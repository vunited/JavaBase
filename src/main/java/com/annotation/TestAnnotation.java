package com.annotation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Properties;

public class TestAnnotation implements Serializable {
	//@SuppressWarnings("unused")
	private static final long serialVersionID = 1L;
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
/*
 * 			@Deprecated 过时弃用
 * 			@Override 用来做代码检测 检测此方法是否是一个重写
 * @SuppressWarnings({"xxx"}) xxx为String类型数组，如果一个长度则省略{ }
 * xxx == 
 * unused 变量定义后未被使用、
 * serial 类实现了序列化的接口，不添加序列化ID号、
 * rawtypes 集合没有定义泛型、
 * 
 * deprecation 方法废弃、
 * unchecked出现了泛型的问题，可以不检测
 * all 包含以上所有
 */
		
		/*
		 * 注解中可以携带信息
		 * 1.基本数据类型
		 * 2.String类型
		 * 3.枚举类型 enum
		 * 4.注解类型
		 * 5.数组类型 数组内部需要是上面1-4的数据类型
		 */
		
//自己描述一个注解类型
		//@interface 注解类型
		//public @interface XXX类名 利用接口特点帮助记忆 接口的属性 
		//只能是 public static final 修饰属性
		//public abstract 返回类型 方法名（） 返回类型 为上面1-4
		//如果要拿来使用，还要继续说明需要利用JAVA提供好的注解来说明（元注解：用来说明注解）
		
		
		
		
		/*
		 * 
		 * 读取文件中的信息---流/高级流
		 * java util//是Hastable的子类，是一个map类型的集合
		 *	读取文件 文件后缀名.properties
		 *	文件中的内容是k-v对形式
		 *
		 *
		 */
		
		Properties pro = new Properties();
		pro.load(new FileReader("D:\\java\\workspace\\JavaBase\\src\\com\\annotation\\Test.properties"));//加载文件高级流
		
		@SuppressWarnings("rawtypes")// rawtypes 是说传参时也要传递带泛型的参数
		Enumeration en = pro.propertyNames();//类似map.ketSet();返回SET类型集合,需要迭代器遍历
		//迭代器，iteration / it.hasNext();/it.next()//获取;
		//en.hasMoreElements();判断有没有多余元素，适用于遍历，如果有 则 en.nextElement()获取
		
		while(en.hasMoreElements())
		{
			String key = (String)en.nextElement();
			String value = pro.getProperty(key);
			System.out.println(key+":"+value);//后进先出，栈内存中特性
			
		}
		
//		String value = pro.getProperty("key1");
//		System.out.println(value);
	}

}
