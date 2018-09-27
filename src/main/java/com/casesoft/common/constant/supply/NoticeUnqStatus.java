package com.casesoft.common.constant.supply;
/**
 * @author john
 * @since 2018-06-28
 *通知单唯一码状态
 * */
public enum  NoticeUnqStatus {
    UNQ_MISSING(-1,"丢失"),
    UNQ_NUN(0,"未验证"),
    UNQ_VALID(1,"已验证"),
    UNQ_ADDED(2,"新增非单据原有");

    private int value;//类型
    private String description;//描述

    NoticeUnqStatus(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public Integer getValue() {
        return value;
    }
    public String getDescription() {
        return description;
    }

}
