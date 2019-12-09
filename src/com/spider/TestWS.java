package com.spider;

public class TestWS {

	public WebSocketClient wsc;
	public TestWS() {};
	public void Start()
	{
		wsc = new WebSocketClient();
		wsc.callback = this;
		wsc.Connect();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
