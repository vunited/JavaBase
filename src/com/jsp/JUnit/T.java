package com.jsp.JUnit;

public class T 
{
	public static int sum=0;
	public T(){}
	public T(int x,int y)
	{
		sum = this.add(x, y);
		
		
	}
	public int add(int x, int y) {
		System.out.println(sum);
		return x + y;
		
	}
	
	public int divide(int x, int y) {
		return x/y;
	}
	
	public static void main(String[] args) {
		int z = new T().add(3, 5);
		System.out.println(z);
	}
}
