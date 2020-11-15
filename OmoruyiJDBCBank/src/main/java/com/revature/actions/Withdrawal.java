package com.revature.actions;

import java.util.Scanner;

import com.revature.beans.Account;

public class Withdrawal {
	
	
static Scanner scan = new Scanner(System.in);
	

	
	public static void create(int customerTag){
		String starLine = "********************************";
		System.out.println(starLine );
		System.out.println("\tCreate: ");
		System.out.println(starLine);
		
		Account a1 = new Account(customerTag, 0.00);
		System.out.print(" Current balance? " + a1.getBalance());
		
		System.out.print("\n How much will you be withdrawaling? ");
		double withdrawl = scan.nextDouble();	
			

		System.out.print("\nNew balance: " +      balance(   customerTag  , computeBalance(  deposit(deposit)   )) + "\n");
		
		//System.out.print("\nNew balance: " +      balance(   customerTag  , computeBalance(  withdrawal() )));
		
	}  
	
	public static double deposit(double num){			
		return num;
	}
		
	public static double withdrawal(){
		double withdrawl = scan.nextDouble();
		return withdrawl*(-1);
	}
	
	public static double balance(int customerTag, double result){
		Account a1 = new Account(customerTag, result);
		return a1.getBalance();
		
	}
	
	public static double computeBalance(double num) {
		double balance =+ num;
		return balance;
	}
	
	

	public static void delete(){
		
	}

}
