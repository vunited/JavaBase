package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Test {

	@org.junit.jupiter.api.Test
	
	//获取person类中属性上方的注解信息
	void test()
	
	{
		//解析Person类中 属性上面的注解信息
		
		//【1】获取person类对应的Class
		
		//		Person p = new Person();
		//		Class cl = p.getClass();
		
		//Class cl = Person.class;//类已经存在时
		try {
			Class cl = Class.forName("com.annotation.Person");
			//【2】获取class中的属性
			Field fd = cl.getDeclaredField("name");
			//【3】通过Field获取注解对象
	/*
	 * 正常的对象调用方法		
	 * 
	 * OrginAnnotation org = (OrginAnnotation)fd.getAnnotation(OrginAnnotation.class);			
	 * String[] v = org.value();
	 * for (String string : v)
	 *  {
	 *  System.out.println(string);
	 *  }
	 */
			//【3】改用 反射的方法进行
			Annotation ant = fd.getAnnotation(OrginAnnotation.class);
			Method md = ant.getClass().getMethod("value");
			String[] st = (String[])md.invoke(ant);
			//invoke(对象，参数) 谁调用的Annotation 就用谁的， 参数在注解中已经给了所以这里不需要给参数了；
			
			for (String string : st) {
				System.out.println(string);
			}
//			Method md = an.getClass().getMethod("value");
//			md.invoke(new Person(),"sangjiexun");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	@org.junit.jupiter.api.Test
	//获取person类中方法上面的注解信息
		void test2() 
		{
			Class cl = Person.class;
			Method md2;
			try {
				md2 = cl.getMethod("hello", null);
				Annotation ant2 = md2.getAnnotation(OrginAnnotation.class);
				String[] str = (String[])ant2.getClass().getMethod("value", null).invoke(ant2, null);
				for (String string : str) {
					System.out.println(string);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		}	
	
	@org.junit.jupiter.api.Test
	//获取person类中方法上面的注解信息
		void test3() 
		{
			//获取一个person 对象不用自己处理，跟别人要 MySpring
			//对象的创建权反转，赋值自动（自动DI），别人处理
			MyIOC my = new MyIOC();
			Person p = (Person)my.getBean("com.annotation.Person");
			System.out.println(p.getName()+p.getSex()+p.getAge());
		
		}

}
