package com.revature.customer;

/* Notes : 
 *	 Methods (7 Buttons)
 * 	 	Main Screen of Customer (exit(break) button returns to main)
 * 		- public static void apply() 1.1
 *  	- public static void login() 1.2
 *  	- public static void register() 1.3
 *  
 *  	- public static void deposit() 1.4
 *  	- public static void withdrawal() 1.5
 *  	- public static void transfer() 1.6
 *  	- public static void view() 1.7
 *  
 *  [A] Register, Login, Apply
 *  [A.1] Register: Sets the username, password, and fname; 
 *  		[a] Username has to be unique
 *  [A.2] Login: 
 *  		[a] Account doesn't exist goes back to mainMenu()
 *  		[b] 
 *  [A.3] Apply will be a collection SET or LIST
 *  		[a] Collection SETs doesn't allow duplicates (unique identifies)
 *  [B] Once a customer applies they get assigned a template with same properties
 */

public class Customer {
	
	private String username; /* Encapsulation */
	private String password;
	
	private String fname;
	
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
	
	 public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	
	 
	 public static void register() { /* 1.1 */
		 System.out.println("\n Register");
		 System.out.println(" --------");
		 
		 Customer user = new Customer();
		 user.setUsername("bharris");
		 user.getUsername();
		 
		 user.setPassword("password");
		 user.getPassword();
		 
		 user.setFname("Beth");
		 user.getFname();
		 
		 
		 System.out.println(user);
		 // Store info somewhere
		 
		 Customer.login();

	 }
	 
	 public static void login() { /* 1.2 */
		 System.out.println("\n Login");
		 System.out.println(" --------");
		 
		 System.out.println(" Login: Input login info");
		 
		 System.out.println(" Login: algorithm that checks username"
		 		+ " and password and grants access to the remaining"
		 		+ " functions");
	 }
	 
	public static void apply() { /* 1.3 */ 
		System.out.println("This is the Apply");
	}
		 
	 
	 public static void deposit() {  /* 1.4 */
		 System.out.println("This is the Deposit");
	 }
	 
	 public static void withdrawal() {  /* 1.5 */
		 System.out.println("This is the Withdrawal");
	 }
	 
	 public static void transfer() {  /* 1.6 */
		 System.out.println("This is the Transfer");
	 }
	 
	 public static void view() {  /* 1.7 */
		 System.out.println("This is the View Method");
	 }
	 

	@Override
	public String toString() {
		return " username: " + username + "\n Password: " + password + "\n First: " + fname ;
	}
	
	
}
