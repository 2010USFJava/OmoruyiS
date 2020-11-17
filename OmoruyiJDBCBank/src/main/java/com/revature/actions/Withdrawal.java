package com.revature.actions;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.dao.AccountDao;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.io.IO;
import com.revature.io.InitializeData;

public class Withdrawal {
	
	static Scanner scan = new Scanner(System.in);
	
	public static AccountDao adi = new AccountDaoImpl();
	
	public static void withdrawal(int customerTag){
		String user = IO.registerList.get(customerTag).getUsername();
		int accountNo = IO.accountList.get(customerTag).getAid();
		int qty = IO.accountList.get(customerTag).getQty();
		double deposit = IO.accountList.get(customerTag).getDeposit();
		
		String starLine = "********************************";
		System.out.println(starLine );
		System.out.println("\t " + user + ",  WITHDRAWAL(S) ");
		System.out.println(starLine);
				
		System.out.print("\n How much are you withdrawaling? ");
		double withdrawal = scan.nextDouble();	
		double balance = IO.accountList.get(customerTag).getBalance();	
		
		
		if(withdrawal > 0) {
			if(balance > 0) {
				if(balance >= withdrawal) {
					
					balance = balance + -(withdrawal);
					Account customer = new Account(accountNo, balance, qty, deposit, withdrawal);
					IO.accountList.set(customerTag, customer);
					System.out.println("\n user account " + accountNo + " Withdrawal: " + withdrawal +
					"\n balance is now: " + balance );
					
					try {
						adi.insertAccountWithdrawal(customer, IO.registerList.get(customerTag));
						adi.insertAccountBalance(customer, IO.registerList.get(customerTag));
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//InitializeData.writeToDatabase();
				}
				else
					System.out.println("\n insufficient funds");
			}
			else
				System.out.println("\n insufficient funds");
		}
		else 
			System.out.println("\n withdrawal must be greater than 0 \n");
	}  
	

}
