package com.test.apiDay03;

public class AgeException extends Exception {
	private String message;

	public AgeException(Integer age) {
		super();
		this.message = age + "年龄错误，人的年龄必须大于0岁，小于150岁。";
	}
	
	@Override
	public String getMessage() {
		return message;		
	}

}
