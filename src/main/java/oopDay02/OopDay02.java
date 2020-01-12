package com.test.oopDay02;

import com.test.javaBasic.JavaDay03;
import com.test.oopDay01.Student;

public class OopDay02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		引用和对象
//		==的作用（对象）		
		Birthday b1 = new Birthday(1990, 7, 1);
		Birthday b2 = new Birthday();
		b2 = b1;

		Birthday b3 = new Birthday(2000, 4, 1);
		Birthday b4 = new Birthday(2000, 4, 1);

		System.out.println(b1 == b2);
		System.out.println(b3 == b4);

//		一个对象，只能有0个或1个引用。
//		一个引用可以被多个对象指向
//		"==" 针对类类型，比较的是 引用 也就是指向
//		     针对基本数据类型，比较的是 值
		Birthday b5;

		int[] a = { 3 };
		int[] b = { 3 };

		System.out.println(a == b);

//		this的作用
//		1.解决构造方法中变量的重名问题
//		2.构造方法中可以调用自身构造方法，必须写在构造方法体内首行
//		3.可以调用类中其他方法
		b3.show();

//		自动生成构造方法
//		Constructor  构造方法
//		generate 生成
//		alt+shift+s 

//		类的 封装 :缩小可见性，防止该类代码和数据被外部类随意访问 (隐藏成员变量名)
		b1.setYear(1986);
		System.out.println(b1.getYear());


//	自动生成set get方法
//	alt+shift+s  generate setters and getters
		
//		关键字： package import
//		package 包 :每个类前 用package指明所在的包
//		import: 导入 在类前 导入需要的包或类
		Student stu1=new Student();
		
//		关键字 ：static 静态
//		1 static可以修饰变量，静态变量---类变量 常用来表示该类所有对象共有的属性 声明时就赋值
//		System.out.println(Person.nation);
//		Person p1=new Person();
//		p1.nation="中国";
//		p1.id="007";
//		Person p2=new Person();		
//		p2.nation="美国";
//		p2.id="888";
//		System.out.println(p1.id);
//		System.out.println(p1.nation);
//		2. static 修饰的方法 叫静态方法（类方法）
		
//		Person.setNation("马来西亚");
//		System.out.println(Person.getNation());
//		Person.eat();
//		Person p1=new Person();
//		p1.show();
//		3. static 修饰的代码块 叫静态代码块  
//		代码块： 初始化块
		Person p1=new Person();
		Person p2=new Person();
//		Person.eat();
//		Person.eat();
//		静态代码块 会在 加载类的时候 主动执行一次 只有一次
//		类 加载顺序：先静后动
//		静态变量 --- 静态代码块 --- 动态变量 --- 代码块 --- 构造方法：
	}

}
