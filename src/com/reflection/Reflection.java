package com.reflection;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;



class Reflection {

	Package p;
	
	
	@Test
	void test() {
		//fail("Not yet implemented");
		try {
			Class cz = Class.forName("com.reflection.A");
			p = cz.getPackage();
			System.out.println(cz.getModifiers()+
					"/"+cz.getName()+
					"/"+cz.getSimpleName()+
					"/"+p.getName()+ 
					"/"+cz.getSuperclass());
			
			//ArrayList<String> list;
			cz = ArrayList.class;
			Class cz2 = cz.getSuperclass();
			if(cz2!=null)
			{
				System.out.println(cz2.getName()+"/"+cz2.getSuperclass());
			}
			
			
			//---------------获取当前类所有父类（super类）接口----------------------------------
//			Class[] classes = cz.getInterfaces();
//			for (Class class1 : classes) {
//				System.out.println(class1.getName());
//			}
			
//---------------用反射机制创建对象----------------------------------
			
		//	A a = (A)cz.newInstance();//无参数构造方法创建对象
		//	System.out.println(a);
			//通过反射获取class 通过class获取属性
			Class cz3 = Class.forName("com.reflection.A");
			Field f = cz3.getField("age");
			//获取属性结构
			int modifiers = f.getModifiers();
			System.out.println(modifiers);
			//获取属性类型
//			Class fclass = f.getType();
//			System.out.println(fclass.getName());
			//获取属性名
//			String name = f.getName();
//			System.out.println(name);

			
//---------给属性赋值--------------------------------		
			//对象创建
		//	A a  = new A();
			//对象创建 反射方法
		A a = (A)cz3.newInstance();
			
			
			//*知道属性名，且公有
			//f.set(a, "sangjiexun");
			
			//System.out.println(a);
			
		//	---取值---
			
			/*
			 * String name2 = (String)f.get(a); System.out.println(name2);
			 */
			 
			//--- 不知道属性名 ---
			
			/*
			 * Field[] fileds = cz3.getFields();
			 * System.out.println(fileds.length);//也包括继承来的属性，私有的不获取
			 */			
			
			
			Class cz4 = Class.forName("com.reflection.A");
			//---*操作私有属性---
			Field f3 = cz4.getDeclaredField("name");
			System.out.println(f3.getName());
			
			f3.setAccessible(true);
			f3.set(a, "sangee");
			
			String value = (String)f3.get(a);
			System.out.println(value);
			
		} catch (ClassNotFoundException |   SecurityException | NoSuchFieldException | IllegalArgumentException | IllegalAccessException | InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	@Test
	void test2() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		String str = new String("san");
		System.out.println(str);
		
		Class classz = str.getClass();
		
		Field field = classz.getDeclaredField("value");
		
		
		//jdk9+会报错
		field.setAccessible(true);
		
		//修改private属性值
		char[] temp = (char[])field.get(str);
		//通过temp地址引用，定位并修改
		temp[0] = 'a';
		temp[1] = 'b';
		temp[2] = '3';
		
		//最终输出str
		System.out.println(str);
		
	}
	
	
	
	public void eat()
	{
		System.out.println("eat function");
	}
	public void eat(String food)
	{
		System.out.println("with food eat()");
	}
	
	@Test
	void test3() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException
	{
		Class cal = Reflection.class;
		Reflection r = (Reflection)cal.newInstance();
		
		Method m = cal.getMethod("eat",String.class);
		
		int mm  = m.getModifiers();
		Class mm2 = m.getReturnType();//获取返回数据类型
		String mm3 = m.getName();//获取方法名
		
		Class[] mm4 = m.getParameterTypes();//获取方法参数列表的类型
		Class[] mm5 = m.getExceptionTypes();//获取方法抛出的异常类型
		
		String result = (String)m.invoke(r, "测试参数");//invoke(object,执行方法需要执行的参数)
		System.out.println(result);
		
	}
	
	@Test
	void test4() {
		try {
			Class clz = A.class;
			A a = (A)clz.newInstance();
			
			Method m = clz.getMethod("sleep");//父类和自己的类中的公有方法，（方法名，参数）
			//Method[] m2 = clz.getMethods();//获取所有公有方法
		//	Method m2 = clz.getDeclaredMethod("fuleisiyou");//无法访问父类中的私有方法
			
			
			
			
			Method m2 = clz.getDeclaredMethod("dangqian");
			
			m2.setAccessible(true);//设置使用权限
			//m.invoke(a);
			m2.invoke(a);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	//操作构造方法
	@Test
	void test5() {
		//操作无参数构造方法
		try {
		//A a = new A();
		Class cs = A.class;
		//A a = (A)cs.newInstance();
		
		Constructor con = cs.getConstructor(String.class);
		//执行构造方法
		//A a = (A)con.newInstance();//只能用于无参数构造方法
		//con.setAccessible(true);
		A a = (A)con.newInstance("www");//用于带参数的构造方法，传入参数类型类
		
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		}
	
	
}
