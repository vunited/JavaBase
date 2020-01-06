package com.test.oopDay03;

public class OopDay03 {
	public static void main(String[] args) {
//		int String 互转
//		int x = 10;
//		String str = String.valueOf(x);
//		System.out.println(str+2);
//		
//		int num=Integer.parseInt("3"+"7");
//		System.out.println(num);
//		String 扩展的两个类
//		StringBuilder 
//		StringBuilder stb = new StringBuilder();
//		stb.append("abc");
//		stb.append("edf");
//		stb.append("xxx");
//		System.out.println(stb); // StringBuilder类型
//		System.out.println(String.valueOf(stb)); // String 类型
//		System.out.println(stb.toString()); // String 类型
//
////		StringBuffer
//		StringBuffer stb2 = new StringBuffer();
//		stb2.append("bbc");
//		stb2.append("bbq");
//		System.out.println(stb2); // StringBuffer类型
//		System.out.println(String.valueOf(stb2)); // String 类型
//		System.out.println(stb2.toString()); // String 类型

//		动态字符串运行速度（效率）： StringBuilder > StringBuffer  > String
//		代码安全性：StringBuffer > StringBuilder > String
//		StringBuilder不支持多线程！！！

//		继承！ extends   a extends b  a继承b
//		b被称为父类(fatherClass) 或  超类(superClass)
//		a被称为子类(childClass,subClass) 或 继承类(derivedClass)
//		继承的定义：新定义一个类，从已有的类中 获取属性和行为
//		Student stu1=new Student();
//		Person p1=new Person();
//		stu1.name="student一号";
//		stu1.eat();

//		Java是单继承
//		一个父类可以有多个子类
//		一个子类只能继承于一个父类

//		方法重载 Overload :方法同名不同参

//		方法重写 Override
//		1.当子类对父类继承过来的方法 不满意时，可以进行方法重写
//		2.重写时，要求 同名同参同返回类型
//		3.重写时，重写的方法 不能拥有父类的该方法更严格的可见性
//		4.只要子类方法重写，子类实例化对象只能调用重写后的子类方法
//		5.重写方法时，可以加 @Override注解，加强代码可读性，帮助系统加强代码可编译性
//		Student stu1 = new Student();
//		stu1.setName("张三");
//		stu1.setId("2102028888888");
//		stu1.setSid("20190929333");
//		stu1.setSex("男");
//		stu1.setAge("18");
//		stu1.show();

//		关键字 Super
//		1.super可以调用父类方法,和成员变量
//		2.super可以调用父类构造方法
//		    2.1  子类对象构造的过程中，必须调用父类的构造方法
//		    2.2 系统默认调用父类的无参构造方法
//		    2.3 调用父类构造方法，必须在子类构造方法首行
//		Student stu2 = new Student("21020319952222222", "李四", "201534524", "女", "17");
//		stu2.show();

//		关键字 final
//		final可以修饰变量==》 常量
//		final int A = 10;
//		final可以修饰方法
//		final修饰的方法 不能被重写！！！

//		final修饰的类 不能被继承！！！

//		Animal ani01 = new Animal("小白");
////		Cat cat01 = new Cat("大花", "棕色");
//		
////		上转型：父类引用（父类类型） 指向 子类对象
//		Animal ani02=new Cat("咪咪","黑色");
//		ani02.eat();
//		ani02.shout();
//		ani02.sleep();
//		ani02.catchMouse();
//		上转型的对象，能够调用父类方法，能够调用子类重写过的父类方法
//		不能调用子类独有方法
//		Animal ani03=new Dog("旺财","黑色");
//		ani02.shout();
//		ani03.shout();
////		动态绑定：根据实际业务需要，父类引用指向不同子类对象，实现不同功能，叫做动态绑定。
////		动态绑定是多态的核心技术之一。
//		
////		下转型 ：父类引用 赋值给子类引用 子类对象原本为父类类型，强转为子类类型 强转类型为原来子类对象类型
//		Cat cat01=(Cat)ani02;
//		cat01.catchMouse();
//		cat01.shout();
//		Dog dog01=(Dog)ani03;
//		dog01.guard();

		/*
		 * Animal ani02=new Cat("咪咪","黑色"); Cat cat01=(Cat)ani02; 等同于 ====> Cat
		 * cat01=new Cat("咪咪","黑色");
		 */
//		Object ob=new String("test");
//		String str=(String)ob;
//		System.out.println(str);

//		Animal ani01 = new Cat("咪咪", "黑色");
//		Animal ani02 = new Dog("旺财", "黑色");
//		if (ani02 instanceof Cat) { // a instanceof b 判断a是否为b类型的对象
//			Cat cat01 = (Cat) ani01;
//			cat01.catchMouse();
//		} else {
//			System.out.println("猫以外的对象不能转换成猫");
//		}

//		多态！！！
//		同一事件，在不同对象上，出现不同效果
//		多态分类 ：类内部多态(重载)   继承式多态
		demo();
		demo(5);

//		继承式多态 : 必要条件---要有继承  要有方法重写  要有上转型
		Animal[] animals = new Animal[3];
		animals[0] = new Cat("猫一", "蓝色");
		animals[1] = new Dog("狗一", "棕色");
		animals[2] = new Cat("猫二", "黑色");
		
//		Animal[] animals02= {new Cat("猫一", "蓝色"),new Dog("狗一", "棕色"),new Cat("猫二", "黑色")};

		for (Animal a : animals) {
			a.shout();
		}

		for (Animal a : animals) {
			if (a instanceof Cat) {
				Cat cat01 = (Cat) a;
				cat01.catchMouse();
			}
			if (a instanceof Dog) {
				Dog dog01 = (Dog) a;
				dog01.guard();
			}
		}

	}

	public static void demo() {

	}

	public static void demo(int a) {

	}
}
