package com.jsp.JUnit;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
class TUser {

	@Test
	void testGetName() {
		//fail("Not yet implemented");
		
		assertThat(new User().getName(), is("你好"));
	}

}
