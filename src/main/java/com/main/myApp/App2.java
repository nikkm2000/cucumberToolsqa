package com.main.myApp;

import java.util.ResourceBundle;

public class App2 {
	
	
	public int m2( String sk) {
		ResourceBundle rb=ResourceBundle.getBundle("config");
		
		String mySku=rb.getString("sku");
		
		System.out.println(mySku);
		
		if(sk.equals(mySku)) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	

}
