package com.revature.bean;

import java.util.Scanner;

public class Menu {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void mainMenu() {
		
		templateMenu("MAIN MENU", 1);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "c":
			createObjectMenu();
			break;
		default:
			//errMsg();
			mainMenu();
			break;
		}
		
		
		
	}
	
	public static void templateMenu(String typeMenu, int version) {
		
		System.out.println("_________________________________");
		System.out.println("\n\t" +  typeMenu   );
		System.out.println("_________________________________");
		
		
		if(version == 1) { // MENU option(s)
			System.out.println("\n\t[c]reate new ojbect");
		}
		if(version == 2) { // CREATE option(s)
			//System.out.println("\n\t[c]reate new ojbect");
		}
		
	}
	
	public static void createObjectMenu() {
		
		templateMenu("Create Object MENU", 2);
		System.out.println("\n\tNow many Player objects" + 
							"\n\tdo you want to create: ");
		
		String amountStr = scan.nextLine();	 
		int amount = Integer.parseInt(amountStr);
		
		if(amount > 0)
		{
			int x = 0;
			do {
				x = x + 1;
				System.out.println("[Player " + x + "]");
				System.out.println("Name: ");
				String name = scan.nextLine();
				
				System.out.println("Position: ");
				String position = scan.nextLine();
				
				System.out.println("Team: ");
				String team = scan.nextLine();
				
				System.out.println("Age: ");
				String ageS = scan.nextLine();
				
				int age = Integer.parseInt(ageS);
				
				League player = new League(name, position, team, age);
				Logs.LogData("info", player.getName() + " was created!");
				//System.out.println(x + " " + " " +amount);
			}while(x < amount );
		}
		else {
			
			System.out.println("Going back to Main Menu");
			mainMenu();
		}
		
		
		System.out.println(Player.leagueList.toString());
		System.out.println("\n");
		mainMenu();
		
	}
			

}
