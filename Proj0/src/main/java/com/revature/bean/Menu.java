package com.revature.bean;

import java.util.Scanner;


public class Menu {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void mainMenu() {
		
		templateMenu("MAIN MENU", 1);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "c":
			customerMenu();
			break;
		case "e":
			employeeMenu();
			break;
		case "q":
			quitMenu();
			mainMenu();
			break;
		default:
			errMsg();
			mainMenu();
			break;
		}
	}
	
	public static void customerMenu() {
		
		templateMenu("CUSTOMER MENU", 2);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "r":
			//Register registerCustomer = new Register("admin", "admin", "Lebron","James");
			registerMenu();
			//customerMenu();
			break;
		case "l":
			Login loginCustomer = new Login("admin", "password", true);
			System.out.print(loginCustomer);
			// Function to enter login data pass (loginCustomer)
			customerMenu();
			break;
		case "a":
			Apply applyCustomer = new Apply(2,1000922);
			System.out.print(applyCustomer);
			// Function to login and apply for # accounts
			customerMenu();
			break;
		case "p": 
			mainMenu();
			break;	
		case "q":
			quitMenu(); 
			mainMenu();
			break;
		default:
			errMsg();
			customerMenu();
			break;
			
		}
	}
	
	
	public static void employeeMenu() {
		
		templateMenu("EMPLOYEE MENU", 3);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "r":
			//Register registerEmployee = new Register();
			//System.out.print(registerCustomer);
			break;
		case "l":
			//Login loginEmployee = new Login();
			//System.out.print(loginCustomer);
			break;
		case "p": 
			mainMenu();
			break;
		case "q":
			quitMenu(); 
			mainMenu();
			break;
		default:
			errMsg();
			employeeMenu();
			break;
			
		}
	}
	
	
	public static void registerMenu() {
		System.out.println("Register Menu");
		System.out.println("_________________________________");
		System.out.println("complete");
		
		System.out.println("User: ");
		String user = scan.nextLine();
		
		System.out.println("Password: ");
		String pass = scan.nextLine();
		
		System.out.println("first: ");
		String first = scan.nextLine();
		
		System.out.println("last: ");
		String last = scan.nextLine();
		
		
		Register registerCustomer = new Register(user, pass, first, last);
		//Register registerCustomer = new Register();
		System.out.println("\tRegistration Complete!!! \n\n\t" + registerCustomer);
				
	}
	
	public static void templateMenu(String typeMenu, int version) {
		
		System.out.println("_________________________________");
		System.out.println("\n\t" +  typeMenu   );
		System.out.println("_________________________________");
		
		
		if(version == 1) { // MENU option(s)
			System.out.println("\n\t[c]ustomer");
			System.out.println("\t[e]mployee");
		}
		else if(version == 2) { // CUSTOMER option(s)
			System.out.println("\n\t[r]egister");
			System.out.println("\t[l]ogin");
			System.out.println("\t[a]pply");
			System.out.println("\n\t[p]revious menu");
		}
		else if(version == 3) { // EMPLOYEE option(s)
			System.out.println("\n\t[r]egister");
			System.out.println("\t[l]ogin");
			System.out.println("\n\t[p]revious menu");
		}
		
		System.out.println("\t[q]uit");
		System.out.println("_________________________________");

	}
	
	
	public static void quitMenu() {
		System.out.println("\tQuiting...");
	}
	
	public static void errMsg() {
		System.out.println("***Error: Invalid Input***** \n");
	}

}
