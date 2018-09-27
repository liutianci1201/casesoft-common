package com.casesoft.common.dto;

public enum  ResCode {
    SUCCESS("success", "10000"),//请求成功
    ERROR("error", "10001"),//请求失败
    SERVICE_NO("serviceError", "10002"),//服务出错
    DATA_INVALID("dataInvalid", "10003")//数据无效
    ;//

    ResCode(String subMsg, String subCode) {
        this.subMsg = subMsg;
        this.subCode = subCode;
    }

    private String subMsg;
    private String subCode;

    public String getSubMsg() {
        return subMsg;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }


}
