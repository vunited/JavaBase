/**
 * 
 */
package com.reflection;

import java.lang.reflect.Method;

/**
 * @author geekjason
 *
 */
public class ReflectServiceImpl {
	private static final String CLASSNAME = "com.reflection.ReflectServiceImpl";

	public Object reflect() {
		ReflectServiceImpl object = null;

		try {

			object = (ReflectServiceImpl) Class.forName(CLASSNAME).newInstance();
			// 通过方法反射
			Method method = object.getClass().getMethod("sayHello", String.class);
			method.invoke(object, "sang");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return object;
	}

	public ReflectServiceImpl getInstance() {
		ReflectServiceImpl object = null;

		try {
			/**
			 * 这里有必要提一下就是Class下的newInstance()和new有什么区别？，首先，newInstance( )是一个方法，
			 * 而new是一个关键字，其次，Class下的newInstance()的使用有局限，因为它生成对象只能调用无参的构造函数，
			 * 而使用new关键字生成对象没有这个限制。 Class.forName("")返回的是类
			 * Class.forName("").newInstance()返回的是object
			 * 
			 * 
			 */
			if (object == null) {
				object = (ReflectServiceImpl) Class.forName(CLASSNAME).newInstance();// 拿到object类型
			}

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
			// TODO: handle exception
			// ex.printStackTrace();
			System.out.println(ex.toString());
		}

		return object;

	}

	public void sayHello(String name) {
		System.err.println("Hello " + name);

	}

}
