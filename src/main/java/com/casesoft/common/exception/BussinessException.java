package com.casesoft.common.exception;

public class BussinessException extends RuntimeException {
       private static final long serialVersionUID = 1L;

    /**
     * 所属模块
     */
    private String module;

    /**
     * 错误码
     */
    private String code="500";

    /**
     * 错误信息
     */
    private String msg;

    public BussinessException(String module, String msg) {
        this.module = module;
        this.msg=msg;
    }
    public BussinessException(  String msg) {
        this.msg=msg;
    }
    public BussinessException(String module, String code, String msg) {
        this.module = module;
        this.code=code;
        this.msg=msg;
    }
    public BussinessException() {
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }



    @Override
    public String getMessage(){

        return msg;
    }
}
