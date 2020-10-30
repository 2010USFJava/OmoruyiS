package com.revature.bean;

import java.util.Scanner;


public class Menu {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void mainMenu() {
		System.out.println("_________________________________");
		System.out.println("\n\t[A] MAIN MENU");
		System.out.println("_________________________________");
		
		System.out.println("\n\t[c]ustomer");
		System.out.println("\t[e]mployee");
		
		System.out.println("\n\t[q]uit");
		
		System.out.println("_________________________________");
		
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
		System.out.println("_________________________________");
		System.out.println("\n\t[B-1] CUSTOMER MENU");
		System.out.println("_________________________________");
		
		System.out.println("\n\t[r]egister");
		System.out.println("\t[l]ogin");
		System.out.println("\t[a]pply");
		
		System.out.println("\n\t[q]uit");
		
		System.out.println("_________________________________");
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "r":
			Register registerCustomer = new Register();
			//System.out.print(registerCustomer);
			break;
		case "l":
			Login loginCustomer = new Login();
			//System.out.print(loginCustomer);
			break;
		case "a":
			Apply applyCustomer = new Apply();
			//System.out.print(applyCustomer);
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
		System.out.println("_________________________________");
		System.out.println("\n\t[B-2] EMPLOYEE MENU");
		System.out.println("_________________________________");
		
		System.out.println("\n\t[r]egister");
		System.out.println("\t[l]ogin");
		//System.out.println("\t[a]pply");
		
		System.out.println("\n\t[q]uit");
		
		System.out.println("_________________________________");
		
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
		//case "a":
			//Apply applyCustomer = new Apply();
			//System.out.print(applyCustomer);
			//break;
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
	
	
	public static void quitMenu() {
		System.out.println("Quiting... \n\n\t*****Welcome Back******");
	}
	
	public static void errMsg() {
		System.out.println("***Error: Invalid Input***** \n");
	}

}
