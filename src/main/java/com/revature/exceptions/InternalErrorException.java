package com.revature.exceptions;

public class InternalErrorException extends AbstractHttpException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InternalErrorException() {
		super("Please check again", 500);
	}
}
