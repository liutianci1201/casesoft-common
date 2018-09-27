package com.casesoft.common.constant.supply;

/**
 * @author john
 * @since 2018-06-28
 * 通知单类型
 */
public enum NoticeMainBillType {
    UNIQUE_TYPE(0, "唯一码"),
    BARCODE_TYPE(1, "条码");


    private int value;//状态进程
    private String description;//描述

    NoticeMainBillType(int type, String description) {
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
