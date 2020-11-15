package com.revature.driver;

/*
 * id no rows in rsults set you will get an error
 */




import com.revature.io.DatabaseProcessing;
import com.revature.io.InitializeData;
import com.revature.menu.Menu;

public class Driver {
	
	
	//static {InitializeData.writeToDatabase();}
	static {InitializeData.readFromDatabase();}
	
	public static void main(String[] args) {
		
		
		Menu.mainMenu();

		}

}
