package com.revature.accounts;

/*
 * [A] Customer Class
 * [1] Private Fields
 * [2] Constructors
 * [3] Extended Classes
 * [4] Get & Setter Method
 * [5] toString Method for Fields
 */
public class Customer{ // [A]
	
	private double balance; //Might need an accounts class for backend processing
	Register register;
	Login login;
	Account account;
	//Account account;
	
	public Customer() { // [2a]
		super();
	}
	
	public Customer(Register register) {
		super();
		this.register = register;
	}
	
	public Customer(Register register, Login login) {
		super();
		this.register = register;
		this.login = login;
	}
	
	public Customer(Register register, Login login, Account account) {
		super();
		this.register = register;
		this.login = login;
		this.account = account;
	}
	
	public Customer(Register register, Login login, Account account, double balance) {
		super();
		this.register = register;
		this.login = login;
		this.account = account;
		this.balance = balance;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account= account;
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
		return "Customer : \n"
				+ "[Register: " +  register + "]\n"
				+ "[Login: " 	+  login    + "]\n"
				+ "[Accounts: " +  account    + "]\n" 
				+ "[Balance: "  +  balance  + "]\n";
	}

	
	
	

	
	
	
	
	
	
}
