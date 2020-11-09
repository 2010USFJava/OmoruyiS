package com.revature.actions;

import java.util.Scanner;

import com.revature.bean.Messages;
import com.revature.io.IO;
import com.revature.menu.CustomerMenu;
import com.revature.menu.Menu;
import com.revature.validate.Validate;

public class Apply {

static Scanner scan = new Scanner(System.in);
	
	public static void applytMenu(int customerTag) {
		
		String user = IO.registerList.get(customerTag).getUsername();
		String screenName  = user.substring(0,1).toUpperCase() + user.substring(1).toLowerCase();
		
		Menu.templateMenu("APPLICATION Menu", 5); 
		
		System.out.print("Select a Type of Account: ");
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "1":
			primaryAccount(customerTag, 1);
			break;
		case "2":
			jointAccount(customerTag, 2);
			break;
		case "3":
			primaryAccount(customerTag, 3);
			break;
		case "4":
			jointAccount(customerTag, 4);
			break;
		case "5":
			primaryAccount(customerTag, 5);
			break;
		case "e":
			Messages.exitMsg();
			CustomerMenu.customerAccountMenu(screenName, customerTag);
			break;
		case "q":
			Messages.loggingOutMsg();
			Menu.mainMenu();
			break;
		default:
			Messages.errMsg();
			applytMenu(customerTag);
			break;
		}	
	}
	
	
	public static void primaryAccount(int customerTag, int special) {
		
		String user = IO.registerList.get(customerTag).getUsername();
		String screenName  = user.substring(0,1).toUpperCase() + user.substring(1).toLowerCase();
		
		String drawLine= "_________________________________";
		int minimum = 800;
		
		if(special == 1) {
			
			System.out.print("\n Christmas Savings Account\n");
		}
		else if(special == 3){
			
			System.out.print("\n Primary 'Vanilla' Account\n");
		}
		else if(special == 5) {
			System.out.print("\n My Money is 'My' Money Primary Account\n");
		}
		
		System.out.println(drawLine);
		
		System.out.print("\n How many primary accounts are you opening? ");
		int qty = Validate.validateIntegerInput();
		
		System.out.print(" How much are you depositing? (Note: $800 minimum per account) ");
		double amount = Validate.validateDoubleInput();
		
		if(amount < (minimum*qty) && amount >= 0){
			// Send to DENY Pill
			System.out.println("\n " + screenName + " applied for " + qty + "accounts and deposited "
					+ amount + "\n");
			
			// Write to approved list
			//EmployeeWorkload.denyList(customerTag); 
			
		}
		else if(amount >= (minimum*qty)){
			// Send to APPROVED Pill
			System.out.println("\n " + screenName + " applied for " + qty + "accounts and deposited "
					+ amount + "\n");
			
			// Write to approved list
			//EmployeeWorkload.approveList(customerTag);
		}
		else {
			System.out.println(screenName + " Invalid Inputs Try again");
			primaryAccount(customerTag, special);
		}

		Messages.processMsg();
		
		System.out.print("\n We are processing your application.");
		System.out.print(" Check back in 48hrs.\n\n\n");
		CustomerMenu.customerAccountMenu(screenName, customerTag);
		
	}
	
	public static void jointAccount(int customerTag, int special) {
		
		String user = IO.registerList.get(customerTag).getUsername();
		String screenName  = user.substring(0,1).toUpperCase() + user.substring(1).toLowerCase();
		
		String drawLine= "_________________________________";
		int minimum = 1000;
		
		if(special == 2) {
			
			System.out.print("\n Election Joint Account \n");
		}
		else if(special == 4){
			
			System.out.print("\n  My Money Is 'Your' Money Joint Account \n");
		}
		System.out.println(drawLine);
		
		System.out.print("\n How many joint accounts are you opening? ");
		int qty = Validate.validateIntegerInput();
		
		System.out.print(" How much are you depositing? (Note: $1000 minimum per account) ");
		double amount = Validate.validateDoubleInput();
		
		if(amount < (minimum*qty) && amount >= 0){
			// Send to DENY Pill
			System.out.println("\n " + screenName + " applied for " + qty + "accounts and deposited "
					+ amount + "\n");
			
		}
		else if(amount >= (minimum*qty)){
			// Send to APPROVED Pill
			System.out.println("\n " + screenName + " applied for " + qty + "accounts and deposited "
					+ amount + "\n");
		}
		else {
			System.out.println(screenName + " Invalid Inputs Try again");
			primaryAccount(customerTag, special);
		}

		Messages.processMsg();
		
		System.out.print("\n We are processing your application.");
		System.out.print(" Check back in 48hrs.\n\n\n");
		CustomerMenu.customerAccountMenu(screenName, customerTag);
		
	}
	
	


	
}
