package com.test.myAppTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.App2;

public class App2Test {
	
	
	@Test
	public void correctSkuVerify() {
		App2 a2= new App2();
		System.out.println(a2.m2("600"));
		Assert.assertEquals(a2.m2("400100"), 1);
		
		
	}

}
