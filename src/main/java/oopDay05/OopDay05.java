package com.test.oopDay05;

import java.util.Random;

public class OopDay05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlarmCar ac1 = new FireEngine();
		AlarmCar ac2 = new PoliceCar();
		AlarmCar ac3 = new FireEngine();
		AlarmCar[] acs = { ac1, ac2, ac3 };
		for (AlarmCar acx : acs) {
			acx.stop();
		}
		FireEngine fe1 = (FireEngine) ac3;

//		抽象： 关键字  abstract  用来设计 用来被继承
//		可以用来修饰  类  方法

//		修饰类 ：  抽象类
//		1.不能实例化
//		2.有构造方法，子类实例化时需要
//		3.抽象类中 可以没有抽象方法 但 有抽象方法的类 必须是抽象类

//		修饰方法：  抽象方法
//		1.没有方法体
//		2.必须在非抽象的后代类中 被重写（被实现）

//		AlarmCar ac4=new AlarmCar();

//		接口：一种抽象类型，是抽象的方法的集合（容器）interface
//		接口 是用来实现的  implements

//		1.接口里的方法 默认 public abstract
//		2.接口不能用于实例化对象
//		3.接口没有构造方法
//		4.接口中所有方法，必须为抽象方法
//		5.接口中没有成员变量
//		6.接口不是被继承，而是被实现
//		7.接口支持多实现----一个类可以实现多个接口，一个接口可以被多个类实现
//		8.接口支持多继承

		AlarmSound01 as01 = new PoliceCar(); // 接口回调 接口类型，实例化实现类对象，该对象可调用接口中方法
		AlarmSound02 as02 = new FireEngine();
		as01.noise();
		as02.silence();
		
		
//		java.lang   java.util
		Random rd=new Random();
		
		for(int i=1;i<=5;i++) {
			System.out.print(rd.nextInt(10));
		}
		
		rd.nextInt();
		
		rd.nextBoolean();
		
		rd.nextFloat();
		
		rd.nextDouble();
		
		rd.nextLong();
		
		rd.getClass();
		
//		foo  bar  foobar baz   qux  === fubar : fucked up beyond any recognization
		
	}

}
