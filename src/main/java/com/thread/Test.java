package com.thread;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.Runnable;

class Test {
	Computer1 c1 = new Computer1();
	Computer2 c2 = new Computer2();
	Thread t1 = new Thread();
	Thread t2 = new Thread();

	class Computer1 implements Runnable {
		int i = 0;

		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		}
	}

	class Computer2 implements Runnable {
		int i = 0;

		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("这个数字是：" + i);
			}
		}
	}

	@org.junit.jupiter.api.Test
	void test() {

		t1.run();
		t2.run();

	}

	@org.junit.jupiter.api.Test
	void test2() {

		/**
		 * 使用匿名内部类来创建线程
		 */
//		Thread th = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				
//				
//				// TODO Auto-generated method stub
//				for(int i = 0;i <= 10 ;i ++)
//				{
//					System.out.println(i);
//				}
//			}
//		});

		System.out.println("线程创建结束");

		// th.start();
		for (int j = 0; j < 10; j++) {
			System.out.println(j + "O");
		}
	}

	@org.junit.jupiter.api.Test

	void test3() throws InterruptedException { // Class cl = Mythread.class;
//		Method md = cl.getMethod("run", null);
//		Annotation ann = md.getAnnotation(cl);
//		md.invoke(ann, null);

		Mythread mt = new Mythread();
		Thread t = new Thread(mt);
		//t.sleep(1000);
		t.start();
		
	}

	class Mythread implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i <= 10; i++) {
				System.out.println(i);
			}
		}

	}

}
