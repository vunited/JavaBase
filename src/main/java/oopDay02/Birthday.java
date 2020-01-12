package com.test.oopDay02;

public class Birthday {
	private int year;
	private int month;
	private int day;
	static private String nation;

//	public void setYear(int year) {
//		this.year=year;
//	}
//	public int getYear() {
//		return this.year;
//	}

	public Birthday(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public static String getNation() {
		return nation;
	}

	public static void setNation(String nation) {
		Birthday.nation = nation;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public Birthday() {
		super();
	}

	public void show() {
		this.showYear();
		this.showMonth();
		this.showDay();
	}

	public void showYear() {
		System.out.println("生日年份为" + this.year);
	}

	public void showMonth() {
		System.out.println("生日月份为" + this.month);
	}

	public void showDay() {
		System.out.println("生日日期为" + this.day);
	}
}
