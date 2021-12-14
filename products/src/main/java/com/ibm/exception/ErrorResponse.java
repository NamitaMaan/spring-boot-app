package com.ibm.exception;

import java.util.Date;

public class ErrorResponse {

	private String errorCode;
	private Date timestamp;
	private String errorMessage;
	
	public ErrorResponse(String errorCode, Date timestamp, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.timestamp = timestamp;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
