package com.main.myApp;

import java.util.ResourceBundle;

public class App1 {
	
	
	
	public int m(String u, String p) {	
			
		ResourceBundle rb= ResourceBundle.getBundle("config");
		String myUser= rb.getString("user"); //nikhil1
		String myPassword= rb.getString("password");// password1
		
		System.out.println(myUser + "----"+ myPassword);// nikhil1    password1
		
		if (u.equals(myUser) && p.equals(myPassword)) {
			return 1;
		}
		else {
			return 0;
		}
	}
	


}
