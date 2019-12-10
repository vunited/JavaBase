package com.test.oopDay06;

public class OopDay06 {
	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setAge(18);
		mem1.setName("张三");
		Member mem2 = new Member();
		mem2.setAge(20);
		mem2.setName("张三");
		System.out.println(mem1.equals(mem2));
		System.out.println(mem1.toString());
		
//		基本数据类型                    包装类
//		byte                Byte
//		short               Short
//		int                 Integer
//		long                Long
//		float               Float
//		double              Double
//		char                Character
//		boolean             Boolean
		
		
//		Integer 类
//		int 的 包装类（封装类）
        
//		创建包装类对象
		Integer int01=new Integer(12);
		Integer int02=new Integer("12");
		System.out.println(int01);
		System.out.println(int02);
		System.out.println(int01+int02);
//		Integer int03=new Integer("abc"); !!!!!!
		
//		Integer 常用方法
//		Integer.parseInt(s)   字符串转数字
		System.out.println(Integer.toBinaryString(500)); //数字转二进制字符串 Arrays.binarySearch
		System.out.println(Integer.toHexString(500)); //数字转十六进制字符串
		System.out.println(Integer.toOctalString(500)); //数字转八进制字符串
		
		System.out.println(int01.equals(int02));
		System.out.println(int01==int02);
		
		
		Integer int03=new Integer(20);
		int int04=int03.intValue(); //以int类型返回该Integer对象的值
	
//		String int 的转换
//		String===》int
		String str1="100";
		int int05=Integer.parseInt(str1);
		
//		int===>String
		int int06=123;
		String str2=""+int06;
		String str3=Integer.toString(int06);
		String str4=String.valueOf(int06);
		
//		拆箱 装箱
//		拆箱
		Integer int07=new Integer(23);
		int int08=int07.intValue();   //手动拆箱
		
		int int09=int07;     //自动拆箱
		
//		装箱
		int int10=8;
		Integer int11=Integer.valueOf(int10); //手动装箱
		Integer int12=int10;    //自动装箱
		
		System.out.println(Integer.MAX_VALUE);
//		Integer.MIN_VALUE
//		Integer.TYPE
//		Integer.SIZE
		
//		1-9 10    16    255
//		1-9 A-F   10    FF
//		
//		1  2   3   4
//		1  10  11  100
//		
//		10110  
//		16 + 4  +2   22
//		
//		300        0 
//		150        0
//		75         1
//		37         1
//		18         0
//		9          1
//		4          0
//		2          0
//		1          1
//		100101100
		
		
		
		
		
	}
}
