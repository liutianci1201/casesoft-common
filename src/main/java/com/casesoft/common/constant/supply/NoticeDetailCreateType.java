package com.casesoft.common.constant.supply;

/**
 * 2018-7-25
 * @author Tom
 * 盘点详单创建类型
 */
public enum  NoticeDetailCreateType {
    CREATE_NOTICE(0,"通知单创建"),
    CREATE_WARE(1,"入库单创建");

    private int value;//代码
    private String description;//描述
    
    NoticeDetailCreateType(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public NoticeDetailCreateType getDefault() {
        return CREATE_NOTICE;
    }
    
    public int getValue() {
        return value;
    }
    public String getDescription() {
        return description;
    }

    //通过value获取description
    public static String getDescriptionByValue(Integer value){
		for(NoticeDetailCreateType createType : NoticeDetailCreateType.values()){
			if(createType.getValue() == value.intValue()){
				return createType.getDescription();
			}
		}
    	return null;
    }
}
