package com.test.javaBasic;

import java.util.Scanner;

public class JavaDay03 {
	public static void main(String[] args) {
//方法： 实现某种特定功能的代码片段
//		方法的特点： 代码复用 维护修改方便
//		方法的格式：
//		可见性   修饰词   返回数据类型   方法名（形参列表）{
//			方法体
//		}
//		调用方法：  方法名（实参列表）
//		int[] x = { 4, 5, 3 };
//		System.out.println(sumFunc(5, 7));
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println(maxInThree(a,b,c));
//		int[] arr={4,5,43,65,34};
//		System.out.println(maxInArrays(arr));

//System.out.println(maxInNums());
//System.out.println(maxInNums(4));
//System.out.println(maxInNums(5,23));
//System.out.println(maxInNums("erer"));

//		public static void demo01(int x) {
//			x=10;
//		}
//		public static void demo01(int[] x) {
//			x[0]=10;
//		}

//		int a = 1;
//		demo01(a); // demo01(1)
//		System.out.println(a);

		int[] arr = { 1, 1, 1, 1, 1, 1, 1 };
		demo01(arr);
		System.out.println(arr[0]);
		
		System.out.println(mulNum(11));
	}

	public static int demoPrint(int[] arr) {

		return arr.length;
	}

	// 方法：形参为两个整型变量，返回值为求和
	public static int sumFunc(int num1, int num2) {
		return num1 + num2;
	}

//case:1设计一个方法，返回三个整型变量中的最大值    形参  三个整型变量
	public static int maxInThree(int num1, int num2, int num3) {
		return ((num1 > num2) ? num1 : num2) > num3 ? ((num1 > num2) ? num1 : num2) : num3;
	}

//case：2设计一个方法，返回一个数组中的最大值   形参  一个整型数组
	public static int maxInArrays(int[] arr) {
		int max = arr[0];
		for (int eachNum : arr) {
			if (max < eachNum) {
				max = eachNum;
			}
		}
		return max;
	}

//		可见性：
//		public :同一个包里的类，包外的类，同一个项目里都可见
//		protected: 同一个包里的类，包外的子类 可见
//		(default): 同一个包里的类 
//		private:仅对当前类可见
//      public protected (default) private  static void return 
//		修饰词：
//		static: 静态的
//		(default):动态的
//		静态只能调用静态！！！

//		返回数据类型：
//		void :无返回值

//		方法名：
//		首字母小写 驼峰式命名

//	    return的使用：
//	      有返回数据类型时，return 后面跟的是返回值  注意！返回的值要和返回数据类型对应
//	    无返回数据类型时（void），return表示 跳出当前方法

//	 形参：形式参数  创建方法时，方法名后括号内  写法：  数据类型  变量名	
//	实参：实体参数  调用方法时，方法名后括号内 写法：  变量值	
//	形参，实参： 顺序，和数据类型要一致

//	方法的重载： 方法名相同，形参的类型，数量不同。!!!和返回类型无关
	public static int maxInNums() {
		return 1;
	}

//	public static void maxInNums() {
//	}
	public static int maxInNums(int num1) {
		return 2;
	}

	public static int maxInNums(int num1, int num2) {
		return 3;
	}

	public static int maxInNums(String num1) {
		return 4;
	}

	// 值传递
//	基本数据类型： 传递的是 真实的值
//	数组或其他对象： 传递的是  对象的引用
	public static void demo01(int x) {
		x = 10;
	}

	public static void demo01(int[] x) {
		x[0] = 10;
	}

//	方法的使用技巧：递归  方法内调用自身方法 
//	5！   5*4*3*2*1   4!  4*3*2*1    5！==5*4！   1！==1
//  mulNum(1) ==  1
//	mulNum(n)  ==  n*mulNum(n-1) 
//	mulNum(1)
	public static int mulNum(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * mulNum(num - 1);		                                    
		}
	}
//	System.out.println(mulNum(11));
//	case:1 一个球从h米高度坠落，第一次反弹至h/2，第二次反弹至第一次的一半。
//	            计算第n次，反弹回多少米
//	            public static int ballHight(int h,int n) {
//		
//	}
//	System.out.println(ballHight(10,3));
//	case：2 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月
//	后每个月又开始生兔子.计算，第n个月 兔子总数为多少。
//	
//	case：3 一个防御盾牌，每次被攻击，防御值减少一半再减少1点，以后每次被攻击，
//	防御值都减少(当前防御值的一半加1点)，到第十次被攻击结束之后，防御值只剩1点，
//	计算防御盾牌初始值为多少。

}
