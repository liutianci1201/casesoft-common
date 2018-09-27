package com.casesoft.common.constant;

/**
 * @author john
 * @since 2018-06-28
 * 系统默认值
 * */
public enum  DefaultInfo {
    SYSTEM_ADMIN(-1, "系统超级用户"),
    SYSTEM_API_ADMIN(-2, "第三方系统用户");
    private int value;//编码
    private String description;//描述

    DefaultInfo(int type, String description) {
        this.value = type;
        this.description = description;
    }

    public DefaultInfo getDefault() {
        return SYSTEM_ADMIN;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
