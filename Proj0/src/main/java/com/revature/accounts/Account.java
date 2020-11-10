package com.revature.accounts;

/*
 * 1. Populate # of accounts based on qty #
 * */

public class Account extends Customer{
	private int qty;
	private long accountNumber;
	private int typeOfAccount;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Account(int qty, long accountNumber, int typeOfAccount) {
		super();
		this.qty = qty;
		this.accountNumber = accountNumber;
		this.typeOfAccount = typeOfAccount;
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
		return "(qty: " + qty + ", Account No.: " + accountNumber + ", type: " + typeOfAccount + ")";
	}
	
}
