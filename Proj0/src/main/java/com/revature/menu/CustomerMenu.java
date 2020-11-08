package com.revature.menu;

import java.util.Scanner;

import com.revature.accounts.Register;
import com.revature.actions.Apply;
import com.revature.actions.Deposit;
import com.revature.actions.Transfer;
import com.revature.actions.View;
import com.revature.actions.Withdrawal;
import com.revature.bean.Messages;
import com.revature.io.IO;
import com.revature.io.InitializeData;

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
			Messages.quitMsg();
			Menu.mainMenu();
			break;
		default:
			Messages.errMsg();
			customerMenu();
			break;
		}
	}
	
	public static void customerAccountMenu(String screenName, int customerTag) {
		
		Menu.templateMenu("CUSTOMER ACCOUNT MENU", 4);
		
//		if accounts equal 0
		System.out.println("\n\tCurrently you have 0 accounts with us, " +
				"\n\tApply Now " + screenName + " for great offers!!! \n");
		
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "a":
			Apply.applytMenu();
			break;
		case "d":
			Deposit.depositMenu(); 
			break;
		case "t": 
			Transfer.transferMenu();
			break;
		case "w":			
			Withdrawal.withdrawalMenu();
			break;
		case "v": 
			View.viewMenu(customerTag); // Layout Customer class here
			break;
		case "q":
			Messages.loggingOutMsg();
			Menu.mainMenu();
			break;
		default:
			Messages.errMsg();
			customerAccountMenu(screenName, customerTag);
			break;
		}
	}
	
	
	public static void registerMenu() {
		
		String drawLine = "_________________________________";
		
		System.out.println("\tREGISTRATION Menu");
		System.out.println(drawLine);
		
		/* 
		 * Calls registration method
		 */
		registerUsers();
		
		/* 
		 * Returns user to Main Menu once completed
		 */
		System.out.println("\n\t Customer Registration Complete!!!\n");
		customerMenu();
	}
	
	public static void loginMenu() {
		
		String drawLine = "_________________________________";
		
		System.out.println("\tLOGIN Menu");
		System.out.println(drawLine);
		
		/* 
		 * Calls login method
		 */
		loginUsers();
	}
	
	public static void registerUsers() {
		
		InitializeData.initializeRegistrationDatabase();
		
		/* 
		 * Asks users to input user, pass, first, & last
		 */
		
		System.out.println("User: ");
		String user = scan.nextLine();
		
		System.out.println("Password: ");
		String pass = scan.nextLine();
		
		System.out.println("first: ");
		String first = scan.nextLine();
		
		System.out.println("last: ");
		String last = scan.nextLine();
		
		Messages.processMsg();
		
		/* 
		 * [1] Get size of database
		 * [2] Goes through the 'username' field  ONLY. 
		 * [3] IF it username matches a 'username' already
		 *     in the database, DENY user registration & 
		 *     allow the user to try again.
		 * [4] ELSE, APPROVE registration, and take user back
		 *     to CUSTOMER MENU.
		 */
		
		int size = IO.registerList.size(); //[1]
		
		for (int i = 0; i < size ; i++) {
			
			String registerUser = IO.registerList.get(i).getUsername(); //[2]
			
			if(user.equals(registerUser)) { //[3]
				
				System.out.println("\nUsername '" + user + "' already in use!!! \n");
				
				Menu.tryAgainMenu(1);  //(Note: 1 = register ; 2 = login)
			}
		}
	
		/* 
		 * Store new user & write it into database --> (register.txt)
		 */
		
		Register registeringCustomer = new Register(user, pass, first, last);  //[4] 
		IO.registerList.add(registeringCustomer);	
	}
	
	public static void loginUsers() {
		
		InitializeData.initializeRegistrationDatabase();
		
		System.out.println("User: ");
		String user = scan.nextLine();
		
		System.out.println("Password: ");
		String pass = scan.nextLine();
		
		/* 
		 * [1] Get size of database.
		 * [2] Goes through the 'username' & 'password' field  ONLY. 
		 * [3] IF it matches db's 'username' & 'password' APPROVE login,
		 *     and take user to CUSTOMER ACCOUNT MENU.
		 * [4] ElSE, DENY user login & allow the user to try again.
		 */
		
		/* 
		 * Goes through the 'username' & 'password' field  ONLY, if it matches
		 * a 'username' & 'password' already in the database, APPROVE login 
		 * and goto CUSTOMER ACCOUNT MENU with a customer-tag for identification.
		 */
		
		int size = IO.registerList.size(); //[1]
		
		if(IO.registerList.isEmpty() == false) { 
			for (int i = 0; i < size ; i++) {
				
				String registerUser = IO.registerList.get(i).getUsername(); 
				String registerPass = IO.registerList.get(i).getPassword();
				
				if(user.equals(registerUser) &&  pass.equals(registerPass)) { //[2]
					
					String screenName  = user.substring(0,1).toUpperCase() + user.substring(1).toLowerCase();
					
					System.out.println(" " + screenName + ", Welcome to Casino Royal Banking ");
					int customerTag = i;
					customerAccountMenu(screenName, customerTag); //[3]
				}
			}
		}
		else if(IO.registerList.isEmpty() == true) {
			System.out.println("No Accounts are currently registered");
			customerMenu();
		}
		
		/* 
		 * it matches login DOES NOT match DENY and ask the login user to
		 * try again. 
		 */
			
		System.out.println("\n\tIncorrect Login Attempt!!!\n"); //[4]
		Menu.tryAgainMenu(2);
	}
	

	

} // End of Class
