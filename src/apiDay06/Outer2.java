package com.test.apiDay06;

import com.test.apiDay06.Outer1.Inner;

public class Outer2 {
	String outValue = "outValue";
	String same = "outSame";

	// 方法内部类 内部类被封装在外部类的方法中
//	调用方法：在该方法中 内部类外 实例化内部类，并调用内部类方法，在可执行文件中，调用该方法	
	public void outer() {
		class Inner {
			String innerValue = "innerValue";
			String same = "innerSame";
			public void print() {
				System.out.println(outValue);
				System.out.println(innerValue);
				System.out.println(Outer2.this.same);
				System.out.println(Inner.this.same);
			}
		}
		Inner inn=new Inner();
		inn.print();
	}
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.outer();
	}
}
