package com.revature.accounts;

/*
 * 1. Populate # of accounts based on qty #
 * */

public class Account extends Customer{
	private int qty;
	private long accountNumber;
	private String typeOfAccount;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Account(int qty, long accountNumber, String typeOfAccount) {
		super();
		this.qty = qty;
		this.accountNumber = accountNumber;
		this.typeOfAccount = typeOfAccount;
	}


	@Override
	public String toString() {
		return "(qty: " + qty + ", Account No.: " + accountNumber + ", type: " + typeOfAccount + ")";
	}
	
}
