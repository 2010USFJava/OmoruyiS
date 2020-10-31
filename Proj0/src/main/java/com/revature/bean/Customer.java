package com.revature.bean;

/*
 * [A] Customer Class
 * [1] Private Fields
 * [2] Constructors
 * [3] Extended Classes
 * [4] Get & Setter Method
 * [5] toString Method for Fields
 */
public class Customer { // [A]
	
	//public static Apply Apply; // [ Create Type Apply in Customer]
	private double balance;
	Register register;
	Login login;
	Apply apply;
	
	public Customer() { // [2a]
		super();
	}
	
	public Customer(double balance, Register register, Login login, Apply apply) {
		super();
		this.balance = balance;
		this.register = register;
		this.login = login;
		this.apply = apply;
	}

	public Apply getApply() {
		return apply;
	}

	public void setApply(Apply apply) {
		this.apply = apply;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "Customer [balance=" + balance + ", register=" + register + ", login=" + login + ", apply=" + apply
				+ "]";
	}

	
	
	

	
	
	
	
	
	
}
