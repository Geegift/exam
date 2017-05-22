package com.g_able.exam.spring.template.core.model;

public class ResponseRestful<T> {
	private boolean status;
	private String code;
	private String message;
	private T objectValue;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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

	public T getObjectValue() {
		return objectValue;
	}

	public void setObjectValue(T objectValue) {
		this.objectValue = objectValue;
	}
	
	public void setOperationError(String code, String message, T object) {
		this.status = false;
		this.code = code;
		this.message = message;
		this.objectValue = object;
	}
	
	public void setOperationSuccess(String code, String message, T object) {
		this.status = true;
		this.code = code;
		this.message = message;
		this.objectValue = object;
	}

}
