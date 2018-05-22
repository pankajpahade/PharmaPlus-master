package com.pk.pharma.customException;

import org.springframework.http.HttpStatus;

public class PharmaPLusException extends RuntimeException {

	private static final long serialVersionUID = 1L;

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
}
