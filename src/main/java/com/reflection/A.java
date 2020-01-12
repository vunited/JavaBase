package com.reflection;

public class A extends B{
//每一个修饰符 用一个整数来表示 class cz;cz.getModifiers();
	//0:默认default //1:public //2:private 4:protected
	//8:static //16:final //32:synchronized //64 volatile
	//128:transient //256:native //512:interface //1024:abstract
	
	private String name = "sang";
	public int age = 10;
	
	
	private void dangqian() {
		System.out.println("dangqianlei");
	}
	
	
	public String toString()
	{
		return "("+name+")";
	}
	//无参数构造方法
//	public A() {
//		System.out.println("我是无参数构造方法");
//	}
	public A(String www) {
		System.out.println("我是有参数构造方法"+www);
	}
	
}
