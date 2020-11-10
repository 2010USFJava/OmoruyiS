package com.revature.workload;

import java.util.Scanner;

import com.revature.bean.Messages;
import com.revature.menu.Menu;

public class AdminWorkload {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void adminWorkLoadMenu() {
		
		Menu.templateMenu("ADMIN WORKLOAD MENU", 6);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "a":
			EmployeeWorkload.viewCustomerList();
			break;
		case "d":
			EmployeeWorkload.viewCustomerList();
			break;	
		case "s":
			EmployeeWorkload.viewCustomerList();
			break;
		case "v":
			EmployeeWorkload.viewCustomerList();
			break;
		case "q":
			Messages.quitMsg();
			Menu.mainMenu();
			break;
		default:
			Messages.errMsg();
			adminWorkLoadMenu();
			break;
		}
	}

}
