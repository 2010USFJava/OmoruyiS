package com.revature.accounts;

import com.revature.io.IO;
import com.revature.io.IOWithCollections;

public class Register {
	
	private String username; 
	private String password;
	private String first;
	private String last;
	private int balance;
	private int qty;
	private long accountNumber;
	private int typeOfAccount;
	
	public Register() {
		super();
		IO.registerList.add(this);
		IOWithCollections.writeInfoFile(IO.registerList);
	}
	
	public Register(String username, int balance, int qty, long accountNumber, int typeOfAccount) {
		super();
		this.username = username;
		this.balance = balance;
		this.qty = qty;
		this.accountNumber = accountNumber;
		this.typeOfAccount = typeOfAccount;
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

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getTypeOfAccount() {
		return typeOfAccount;
	}

	public void setTypeOfAccount(int typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}

	@Override
	public String toString() {
		return "Register [username=" + username + ", password=" + password + ", first=" + first + ", last=" + last
				+ ", balance=" + balance + ", qty=" + qty + ", accountNumber=" + accountNumber + ", typeOfAccount="
				+ typeOfAccount + "]";
	}

}
