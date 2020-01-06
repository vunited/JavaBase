package com.singleton;
public class TestSingleton3 {
	//双重检测锁模式
	    private volatile static TestSingleton3 uniqueSingleton;
	    //volatile 可以防止自动线程排序，
	    //防高并发线程串行，引用空对象现象

	    private TestSingleton3() {
	    }

	    public static TestSingleton3 getInstance() {
	        if (null == uniqueSingleton) {
	            synchronized (TestSingleton3.class) {
	                if (null == uniqueSingleton) {
	                    uniqueSingleton = new TestSingleton3();
	                }
	            }
	        }
	        return uniqueSingleton;
	    }
	}