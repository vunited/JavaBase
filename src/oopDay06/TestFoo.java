package com.test.oopDay06;

class Foo {
	public int a;

	public Foo() {
		a = 3;
	}

	public void addFive() {
		a += 5;
	}
}

class Bar extends Foo {
	public int a;

	public Bar() {
		a = 8;
	}

	public void addFive() {
		this.a += 5;
	}
}

public class TestFoo {
	public static void main(String[] args) {
		Foo foo = new Bar();
		foo.addFive();
		System.out.println("Value: " + foo.a);
	}
}
