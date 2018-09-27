package com.casesoft.common.constant;

public enum UnitEnum {

	TYPE_Vender("0", "供应商"),
    TYPE_Headquarters("1", "品牌商"),
    TYPE_Agent("2", "代理商"),
    TYPE_Factory("3", "加工厂"),
    TYPE_Shop("4", "门店"),
    TYPE_NetShop("5", "网店"),
    TYPE_SampleRoom("6", "样衣间"),
    TYPE_Department("7", "部门"),
    TYPE_Warehouse("9", "仓库");

    private String code;
    private String message;

    UnitEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode()
    {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

}
