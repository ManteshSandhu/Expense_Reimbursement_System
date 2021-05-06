package com.revature.exceptions;

public class UserNotFoundException extends AbstractHttpException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
		super("User Not Found in System", 404);
	}
}
