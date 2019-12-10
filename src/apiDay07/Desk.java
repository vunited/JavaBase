package com.test.apiDay07;

public class Desk {
	private Object fork = new Object();
	private Object knife = new Object();

//	public void eatForLeft() {
//		synchronized (fork) {
//			System.out.println("左撇子拿起叉子");
//			synchronized (knife) {
//				System.out.println("左撇子拿起刀");
//				System.out.println("左撇子开始吃饭");
//			}
//		}
//
//	}
	public void eatForLeft() {
		synchronized (knife) {
			System.out.println("左撇子拿起刀");
			synchronized (fork) {
				System.out.println("左撇子拿起叉子");
				System.out.println("左撇子开始吃饭");
//				while(true) {
//					
//				}
			}
		}		
	}

	public void eatForRight() {
		synchronized (knife) {
			System.out.println("右撇子拿起刀");
			synchronized (fork) {
				System.out.println("右撇子拿起叉子");
				System.out.println("右撇子开始吃饭");
			}
		}

	}
	
	public static void main(String[] args) {
		Desk desk=new Desk();
		new LeftHand(desk);
		new RightHand(desk);
	}
}
