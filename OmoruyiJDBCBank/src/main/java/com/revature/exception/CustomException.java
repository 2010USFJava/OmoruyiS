package com.revature.exception;

public class CustomException extends RuntimeException{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 8703235294948953755L;

	public CustomException() {
		System.out.println("access on for admins");
		}

}
