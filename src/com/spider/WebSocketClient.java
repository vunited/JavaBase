package com.spider;

public class WebSocketClient {

	public void Connect(String sServer) {
		// TODO Auto-generated method stub
		try {
			userSession = container.connectToServer(this,new URI(sServer));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
