package com.annotation;

public class Person {
	//@OrginAnnotation(test1="abc",test2=123)
	//@OrginAnnotation(value= {"桑","29","男"})
	private String name;
	private Integer age;
	private String sex;
	
	//利用反射技术实现一个IOC 对象有别人来创建， 创建的同时自动注入属性信息
	
	
	
	
	@OrginAnnotation(value= {"你好","程序","猿"})
	public void hello()
	{
		
	}

	@OrginAnnotation(value= {"桑","29","男"})
	public Person() {
		
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
}
