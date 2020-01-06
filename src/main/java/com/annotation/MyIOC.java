package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyIOC {
	public Object getBean(String className)
	{
		Object obj = null;//变量接收最终的对象
		//1.通过传递的className来获取对应的类Class
		try {
			Class cls = Class.forName(className);
			//通过cls创建一个空的对象
			Constructor con = cls.getConstructor();
			obj = con.newInstance();
			//3.创建对象后将对象内的所有属性自动赋值 DI依赖注入 存入文件（代码包装起来不能修改，文件可修改；XML文件），或存入注解中（编写开发方便，调参方便，包装后不可修改）
			//4.首先获取属性值，类的无参数构造方法之上
			OrginAnnotation ann = (OrginAnnotation)con.getAnnotation(OrginAnnotation.class);
			//5.获取a注解对象内携带的信息 person对象中所有属性
			
			Class clz = ann.getClass();
			String[] values = (String[]) clz.getMethod("value").invoke(ann);
			
			//6.将Values中的每一个值 对应的赋给属性
			//找寻属性对应的set方法赋值
			Field[] fies = clz.getDeclaredFields();//获取全部私有属性
			
			for (Field field : fies) {
				System.out.println(field.toString());
			}
			
			  for (int i=0;i<fies.length;i++) { //找寻属性名 
				  String Fname = fies[i].getName();
			  //处理set方法拼串 
				  String FirstLetter =Fname.substring(0,1).toUpperCase();
				  //set后的首字母 
				  String LastLetter = Fname.substring(1);
			  
			  //拼接 
			StringBuilder setMethodName = new StringBuilder("set");
			  setMethodName.append(FirstLetter); 
			  setMethodName.append(LastLetter);
			  
			  //需要将注解内读取到String类型转化为属性类型对应的值 
			  Class fieldTypes = fies[i].getType();
			  
			  
			  System.out.println(Fname);
			  //通过处理好的set方法找到对应的找到对应set方法,参数为属性类型（私有）
			Method setMethod = clz.getMethod(setMethodName.toString(), fieldTypes); 
			  //执行找到的set方法
			  //开始赋值
			  
			 setMethod.invoke(obj,fieldTypes.getConstructor(String.class).newInstance(values[i]));
			  
			  
			  
			  }
			 
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
