package com.davidedalsanto.exceptions;

public class RoleNotFindException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RoleNotFindException() {		
		super("No role found.");
	}
}
