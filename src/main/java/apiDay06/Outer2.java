package com.test.apiDay06;

import com.test.apiDay06.Outer1.Inner;

public class Outer2 {
	String outValue = "outValue";
	String same = "outSame";

	// �����ڲ��� �ڲ��౻��װ���ⲿ��ķ�����
//	���÷������ڸ÷����� �ڲ����� ʵ�����ڲ��࣬�������ڲ��෽�����ڿ�ִ���ļ��У����ø÷���	
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
