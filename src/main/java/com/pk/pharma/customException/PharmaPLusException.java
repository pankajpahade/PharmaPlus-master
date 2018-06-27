package com.pk.pharma.customException;

import org.springframework.http.HttpStatus;

import com.pk.pharma.response.StatusType;

public class PharmaPLusException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String errorMessage;

	public  PharmaPLusException() {
		super();
	}
	
	public  PharmaPLusException(String message) {
		super(message);
	}
	
	public  PharmaPLusException(Throwable cause) {
		super(cause);
	}
	
	public  PharmaPLusException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public  PharmaPLusException(String message, HttpStatus status, Throwable cause) {
	}

	public PharmaPLusException(String string, HttpStatus noContent, StatusType status) {
		
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
