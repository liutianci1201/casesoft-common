package com.casesoft.common.constant.supply;

public enum  BusType {
    TYPE_NOTICE(0,"通知单生成"),
    TYPE_AUTO(1,"任务生成"),
    TYPE_API_EXTENDED(2,"第三方系统对接");

    private int value;//代码
    private String description;//描述
    BusType(int type, String description) {
        this.value = type;
        this.description = description;
    }
     public int getValue() {
        return value;
    }
    public String getDescription() {
        return description;
    }
}
