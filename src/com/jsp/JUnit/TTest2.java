package com.jsp.JUnit;

import static org.junit.Assert.*;

import org.junit.Ignore;

import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class TTest2 {

	@Test
	public void testAdd() {
		int z = new T().add(1, 3);
		assertEquals(4, z);
		//assertTrue("is too big", z < 2);
		assertThat(z, is(4));
	}
	
	//@Ignore 停用某测试
	@Test(expected = java.lang.ArithmeticException.class)
	public void testDivide()
	{
		int z = new T().divide(8, 0);
		//assertThat(z, is(1));
	}

}
