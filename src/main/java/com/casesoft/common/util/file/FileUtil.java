package com.casesoft.common.util.file;

import com.alibaba.fastjson.JSONWriter;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.*;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class FileUtil {

    /**
     * 创建文件，当已有时删除并新建
     *
     * @param file
     * @throws IOException
     */
    public static void createNewFile(File file) throws IOException {
        if (!file.exists()) {
            File dic = file.getParentFile();
            if (!dic.exists()) {
                dic.mkdirs();
            }

            if (file.toString().indexOf(".") != -1) {
                file.createNewFile();
            } else {
                file.mkdir();
            }
        } else {
            file.delete();
            createNewFile(file);
        }
    }



    public final static String File_Dir = "";

/*创建文件夹目录，本步骤存放至缓存中
    public static void init() {
        try {
            String tempPath = PropertyUtil.getValue("caseSoft_temp");
            initFolder(tempPath + Constant.Folder.Epc_Init_Zip_File_Folder);
            initFolder(tempPath + Constant.Folder.Epc_Init_File_Folder);
            initFolder(tempPath + Constant.Folder.Report_File_Folder);
            initFolder(PropertyUtil.getValue("MilanUpload"));
            initFolder(PropertyUtil.getValue("MilanUploadHistory"));
            //增加云上传目录
            initFolder(PropertyUtil.getValue("MilanUpload") + File.separator + "Cloud");
            initFolder(PropertyUtil.getValue("MilanUploadHistory") + File.separator + "Cloud");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/

    public static boolean initFolder(String path) {
        File file = new File(path);
        if (!file.exists())
            return file.mkdirs();
        return true;
    }

    /**
     * * 递归删除目录下的所有文件及子目录下所有文件 * @param dir 将要删除的文件目录 * @return boolean Returns "true" if all
     * deletions were successful. * If a deletion fails, the method stops attempting to * delete and
     * returns "false".
     */
    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();// 递归删除目录中的子目录下
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }// 目录此时为空，可以删除
        return dir.delete();

    }

    public static StringBuffer readFileToStr(String fileName) throws Exception {
        return readFileToStr(new File(fileName));
    }

    public static StringBuffer readFileToStr(File f) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
        return readInputStreamToStr(bis);
    }

    //    凡是format开头的都是用来解析文件的
    public static CSVParser formatCSV(String filePath) throws IOException {

        CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader();
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "GBK");
        return new CSVParser(isr, csvFormat);
    }

    public static CSVParser formatCSV(InputStream is) throws IOException {

        CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader();
        InputStreamReader isr = new InputStreamReader(is, "GBK");
        return new CSVParser(isr, csvFormat);
    }

    /**
     * @param srcFile
     * @param destPath
     * @return
     */
    public static boolean moveFile(File srcFile, String destPath) {
        OutputStream os = null;
        boolean success = true;
        try {
            InputStream is = new FileInputStream(srcFile);
            File toFile = new File(destPath); // 设置目标文件
            os = new FileOutputStream(toFile);
            // 设置缓存
            byte[] buffer = new byte[1024];
            int length = 0;
            // 读取myFile文件输出到toFile文件中
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            // 关闭输入流
            is.close();
            // 关闭输出流
            os.close();
        } catch (Exception ex) {
            success = false;
            ex.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return success;
    }

    /**
     * @param ins  写入流
     * @param file 文件
     * @return 写文件并生成md
     */
    public static String writeInputStreamToFileMd5(InputStream ins, File file) throws Exception {
        if (!file.exists()) {
            file.createNewFile();
        }
        MessageDigest MD5 = MessageDigest.getInstance("MD5");
        OutputStream os = new FileOutputStream(file);
        int bytesRead = 0;
        byte[] buffer = new byte[8192];
        while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
            os.write(buffer, 0, bytesRead);
            MD5.update(buffer, 0, bytesRead);
        }
        os.close();
        ins.close();
        return new String(Hex.encodeHex(MD5.digest()));
    }

    /**
     * 获取文件md5值
     */
    public static String getMD5(File file) throws FileNotFoundException {
        return getMD5(new FileInputStream(file));
    }

    /**
     * @param fileInputStream
     * @return 获取文件md5值
     */
    public static String getMD5(InputStream fileInputStream) {
        try {
            MessageDigest MD5 = MessageDigest.getInstance("MD5");
            byte[] buffer = new byte[8192];
            int length;
            while ((length = fileInputStream.read(buffer)) != -1) {
                MD5.update(buffer, 0, length);
            }
            return new String(Hex.encodeHex(MD5.digest()));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param path
     * @param objectList
     * @return 批量写入json对象
     */
    public static <T> boolean writeJsonFileObjects(String path, List<T> objectList) {
        if (objectList == null) {
            return false;
        }
        try {
            OutputStreamWriter fileWriter = new OutputStreamWriter(new FileOutputStream(new File(path)), "UTF-8");
            JSONWriter writer = new JSONWriter(fileWriter);
            writer.startArray();
            for (int i = 0; i < objectList.size(); ++i) {
                writer.writeValue(objectList.get(i));
            }
            writer.endArray();
            fileWriter.flush();
            writer.flush();
            fileWriter.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("写入对象：IOException");
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("写入对象：Exception");
            return false;
        }
        return true;
    }

    /**
     * 读取BufferedInputStream到String
     *
     * @param bis
     * @return
     * @throws Exception
     */
    public static StringBuffer readInputStreamToStr(BufferedInputStream bis) throws Exception {
        StringBuffer sb = new StringBuffer();
        try {
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            // 从文件中按字节读取内容，到文件尾部时read方法将返回-1
            while ((bytesRead = bis.read(buffer)) != -1) {
                // 将读取的字节转为字符串对象
                String chunk = new String(buffer, 0, bytesRead);
                sb.append(chunk);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                    throw ex;
                }
            }
        }
        return sb;
    }

    public static void zip(String souceFileName, String destFileName) {
        File file = new File(souceFileName);
        try {
            zip(file, destFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void zip(File souceFile, String destFileName) throws IOException {
        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream(destFileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ZipOutputStream out = new ZipOutputStream(fileOut);
        zip(souceFile, out, "");
        out.close();
    }

    private static void zip(File souceFile, ZipOutputStream out, String base) throws IOException {

        if (souceFile.isDirectory()) {
            File[] files = souceFile.listFiles();
            out.putNextEntry(new ZipEntry(base + "/"));
            base = base.length() == 0 ? "" : base + "/";
            for (File file : files) {
                zip(file, out, base + file.getName());
            }
        } else {
            if (base.length() > 0) {
                out.putNextEntry(new ZipEntry(base));
            } else {
                out.putNextEntry(new ZipEntry(souceFile.getName()));// 把待压缩文件放入out流
            }
            // System.out.println("filepath=" + souceFile.getPath());
            FileInputStream in = new FileInputStream(souceFile);

            int b;
            byte[] by = new byte[1024];
            while ((b = in.read(by)) != -1) {
                out.write(by, 0, b);
            }
            in.close();
        }
    }

    public static void unzip(File srcFile, String destPath) throws IOException {
        ZipFile zipFile = null;

        try {
            Charset gbk = Charset.forName("GBK");
            zipFile = new ZipFile(srcFile, gbk);
//      zipFile = new ZipFile(srcFile);
            Enumeration<?> enu = zipFile.entries();
            while (enu.hasMoreElements()) {
                ZipEntry entry = (ZipEntry) enu.nextElement();
                if (entry.isDirectory()) {
                    new File(destPath + entry.getName()).mkdir();
                    continue;
                }
                BufferedInputStream bis = new BufferedInputStream(zipFile.getInputStream(entry));
                File file = new File(destPath + entry.getName());
                // 加入这个的原因是zipfile读取文件是随机读取的，这就造成可能先读取一个文件
                // 而这个文件所在的目录还没有出现过，所以要建出目录来。
                File parent = file.getParentFile();
                if (parent != null && !parent.exists()) {
                    parent.mkdirs();
                }
                final int BUFFER = 2048;
                FileOutputStream fos = new FileOutputStream(file);
                BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER);

                int count;
                byte data[] = new byte[BUFFER];
                while ((count = bis.read(data, 0, BUFFER)) != -1) {
                    bos.write(data, 0, count);
                }
                bos.flush();
                bos.close();
                bis.close();

            }
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            if (zipFile != null)
                zipFile.close();
        }
    }

    /**
     * 解压缩文件 upzip
     *
     * @throws IOException
     */
    public static void unzip(String srcFile, String destPath) throws IOException {
        unzip(new File(srcFile), destPath);
    }

    /**
     * 复制文件
     *
     * @param fromFileName
     * @param toFileName
     */
    public static void copyFile(String fromFileName, String toFileName) throws IOException {
        FileInputStream ins = new FileInputStream(new File(fromFileName));
        FileOutputStream out = new FileOutputStream(new File(toFileName));
        byte[] b = new byte[1024];
        int n = 0;
        while ((n = ins.read(b)) != -1) {
            out.write(b, 0, n);
        }
        ins.close();
        out.close();
    }

    /**
     * 将字符串写入文件 FileWriter在写出文件时是以系统默认的编码格式输出的，因此对于一些不同编码格式容易产生乱码， 尤其对于中文字符，
     * 在使用时应格外留意。为了解决这个问题，可以使用OutputStreamWriter， 示例如下： 这段代码就是指定输出文件filename，使用UTF-8的编码格式以append
     * 的形式输出字符串 toStr
     *
     * @param
     */
    public static File writeStringToFile(String str, String fileName) {
        // System.out.println(fileName);
        // FileWriter fw = null;
        OutputStreamWriter osw = null;
        File file = null;
        try {
            file = new File(fileName);
            if (!file.exists())
                file.createNewFile();
            osw = new OutputStreamWriter(new FileOutputStream(file, false), "UTF-8");
            osw.write(str);
            // fw = new FileWriter(file);
            long begin3 = System.currentTimeMillis();
            // fw.write(str);
            // fw.close();
            osw.close();
            long end3 = System.currentTimeMillis();
            System.out.println("FileWriter执行耗时:" + (end3 - begin3) + " 毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // fw.close();
                osw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return file;
    }
}
