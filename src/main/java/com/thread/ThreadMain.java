package com.thread;
import com.thread.ThreadMain;


public class ThreadMain  {
	static class Computer1 extends Thread
	{
		public void run()
		{
		for(int i=0;i<=10;i++)
		{
			yield();//线程让步
			System.out.println(i);
		}
		
		
	}
		}
	
	 static class Computer2 extends Thread{
		 char ch;
		 Computer2(char ch){
			 this.ch = ch;
		 }
		 public void print(char ch){
			 for(int i=0;i<10;i++) {
				 System.out.println(ch);
			 }
		 }
		 
		 
		 public void run()
		 {
			print(ch);
//			for(int i=0;i<10;i++)
//			{
//				
//				System.out.println(i+"3");
//				
//			}
		}
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer1 c1 = new Computer1();
		Computer2 c2 = new Computer2('b');
//		Thread t1 = new Thread();
//		Thread t2 = new Thread();
		c1.setPriority(10);
		c2.setPriority(1);
		c1.start();
	 
		c2.start();
//		try {
//			Thread.sleep(5000);
//			c1.start();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
	}

	 
	

}
