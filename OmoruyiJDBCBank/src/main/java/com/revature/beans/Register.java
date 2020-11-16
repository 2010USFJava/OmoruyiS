package com.revature.beans;

import java.io.Serializable;

import com.revature.io.IO;
import com.revature.io.IOWithCollections;
import com.revature.io.Logging;

public class Register implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5036266905878206903L;
	
	//private int uid;
	private String username; 
	private String password;
	private String first;
	private String last;

	public Register() {
		super();
		IO.registerList.add(this);
		IOWithCollections.writeInfoFile(IO.registerList, IO.accountList);
	}
	

	public Register(String username, String password, String first, String last) { // for customer registration
		super();
		//this.uid = uid;
		this.username = username;
		this.password = password;
		this.first = first;
		this.last = last;
		IO.registerList.add(this);
		IOWithCollections.writeInfoFile(IO.registerList, IO.accountList);
		Logging.LogIt("info", "Customer, "+ this.username + ", has registered");
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
		return "Register [user: " + username + ", pass: " + password + ", first: " + first
				+ ", last: " + last + "]";
	}

}
