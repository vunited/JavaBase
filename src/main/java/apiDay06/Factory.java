package com.test.apiDay06;

public class Factory{
	//普通工厂模式
	public Car produce(String message) {
        if("audi".equalsIgnoreCase(message)||"au".equalsIgnoreCase(message)) {
        	return new Audi();  //===Car xxx=new Audi() 接口回调
        }
        if("benz".equalsIgnoreCase(message)) {
        	return new Benz();  
        }
        return null;
	}
	
	//多个方法工厂模式
	public Car produceAudi() {
		return new Audi();
	}
	public Car produceBenz() {
		return new Benz();
	}
	
//	静态工厂方法模式
	public static Car produceStaitcAudi() {
		return new Audi();
	}
	public static Car produceStaticBenz() {
		return new Benz();
	}
	
	
}
