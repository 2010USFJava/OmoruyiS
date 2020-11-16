package com.revature.driver;


import com.revature.io.InitializeData;
import com.revature.menu.Menu;

public class Driver {
	
	
	//static {InitializeData.writeToDatabase();}
	static {InitializeData.readFromDatabase();}
	
	public static void main(String[] args) {
		
		
		Menu.mainMenu();

		}

}
