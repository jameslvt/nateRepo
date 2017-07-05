package com.natabm.exception;

public class UserException extends Exception {

	private static String errorCode = "0000000001";

	public UserException(String message) {
		super(message);
	}

}
