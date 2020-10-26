package com.revature.scanner;

import com.revature.customer.*;

public class Scanner {

	public static void main(String[] args) {
		
		Customer user = new Customer();
		
		user.setUsername("Sandy");
		user.getUsername();
		
		System.out.println(user);

	}

}
