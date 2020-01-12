package com.test.javaBasic;

public class JavaDay01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 输出语句
//		println 输出后换行 print输出
//		System.out.println("Java Run Test 你我他");
//		System.out.print("2");
//		System.out.print("3");
//		System.out.println("4");
//		System.out.println("5");
//        JavaDay01   Java_day_01
//		f复制 粘贴 剪切 查找  保存 ctrl +  c  v   x   f   s
//		撤销  取消撤销   z   y   
//		ctrl  +  shift  + l  查看所有快捷键
//		ctrl   +  shit  + F   代码格式标准化 
//      ctrl  /   
//      ctrl   shift   /

//		1.变量 常量 
//		2.支持的数据类型
//		3.支持的符号
//		4.过程控制语句 判断 循环
//		5.语言特有的功能 

//		变量： 可以改变的量 
//		变量的使用方法： 先声明（变量的诞生）  再赋值
//		变量声明：  数据类型 变量名
//		int a;
////		赋值
//		a = 20;
//		System.out.println(a);
//		a = 50;
//		System.out.println(a + a + 8);
//
////		常量： 一经赋值 不可更改   final 数据类型 变量名 
//		final int B;
//		B = 50;
//		System.out.println(B);
//
//		int b=5,c=7,d=20;
//		int e,f,g;

//		数据类型
//		8种基本数据类型   +   类 类型(系统继承的类型 String 的顶级父类 object +  自定义  )
//		整数型        byte     short           int          long   
//		 字节数     1（8位）    2                 4            8
//		 范围      -128~127   -32768~32767     正负21亿               
//		浮点数    float  double 
//		字节数      4        8
//		float 单精度浮点类型    
//		double 双精度浮点类型  
//		布尔型  boolean   :  两个值  true  false
//		字符型  char: 可以存放单个字母 数字 汉字

//		byte byte01=20;
//		short short01=30000;
//		long long01=72487334234234L;   //long型变量赋值   值后加字母L
//		
//		float f1=4.564f;   //float型变量赋值  值后加字母F
//		double d1=3.1415926;   //double型变量赋值  值后可加字母D  也可省略
//		boolean flag=true;
//		char c1='叁';
//		char c2='t';

//		int a=10,b=20;
//		int temp=a;
//		a=b;
//		b=temp;

//		数据精度 从低到高： byte  short  int   long   float  double 
//		基本数据类型之间的转换规则

//		从高到低  高精度的值赋值给低精度变量  需要强制转换  强转的值不能溢出
//		int a=100;
//		byte b=(byte)a;
//		System.out.println(b);
//		
////		从低到高 低精度的值赋值给高精度变量  直接转换
//		byte c=125;
//		int d=c;
//		
////		浮点数转整型 取整  无四舍五入
//		float f1=3.14f;
//		int i1=(int)f1;
//		System.out.println(i1);

		// 不同精度运算 首先低精度自动往高精度转换 类型一致后进行运算
//		1.数字默认int型
//		2.运算时需要类型一致
//		int d=(int)(2+1.5f+3.5d);
////		2+1.5f+3.5d  ====》   2.0d+1.5d+3.5d    ===>  7.0d  ===> 7
//		System.out.println(d);
//		
//		符号
//		算术运算符： + - * / %
//		int x = 20;
//		int y = 3;
//		String s = "3";
//		System.out.println(x + s);
////		1.+ 两侧 只要有一侧不为数值型 则+ 不做加法运算 而是拼接符
//		System.out.println(x + x + s); // 403
//		System.out.println(s + x + x); // 32020
//		System.out.println("" + x + y);
//
//		System.out.println(x - y);
//		System.out.println(x * y);
//		System.out.println(x / y); // 取整 无四舍五入
//		System.out.println(x % y);
//
//		int demo = 43462;
//		System.out.println(demo / 10000);
//		System.out.println(demo / 1000 % 10); // 43 3
//		System.out.println(demo / 100 % 10);
//		System.out.println(demo / 10 % 10);
//		System.out.println(demo % 10);
//
//		System.out.println(demo / 10000);
//		System.out.println(demo % 10000 / 1000); // 3462 3
//		System.out.println(demo % 1000 / 100);
//		System.out.println(demo % 100 / 10);
//		System.out.println(demo % 10);

//赋值运算符 = += -=  *=   /=  %=
//int a=6;
//		a+=6; //====>  a=a+6
//		a%=6;//  a=a%6

		// a+=b a=a+b

//		int a=6;
//		double b=3.6;
//		a+=b;
//		a=(int)(a+b);

////		比较运算符 >  <   >=  <=  ==  !=   比较运算符连接的算式结果位为 boolean型值
//		int a=20;
//		int b=30;
//		System.out.println(a>=b);
//		
////		逻辑运算符 &&  ||   !
//		true&&false   
//		true||false 

//		自增自减运算符  ++  --
//		a++   ++a 

//		三目运算符   (条件)?值1:值2
//		int a=23,b=35;
//		System.out.println((a>b)?a:b);

//		过程控制语句
//		判断
//		单分支：
//		if(条件) {
//			
//		}
//		
//		双分支：
//		if() {
//			
//		}else {
//			
//		}
//		
//		多分支：
//		if() {
//			
//		}else if() {
//			
//		}else if() {
//			
//		}else {
//			
//		}
//		switch //switch(demo)  demo必须是 byte  short  int  char 中的一个
//		int demo = 3;
//		switch (demo + 10) {
//		case 1:
//			System.out.println("1");
//			break;
//		case 2:
//			System.out.println("2");
//			break;
//		case 3:
//			System.out.println("3");
//			break;
//		case 4:
//			System.out.println("4");
//			break;
//		default:
//			System.out.println("5");
//		}
//
//		int score = 87;
//		switch (score / 10) {
//		case 9:
//			System.out.println("优秀");
//			break;
//		case 8:
//			System.out.println("良好");
//			break;
//		case 7:
//			System.out.println("勉强");
//			break;
//		case 6:
//			System.out.println("及格");
//			break;
//		default:
//			System.out.println("fail");
//		}
//
////		循环
//
//		for (int index = 1; index <= 10; index++) {
//			for (int i = 1; i <= 10; i++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//
//		int ii=10;
//		while(ii>1) {
//			System.out.println(ii);
//			ii--;
//		}
//		
//		int iii=0;
//		do {
//			System.out.println(iii);
//			iii--;
//		}while(iii>1);
		
		//判断一个数字是否为质数
		//一个数字  67
		int num=67;
		//计数器 初始值为0
		int count=0;		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++; //找到能整除的数字 计数器加1
			}
		}		
		if(count==0) {
			System.out.println(num+"是质数");
		}else {
			System.out.println(num+"不是质数");
		}
		
		//判断一个数字是否为质数
		int num2=47;
		//初始化开关
		boolean flagX=true;
		for(int i=2;i<num2;i++) {
			if(num2%i==0) {
				flagX=false; //找到能整除的数字 开关关闭
			}
		}
		if(flagX) {
			System.out.println(num2+"为质数");
		}else {
			System.out.println(num2+"不为质数");
		}
		
		
//		1.给定一个偶数 n=20
//		2.从2开始循环到n/2  2~10
//		3.在2~10中寻找质数    找到3
//		4.判断n-找到的质数   是否为质数   20-3=17   17是否为质数？
//		CSDN V2EX
//		黑马程序员  千峰  菜鸟
		
		int num3=88;
		for(int i=2;i<=num/2;i++) {
			boolean flag=true;
			for(int ii=2;ii<i;ii++) {
				if(i%ii==0) {
					flag=false;
					break;
				}
			}			 
			if(flag) {
				boolean flag2=true;
				for(int i3=2;i3<num-i;i3++) {
					if((num-i)%i3==0) {
						flag2=false;
						break;
					}
				}
				if(flag2) {
					System.out.println(i+","+(num-i));
				}
				
			}
		}
		
		
		
		
		
	}

	public boolean fun1(int num){
		//...
		return false;		
	}
}
