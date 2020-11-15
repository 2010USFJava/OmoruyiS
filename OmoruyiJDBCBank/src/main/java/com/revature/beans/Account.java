package com.revature.beans;

public class Account {
	private int aid;
	private double balance;
	private int qty;
	private double deposit;
//	private int typeOfAccount;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int aid, double balance, double deposit) {
		super();
		this.aid = aid;
		this.balance = balance;
		this.balance = deposit;
	}
	
	public Account(int aid, double balance, int qty, double deposit) {
		super();
		this.aid = aid;
		this.balance = balance;
		this.qty = qty;
		this.deposit = deposit;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public Account(int qty) {
		super();
		this.qty = qty;
	}
	
	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [aid=" + aid + ", balance=" + balance + ", qty=" + qty + ", deposit=" + deposit + "]";
	}
	
	

}
