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

	// ����
	public void shout() {
		System.out.println(name + "�ڽ�");
	}

	// ��ʳ
	public void eat() {
		System.out.println(name + "�ڳ�ʳ");
	}

	// ˯��
	public void sleep() {
		System.out.println(name + "��˯��");
	}

}
