package com.lti;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCasesEx {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}
	*/
	
	//ctrl+shift+o --> import automatically
	
	@Test
	public void testcase1()
	{
		Assertions.assertEquals("Hello","Hello");
		Assertions.assertEquals(500, 200+300);
	}
	
	@Test
	public void testAdd()
	{
		Calculator c=new Calculator();
		int r=c.add(500,200);
		Assertions.assertEquals(500,r);
	}

}
