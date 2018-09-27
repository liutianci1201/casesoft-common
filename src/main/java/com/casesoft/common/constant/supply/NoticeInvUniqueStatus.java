package com.casesoft.common.constant.supply;

/**
 * 2018-7-25
 * @author Tom
 * 盘点状态
 */
public enum  NoticeInvUniqueStatus {
    STATUS_UNSCANNED(0,"未扫描"),
    STATUS_SCANNED(1,"已扫描"),
    STATUS_ATTACH(0,"附加");

    private int value;//代码
    private String description;//描述
    
    NoticeInvUniqueStatus(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public NoticeInvUniqueStatus getDefault() {
        return STATUS_UNSCANNED;
    }
    
    public int getValue() {
        return value;
    }
    public String getDescription() {
        return description;
    }

    //通过value获取description
    public static String getDescriptionByValue(Integer value){
		for(NoticeInvUniqueStatus status : NoticeInvUniqueStatus.values()){
			if(status.getValue() == value.intValue()){
				return status.getDescription();
			}
		}
    	return null;
    }
}
