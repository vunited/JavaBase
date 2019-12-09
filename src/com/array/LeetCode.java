package com.array;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class LeetCode {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void findMedianSortedArrays() {
   	 	//double zhongweishu=0;
		int[] nums1 = null;
		int[] nums2;
   	//请输入第一个数组的值
   	 	int m=10;       //定义一个整型变量n
        
         Scanner arr=new Scanner(System.in);//用Scanner类获取控制台的输入
         System.out .println("请输入10个数字(用空格隔开)：");//显示台输出提示--请输入10个数字(用空格隔开)：
         
        
         
         //用for循环逐一获取控制台输入的十个数字赋值给数组array
         
         for(int i=0;i<m;i++) //定义变量当i=0,当i<数组长度时，执行循环语句，否则跳出；每执行一次i=1+1
         {
       	  nums1[i]=arr.nextInt();//接受控制台输入的数字给数组array赋值
         }
         System.out.println();//显示台输出一个空白行用于作间隔
         System.out.print("排序前数组： ");//显示台输出提示--排列前数组：
         //用for循环逐一提取显示数组array的元素
          for(int i=0;i<m;i++)//定义变量当i=0,当i<数组长度时，执行循环语句，否则跳出；每执行一次i=1+1
          {
                System.out.print(nums1[i]+" ");//显示台输出数组array的元素，中间用"空格"隔开
           }
		//return zhongweishu;

//          
//       
//   
//       //请输入第二个数组的值
//          int n=10;       //定义一个整型变量n
//          int array2[]=new int[n];     //创建一个长度为n的定长数组 
//          Scanner arr2=new Scanner(System.in);//用Scanner类获取控制台的输入
//          System.out .println("请输入10个数字(用空格隔开)：");//显示台输出提示--请输入10个数字(用空格隔开)：
//          //用for循环逐一获取控制台输入的十个数字赋值给数组array
//          for(int i=0;i<array2.length;i++) //定义变量当i=0,当i<数组长度时，执行循环语句，否则跳出；每执行一次i=1+1
//          {
//              array2[i]=arr2.nextInt();//接受控制台输入的数字给数组array赋值
//          }
//           System.out.println();//显示台输出一个空白行用于作间隔
//          System.out.print("排序前数组： ");//显示台输出提示--排列前数组：
//          //用for循环逐一提取显示数组array的元素
//           for(int i=0;i<array2.length;i++)//定义变量当i=0,当i<数组长度时，执行循环语句，否则跳出；每执行一次i=1+1
//           {
//                 System.out.print(array2[i]+" ");//显示台输出数组array的元素，中间用"空格"隔开
//            }
//       
//       return zhongweishu;
       
           
       
       
       // StringBuffer sb = new StringBuffer();
       // System.out.println(sb);
   }

}
