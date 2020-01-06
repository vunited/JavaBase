package com.test.oopDay01;

public class Student {
	
//	类：所有学生
	
//	属性：成员变量（全局变量）:在类中声明的变量  如不赋值，有默认值
//	       局部变量  : 在方法中声明的变量  必须赋值才能使用
	String id; // 成员变量 学号
	String name; // 姓名
	String sex; // 性别
	String major; // 专业
	int age; // 年龄

	
//行为：动态方法
	public void study() {
		System.out.println(name+"在学习");
	}

	public void doSport() {
		System.out.println(name+"在运动");
	}

	public void sleep() {
		System.out.println(name+"在睡觉");
	}
	public void show() {
		System.out.println(name+","+id+","+sex+","+major+","+age);
	}
	//无参构造方法 
	public Student() {
		
	}
	//有参构造方法(全参)
	public Student(String _id,String _name,String _sex,String _major,int _age) {
		id=_id;
		name=_name;
		sex=_sex;
		major=_major;
		age=_age;
	}
	//有参构造方法(部分参数)
	public Student(String _id,String _name) {
		id=_id;
		name=_name;
	}

}
