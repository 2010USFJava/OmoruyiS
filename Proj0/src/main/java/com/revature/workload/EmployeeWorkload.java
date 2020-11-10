package com.revature.workload;

import java.util.Scanner;

import com.revature.accounts.Customer;
import com.revature.bean.Messages;
import com.revature.io.IO;
import com.revature.io.InitializeData;
import com.revature.menu.Menu;

public class EmployeeWorkload {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void employeeWorkLoadMenu() {
		
		Menu.templateMenu("EMPLOYEE 'WORKLOAD' MENU", 6);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "a":
			viewCustomerList();
			break;
		case "d":
			viewCustomerList();
			break;
		case "s":
			viewCustomerList();
			break;
		case "v":
			viewCustomerList();
			break;
		case "q":
			Messages.quitMsg();
			Menu.mainMenu();
			break;
		default:
			Messages.errMsg();
			employeeWorkLoadMenu();
			break;
		}
	}
	
	public static void viewCustomerList() {
		
		InitializeData.initializeRegistrationDatabase();
		
		int size = IO.registerList.size();
		
		System.out.println("\n Total Registered Customers: " + size + "\n");
		
		System.out.println(" List of Registered Customers\n");
		//System.out.println(" " + IO.registerList);
		
		//System.out.println(" size : " + IO.registerList.size());
		
	
		for(int i = 0; i < IO.registerList.size(); i++ ) {
			
			System.out.println(" " + i + " " + IO.registerList.get(i) );
			
		}
		
		
//		Customer c1 = new Customer();
//		System.out.println("customer: " + c1 );
		
		
	System.out.println("\n\t[p]revious" + "\t[e]xit" +  "\t[q]uit");
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "p":
			Messages.exitMsg();
			employeeWorkLoadMenu();
			break;
		case "e":
			Messages.exitMsg();
			employeeWorkLoadMenu();
			break;
		case "q":
			Messages.loggingOutMsg();
			Menu.mainMenu(); 
			break;
		default:
			Messages.errMsg();
			viewCustomerList();
			break;
		}
	}
	

	public static void denyList(int customerTag) {
		
		
	}

	public static void approveList(int customerTag) {
		
		
	}

}
