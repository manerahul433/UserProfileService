package com.uxpsystems.assignment.common;

import org.springframework.http.HttpStatus;

public class UserProfileServiceException extends Exception{
	
	private HttpStatus httpStatus;
	
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public UserProfileServiceException(String message, HttpStatus httpStatus){
		super(message);
		this.httpStatus = httpStatus;
	}
	
	public UserProfileServiceException(HttpStatus httpStatus){
		super();
		this.httpStatus = httpStatus;
	}

}
