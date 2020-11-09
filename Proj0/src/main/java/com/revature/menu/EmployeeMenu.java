package com.revature.menu;

import java.util.Scanner;

import com.revature.bean.Messages;
import com.revature.io.IO;
import com.revature.io.InitializeData;
import com.revature.validate.Validate;
import com.revature.workload.AdminWorkload;
import com.revature.workload.EmployeeWorkload;

public class EmployeeMenu {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void employeeMenu() {
		
		Menu.templateMenu("EMPLOYEE MENU", 3);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "a":
			loginAdminMenu();
			break;
		case "r":
			registerEmployeeMenu();
			break;
		case "l":
			loginEmployeeMenu();
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
			employeeMenu();
			break;
		}
	}
	
	
	public static void registerEmployeeMenu() {
		
		CustomerMenu.registerMenu();
		
		/* 
		 * Returns user to Main Menu once completed
		 */
		System.out.println("\n\tEmployee Registration Complete!!!\n");
		employeeMenu();
	}
	
	public static void loginAdminMenu() {
		
		String drawLine = "_________________________________";
		
		System.out.println("\t ADMIN LOGIN Menu");
		System.out.println(drawLine);
		
		/* 
		 * Calls login method
		 * 
		 */
		
		loginEmployee();	
	}
	
	public static void loginEmployeeMenu() {
		
		String drawLine = "_________________________________";
		
		System.out.println("\tEMPLOYEE LOGIN Menu");
		System.out.println(drawLine);
		
		/* 
		 * Calls login method
		 * 
		 */
		
		loginEmployee();
	}
	
	public static void loginEmployee() {
		
		InitializeData.initializeRegistrationDatabase();
		
		int adminKey = 111;
		int employeeKey = 222;
		
		System.out.println("User: ");
		String user = scan.nextLine();
		
		System.out.println("Password: ");
		String pass = scan.nextLine();
		
		System.out.println("KEY: ");
		int key =  Validate.validateIntegerInput();
		
		int size = IO.registerList.size(); 
		
		if(IO.registerList.isEmpty() == false) { 
			for (int i = 0; i < size ; i++) {
				
				String registerUser = IO.registerList.get(i).getUsername(); 
				String registerPass = IO.registerList.get(i).getPassword();
			
				if( user.equals(registerUser) &&  pass.equals(registerPass) && (key == employeeKey)) {
					
					String screenName  = user.substring(0,1).toUpperCase() + user.substring(1).toLowerCase();
					System.out.println("\n\t " + screenName + ", Welcome Employee \n");
					System.out.println("\n\t The following accounts need approval \n");
					EmployeeWorkload.employeeWorkLoadMenu();
					}
				else if( user.equals(registerUser) &&  pass.equals(registerPass) && (key == adminKey)) {
					
					String screenName  = user.substring(0,1).toUpperCase() + user.substring(1).toLowerCase();
					System.out.println("\n\t " + screenName + ", Welcome ADMIN \n");
					System.out.println("\n\t The following accounts need approval \n");
					AdminWorkload.adminWorkLoadMenu();
					}
				}
			}
		else if(IO.registerList.isEmpty() == true) {
			System.out.println("No Accounts are currently registered");
			employeeMenu();
		}
		
		/* 
		 * it matches login DOES NOT match DENY and ask the login user to
		 * try again. 
		 */
			
		System.out.println("\n\tIncorrect Login Attempt!!!\n"); //[4]
		Menu.tryAgainMenu(3); //(Note: 3 = employee login)
		
		}

}
