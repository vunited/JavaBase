package com.test.oopDay01;

public class Member {
	String id; // ����
	String name; // ����
	char sex; // �Ա�
	String level; // ����
	int salary; // ����

	public Member() {

	}

	public Member(String _id, String _name, char _sex, String _level, int _salary) {
		id = _id;
		name = _name;
		sex = _sex;
		level = _level;
		salary = _salary;
	}

	public void show() {
		System.out.println("------------------");
		System.out.println(id + "," + name + "," + sex + "," + level + "," + salary);
	}
}
