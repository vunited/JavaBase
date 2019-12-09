/**
 * 
 */
package com.thread;

import java.math.BigInteger;

/**
 * @author Administrator
 *
 */
public class Teacher extends Thread implements School  {
	private String schoolname;
	private String grade;
	private String teachername;
	private String teachercode;//學號
	private String teachersexy;
	private String teachercourse;//選課
	private Float teachersalary;//工资
	
	
	public Teacher(String teachername, String teachercode, String teachersexy, String teachercourse) {
		super();
		this.teachername = teachername;
		this.teachercode = teachercode;
		this.teachersexy = teachersexy;
		this.teachercourse = teachercourse;
	}

	@Override
	public String toString() {
		return "Teacher [schoolname=" + schoolname + ", grade=" + grade + ", teachername=" + teachername
				+ ", teachercode=" + teachercode + ", teachersexy=" + teachersexy + ", teachercourse=" + teachercourse
				+ ", teachersalary=" + teachersalary + "]";
	}

	@Override
	public void set(String schoolname, String grade) {
		// TODO Auto-generated method stub
		this.grade = grade;
		this.schoolname = schoolname;
	}

	@Override
	public String getSchool() {
		// TODO Auto-generated method stub
		return schoolname;
	}

	@Override
	public String getGrade() {
		// TODO Auto-generated method stub
		return grade;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		setName("线程1");
		Thread.currentThread().setPriority(10);
		teachersalary = new Float("1421.22");
		for(Integer i = 1;i<=11;i++)
		{
			System.out.println("这个老师的工资是："+(i+teachersalary)+":"+getName());
		}
	}

}
