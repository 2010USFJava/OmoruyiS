package com.revature.workload;

import java.util.Scanner;

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
			
			break;
		case "d":
			
			break;
		case "s":
			
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
		
		System.out.println(" List of Registered Customers\n");
		System.out.println(" " + IO.registerList);
		System.out.println("\n Total Registered Customers: " + size + "\n");
		
	}
	

	public static void denyList(int customerTag) {
		
		
	}

	public static void approveList(int customerTag) {
		
		
	}

}
