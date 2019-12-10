package com.test.oopDay01;

public class OopDay01 {

	public static void main(String[] args) {
		String id;// 局部变量 : 在方法中声明的变量

		// TODO Auto-generated method stub
		// OOP: object oriented programming 面向对象编程

//		面对对象：是一种编程思想，java中，所有的操作，都是对 对象的属性
//		和方法进行操作。
//		面向对象的特点：封装，继承，多态，抽象

//		类和对象
//		类：描述现实世界的一类事务的抽象概念
//		对象： 类的具体实例     
//		总结出：万物皆对象

//		创建类
//		属性：全局变量（成员变量）
//		行为：动态方法

//		创建对象 --- 实例化对象     格式：  类名   对象名 =  new  类构造方法
//		Student stu1 = new Student();
//		Student stu2 = new Student();
//		stu1.id = "2019070324";
//		stu2.id = "2019070325";
//		stu1.name = "宁十三";
//		stu1.sex = "男";
//		stu1.major = "软件开发";
//		stu1.age = 18;
//		stu1.name = "李十四";
//		stu1.sleep();
//		stu1.show();
//		Student[] stus = { stu1, stu2 };
//		int[] arr = { 2, 3, 4, 5 };
//
//		
//		
//		stu2.name = "宁十三";
//		stu2.sex = "男";
//		stu2.major = "软件开发";
//		stu2.age = 18;
//		stu2.show();
//		
//		Car car01=new Car();
//		car01.brand="Benz";
//		car01.engineType="V6";
//		car01.run();
//		
//		System.out.println(stu1.id);
//		System.out.println(stu2.id);
//		Student stu3=new Student();
//		System.out.println(stu3.id);
//		System.out.println(stu3.age);
//		
////		构造方法（构造函数 构造体）
////		构造方法使用的地方，实例化对象时 关键字new 后面
//		Student stu4 = new Student("8888","张三","女","财会",20);
////		构造方法特点：
////		构造方法名 和类名相同		
////		构造方法 没有返回值，不用写void
////		创建类时，系统提供默认的无参构造方法
////		如果用户自定义构造方法，系统收回提供的无参构造方法！！！
//		stu4.show();
//		Student stu5=new Student("6666","王五");
//		stu5.sex="男";
//		stu5.name="赵一";
//		Cube cu1 = new Cube(2.5);
//		System.out.println(cu1.area());
//		System.out.println(cu1.totalLength());

//		case:
//			Circle   
//			属性  r
//			
//			方法 求  
//			面积    Math.PI *r*r
//			周长    2*Math.PI*r

//		case:
//			创建两个类：
//			1，公司类   Company
//			  属性  公司ID   公司名    职员们
//			2，职员类  Member
//			 属性   员工卡号   员工姓名  员工性别   员工级别   员工工资
//			main函数中： 创建对象 公司1，DHC，自定义5个员工，输出公司和每个员工的信息
//			             创建对象 公司2，IBM，自定义5个员工，输出公司和每个员工的信息
//			             Student[] stus= {stu1,stu2};

		Company com1 = new Company();
		com1.cid = "001";
		com1.name = "DHC";
		Member m1 = new Member("20190926", "王一", '男', "PL", 5500);
		Member m2 = new Member("20190927", "王二", '男', "PG", 5000);
		Member m3 = new Member("20190928", "王三", '男', "PG", 5000);
		Member m4 = new Member("20190929", "王四", '男', "PG", 5000);
		Member m5 = new Member("20190920", "王五", '男', "PG", 5000);
		Member m6 = new Member("20190921", "王六", '男', "PG", 5000);
		com1.addMem(m1);
		com1.addMem(m2);
		com1.addMem(m3);
		com1.addMem(m4);
		com1.addMem(m5);
		com1.addMem(m6);
		com1.show();
		
		Member[] members=new Member[5];
		Company com2=new Company("002","IBM",members,0);
		com2.addMem(m1);
		com2.addMem(m2);
		com2.addMem(m3);
		com2.addMem(m4);
		com2.addMem(m5);
		com2.addMem(m6);
		com2.show();
		
		
		
	}

}
