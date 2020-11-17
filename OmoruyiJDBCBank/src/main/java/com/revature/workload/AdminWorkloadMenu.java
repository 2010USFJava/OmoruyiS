package com.revature.workload;


import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.beans.Register;
import com.revature.dao.AccountDao;
import com.revature.dao.RegisterDao;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.daoimpl.RegisterDaoImpl;
import com.revature.io.DatabaseProcessing;
import com.revature.io.IO;
import com.revature.io.InitializeData;
import com.revature.io.Logging;
import com.revature.menu.Menu;
import com.revature.msg.Msg;

public class AdminWorkloadMenu {
	
	static Scanner scan = new Scanner(System.in);
	public static RegisterDao rdi = new RegisterDaoImpl();
	public static AccountDao adi = new AccountDaoImpl();
	
	public static void adminWorkLoadMenu() {

		
		Menu.templateMenu("ADMIN 'WORKLOAD' MENU", 6);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "v": //1
			viewCustomerList();
			break;
		case "c": //2
			createCustomerList();
			break;
		case "u": //3
			//updateCustomerList();
			break;
		case "d": //4
			deleteCustomerList();
			break;
		case "s": //5
			searchCustomerList();
			break;
		case "q":
			Msg.quitMsg();
			Menu.mainMenu();
			break;
		default:
			Msg.errMsg();
			adminWorkLoadMenu();
			break;
		}
	}
	
	public static void createCustomerList() {
		
		System.out.println("Create a User");
		
		System.out.print("\nUsername: ");
		String user = scan.nextLine();
		
		System.out.print("\nPassword: ");
		String pass = scan.nextLine();
		
		System.out.print("\nFirst: ");
		String first = scan.nextLine();
		
		System.out.print("\nLast: ");
		String last = scan.nextLine();
		
		Msg.processMsg();
		
		int size = IO.registerList.size(); 
		
		for (int i = 0; i < size ; i++) {
			String registerUser = IO.registerList.get(i).getUsername(); 
			
			if(user.equals(registerUser)) {
				System.out.println("\nUsername '" + user + "' already in use!!! \n");
				Logging.LogIt("\n" + "info", " user was NOT created" + "\n" );
				Menu.tryAgainMenu(4);  //(Note: 4 = createCustomerList())
				}
			}
			Register r1 = new Register(user, pass, first, last);
			createCustomerAndAccount(r1);
			
			Account accountCustomer = new Account(size+1000+1, 0.00, 1, 0.00, 0.00);
			DatabaseProcessing.dbAccountinsert(accountCustomer, r1);
			Logging.LogIt("info", r1 + " was created");
			Logging.LogIt("info", accountCustomer + " was created");
			
			navmenu(); // back, previous, exit		 
	}
	
	public static void createCustomerAndAccount(Register person) {
		
		
		DatabaseProcessing.dbRegisterinsert(person);
	
	}
	
	public static void deleteCustomerList() {
		
		System.out.print("Which user would you like to delete? ");
		String user = scan.nextLine();
		int size = IO.registerList.size(); 
		
		for (int i = 0; i < size ; i++) {
			String registerUser = IO.registerList.get(i).getUsername(); 
			if(user.equals(registerUser)) {
				
				Register r1 = IO.registerList.get(i);
				Account a1 = IO.accountList.get(i);
				System.out.println(
						"r1: " + r1 + "\n" +
						"i:  " + i);
				deleteCustomer(r1, a1, i); //issue
			
				}
			}
	}
	
	public static void deleteCustomer(Register person, Account aPerson, int i) {
		String user = person.getUsername();
		IO.registerList.remove(person);
		IO.accountList.remove(aPerson);
		Logging.LogIt("info", user + " was removed");
		Logging.LogIt("info", aPerson.getAid() + " was removed");
		
		try {
			rdi.deleteUser(person);
			adi.deleteAccount(aPerson, person);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		InitializeData.writeToDatabase();
		viewCustomerList();
	}
	
	public static void searchCustomerList(){ /* SEARCH */
		
		System.out.print("Which user would you like to search? ");
		String user = scan.nextLine();
		
		searchCustomer(user);
		
		navmenu();
	}
	
	public static Register searchCustomer(String inputName) {
		
		for (int i = 0; i < IO.registerList.size(); i++) {
			String user = IO.registerList.get(i).getUsername();
			if(inputName.equals(user)) {
				System.out.println("\n found \n");
				System.out.println(IO.registerList.get(i));
				System.out.println(IO.accountList.get(i));
				return IO.registerList.get(i);
			}
		}
		System.out.println("customer not found");
		return null;
	}
	
	
	public static void viewCustomerList() { /* VIEW */

		
		int size = IO.registerList.size();
		System.out.println("\n Total Registered Customers: " + size + "\n");
		System.out.println(" List of Registered Customers\n");
		
		for(int i = 0; i < IO.registerList.size(); i++ ) {
			System.out.println(" " + i + " " + IO.registerList.get(i) );
			System.out.println(" " + i + " " + IO.accountList.get(i) + "\n");
		}
		
		/* [6] PL/SQL with at least one user defined function*/
//		try {
//			System.out.println("\n Equity: " + adi.retrievedAssets());
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		navmenu();
	}
		
	public static void navmenu() {
		
		System.out.println("\n\t[p]revious" + "\t[e]xit" +  "\t[q]uit");
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "p":
			Msg.exitMsg();
			adminWorkLoadMenu();
			break;
		case "e":
			Msg.exitMsg();
			adminWorkLoadMenu();
			break;
		case "q":
			Msg.loggingOutMsg();
			Menu.mainMenu(); 
			break;
		default:
			Msg.errMsg();
			viewCustomerList();
			break;
		}	
	}
}
