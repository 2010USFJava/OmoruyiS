package com.revature.scanner;

import com.revature.customer.*;

public class Scanner {

	public static void main(String[] args) {
		
		Customer user = new Customer();
			
			mainMenu(user);
			
			// Customer user = new Customer();
			// user.setUsername("Sandy");
			// user.getUsername();
			//System.out.println(user);
			
			
	
	}
		public static void mainMenu(Customer user) {
			
			System.out.println("\n [A]pply " + " [R]egister " + " [L]ogin ");
			

			Customer.register();
			//Customer.login();
			
			//user.register();
			//user.login();
			//user.apply();
			//user.deposit();
			//user.withdrawal();
			//user.transfer();
			//user.view();
			
		}
}

	