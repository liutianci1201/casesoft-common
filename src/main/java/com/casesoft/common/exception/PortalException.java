package com.casesoft.common.exception;
/**
 *
 * @author john
 * @since 2018-08-06
 * 第三方接口异常
 * */
public class PortalException extends RuntimeException {
       private static final long serialVersionUID = 1L;

    /**
     * 所属模块
     */
    private String busModule;

    /**
     * 错误信息
     */
    private String msg;
    public PortalException(String busModule, String msg) {
        this.busModule = busModule;
        this.msg=msg;
    }
    public PortalException(  String msg) {
        this.msg=msg;
    }
    public PortalException() {
    }

    public String getBusModule() {
        return busModule;
    }

    public void setBusModule(String busModule) {
        this.busModule = busModule;
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
