package com.test.apiDay07;

public class GreatThread {
	public static void main(String[] args) {
		//����̳�ʵ�����߳�
		Car carThread = new Car();
//		Car carThread1 = new Car();
		carThread.setName("car�߳�");
//		carThread1.setName("�½��߳�2");
//		carThread.setPriority(1);
//		carThread1.setPriority(10);
		
		//ʵ����ʵ��   �½��߳�
		Runnable busRun=new Bus();   //�ӿڻص�
		Thread busThread=new Thread(busRun,"bus�߳�");  //ʵ����Thread����   �ӿڻص�������Ϊ����
		
		carThread.start();  //��ʵ�����߳�����run����
//		carThread1.start();  //��ʵ�����߳�����run����
		busThread.start();
//		carThread.yield();  //�ݶ�����ִ�е��̣߳�ִ�������߳�
//		busThread.yield();   //yield���� Ŀ�������̸߳���Ľ���ִ��
//		carThread.run();  //ֱ�Ӷ������run  ��main�߳�ִ��
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
//			Thread.sleep(1000);  //�̵߳ȴ� �̹߳���  ����������
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

