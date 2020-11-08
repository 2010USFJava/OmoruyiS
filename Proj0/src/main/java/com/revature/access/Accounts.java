package com.revature.access;

import com.revature.accounts.Account;
import com.revature.accounts.Customer;
import com.revature.accounts.Login;
import com.revature.accounts.Register;
import com.revature.io.IO;

public class Accounts {
	

	
	public static void primaryAccount() {
		
		// Populate customer info for login
		
		// Create customer file here
		
//		Register r1 = new Register(IO.registerList.get(i).getUsername(), IO.registerList.get(i).getPassword(),
//								   IO.registerList.get(i).getFirst(), IO.registerList.get(i).getLast());
//		Login log1 = new Login(IO.registerList.get(i).getUsername(), IO.registerList.get(i).getPassword());
//		Customer c1 = new Customer(r1, log1);
//		System.out.println(IO.customerList);

		
		System.out.println("Hard Coded Info\n");
		
		Register r1 = new Register("admin", "password", "lebron", "james");
		Login log1 = new Login("admin", "password");
		Account a1 = new Account(2, 12345, "primary");
		Customer c1 = new Customer(r1, log1, a1, 25.00);
		
		//System.out.println(IO.customerList);
		System.out.println(c1);
		
	}

	public static void jointAccount() {
		System.out.println("");
		
	}
	

}
