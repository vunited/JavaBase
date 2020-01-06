package com.test.apiDay07;

public class LeftHand implements Runnable {
	private Desk desk;
	
	public LeftHand(Desk desk) {
		super();
		this.desk = desk;
		Thread th=new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		while (true) {
			desk.eatForLeft();
		}
	}
}
class RightHand implements Runnable{
	private Desk desk;

	public RightHand(Desk desk) {
		super();
		this.desk = desk;
		Thread th=new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		while (true) {
			desk.eatForRight();
		}
	}
}
