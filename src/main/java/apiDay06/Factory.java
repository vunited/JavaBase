package com.test.apiDay06;

public class Factory{
	//��ͨ����ģʽ
	public Car produce(String message) {
        if("audi".equalsIgnoreCase(message)||"au".equalsIgnoreCase(message)) {
        	return new Audi();  //===Car xxx=new Audi() �ӿڻص�
        }
        if("benz".equalsIgnoreCase(message)) {
        	return new Benz();  
        }
        return null;
	}
	
	//�����������ģʽ
	public Car produceAudi() {
		return new Audi();
	}
	public Car produceBenz() {
		return new Benz();
	}
	
//	��̬��������ģʽ
	public static Car produceStaitcAudi() {
		return new Audi();
	}
	public static Car produceStaticBenz() {
		return new Benz();
	}
	
	
}
