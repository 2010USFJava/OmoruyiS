package com.revature.actions;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.dao.AccountDao;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.io.IO;
import com.revature.io.InitializeData;


public class Deposit {
	
	public static AccountDao adi = new AccountDaoImpl();
	
	static Scanner scan = new Scanner(System.in);
	
	public static void deposit(int customerTag){
		int aid = IO.accountList.get(customerTag).getAid();
		String user = IO.registerList.get(customerTag).getUsername();
		int qty = IO.accountList.get(customerTag).getQty();
		//double withdrawal = IO.accountList.get(customerTag).getWithdrawal();
		double balance = IO.accountList.get(customerTag).getBalance();
		
		String starLine = "********************************";
		System.out.println(starLine);
		System.out.println("\t " + user + ", Deposit: ");
		System.out.println(starLine);
		

		
		System.out.print("\n How much will you be depositing? ");
		double deposit = scan.nextDouble();	
		
		balance = balance + deposit;
		
		Account customer = new Account(aid, balance, qty, deposit);
		
		IO.accountList.set(customerTag, customer);
		
		System.out.println("\n account no: " + aid + " Deposited: " + deposit +
		"\n balance is now: " + balance );
		
		try {
			adi.insertAccountBalance(customer, IO.registerList.get(customerTag));
			adi.insertAccountDeposit(customer, IO.registerList.get(customerTag));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//DatabaseProcessing.dbAccountinsert(customer); //db
		
		InitializeData.writeToDatabase();

		
		
		
		
	}  
		
}
