package com.test.oopDay03;

public class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	public Animal() {
		super();
	}

	// 叫声
	public void shout() {
		System.out.println(name + "在叫");
	}

	// 觅食
	public void eat() {
		System.out.println(name + "在吃食");
	}

	// 睡觉
	public void sleep() {
		System.out.println(name + "在睡觉");
	}

}
