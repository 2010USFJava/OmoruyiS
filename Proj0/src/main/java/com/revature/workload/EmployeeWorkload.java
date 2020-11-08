package com.revature.workload;

import java.util.Scanner;

import com.revature.bean.Messages;
import com.revature.menu.Menu;

public class EmployeeWorkload {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void employeeWorkLoadMenu() {
		
		Menu.templateMenu("EMPLOYEE 'WORKLOAD' MENU", 6);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "a":
			
			break;
		case "s":
			
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

}
