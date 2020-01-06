package com.test.apiDay06;

public class ApiDay06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//设计模式
		
//		单例模式(singleton)：始终保证在堆中，只有一个实例，节约堆内存
		
		Single a=Single.getInstance();
		Single b=Single.getInstance();
		System.out.println(a==b);
		System.out.println(SingleLazy.getInstance()==SingleLazy.getInstance());
		
		Player.getVip().fight();
		Player.getVip().levelUp();
		Player.getVip().show();
		Player.getVip().levelUp();
		Player.getVip().show();
		
		
//		工厂模式（factory）: 高内聚 低耦合
		
		//普通工厂模式
//		优点：根据不同需求 设计工厂生产相应的对象
//		缺点：传递的参数如果不对，无法产生相应实例
//		格式：
//		public 产品种类共同接口 工厂名(String 产品种类需求) {
//			if(产品种类需求.equalsIgnoreCase(入参)) {
//				return new 相应对象
//			}
//			if(产品种类需求.equalsIgnoreCase(入参)) {
//				return new 相应对象
//			}
//			...
//			return null
//		}
		
		
//		Factory factory=new Factory();
//		Car car=factory.produce("AU");  //new Audi()
//		car.start();
//		factory.produce("benZ").start();
//		
////		多个方法工厂模式
////		优点：多个方法清晰可见 见名知义调用对应方法即可实例化相应对象
////		缺点：方法是非静态的 需要实例化工厂才能调用
//		Car car02=factory.produceAudi();
//		Car car03=factory.produceBenz();
//		car02.start();
//		car03.start();
//		
////		静态工厂方法模式
////		优点：不用实例化工厂 可直接调用
////		缺点：当新增生产对象时，需要改动Factory类
//		Car car04=Factory.produceStaitcAudi();
//		car04.start();
		
//		抽象工厂方法模式
//		优点：新增产品时，只需新建一个工厂实现类（新产品）实现工厂接口即可，不影响原有代码
		FactoryInterface fif=new FactoryAudi();
		Car car05=fif.produceCar();//  Car car05=new Audi();
		car05.start();
		FactoryInterface fifM=new FactoryMazda();
		Car car06=fifM.produceCar();
		car06.start();
		
//		case:利用抽象工厂方法模式
//			接口   AnimalInterface  作为工厂接口
//			接口   Animal 作为 动物接口  内有抽象方法 call()
//			实现类    Cat   Dog    
			AnimalInterface ai=new AnimalCat();
			Animal ani01=ai.born();
			ani01.call();
			
//		内部类：类中嵌套另一个类。外面的类叫外部类，内部的类叫内部类
//		静态内部类（开发中不用）
//		非静态内部类(成员内部类  方法内部类  匿名类!)
//		    匿名类： 接口式匿名类   继承式匿名类  参数匿名类 ！！！注意"；"结尾
//			接口式匿名类
			Car byd=new Car() {
				@Override
				public void start() {
					System.out.println("比亚迪启动");
				}
			};
			byd.start();
//			继承式匿名类 抽象类
			Fruit apple=new Fruit() {
				@Override
				public void type() {
					// TODO Auto-generated method stub
					System.out.println("苹果好吃");
				}				
			};
			apple.type();
//			参数匿名类
			Fruit.test(new Fruit() {
				@Override
				public void type() {
					// TODO Auto-generated method stub
					System.out.println("!!!");
				}				
			});
			
			
	}

}
