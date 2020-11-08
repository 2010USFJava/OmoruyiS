package com.revature.accounts;

import java.io.Serializable;

import com.revature.io.IO;
import com.revature.io.IOWithCollections;

public class Register extends Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2369493236795370396L;
	
	private String username; 
	private String password;
	private String first;
	private String last;
	
	public Register() {
		super();
		IO.registerList.add(this);
		IOWithCollections.writeInfoFile(IO.registerList);
	}

	public Register(String username, String password, String first, String last) {
		super();
		this.username = username;
		this.password = password;
		this.first = first;
		this.last = last;
		IO.registerList.add(this);
		IOWithCollections.writeInfoFile(IO.registerList);
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
		return "("
				+ "user: " + username  
				+ ", pass: " + password 
				+ ", first: " + first  
				+ ", last: " + last  
				+ ")";
	}

	
}
