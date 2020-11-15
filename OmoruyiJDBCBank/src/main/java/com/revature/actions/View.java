package com.revature.actions;

import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.io.IO;
import com.revature.menu.CustomerMenu;
import com.revature.menu.Menu;
import com.revature.msg.Msg;

public class View {
	static Scanner scan = new Scanner(System.in);
	
	public static void viewMenu(int customerTag) {
		
		
		String starLine = "************************************************";
		int uid = IO.registerList.get(customerTag).getUid();
		String first = IO.registerList.get(customerTag).getFirst();
		String last = IO.registerList.get(customerTag).getLast();
		String user = IO.registerList.get(customerTag).getUsername();
		String screenName  = user.substring(0,1).toUpperCase() + user.substring(1).toLowerCase();
		
		
		int aid = IO.accountList.get(customerTag).getAid();
		Double balance = IO.accountList.get(customerTag).getBalance();
		Double deposit = IO.accountList.get(customerTag).getDeposit();
		//Double wd = Create.withdrawal();
		
		System.out.println(aid + balance + deposit);
	
				
		
		System.out.println("\n");
		System.out.println(" Personal Information");
		System.out.println(starLine);
		
		System.out.println(" First : "  + first  +  "\t" + "\tLast : " + last );
		
		System.out.println(" uid : " + uid + "\n");
		System.out.println(" Username : " + user + "\t" + "Password : " + "********" + "\n"); 

		
		System.out.println(" Email   : n/a");
		System.out.println(" Address : n/a");
		System.out.println(" Phone   : n/a");
		
		
		
		System.out.println("\n\n Account Information");
		System.out.println(starLine);
		
		System.out.println(" Account No       : " + aid);
		
		System.out.println(" Account Type(s)  : " + "primary");
		
		System.out.println(" Balance          : " + balance);
		
		System.out.println(" Last Withdrawl   : " + 0.00);
		
		System.out.println(" Last Deposit     : " + deposit);
		
		//System.out.println(" Transfers       : ");
		
		System.out.println("\n\n Policy");
		System.out.println(starLine);
		
		System.out.println("The FDIC insures a maximum of "
				+ "$250,000 per depositor.");
	
		System.out.println("\n\t[p]revious" + "\t[e]xit" +  "\t[q]uit");
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "p":
			Msg.exitMsg();
			CustomerMenu.customerAccountMenu(screenName, customerTag);
			break;
		case "e":
			Msg.exitMsg();
			CustomerMenu.customerAccountMenu(screenName, customerTag);
			break;
		case "q":
			Msg.loggingOutMsg();
			Menu.mainMenu(); 
			break;
		default:
			Msg.errMsg();
			viewMenu(customerTag);
			break;
		}
		
		
	}
	

}
