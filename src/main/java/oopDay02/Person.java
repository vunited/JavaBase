package com.test.oopDay02;

public class Person {
//����� --- ��ʼ����
	{
		System.out.println("����һ�������");
	}
	//��̬�����
	static {
		System.out.println("����һ����̬�����");
	}
	private String id;
	private String name;
	private static String nation = "�й�";

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

//��̬���� --- �෽��
	public static void eat() {
		System.out.println("����" + nation + "�Է�");
	}

//	��Ϊ �� ��̬����
	public void traval() {
		System.out.println(name + "������");
	}

	public void show() {
		this.traval();
		this.eat();
	}
}
