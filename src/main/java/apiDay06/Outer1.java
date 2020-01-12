package com.test.apiDay06;

public class Outer1 {
	String outValue = "outValue";
	String same = "outSame";

	// 成员内部类 类直接写在外部类中
	class Inner {
		String innerValue = "innerValue";
		String same = "innerSame";
		
		public void print() {
			System.out.println(outValue);
			System.out.println(innerValue);
			System.out.println(Outer1.this.same);
			System.out.println(Inner.this.same);
		}		
	}
	
	public static void main(String[] args) {
		//实例化成员内部类对象
		Outer1 out=new Outer1();
		Outer1.Inner in=out.new Inner();
		in.print();
	}
}
