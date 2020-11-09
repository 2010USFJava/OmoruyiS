package com.revature.actions;

import java.util.Scanner;

import com.revature.bean.Messages;
import com.revature.io.IO;
import com.revature.menu.CustomerMenu;
import com.revature.menu.Menu;

public class View {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void viewMenu( int customerTag ) {
		
		
		String first = IO.registerList.get(customerTag).getFirst();
		String last = IO.registerList.get(customerTag).getLast();
		String user = IO.registerList.get(customerTag).getUsername();
		
		String screenName  = user.substring(0,1).toUpperCase() + user.substring(1).toLowerCase();
		//String accountNumber = IO.registerList.get(customerTag).getUsername();
		//String balance = IO.registerList.get(customerTag).getUsername();
		
		//String account = IO.registerList.get(customerTag).getAccount();
		
 
		String starLine = "************************************************";
		
		System.out.println("\n");
		System.out.println(" Personal Information");
		System.out.println(starLine);
		
		System.out.println(" First : "  + first  +  "\t" + "\tLast : " + last );
		
		System.out.println(" Username : " + user + "\t" + "Password : " + "********" + "\n"); 

		
		System.out.println(" Email   : n/a");
		System.out.println(" Address : n/a");
		System.out.println(" Phone   : n/a");
		
		
		
		System.out.println("\n\n Account Information");
		System.out.println(starLine);
		
		System.out.println(" Account No      : ");
		
		System.out.println(" Account Type(s) : ");
		
		System.out.println(" Balance         : ");
		
		System.out.println(" Transfers       : ");
		
		System.out.println("\n\n Policy");
		System.out.println(starLine);
		
		System.out.println(""
				+ " In order for an account "
				+ "to be approved a minimum"
				+ "\n of $800 must be deposited to each "
				+ "primary account, \n and a minimum " 
				+ "of $1000 for each joint account.");
		
		System.out.println("\n The FDIC insures a maximum of "
				+ "$250,000 per depositor.");
	
		System.out.println("\n\t[p]revious" + "\t[e]xit" +  "\t[q]uit");
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "p":
			Messages.exitMsg();
			CustomerMenu.customerAccountMenu(screenName, customerTag);
			break;
		case "e":
			Messages.exitMsg();
			CustomerMenu.customerAccountMenu(screenName, customerTag);
			break;
		case "q":
			Messages.loggingOutMsg();
			Menu.mainMenu(); 
			break;
		default:
			Messages.errMsg();
			viewMenu(customerTag);
			break;
		}
		
		
	}
	
	

}
