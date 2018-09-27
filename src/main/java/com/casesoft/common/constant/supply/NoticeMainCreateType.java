package com.casesoft.common.constant.supply;

/**
 * @author john
 * @since 2018-06-28
 * 通知单创建方式
 * */
public enum  NoticeMainCreateType {
    CREATE_COMMON(0,"手动生成"),
    CREATE_BUS(1,"任务生成"),
    CREATE_API_IMPORT(2,"第三方系统生成"),
    CREATE_API_EXTENDED(3,"直接获取第三方系统");

    private int value;//代码
    private String description;//描述
    NoticeMainCreateType(int type, String description) {
        this.value = type;
        this.description = description;
    }

    public NoticeMainCreateType getDefault() {
        return CREATE_COMMON;
    }
    public int getValue() {
        return value;
    }
    public String getDescription() {
        return description;
    }

}
