package com.test.apiDay03;

public class AgeException extends Exception {
	private String message;

	public AgeException(Integer age) {
		super();
		this.message = age + "��������˵�����������0�꣬С��150�ꡣ";
	}
	
	@Override
	public String getMessage() {
		return message;		
	}

}
