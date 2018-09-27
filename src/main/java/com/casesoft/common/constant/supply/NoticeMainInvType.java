package com.casesoft.common.constant.supply;

/**
 * 2018-7-25
 * @author Tom
 * 盘点状态
 */
public enum NoticeMainInvType {
    TYPE_CLASSIFY(0,"分类盘点"),
    TYPE_OVERALL(1,"全盘");

    private int value;//代码
    private String description;//描述
    
    NoticeMainInvType(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public NoticeMainInvType getDefault() {
        return TYPE_CLASSIFY;
    }
    
    public int getValue() {
        return value;
    }
    public String getDescription() {
        return description;
    }

    //通过value获取description
	public static String getDescriptionByValue(Integer value) {
		if (value != null) {
			for (NoticeMainInvType type : NoticeMainInvType.values()) {
				if (type.getValue() == value.intValue()) {
					return type.getDescription();
				}
			}
		}
		return null;
	}
}
