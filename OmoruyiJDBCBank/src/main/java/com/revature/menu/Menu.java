package com.revature.menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

import com.revature.beans.Register;
import com.revature.daoimpl.RegisterDaoImpl;
import com.revature.io.IO;
import com.revature.io.Logging;
import com.revature.msg.Msg;
import com.revature.workload.AdminWorkloadMenu;

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
		case "a":
			EmployeeMenu.employeeMenu();
			break;
		case "v":
			viewMenu();
			mainMenu();
			break;
		case "d": /* Hide in production */
			debugMenu();
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
			System.out.println("\t[a]dmin");
			System.out.println("\n\t[v]iew info");
			System.out.println("\n\t[d]ebug"); /* hide in production */
			
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
			System.out.println("\n\t[c]reate");
			System.out.println("\t[d]elete");
			System.out.println("\t[a]dd deposit");
			System.out.println("\t[w]ithdrawl");
			System.out.println("\n\t[v]iew");
		}
		else if(version == 6) { 
			System.out.println(
					  "\n\t[v]iew"
					+ "\n\t[c]reate"
					+ "\n\t[u]pdate"		  
					+ "\n\t[d]elete"
					+ "\n\n\t[s]earch user"
			);
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
			else if(userType == 4) {
				AdminWorkloadMenu.createCustomerList();
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
	
	
	public static void viewMenu() {
	
		int size = IO.registerList.size();
		
		System.out.println(" List of Registered Customers\n");
		System.out.println(" " + IO.registerList + " " + IO.accountList);
		
		System.out.println("\n Total Registered Customers: " + size + "\n");
		
	}
	/* DEBUG */
	
	public static void debugMenu(){
		
		
	}
	


}
