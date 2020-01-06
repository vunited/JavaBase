package com.test.apiDay06;

public class Single {
	//单例模式：饿汉式
//	加载类时，实例化对象
	//私有静态成员变量 同时 实例化一个对象
	private static Single instance=new Single();	
	//私有化构造方法
	private Single() {
		
	}	
	//静态方法 权限一定要大于private
	public static Single getInstance() {
		return instance;
	}
}
class SingleLazy{
	//单例模式：懒汉式
//	类加载时，不实例化，只有在调用get方法时，判断是否为null时才实例化
	//私有静态成员变量 
	private static SingleLazy instance;
	//私有化构造方法
	private SingleLazy() {
		
	}
	//静态方法 权限一定要大于private
	public static SingleLazy getInstance() {
		if(instance==null) {
			instance=new SingleLazy();
		}
		return instance;
	}
}

