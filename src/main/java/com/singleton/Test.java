package com.singleton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//饿汉模式
		TestSingleton1 ts1 = TestSingleton1.getInstance();//获取对象
		TestSingleton1 ts2 = TestSingleton1.getInstance();//获取对象
		
		if (ts1 == ts2) {
			System.out.println("对象一致");
		}
		else {
			System.out.checkError();
		}
		
		//lan汉模式
				TestSingleton2 ts3 = TestSingleton2.getInstance();//获取对象
				TestSingleton2 ts4 = TestSingleton2.getInstance();//获取对象
				
				if (ts4 == ts3) {
					System.out.println("对象一致");
				}
				else {
					System.out.checkError();
				}
				
		
				//双重检测锁模式
				TestSingleton3 ts5 = TestSingleton3.getInstance();//获取对象
				TestSingleton3 ts6 = TestSingleton3.getInstance();//获取对象
				
				if (ts5 == ts6) {
					System.out.println("对象一致");
				}
				else {
					System.out.checkError();
				}
				
				//静态内部类模式
				TestSingleton4 ts7 = TestSingleton4.getInstance();//获取对象
				TestSingleton4 ts8 = TestSingleton4.getInstance();//获取对象
				
				if (ts7 == ts8) {
					System.out.println("//静态内部类模式\n"+"对象一致");
				}
				else {
					System.out.checkError();
				}
				
	}

}
