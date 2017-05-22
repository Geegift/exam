package com.g_able.exam.spring.template.core.model;

public class RequestRestful<T> {
	private String action;
	private T requestObject;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public T getRequestObject() {
		return requestObject;
	}

	public void setRequestObject(T requestObject) {
		this.requestObject = requestObject;
	}

}
