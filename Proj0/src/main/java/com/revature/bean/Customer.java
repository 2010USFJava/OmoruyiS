package com.revature.bean;

/*
 * [A] Customer Class
 * [1] Private Fields
 * [2] Constructors
 * [3] Extended Classes
 * [4] Get & Setter Method
 * [5] toString Method for Fields
 */
public class Customer { // [A]
	
	private String username; // [1a-e]
	private String password;
	private String first;
	private String last;
	private double balance;
	
	
	public Customer() { // [2a]
		super();
	}
	
	public Customer(String username, String password, String first, String last, double balance) { // [2b]
		super();
		this.username = username;
		this.password = password;
		this.first = first;
		this.last = last;
		this.balance = balance;
	}

	class Register extends Customer{ // [3a]
		
		// Login methods
	}
	
	class Login extends Customer{ // [3b]
		
		// Login methods
	}
	
	class Apply extends Login{	// [3c]
		
		// Apply methods
	}

	public String getUsername() { // [4a]
		return username;
	}

	public void setUsername(String username) { // [4b]
		this.username = username;
	}

	public String getPassword() { // [4c]
		return password;
	}

	public void setPassword(String password) { // [4d]
		this.password = password;
	}

	public String getFirst() { // [4e]
		return first;
	}

	public void setFirst(String first) { // [4f]
		this.first = first;
	}

	public String getLast() { // [4g]
		return last;
	}

	public void setLast(String last) { // [4h]
		this.last = last;
	}

	public double getBalance() { // [4i]
		return balance;
	}

	public void setBalance(double balance) { // [4j]
		this.balance = balance;
	}

	@Override
	public String toString() { // [5]
		return "Customer [username=" + username + ", password=" + password + ", first=" + first + ", last=" + last
				+ ", balance=" + balance + "]";
	}
	
	
	
	
	
}
