package com.junit;

public class ErrorResponse implements Response {
	private Request originalRequest;
	private Exception originalException;
	public ErrorResponse(Request request,Exception exception) {
		this.originalRequest = request;
		this.originalException = exception;
		
	}
	public Request getOrigRequest() {
		return this.originalRequest;
	}
	
	public Exception getorException() {
		return this.originalException;
	}
}
