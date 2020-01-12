package com.reflection;

import java.math.BigDecimal;

public class Person {
	private String name;
	private String sex;
	//private int age;//Integer包装类更安全，自动拆装箱
	//改写后
	private Integer age;//person类的信息在文件里，null不能储存在int类型里，且反射技术不能操作拆箱类int
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	
	public Person() {
		
	}
	
	public Person(String name,String sex) {
		this.name = name;
		this.sex = sex;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String toString()
	{
		
		return "{"+name+","+sex+","+age+"}";
		
	}
	
}
