package com.revature.menu;

/*
 * [A] Main Menu : Lists the (3) Primary Menus 
 * 		[1] Main Menu
 * 		[2] Customer Menu
 * 		[3] Employee Menu
 * [B] Template : Populates the content for core menus
 * [C] Try Again Menu : Called when user needs to repeat a task 
 * [D] Debug Menu : Used to test code before implementation (hidden during production)
 * [E] Exit Menu :
 * 
 */

import java.util.Scanner;

import com.revature.msg.Msg;

public class Menu { //[A]
	
	static Scanner scan = new Scanner(System.in);
	
	public static void mainMenu() {
		
		System.out.println("\n Welcome to Casino Royal Banking");
		
		templateMenu("MAIN MENU", 1);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "c":
			CustomerMenu.customerMenu(); 
			break;
		case "e":
			EmployeeMenu.employeeMenu();
			break;
		case "q":
			Msg.quitMsg();
			mainMenu();
			break;
		default:
			Msg.errMsg();
			mainMenu();
			break;
		}
	}
	
	public static void templateMenu(String typeMenu, int version) { //[B]
		
		String drawLine= "_________________________________";
		
		System.out.println(drawLine);
		System.out.println("\n\t" +  typeMenu   );
		System.out.println(drawLine);
		
		// MENUS 
		if(version == 1) { // MAIN option(s)
			System.out.println("\n\t[c]ustomer");
			System.out.println("\t[e]mployee");
		}
		else if(version == 2) { // CUSTOMER option(s)
			System.out.println("\n\t[r]egister");
			System.out.println("\t[l]ogin");
			System.out.println("\n\t[p]revious menu");
		}
		else if(version == 3) { // EMPLOYEE option(s)
			System.out.println("\n\t[r]egister");
			System.out.println("\t[l]ogin");
			System.out.println("\n\t[p]revious menu");
		}
		else if(version == 4) { // CUSTOMER ACCOUNT option(s)
			System.out.println("\n\t[a]pply");
			System.out.println("\t[d]eposit");
			System.out.println("\t[t]ransfer");
			System.out.println("\t[v]iew info");
		}
		else if(version == 6) { // APPLY option(s)
			System.out.println("\n\t[a]prove accounts");
			System.out.println("\t[d]eny accounts");
			System.out.println("\t[s]earch customer info");
			System.out.println("\t[v]iew customer info");
			
			if( ("ADMIN WORKLOAD MENU").equals(typeMenu) ) {
				System.out.println("\n\t[r]eview employee info*");
			}		
		}
		else if(version == 10) { // TRY AGAIN options(s)
			System.out.println("\n\t[y]es");
			System.out.println("\t[n]o");
		}
	
		System.out.println("\n\t[q]uit");
		System.out.println(drawLine);
	}
	
public static void tryAgainMenu(int userType) { //[C]
		
		templateMenu("TRY AGAIN?", 10);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "y":
			if(userType == 1)
				CustomerMenu.registerUsers();
			else if(userType == 2)
				CustomerMenu.loginUsers();
			else if(userType == 3) {
				EmployeeMenu.loginEmployee();
			}
			break;
		case "n":
			CustomerMenu.customerMenu();
			break;
		case "q":
			Msg.quitMsg();
			mainMenu();
			break;	
		default:
			Msg.errMsg();
			tryAgainMenu(userType);
			break;
		}
	}

}
