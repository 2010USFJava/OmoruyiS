package com.revature.customer;

public class Customer {
	
	private String username; /* Encapsulation */
	private String password;
	
	private String firstName;
	
	/*
	 * Only need firstName to apply for now.
	 */
	
	/*
	 * Methods (7 Buttons)
	 * - Main Screen of Customer (exit(break) button returns to main)
	 * 		- public static void apply() 1.1
	 *  	- public static void login() 1.2
	 *  	- public static void register() 1.3
	 *  
	 *  	- public static void deposit() 1.4
	 *  	- public static void withdrawal() 1.5
	 *  	- public static void transfer() 1.6
	 *  	- public static void view() 1.7
	 */
	
	public Customer() {	/* Overloading*/
	}
	
	public Customer(String username) {	
		this(username, "default");
	}
	
	public Customer(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	 public static void apply() { /* */ 
		
	 }
	 
	 public static boolean login() { /* */
			 return false;
	 }
	 
	 public static boolean register() { /* */
		 	return false;
	 }

	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password + "]";
	}
	
	
}
