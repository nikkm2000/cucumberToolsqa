package com.test.myAppTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class App3Test {
	
	@Test
	public void m3() {
		System.out.println(7);
		Assert.assertEquals(3+4, 7);
	}

}
