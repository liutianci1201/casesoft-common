package com.casesoft.common.constant.supply;
/**
 * @author john
 * @since 2018-06-28
 * 通知单校验类型
 * */
public enum NoticeMainCheckType {
    CHECK_EQ(0,"单据完全符合"),
    CHECK_NE(1,"允许单据明细数量不符"),
    CHECK_LT(2,"允许单据明细数量少"),
    CHECK_GT(3,"允许单据明细数量多"),
    CHECK_AC(4,"允许单据明细行数自增加");

    private int value;//代码
    private String description;//描述


    NoticeMainCheckType(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public NoticeMainCheckType getDefault() {
        return CHECK_EQ;
    }


    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
