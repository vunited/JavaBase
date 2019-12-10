package com.test.javaBasic;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JavaDay04 {
	public static void main(String[] args) {
//		System.out.println(ballHight(10, 3));
//		System.out.println(2 * rabNum(10));
//		System.out.println(defValue(0));

//		算法：排序--------冒泡排序(Bubble Sort):两两比较，大的值放后面
		int[] demoArr = { 5, 9, 7, 4, 3 };
//		对象方法排序
//		Arrays.sort(demoArr); //升序
		// 手动排序
//		{5,9,7,4,3}  
//		
//		{5,9,7,4,3}      第一轮 第一次
//		{5,7,9,4,3}      第一轮 第二次
//		{5,7,4,9,3}      第一轮 第三次
//		{5,7,4,3,9}      第一轮 第四次
//		
//		{5,7,4,3,9}      第二轮 第一次
//		{5,4,7,3,9}      第二轮 第二次
//		{5,4,3,7,9}      第二轮 第三次
//		
//		{4,5,3,7,9}      第三轮 第一次
//		{4,3,5,7,9}      第三轮 第二次
//		
//		{3,4,5,7,9}      第四轮 第一次

		arraySort(demoArr);
		System.out.println(Arrays.toString(demoArr));

//		算法：查找（有序）------二分法
		//手写二分法
		int[] demoArr02 = { 12, 24, 53, 23, 56, 74, 96, 235, 65, 47, 70, 1, 2, 5, 9, 7, 30 };
		arraySort(demoArr02);  //查找之前 首先排序
		System.out.println(Arrays.toString(demoArr02));
		int value = 80; //被查询的值
		int high = demoArr02.length - 1;  //右侧边界下标
		int low = 0;  //左侧边界下标
		int middle = 0;  //下标中值
		int index = 0;  //接被查询的值的下标
		boolean boo = false;  //开关（判断被查询的值是否在数组中）
		while (low <= high) { //循环条件（左侧边界下标 <=右侧边界下标）
			middle = (low + high) / 2;  //下标中值赋值 等于（左侧边界+右侧边界）/2
			if (demoArr02[middle] == value) { //如果被查询的值等于中间下标对应元素值
				boo = true;                 //打开开关
				index = middle;             //将下标中值赋值给index
				break;                      //跳出循环
			}
			if (demoArr02[middle] > value) {  //如果被查询的值<中间下标对应元素值
				high = middle - 1;            //新的右侧边界等于原中值下标-1
			}
			if (demoArr02[middle] < value) {  //如果被查询的值>中间下标对应元素值
				low = middle + 1;             //新的左侧边界等于原中值下标+1
			}
		}
		if(boo) {      //判断开关状态
			System.out.println(value+"在数组中，下标为"+index);
		}else {
			System.out.println(value+"不在数组中");
		}
		//系统对象的方法实现查找
		System.out.println(Arrays.binarySearch(demoArr02,80));
		
		//控制台输入 使用场景：局部或方法功能测试
//		Scanner scan=new Scanner(System.in); //实例化Scanner对象
//		int x=scan.nextInt(); //创建整型变量 从控制台赋值
//		System.out.println(x);
////		Byte y=scan.nextByte();
////		System.out.println(y);
//		String s=scan.next(); //创建字符串变量，从控制台赋值
//		System.out.println(s);
//		double h=scan.nextDouble();
//		int n=scan.nextInt();
//		System.out.println(ballHight(h,n));
		
		//生成随机数
		Random rd=new Random();  //导入随机数类
		int target=rd.nextInt(100)+1;   //random.nextInt(n)   生成[0,n)随机整数
		if(target<=3) {
			System.out.println("恭喜获得SSR");
		}else if(target<=13) {
			System.out.println("恭喜获得SR");
		}else if(target<=63) {
			System.out.println("恭喜获得R");
		}else {
			System.out.println("谢谢惠顾");
		}

	}

//	case:1 一个球从h米高度坠落，第一次反弹至h/2，第二次反弹至第一次的一半。
//  计算第n次，反弹回多少米
	public static double ballHight(double h, int n) {
		if (n == 0) {
			return h;
		} else {
			return ballHight(h, n - 1) / 2;
		}
	}
//	1:ballHight(h,n)==ballHight(h,n-1)/2     2: ballHight(h,0)==h

//case：2 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月
//后每个月又开始生兔子.计算，第n个月 兔子总数为多少。
//月份            数量
//1                1 
//2                1
//3                2
//4                3
//5                5
//6                8
//	rabNum(6)==rabNum(5)  + rabNum(4)    rabNum(2)==1  rabNum(1)==1
	public static int rabNum(int month) {
		if (month == 2 || month == 1) {
			return 1;
		} else {
			return rabNum(month - 1) + rabNum(month - 2);
		}
	}

//case：3 一个防御盾牌，每次被攻击，防御值减少一半再减少1点，以后每次被攻击，
//防御值都减少(当前防御值的一半加1点)，到第十次被攻击结束之后，防御值只剩1点，
//计算防御盾牌初始值为多少。
	public static int defValue(int attTime) {
//	defValue(n)==  (defValue(n+1)+1)*2  
//			defValue(10)==1	
		if (attTime == 10) {
			return 1;
		} else {
			return (defValue(attTime + 1) + 1) * 2;
		}
	}
	
	public static void arraySort(int[] demoArr) {
		for (int i = 0; i < demoArr.length - 1; i++) {
			for (int j = 0; j < demoArr.length - 1 - i; j++) {
				if (demoArr[j] > demoArr[j + 1]) {
					int temp = demoArr[j];
					demoArr[j] = demoArr[j + 1];
					demoArr[j + 1] = temp;
				}
			}
		}
	}
//	!!!debug运行（debug测试）：点击debug按钮   F6：下一步  F8:直接运行至下一个断点（如无断点，结束运行）
//            F5:进入方法   F7：退出方法
	
	
	
	
}
