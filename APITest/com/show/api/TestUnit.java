package com.show.api;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestUnit {

	@Test
	public  void oil() throws Exception {
		byte b[]=new ShowapiRequest("http://ali-todayoil.showapi.com/todayoil","1e5d7408a49d4cf3a1c2f8df64dd17dd") 
				.addTextPara("prov", "北京")
				.getAsByte();
		String str=new String(b,"utf-8");
		System.out.println(str);
	}
}
