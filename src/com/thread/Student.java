package com.thread;

public class Student implements Runnable,School {
	private String schoolname;
	private String grade;
	private String studentname;
	private String studentcode;//學號
	private String studentsexy;
	private String studentcourse;//選課
	private Integer studentavg;//平均分
	public Student(String studentname, String studentcode, String studentsexy, String studentcourse) {
		super();
		this.studentname = studentname;
		this.studentcode = studentcode;
		this.studentsexy = studentsexy;
		this.studentcourse = studentcourse;
	}
	
	@Override
	public String toString() {
		return "Student [schoolname=" + schoolname + ", grade=" + grade + ", studentname=" + studentname
				+ ", studentcode=" + studentcode + ", studentsexy=" + studentsexy + ", studentcourse=" + studentcourse
				+ ", studentavg=" + studentavg + "]";
	}
	@Override
	public void set(String schoolname, String grade) {
		this.grade = grade;
		this.schoolname = schoolname;
		
	}
	@Override
	public String getSchool() {
		// TODO Auto-generated method stub
		return schoolname;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Thread.currentThread().setName("线程2");
		Thread.currentThread().setPriority(1);//设置优先级1-最低
		for(int i =1;i<13;i++)
		{
			System.out.println("学生成绩为："+i+"月"+(studentavg+i*2)+":"+Thread.currentThread().getName());
		}
	}

	
	
	
	
	public Integer getStudentavg() {
		return studentavg;
	}

	public void setStudentavg(Integer studentavg) {
		this.studentavg = studentavg;
	}

	@Override
	public String getGrade() {
		// TODO Auto-generated method stub
		return grade;
	}
	
	
	
	
}
