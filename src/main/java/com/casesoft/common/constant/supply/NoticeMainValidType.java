package com.casesoft.common.constant.supply;

/**
 * @author john
 * @since 2018-06-28
 *通知单验证方式
 * */
public enum NoticeMainValidType {

    VALID_UNQ(0,"唯一码验证"),
    VALID_BARCODE(1,"条码验证");
    private int value;//类型
    private String description;//描述

    NoticeMainValidType(int type, String description) {
        this.value = type;
        this.description = description;
    }

    public NoticeMainValidType getIsDefault() {
        return VALID_BARCODE;
    }
    public Integer getValue() {
        return value;
    }
    public String getDescription() {
        return description;
    }


}
