package com.revature.beans;

import java.io.Serializable;

import com.revature.io.IO;
import com.revature.io.IOWithCollections;
import com.revature.io.Logging;

public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1470638531199181458L;
	private int aid;
	private double balance;
	private int qty;
	private double deposit;
	private double withdrawal;
//	private int typeOfAccount;
	
	public Account() {
		super();
		IO.accountList.add(this);
	}
	
	public Account(int aid, double balance) {
		super();
		this.aid = aid;
		this.balance = balance;
		IO.accountList.add(this);
		}

	public Account(int aid, double balance, double deposit) {
		super();
		this.aid = aid;
		this.balance = balance;
		this.balance = deposit;
		IO.accountList.add(this);
		IOWithCollections.writeInfoFile(IO.registerList, IO.accountList);
		Logging.LogIt("info", "Account, "+ this.aid + ", was updated");
	}
	
	public Account(int aid, double balance, int qty, double deposit) {
		super();
		this.aid = aid;
		this.balance = balance;
		this.qty = qty;
		this.deposit = deposit;
		IO.accountList.add(this);
		IOWithCollections.writeInfoFile(IO.registerList, IO.accountList);
		Logging.LogIt("info", "Account, "+ this.aid + ", was updated");
	}
	
	public Account(int aid, double balance, int qty, double deposit, double withdrawal) {
		super();
		this.aid = aid;
		this.balance = balance;
		this.qty = qty;
		this.withdrawal = withdrawal;
		IO.accountList.add(this);
		IOWithCollections.writeInfoFile(IO.registerList, IO.accountList);
		Logging.LogIt("info", "Account, "+ this.aid + ", was updated");
	}
	
	
	public double getWithdrawal() {
		return withdrawal;
	}

	public void setWithdrawal(double withdrawal) {
		this.withdrawal = withdrawal;
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
		return "Account [aid: " + aid + ", balance: " + balance + ", qty: " + qty + ", last_deposit: " + deposit + ", last_withdrawal: " + withdrawal +"]";
	}
	
	

}
