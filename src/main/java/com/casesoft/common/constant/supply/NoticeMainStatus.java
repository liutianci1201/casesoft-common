package com.casesoft.common.constant.supply;

/**
 * @author john
 * @since 2018-06-28
 * 通知单状态
 * */
public enum NoticeMainStatus {
    STATUS_CANCELLED(-1,"已作废"),
    STATUS_SAVED(0,"已保存"),
    STATUS_CONFIRMED(1,"已审核"),
    STATUS_CHECKING(2,"校验中"),
    STATUS_FINISHED(3,"已完成");


    private int value;//状态进程
    private String description;//描述
    NoticeMainStatus(int type, String description) {
        this.value = type;
        this.description = description;
    }

    public NoticeMainStatus getDefault() {
        return STATUS_SAVED;
    }
    public int getValue() {
        return value;
    }
    public String getDescription() {
        return description;
    }


}
