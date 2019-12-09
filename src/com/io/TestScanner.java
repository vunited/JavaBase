package com.io;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//
		System.out.println("请输入字符");
		String a1 = sc.nextLine();
		System.out.println(a1);
		
		
		System.out.println("请输入数字");
		int a = sc.nextInt();
		System.out.println(a);
		
		sc.nextLine();//解决nextline()吞上一个回车符的问题
		
		System.out.println("请输入字符2");
		String a2 = sc.nextLine();//吸收上一个回车符 ;
		System.out.println(a2);

		
	}

}
