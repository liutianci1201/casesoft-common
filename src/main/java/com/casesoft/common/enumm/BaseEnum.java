package com.casesoft.common.enumm;

/**
 * 放置后固定不可变配置
 * 由于部分不可抗拒原因弃用
 */

@Deprecated
public enum BaseEnum {
    BRANDCODE("casesoft", "品牌商编码"),

    //    属性类型
    PROPERTY_STYLE("style", "款式类型"),
    PROPERTY_PRODUCT("product", "商品类型"),

    //    标签类型
    TAGTYPE_MATERIAL("M", "面料类型"),
    TAGTYPE_SAMPLE("s", "样衣类型"),

    //    临时目录
    FOLDER_Epc_Init_File_Folder("\\initFile\\", "初始化标签临时目录"),
    FOLDER_Epc_Init_Zip_File_Folder("\\initFileZip\\", "初始化标签压缩包临时目录"),
    FOLDER_Report_File_Folder("\\report\\", "报表所在临时目录"),
    FOLDER_Product_File_Folder("\\productZip\\", "商品所在临时目录");


    private String value;
    private String introduce;


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    private BaseEnum(String val, String introduce) {
        this.value = val;
        this.introduce = introduce;
    }


}
