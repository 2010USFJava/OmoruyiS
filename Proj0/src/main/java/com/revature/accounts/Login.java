package com.revature.accounts;

import java.io.Serializable;

public class Login extends Customer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4952533841391200082L;
	
	private String username; 
	private String password;
	
	public Login() {
		super();
	}
	
	public Login(String username, String password) {
		super();
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


	@Override
	public String toString() {
		return "(username: " + username + ", password: " + password + ")" ;
	}
	
	
	

	
	
	
}
