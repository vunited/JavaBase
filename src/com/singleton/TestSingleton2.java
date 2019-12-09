package com.singleton;
//懒汉式
public class TestSingleton2 {
//类初始化时候，立即加载这个对象，有延时加载的优势，【线程不安全】
	private static TestSingleton2 instance;
	private TestSingleton2() {
		
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	//方法同步，调用效率低（挂起等待）
	//当用户获取的时候才生成实例，减少开销
	public static synchronized TestSingleton2 getInstance() {
		if (instance == null) {
			instance = new TestSingleton2();
		}
		
		
		return instance;
	}
	
	
	//因为会加大服务器或内存开销
	//双重检查锁（double checked locking）是对上述问题的一种优化。先判断对象是否已经被初始化，再决定要不要加锁。

	

}
