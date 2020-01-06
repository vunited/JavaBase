package com.reflection;

public class IOC {
	/*
	 * 控制反转 IOC( inversion of control) 应用场景-Spring框架
	 * 
	 * 创建一个Person对象，对象的控制反转权交由别人处理 MySpring类 IOC
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySpring spring = new MySpring();	
		Person person = (Person)spring.getBean("com.reflection.Person");
		System.out.println(person);
	
	
		//反转控制权后 给对象内属性赋值 
		//使用依赖注入方法 DI(dependency injection)
		//别人创建对象的同时，帮我们自动注入属性值
		
		
		
		
		
		
	}

}
