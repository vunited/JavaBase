package com.test.apiDay06;

public class Outer1 {
	String outValue = "outValue";
	String same = "outSame";

	// ��Ա�ڲ��� ��ֱ��д���ⲿ����
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
		//ʵ������Ա�ڲ������
		Outer1 out=new Outer1();
		Outer1.Inner in=out.new Inner();
		in.print();
	}
}
