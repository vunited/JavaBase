/**
 * 
 */
package com.reflection;

import java.lang.reflect.InvocationTargetException;

/**
 * @author geekjason
 *
 */
public class ReflectServiceImpl2 {
	private static final String CLASSNAME = "com.reflection.ReflectServiceImpl2";
	private String name = null;

	/**
	 * 加构造函数
	 */
	public ReflectServiceImpl2(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;

	}

	public ReflectServiceImpl2 getInstance() {
		ReflectServiceImpl2 object = null;

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
				object = (ReflectServiceImpl2) Class.forName(CLASSNAME).getConstructor(String.class).newInstance(name);

			}

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException ex) {
			// TODO: handle exception
			// ex.printStackTrace();
			System.out.println(ex.toString());
		}

		return object;

	}

	public void sayHello(String name) {
		this.name = name;
		System.err.println("Hello " + name);

	}

}
