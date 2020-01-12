package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {

	
	public static class CallableTest implements Callable<String>
	{
		public String call() throws Exception
		{
			return "hello";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService threadPool = Executors.newSingleThreadExecutor();//
		
		//start
		Future<String> future = threadPool.submit(new CallableTest());
		try {
			System.out.println("waiting thread to finish");
			System.out.println(future.get());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
