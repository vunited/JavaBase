package com.test.apiDay07;

public class Desk {
	private Object fork = new Object();
	private Object knife = new Object();

//	public void eatForLeft() {
//		synchronized (fork) {
//			System.out.println("��Ʋ���������");
//			synchronized (knife) {
//				System.out.println("��Ʋ������");
//				System.out.println("��Ʋ�ӿ�ʼ�Է�");
//			}
//		}
//
//	}
	public void eatForLeft() {
		synchronized (knife) {
			System.out.println("��Ʋ������");
			synchronized (fork) {
				System.out.println("��Ʋ���������");
				System.out.println("��Ʋ�ӿ�ʼ�Է�");
//				while(true) {
//					
//				}
			}
		}		
	}

	public void eatForRight() {
		synchronized (knife) {
			System.out.println("��Ʋ������");
			synchronized (fork) {
				System.out.println("��Ʋ���������");
				System.out.println("��Ʋ�ӿ�ʼ�Է�");
			}
		}

	}
	
	public static void main(String[] args) {
		Desk desk=new Desk();
		new LeftHand(desk);
		new RightHand(desk);
	}
}
