package com.junit;

import java.util.HashMap;
import java.util.Map;

public class DeafultController implements Controller{
	
	private Map requestHandlers  = new HashMap();
	protected RequestHandler getHandler(Request request)
	{
		if (!this.requestHandlers.containsKey(request.getName())) {
			String message = "Cannot find handler for request name"+
							 "["+request.getName()+"]";
			//
			throw new RuntimeException(message);
			
			
		}
		return (RequestHandler)this.requestHandlers.get(request.getName());
	}
	@Override
	public Response processRequest(Request request) {
		Response response;
		try {
			response= getHandler(request).process(request);
					} catch (Exception e) {
						response = new ErrorResponse(request,e);
			// TODO: handle exception
		}
		return response;
		
	}
	
	
	
	

	@Override
	public void addHandler(Request request, RequestHandler requestHandler) {
		// TODO Auto-generated method stub
		if (this.requestHandlers.containsKey(request.getName())) {
			throw new RuntimeException("A request handler has"+
		"alreadt been resigstered fro request name"+
					"["+request.getName()+"]"
		);
		}
		else {
			this.requestHandlers.put(request.getName(),requestHandler);
		}
	}
	
	
	
	
}
