package com.weng.seckill.common.exception;

import com.weng.seckill.common.api.IErrorCode;

/**
 *  自定义异常
 */
public class RrException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
    private String msg;
    
    private int code = 500;
    
    public RrException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public RrException(IErrorCode errorCode){
    	super(errorCode.getMessage());
    	this.code = (int)errorCode.getCode();
	}
	
	public RrException(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}
	
	public RrException(String msg, int code) {
		super(msg);
		this.msg = msg;
		this.code = code;
	}
	
	public RrException(String msg, int code, Throwable e) {
		super(msg, e);
		this.msg = msg;
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}
