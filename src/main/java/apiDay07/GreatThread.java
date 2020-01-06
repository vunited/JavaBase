package com.test.apiDay07;

public class GreatThread {
	public static void main(String[] args) {
		//子类继承实例化线程
		Car carThread = new Car();
//		Car carThread1 = new Car();
		carThread.setName("car线程");
//		carThread1.setName("新建线程2");
//		carThread.setPriority(1);
//		carThread1.setPriority(10);
		
		//实现类实现   新建线程
		Runnable busRun=new Bus();   //接口回调
		Thread busThread=new Thread(busRun,"bus线程");  //实例化Thread对象   接口回调对象作为参数
		
		carThread.start();  //由实例化线程启动run方法
//		carThread1.start();  //由实例化线程启动run方法
		busThread.start();
//		carThread.yield();  //暂定正在执行的线程，执行其他线程
//		busThread.yield();   //yield方法 目的是让线程更多的交替执行
//		carThread.run();  //直接对象调用run  由main线程执行
	}
}

class Car extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

class Bus implements Runnable{
	@Override
	public void run() {
//		try {
//			Thread.sleep(1000);  //线程等待 线程挂起  参数毫秒数
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

