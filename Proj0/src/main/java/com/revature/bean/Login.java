package com.revature.bean;

import java.io.Serializable;

public class Login extends Customer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4952533841391200082L;
	
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

	public boolean isAccess() {
		return access;
	}

	public void setAccess(boolean access) {
		this.access = access;
	}

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", access=" + access + "]";
	}
	
	
	

	
	
	
}
