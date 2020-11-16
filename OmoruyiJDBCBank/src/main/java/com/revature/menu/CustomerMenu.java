package com.revature.menu;

import java.util.Scanner;

import com.revature.actions.Deposit;
import com.revature.actions.Update;
import com.revature.actions.View;
import com.revature.actions.Withdrawal;
import com.revature.beans.Account;
import com.revature.beans.Register;
import com.revature.io.DatabaseProcessing;
import com.revature.io.IO;
import com.revature.io.InitializeData;
import com.revature.io.Logging;
import com.revature.msg.Msg;


public class CustomerMenu {
	
	static Scanner scan = new Scanner(System.in);
	
	
	public static void customerMenu() {
		
		Menu.templateMenu("CUSTOMER MENU", 2);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "r":
			registerMenu();
			break;
		case "l":
			loginMenu();
			break;
		case "p": 
			Menu.mainMenu();
			break;	
		case "q":
			Msg.quitMsg();
			Menu.mainMenu();
			break;
		default:
			Msg.errMsg();
			customerMenu();
			break;
		}
	}
	
	public static void customerAccountMenu(String screenName, int customerTag) {
		
		Menu.templateMenu("CUSTOMER ACCOUNT MENU", 4);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "d":
			Deposit.deposit(customerTag); 
			customerAccountMenu(screenName, customerTag);
			break;
		case "w":			
			Withdrawal.withdrawal(customerTag);
			customerAccountMenu(screenName, customerTag);
			break;
		case "u":
			Update.update(customerTag);
			customerAccountMenu(screenName, customerTag);
		case "r":
			//Delete.deposit(customerTag);
			customerAccountMenu(screenName, customerTag);
			break;
		case "v": 
			View.viewMenu(customerTag); // Layout Customer class here
			break;
		case "q":
			Msg.loggingOutMsg();
			Menu.mainMenu();
			break;
		default:
			Msg.errMsg();
			customerAccountMenu(screenName, customerTag);
			break;
		}
	}
	
	public static void registerMenu() {
		
		String drawLine = "_________________________________";
		
		System.out.println("\tREGISTRATION Menu");
		System.out.println(drawLine);
		registerUsers();
		System.out.println("\n\tCustomer Registration Complete!!!\n");
		customerMenu();
	}
	
	public static void loginMenu() {
		
		String drawLine = "_________________________________";
		System.out.println("\tLOGIN Menu");
		System.out.println(drawLine);
		loginUsers();
	}
	
	public static void registerUsers() {

		System.out.print(" User: ");
		String user = scan.nextLine();
		System.out.print(" Password: ");
		String pass = scan.nextLine();
		System.out.print(" first: ");
		String first = scan.nextLine();
		System.out.print(" last: ");
		String last = scan.nextLine();
		
		Msg.processMsg();
		
		int size = IO.registerList.size(); 
		for (int i = 0; i < size ; i++) {
			String registerUser = IO.registerList.get(i).getUsername(); 
			
			if(user.equals(registerUser)) { 
				System.out.println("\n Username '" + user + "' already in use!!! \n");
				Logging.LogIt(" error ", user + " was not created!");
				Menu.tryAgainMenu(1);  //(Note: 1 = register ; 2 = login)
			}
		}
		Register registeringCustomer = new Register(user, pass, first, last);  
		
		int aid = size+10000+1;			
		DatabaseProcessing.dbRegisterinsert(registeringCustomer);
		
		Account accountCustomer = new Account(aid, 0.00, 1, 0.00, 0.00);
		DatabaseProcessing.dbAccountinsert(accountCustomer, registeringCustomer);
		
		InitializeData.writeToDatabase();
	}
	
	public static void loginUsers() {
		
		System.out.print(" User: ");
		String user = scan.nextLine();
		System.out.print(" Password: ");
		String pass = scan.nextLine();
		
		int size = IO.registerList.size(); //[1]
			for (int i = 0; i < size ; i++) {
				String registerUser = IO.registerList.get(i).getUsername(); 
				String registerPass = IO.registerList.get(i).getPassword();
				
				if(user.equals(registerUser) &&  pass.equals(registerPass)) { 
					String screenName  = user.substring(0,1).toUpperCase() + user.substring(1).toLowerCase();
					System.out.println("\n " + screenName + ", Welcome to Casino Royal Banking ");
					int customerTag = i;
					customerAccountMenu(screenName, customerTag); 
				}
			}
			System.out.println("\n\tIncorrect Login Attempt!!!\n"); 
			Menu.tryAgainMenu(2);
	}
	

} // End of Class
