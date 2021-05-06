package com.revature.exceptions;

public abstract class AbstractHttpException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int statusCode;
	
	protected AbstractHttpException(String message, int statusCode) {
		super(message);
		this.statusCode = statusCode;
	}

	public int getStatusCode() {
		return statusCode;
	}
	
	
}
