/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casesoft.common.util;


import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author
 */
public class CommonUtil {
    public static final String UTF8 = "UTF-8";
    public static final String TIME_ZONE_UTC = "UTC";

    public static String addQuotes(String[] args) {
        StringBuffer sb = new StringBuffer();
        for (String arg : args) {
            sb.append(",'").append(arg).append("'");
        }
        return sb.substring(1);
    }

    public static void dateDiff(String startTime, String endTime, String format) throws ParseException {
//按照传入的格式生成一个simpledateformate对象
        SimpleDateFormat sd = new SimpleDateFormat(format);
        long nd = 1000 * 24 * 60 * 60;//一天的毫秒数
        long nh = 1000 * 60 * 60;//一小时的毫秒数
        long nm = 1000 * 60;//一分钟的毫秒数
        long ns = 1000;//一秒钟的毫秒数long diff;try {
//获得两个时间的毫秒时间差异
        Long diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();
        long day = diff / nd;//计算差多少天
        long hour = diff % nd / nh;//计算差多少小时
        long min = diff % nd % nh / nm;//计算差多少分钟
        long sec = diff % nd % nh % nm / ns;//计算差多少秒//输出结果
        System.out.println("时间相差：" + day + "天" + hour + "小时" + min + "分钟" + sec + "秒。");
    }

    public static String dateDiff(Date startTime, Date endTime) {
//按照传入的格式生成一个simpledateformate对象
        long nd = 1000 * 24 * 60 * 60;//一天的毫秒数
        long nh = 1000 * 60 * 60;//一小时的毫秒数
        long nm = 1000 * 60;//一分钟的毫秒数
        long ns = 1000;//一秒钟的毫秒数long diff;try {
//获得两个时间的毫秒时间差异
        Long diff = endTime.getTime() - startTime.getTime();
        long day = diff / nd;//计算差多少天
        long hour = diff % nd / nh;//计算差多少小时
        long min = diff % nd % nh / nm;//计算差多少分钟
        long sec = diff % nd % nh % nm / ns;//计算差多少秒//输出结果
        return day + "天" + hour + "小时" + min + "分钟" + sec + "秒。";
    }

    public static String getSqlStrByList(List<String> sqhList, Class<?> c,
                                         String columnName) {
        StringBuffer sql = new StringBuffer("");
        if (CommonUtil.isNotBlank(sqhList)) {
            sql.append(" ").append(c.getSimpleName().toLowerCase()).append(".")
                    .append(columnName).append(" IN ( ");
            for (int i = 0; i < sqhList.size(); i++) {
                sql.append("'").append(sqhList.get(i) + "',");
                if ((i + 1) % 999 == 0 && (i + 1) < sqhList.size()) {
                    sql.deleteCharAt(sql.length() - 1);
                    sql.append(" ) OR ")
                            .append(c.getSimpleName().toLowerCase())
                            .append(".").append(columnName).append(" IN (");
                }
            }
            sql.deleteCharAt(sql.length() - 1);
            sql.append(" )");
        } else {
            sql.append(" ").append(c.getSimpleName().toLowerCase()).append(".")
                    .append(columnName).append(" IN ( '')");
        }
        return sql.toString();
    }


    public static String objToString(Object o) {
        if (null == o)
            return "0";
        return o.toString();
    }


    @SuppressWarnings("rawtypes")
    public static boolean isBlank(Object param) {
        if (null == param)
            return true;
        if (param instanceof String) {
            return ((String) param).trim().equals("");
        }
        if (param instanceof Collection) {
            Collection c = (Collection) param;
            return c.size() <= 0;
        }
        if (param instanceof Map) {
            Map map = (Map) param;
            return map.isEmpty() || map.size() <= 0;
        }
        return false;
    }

    public static boolean isNotBlank(Object param) {
        return !isBlank(param);
    }

    public static boolean isPositive(String str) {
        Pattern pattern = Pattern.compile("^\\d+$|-\\d+$"); // 就是判断是否为整数
        Matcher isPositive = pattern.matcher(str);
        return isPositive.matches();
    }

    public static boolean isFloat(String str) {
        Pattern pattern = Pattern.compile("\\d+\\.\\d+$|-\\d+\\.\\d+$");// 判断是否为小数
        Matcher isPositive = pattern.matcher(str);
        return isPositive.matches();
    }

    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static boolean isLetterOrNum(String str) {
        if (isBlank(str))
            return false;
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                flag = true;
            } else {
                break;
            }
        }
        return flag;
    }

    public static String convertIntToString(int value, int length) {
        StringBuilder buf = new StringBuilder("" + value);
        while (buf.toString().length() < length) {
            buf.insert(0, "0");
        }
        return buf.toString();
    }


    /**
     * @return 字符串
     * @toString :十六进制ASCII码转换为字符串
     */
    public static String toString(String str) {
        // String str = "77617463682e657865";
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length(); i += 2) {
            result.append((char) Integer.parseInt(str.substring(i, i + 2), 16));
        }
        return result.toString();
    }

    /**
     * @return ASCII码
     * @toHexAscii :字符串转换为十六进制ASCII码
     */
    public static String toHexAscii(String str) {
        // String s = "watch.exe";// 字符串
        StringBuffer result = new StringBuffer();
        char[] chars = str.toCharArray(); // 把字符中转换为字符数组
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
                result.append(Integer.toHexString((int) c));
            else
                result.append(c);
        }
        // result.insert(0, (result.length() / 2));
        return result.toString();
    }

    public static String toHexAscii(String str, int index) {
        String starStr = str.substring(0, index);
        String endStr = str.substring(index + 1);
        char c = str.charAt(index);
        return starStr + Integer.toHexString(c) + endStr;
    }

    public static String asciiToChar(String str, int startIndex) {
        String starStr = str.substring(0, startIndex);
        String endStr = str.substring(startIndex + 2);
        String asciiStr = str.substring(startIndex, startIndex + 2);
        // int asciiInt = Integer.parseInt(asciiStr);
        return starStr + (char) Integer.parseInt(asciiStr, 16) + endStr;
    }


    public static String produceIntToString(int i, int digit) {
        if (digit == 0) {
            return "";
        }
        StringBuilder buf = new StringBuilder("" + i);
        while (buf.toString().length() < digit) {
            buf.insert(0, "0");
        }
        return buf.toString();
    }


    public static long dateInterval(String d1, String d2, String dataFormat) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(dataFormat);
        Date date1 = sdf.parse(d1);
        Date date2 = sdf.parse(d2);
        // 从间隔毫秒变成间隔天数
        long gap = (date2.getTime() - date1.getTime()) / (1000 * 3600 * 24);
        return gap;
    }

    public static String getDecimal(double value, String decimal) {
        DecimalFormat df2 = new DecimalFormat(decimal);
        return df2.format(value);
    }

    public static String convertSkuToEpc(String uniqueCode, int[] indexChars) throws Exception {
        String epc = uniqueCode;
        for (int i = 0; i < indexChars.length; i++) {
            int charIndex = indexChars[i] + i;
            epc = CommonUtil.toHexAscii(epc, charIndex);
        }
        return epc;
    }

    public static String convertEpcToUniqueCode(String epc, int[] indexChars) throws Exception {
        String uniqueCode = epc;
        for (int i = 0; i < indexChars.length; i++) {
            int charIndex = indexChars[i];
            uniqueCode = CommonUtil.asciiToChar(uniqueCode, charIndex);
        }
        return uniqueCode;
    }


    //region 16/32位MD5加密

    /***
     * MD5加码 生成32位小写md5码
     */
    public static String string2MD5(String inStr) {
        try {
            String sign = sign(inStr, "UTF-8");
            return sign;
        } catch (Exception e) {
            e.printStackTrace();
            return "";

        }
    }

    // MD5加码。32位小写
    public static String sign(String data, String encode) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(data.getBytes(encode));
        byte[] bArray = md.digest();
        StringBuilder output = new StringBuilder(32);
        for (int i = 0; i < bArray.length; i++) {
            String temp = Integer.toHexString(bArray[i] & 0xff);
            if (temp.length() < 2) {
                output.append("0");
            }
            output.append(temp);
        }
        return output.toString();
    }

    /**
     * 将一个list均分成n个list,主要通过偏移量来实现的
     *
     * @param source
     * @return
     */
    public static <T> List<List<T>> averageAssign(List<T> source, int n) {
        List<List<T>> result = new ArrayList<List<T>>();
        int remaider = source.size() % n;  //(先计算出余数)
        int number = source.size() / n;  //然后是商
        int offset = 0;//偏移量
        for (int i = 0; i < n; i++) {
            List<T> value = null;
            if (remaider > 0) {
                value = source.subList(i * number + offset, (i + 1) * number + offset + 1);
                remaider--;
                offset++;
            } else {
                value = source.subList(i * number + offset, (i + 1) * number + offset);
            }
            result.add(value);
        }
        return result;
    }

    public static String getDateString(LocalDateTime dateTime, String pattern) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(format);
    }

    public static String getCurrentTimeString(String pattern) {
        return getDateString(LocalDateTime.now(), pattern);
    }
}
