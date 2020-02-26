package com.bulb.rfid.entity;

import com.fasterxml.jackson.databind.ObjectMapper;

public class e3Result{
	// 定义jackson对象
	private static final ObjectMapper mapper = new ObjectMapper();
	// 响应业务状态
	private Integer status;
    // 响应消息
    private String msg;
    // 响应中的数据
    private Object data;

	public static e3Result build(Integer status, String msg, Object data) {
		return new e3Result(status, msg, data);
	}

	public static e3Result ok(Object data) {
		return new e3Result(data);
	}

	public static e3Result ok() {
		return new e3Result(null);
	}

	public e3Result() {
	}

	public static e3Result build(Integer status, String msg) {
		return new e3Result(status, msg, null);
	}

	public e3Result(Integer status, String msg, Object data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public e3Result(Object data) {
		this.status = 200;
		this.msg = "OK";
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static ObjectMapper getMapper() {
		return mapper;
	}
}
