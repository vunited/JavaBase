package com.junit_1;

import java.nio.channels.IllegalSelectorException;

public class Class_1_1 {

	/**
	 * 框架和工具的区别
	 * 框架提供一个可以复用的公共结构，可以在多个应用程序中进行共享。
	 * 开发人员将框架融入到他们自己的应用程序中
	 * 并且加以扩展以满足他们疼的需求
	 * 
	 * 简言之：框架提供一致的结构，工具提供一种工具类
	 * 
	 * 极限编程 www.extremeprogramming.org
	 * Junit www.junit.org 根据ibm通用公共许可证 common public license 1.0 版本进行发布
	 * 被称为xUnit相关测试框架
	 * 最初单元测试术语用来描述一项检查单个工作单元的行为测试。
	 * IEEE组织已经将单元测试定义为“单个硬件，软件单元或一组相关的单元的测试”
	 * 
	 * @param args
	 */
	public static class Calculator{
		double add(double i,double j){
			return (i+j);
		}
		
	}
	
	public static class CalculatorTest{
		private int nbErrors = 0;
		
		public void testAdd() {
			Calculator calculator = new Calculator();
			double result = calculator.add(10,50);
			//手动造异常
			if(result == 60 ) {
				throw new IllegalStateException("错的离谱！"+result);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lol");
		CalculatorTest test = new CalculatorTest();
		try {
			test.testAdd();
		} catch (Throwable e) {
			// TODO: handle exception
			test.nbErrors++;
			e.printStackTrace();
			
		}
		if(test.nbErrors > 0) {
			throw new IllegalStateException("!!!"+test.nbErrors);
		}
		
		
	}

}
