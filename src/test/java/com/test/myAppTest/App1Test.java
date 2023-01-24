package com.test.myAppTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.App1;

public class App1Test {

	@Test
	public void positiveLoginCredential() {		
		App1 a1= new  App1();
		int myreturnValues= a1.m("nikhil1", "password1");	
		Assert.assertEquals(myreturnValues, 1 );		
	}

	@Test
	public void negativeLoginCredential() {		
		App1 a1= new  App1();
		int myreturnValues= a1.m("nik1", "pass1");		 
		Assert.assertEquals(0,myreturnValues );		
	}


}
