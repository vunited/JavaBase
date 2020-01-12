/**
 * 
 */
package com.reflection;

/**
 * @author geekjason
 *
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReflectServiceImpl rs = new ReflectServiceImpl();
//		ReflectServiceImpl2 rs2 = new ReflectServiceImpl2(null);
//
//		System.out.println("ok---" + rs.getInstance());
//		System.out.println("ok2---" + rs2.getInstance());
//		// rs2.sayHello("sang");

		rs.reflect();

	}

}
