package com.test.apiDay07;

public class ApiDay07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//进程与线程
//		进程：程序的一次动态运行
//		线程：运算调度的最小单位，是进程的执行单位
		
//		单线程与多线程
//		单线程：程序一次动态运行，只有一个线程执行（main 主线程）
//		多线程：程序一次动态运行，多个线程执行
		
//		实例化线程 2种 java.lang.Thread类   Runnable接口
//		1.子类继承Thread
//		2.实现类实现Runnable
		
//		线程常用方法：
//		Thread.currentThread().getName()  获取线程名
//		实例对象名.setName("新建线程名");   设置线程名
//		setPriority(int x)更改线程优先级 1-10   默认5  最高 10   优先级并不是绝对的！！！！！！！
		
//		线程安全： 
//		单线程： 线程的是安全的
//		多线程： 并发操纵 可能会不安全 ----  数据不同步  产生bug 
//		     解决方式   加锁synchronized   方法锁  代码锁
//		加锁  ：  有可能产生死锁
//		死锁1 ：双方占有对方资源，并且 释放的前提是对方释放自己需要的资源，互相僵持，叫做死锁
//		解決方法： 改变资源占有顺序
//		死锁2：被锁代码 无法解锁 导致被锁资源得不到释放 影响其他需要调用该资源的线程运行
//		解决方法：改变代码逻辑
//		volatile
	}
}
