package com.test.oopDay03;

public class Student extends Person{
	private String sid;
	private String sex;
	private String age;
	
	//������д
	@Override  //��ע�� 
	public void eat() {
		System.out.println(super.getName() +this.sid+"�Ա���"+this.sex+ "�ڳԷ�");
	}
	
	@Override
	public void show() {
		super.show(); //���ø��෽��
		System.out.println(super.getId()+","+super.getName()+","+this.sid+","+sex+","+age); //���ø����Ա����
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
