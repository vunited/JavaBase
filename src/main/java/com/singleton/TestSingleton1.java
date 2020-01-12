package com.singleton;
//饿汉式
public class TestSingleton1 {
//类初始化时候，立即加载这个对象，没有延时加载的优势，加载类时，【天然的是线程安全的】。获取对象快。
	private static TestSingleton1 instance = new TestSingleton1();
	private TestSingleton1() {
		
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	//没有同步块，调用效率高
	public static TestSingleton1 getInstance() {
		return instance;
	}

}
