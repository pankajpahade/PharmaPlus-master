package com.pk.pharma.response;

import org.springframework.http.HttpStatus;

public class Response {
	
	private StatusType status;
	private HttpStatus errorCode;
	private String errorMessage;
	private ExceptionType exceptionType;
	private Object result;
	private int count;
	private int pages;
	
	public Response(StatusType status, HttpStatus errorCode, String errorMessage, ExceptionType exceptionType,
			Object result, int count, int pages) {
		super();
		this.status = status;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.exceptionType = exceptionType;
		this.result = result;
		this.count = count;
		this.pages = pages;
	}
	
	public Response() {
		super();
	}

	public Response(HttpStatus errorCode, Object result) {
		super();
		this.errorCode = errorCode;
		this.result = result;
	}
	
	public Response(Object result, StatusType status) {
		this.result = result;
		this.status = status;
	}

	public Response(Object result, int pages, int count, HttpStatus errorCode, String errorMessage) {
		this.result = result;
		this.setPages(pages);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.count = count;
	}

	public Response(StatusType status, HttpStatus errorCode, String errorMessage, ExceptionType exceptionType) {
		this.status = status;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.exceptionType = exceptionType;
	}

	public Response(Object result, StatusType status, HttpStatus errorCode, String errorMessage) {
		this.result = result;
		this.status = status;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;

	}

	public Response(Object result, StatusType status, HttpStatus errorCode, String errorMessage,
			ExceptionType exceptionType) {
		this.result = result;
		this.status = status;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.exceptionType = exceptionType;
	}

	public Response(StatusType status, HttpStatus errorCode, String errorMessage) {
		this.status = status;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;

	}

	public Response(StatusType status, HttpStatus errorCode) {
		this.status = status;
		this.errorCode = errorCode;
	}

	public Response(Object result, HttpStatus errorCode, String string, ExceptionType noException) {
		this.result = result;

	}

	public Response(Object result, StatusType status, HttpStatus errorCode) {
		this.result = result;
		this.status = status;
		this.errorCode = errorCode;
	}

	public StatusType getStatus() {
		return status;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

	public HttpStatus getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(HttpStatus errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ExceptionType getExceptionType() {
		return exceptionType;
	}

	public void setExceptionType(ExceptionType exceptionType) {
		this.exceptionType = exceptionType;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
}
