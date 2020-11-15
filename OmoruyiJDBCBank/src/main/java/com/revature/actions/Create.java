package com.revature.actions;

import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.io.IO;



public class Create {
	
	static Scanner scan = new Scanner(System.in);
	

	
	public static void create(int customerTag){
		String starLine = "********************************";
		System.out.println(starLine );
		System.out.println("\t Create: ");
		System.out.println(starLine);
		
		Double balance = 0.00;
		
		System.out.print("\n How much will you be depositing? ");
		double deposit = scan.nextDouble();	
		double newbalance = balance + deposit;
		
		Account customer = new Account(customerTag, newbalance, deposit);
		
		System.out.print("\n New balance: " + newbalance + "\n\n" );
		IO.accountList.add(customer);
		
		System.out.println(" customer :" + customer);
	}  
	

	

	

	
}
