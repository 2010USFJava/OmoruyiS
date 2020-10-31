package com.revature.bean;

public class Login extends Customer {
	private String username; 
	private String password;
	private boolean access;
	
	public Login() {
		super();
		System.out.print( " login \n");
		
	}

	public Login(String username, String password, boolean access) {
		super();
		this.username = username;
		this.password = password;
		this.access = access;
	}
	
	public void loginMenu() {
		System.out.println("Login Menu");
		System.out.println("_________________________________");
		System.out.println("complete");
	}
	

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", access=" + access + "]";
	}
	
	
	

	
	
	
}
