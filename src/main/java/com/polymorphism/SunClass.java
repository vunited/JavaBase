package com.polymorphism;

public class SunClass extends SupperClass{
public static void print() {
		
		System.out.println(" son static");
	}
	
	
	public void print_not()
	{
		System.out.println("son not static");
	}
	
	
	public int close()
	{
		return 2;
	}
}
