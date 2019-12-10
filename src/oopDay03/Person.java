package com.test.oopDay03;

public /*final */class Person {
	private String id;
	private String name;

	public void eat() {
		System.out.println(name + "ÔÚ³Ô·¹");
	}
	public /*final */void show() {
		System.out.println(id+","+name);
	}
	
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Person() {
		super();
	}
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
	
	
}
