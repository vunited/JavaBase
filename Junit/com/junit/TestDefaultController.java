package com.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDefaultController {

	private DeafultController controller;
	
	//Before 发生在每一个@Test方法的之行之前
	//注释的方法用来实例化DefaultController这是一个内置的扩展点
	//Junit会在测试方法之间调用它
	
	//After----之后
	//@After	//空指针
	@Before 	//通过
	public void instantiate() throws Exception{
		controller = new DeafultController();
		
	}
	
//	@Test
//	public void testMethod() {
//		throw new RuntimeException("implement me!");
//	}
	//内部类
	private class SampleRequest implements Request{

		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return "Test!";
		}
		
	}
	
	private class SampleHandler implements RequestHandler{

		@Override
		public Response process(Request request) throws Exception {
			// TODO Auto-generated method stub
			return new SampleResponse();
		}
		
	}
	
	private class SampleResponse implements Response{
		//return "";
	}
	
	@Test//测试创建一个对象
	public void testAddHandler() {
		Request request = new SampleRequest();
		RequestHandler handler = new SampleHandler();
		controller.addHandler(request, handler);
		RequestHandler handler2 = controller.getHandler(request);
		//对象相等
		assertSame("handler we set in controller should be the samee handler we get",handler2,handler);
	}
	
	//@Test//测试处理请求
	
	
}
