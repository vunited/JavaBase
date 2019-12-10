package com.test.oopDay02;

public class Person {
//代码块 --- 初始化块
	{
		System.out.println("这是一个代码块");
	}
	//静态代码块
	static {
		System.out.println("这是一个静态代码块");
	}
	private String id;
	private String name;
	private static String nation = "中国";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getNation() {
		return nation;
	}

	public static void setNation(String nation) {
		Person.nation = nation;
	}

//静态方法 --- 类方法
	public static void eat() {
		System.out.println("我在" + nation + "吃饭");
	}

//	行为 ： 动态方法
	public void traval() {
		System.out.println(name + "在旅游");
	}

	public void show() {
		this.traval();
		this.eat();
	}
}
