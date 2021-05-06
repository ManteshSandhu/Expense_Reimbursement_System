package com.revature.exceptions;

public class UnauthorizedException extends AbstractHttpException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnauthorizedException() {
		super("You do not have permissions to access this resource", 403);
		// TODO Auto-generated constructor stub
	}

}
