package com.numeber;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 
 * 
 * @author Administrator 
 * Boolean false 
 * Char '\u0000'(null) 
 * byte (byte)0 
 * short (short)0 
 * int 0 
 * long 0L 
 * float 0.0f 
 * double 0.0d
 */

public class TestNumbers {

	static int i;

	// Constructor
	public TestNumbers(String url) {
		System.out.println(url);
		i++;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		float a = 123.01f + 1.01f;
		System.out.println(a);// 124.020004 精度有问题

		new TestNumbers("www.vunited.net");

		Integer b = Integer.valueOf("11101", 2);
		System.out.println(b);

		double d1 = 2.15;
		double d2 = 1.10;
		System.out.println(d1 - d2);

		// 牺牲了速度，但换来了精度。只是必须使用方法调用，不能使用运算符。BigInteger 支持任意精度的整数。
		// 也就是说，我们可精确表示任意大小的整数值，同时在运算过程中不会丢失任何信息。
		// BigDecimal 支持任意精度的定点数字。例如，可用它进行精确的币值计算。
		BigInteger bi1 = new BigInteger("1234");
		BigInteger bi2 = new BigInteger("54321");
		System.out.println(bi1.toString() + "+" + bi2.toString() + "=" + bi1.add(bi2));

		// -,op1.subtract(op2)
		// *,op1.multiply(op2)
		// ÷,op1.divide(op2)
		// ^2,op1.pow(2);
		// %,op1.remainder(op2)

		BigDecimal bd1 = new BigDecimal("2.1000555");
		BigDecimal bd2 = new BigDecimal("1.10");
		System.out.println("bigdecimal 类型运算：" + bd1.subtract(bd2));

		bd1.setScale(5, 5);
		bd2.setScale(5, 5);
		
		BigDecimal bd3;
		bd3 = bd1.add(bd2);
		System.out.println(bd3.setScale(5, 5));//设置四舍五入和小数位宽
		//3.20006
		
		// -,op1.subtract(op2)
		// *,op1.multiply(op2)
		// ÷,op1.divide(op2)
		// ^2,op1.pow(2);
		// %,op1.remainder(op2)
////////////////////////////////////////////////////////////////////////////////////////

		byte c = (byte) 129;
		System.out.println(c);
		System.out.println(Integer.parseInt("29"));// return int
		System.out.println(Integer.valueOf("29"));// return int

		Float a2 = 0.0f;
		System.out.println(Float.MIN_VALUE + "|" + Float.MAX_VALUE);

		short a3 = 1;
		short b3 = 2;

		int b4 = 2;
		System.out.println((a += b) + "." + a);
		// a3= a3+b4; += 可以隐式转换，+ 不能隐式转换
		a3 = (short) (a3 + b4);

		b4 = b4++;// ++返回的是空值
		System.out.println(b4);

		int i3 = Integer.MAX_VALUE;
		if (i3 > i3 + 1)// +1溢出 变为负数
		{
			System.out.println("exist");
		}

		System.out.println(i);

		short a4 = 128;
		byte b5 = (byte) a;
		System.out.println(b5);

		System.out.println(1.0 / 0.0);// Infinity 浮点数不能等于0,此为正无穷大
		System.out.println(Double.isInfinite(1.0 / 0.0));
		System.out.println(Double.NEGATIVE_INFINITY);// 負無窮F
		System.out.println(Double.POSITIVE_INFINITY);// 正无穷

	}

	static {
		System.out.println("静态代码块");
	}

	/*
	 * 静态代码块 124.020004 www.vunited.net 29 1.0499999999999998 bigdecimal 类型运算：1.05
	 * -127 29 29 1.4E-45|3.4028235E38 153.02.153.02 2 exist 1 -103 Infinity true
	 * -Infinity Infinity
	 */
}
