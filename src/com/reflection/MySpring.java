package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;



public class MySpring {

	/*
	 * 设计一个方法，帮我控制对象的创建
	 * 
	 * 是否需要参数，String类全名
	 * 是否需要返回值，对象Object
	 * 
	 */
	
	public Object getBean(String className)
	{
		
		Object ob = null;
		Scanner input = new Scanner(System.in);
		System.out.println("请给："+className+"类赋值");
		
		try {
			Class clazz = Class.forName(className);
			//通过clazz创建对象
			
			
			
			ob = clazz.newInstance();
			//在这里做一个自动DI注入 对象中所有属性值
			//找到每一个不同对象中的所有set方法，给属性赋值
			//通过拼接字符串的方式处理名字
			//1.先通过clazz找寻所有私有属性，获取每一个属性名--处理set属性
			Field[] f = clazz.getDeclaredFields();
			for (Field field : f) {
				//获取属性名
				String fieldName = field.getName();
				//2.手动拼接，属性对应的set方法名 设置setName，setSex
				String firstLetter = fieldName.substring(0,1).toUpperCase();//substring,截取首字母，并首字母大写
				//其他字母，从一号往后
				String otherLetters = fieldName.substring(1);
				//StringBuilder与StringBuffer相比就是去掉了保证线程安全的那部分，减少了开销，频繁的字符串操作还是得用StringBuilder
				StringBuilder setMethodName = new StringBuilder("set");				
				setMethodName.append(firstLetter);
				setMethodName.append(otherLetters);
				//拼串end
				//3.获取field对应的属性类型--找寻set方法时候传递参数
				Class fieldClass = field.getType();
				//4.通过处理好的set方法名找寻类中的set方法
				Method setMethod = clazz.getMethod(setMethodName.toString(),fieldClass);//参数应该是每一个属性对应的类型
				//5.找到setMethod执行，属性就赋值成功
				System.out.println("请给"+fieldName+"属性赋值");
				
				String value = input.nextLine();//String类型
				//若其他类型 怎么办？值得类型应该改为所有属性的类型
				//需要执行属性对应的set方法给属性赋值，方法才结束
				//属性的值是接收过来的（可以是scanner输入的，也可以是文件读取的---得来的都是String类型--信息流，通过反射读取注解读值）
				//如何将信息流转换成属性对应的类型的值 包括int（Integer）Float等
				//Integer 包装类，八个包装类7个都含String的构造方法
			//new Integer(String) ；new Float(String) ；char不行
				//此方法不用于 集合和数组
				//利用包装类带String的构造方法来处理，寻找属性类型对应String构造方法
				//值类型应该是属性的类型
				Constructor con = fieldClass.getConstructor(String.class);
				
				setMethod.invoke(ob,con.newInstance(value));
			
			
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return ob;
	}
	
//	public Person getBean(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
