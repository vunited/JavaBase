package com.thread;

public class TestSleep extends Thread{

	public void run(){
		
		for(int i=0;i<=10;i++)
		{
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("get/---"+getId()+i);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestSleep().start();
	}

}
