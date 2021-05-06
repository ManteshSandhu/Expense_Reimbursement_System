package com.revature.exceptions;

public class UnauthenticatedException extends AbstractHttpException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnauthenticatedException() {
		super("You hae not logged in", 401);
		// TODO Auto-generated constructor stub
	}

}
