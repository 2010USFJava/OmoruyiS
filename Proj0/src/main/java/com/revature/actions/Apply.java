package com.revature.actions;

import java.util.Scanner;

import com.revature.bean.Messages;
import com.revature.menu.Menu;

public class Apply {

static Scanner scan = new Scanner(System.in);
	
	public static void applytMenu() {
		
		
		Menu.templateMenu("APPLICATION Menu", 5); 
		
		System.out.print("Select a Type of Account: ");
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "1":
			primaryAccount();
			break;
		case "2":
			jointAccount();
			break;
		case "3":
			primaryAccount();
			break;
		case "4":
			jointAccount();
			break;
		case "5":
			primaryAccount();
			break;
		case "q":
			Messages.loggingOutMsg();
			Menu.mainMenu();
			break;
		default:
			Messages.errMsg();
			break;
		}	
	}
	
	
	public static void primaryAccount() {
		
	}
	
	public static void jointAccount() {
		
	}
	
	
}
