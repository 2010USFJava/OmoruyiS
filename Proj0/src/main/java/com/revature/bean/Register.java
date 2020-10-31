package com.revature.bean;

public class Register extends Customer {
	private String username; 
	private String password;
	private String first;
	private String last;
	
	public Register() {
		super();
		System.out.print( " register \n");
	}

	public Register(String username, String password, String first, String last) {
		super();
		this.username = username;
		this.password = password;
		this.first = first;
		this.last = last;
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

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	@Override
	public String toString() {
		return "Register [username=" + username + ", password=" + password + ", first=" + first + ", last=" + last
				+ "]";
	}

	
}
