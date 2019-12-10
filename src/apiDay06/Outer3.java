package com.test.apiDay06;

public class Outer3 {
	static String outValue = "outValue";
	static String same = "outSame";
	//¾²Ì¬ÄÚ²¿Àà
	static class Inner {
		String innerValue = "innerValue";
		String same = "innerSame";
		public void print() {
			System.out.println(outValue);
			System.out.println(innerValue);
			System.out.println(Outer3.same);
			System.out.println(Inner.this.same);
		}
	}
	
	public static void main(String[] args) {
		Outer3.Inner inn=new Outer3.Inner();
		inn.print();
	}
}
