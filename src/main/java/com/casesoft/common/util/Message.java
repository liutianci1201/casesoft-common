package com.casesoft.common.util;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

public class Message implements Serializable {

	private static final long serialVersionUID = -4303499387889592642L;
	
	private String code;
	private String message;
	private JSONObject info;

	public Message() {
	}

	public Message(String code) {
		super();
		this.code = code;
	}

	public Message(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public Message(String code, JSONObject info) {
		super();
		this.code = code;
		this.info = info;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public JSONObject getInfo() {
		return info;
	}

	public void setInfo(JSONObject info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Message [code=" + code + ", message=" + message + ", info=" + info + "]";
	}

}
