package com.test.oopDay03;

public class Student extends Person{
	private String sid;
	private String sex;
	private String age;
	
	//方法重写
	@Override  //打注解 
	public void eat() {
		System.out.println(super.getName() +this.sid+"性别是"+this.sex+ "在吃饭");
	}
	
	@Override
	public void show() {
		super.show(); //调用父类方法
		System.out.println(super.getId()+","+super.getName()+","+this.sid+","+sex+","+age); //调用父类成员变量
	}

	public Student(String id, String name, String sid, String sex, String age) {
		super(id, name);
		this.sid = sid;
		this.sex = sex;
		this.age = age;
	}

	public Student() {
		super();
	}

	public Student(String sid, String sex, String age) {
		super();
		this.sid = sid;
		this.sex = sex;
		this.age = age;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	


	
	
	
	
	
}
