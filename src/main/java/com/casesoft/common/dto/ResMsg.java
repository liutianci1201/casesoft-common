package com.casesoft.common.dto;

import java.io.Serializable;

/**
 * 响应Web请求的信息封装类，转换成JSON后返回给前台
 *
 * @author john
 * @since 2018-06-28
 */
public class ResMsg implements Serializable {

    private boolean success;
    private String msg;//返回自定义信息
    private Object result;
    private String subCode;//返回编码
    private String subMsg;//返回信息

    public ResMsg(boolean success, String msg) {
        super();
        this.success = success;
        this.msg = msg;
        if (success) {
            this.subMsg = ResCode.SUCCESS.getSubMsg();
            this.subCode = ResCode.SUCCESS.getSubCode();
        } else {
            this.subMsg = ResCode.ERROR.getSubMsg();
            this.subCode = ResCode.ERROR.getSubCode();
        }
    }

    public ResMsg(ResCode resCode, String msg) {
        this(resCode);
        this.msg = msg;
    }

    public ResMsg(boolean success, String msg, Object result) {
        this(success, msg);
        this.result = result;
    }

    public ResMsg(ResCode resCode) {
        if (resCode.getSubCode().equals(ResCode.SUCCESS.getSubCode())) {
            success = true;
        } else {
            success = false;
        }
        this.subCode = resCode.getSubMsg();
        this.subMsg = resCode.getSubMsg();
    }
    public ResMsg(ResCode resCode,Object result) {
       this(resCode);
       this.result=result;
    }
    public ResMsg() {
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubMsg() {
        return subMsg;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }
}
