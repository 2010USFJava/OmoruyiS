package com.revature.beans;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

public class Menu {

	static Scanner scan = new Scanner(System.in);
	
	public static void mainMenu() {
		
		System.out.println("\n\nWelcome To The Art Shop\n");
		System.out.println("Main Menu");
		System.out.println("[p]ainting");
		
		String choice = scan.nextLine();
		
		switch(choice.toLowerCase()) {
		case "p":
			artMenu();
			break;
		default:
			mainMenu();
			break;
		
		}
		
	}
	
	public static void artMenu() {
		
		System.out.println("Art Menu");
		System.out.println("Qty: ");
		
		
		int qty = scan.nextInt();
		
		Art p1 = new Art(qty);
		
		
		
		System.out.println("You seleted " + p1.getQuantity() + " at $10 dollars a paintings");
		
		int cost = 10;
		
		totalCost(cost, p1.getQuantity());
	}
	
	//public static String artPainting() {
		
	//}
	
	public static void templateMenu(String menuType) {
		
		System.out.println(menuType);
	}
	
	public static int totalCost(int cost, int qty){
		
		int total;
		total = cost * qty;
		System.out.println("At a total of $" + total);
		//test();
		//assertEquals(total, 20);
		//totalTest();
		//test();
		return total;
	}
	

	
}
