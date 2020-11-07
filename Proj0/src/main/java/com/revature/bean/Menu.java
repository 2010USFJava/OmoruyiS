package com.revature.bean;


import java.util.Scanner;

import com.revature.io.IO;
import com.revature.io.IOWithCollections;


public class Menu {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void mainMenu() {
		
		templateMenu("MAIN MENU", 1);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "c":
			customerMenu();
			break;
		case "e":
			employeeMenu();
			break;
		case "q":
			Messages.quitMsg();
			mainMenu();
			break;
		case "d":
			debugMenu();
			break;
		default:
			Messages.errMsg();
			mainMenu();
			break;
		}
	}
	
	public static void customerMenu() {
		
		templateMenu("CUSTOMER MENU", 2);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "r":
			registerMenu();
			break;
		case "l":
			loginMenu();
			break;
		case "p": 
			mainMenu();
			break;	
		case "q":
			Messages.quitMsg();
			mainMenu();
			break;
		default:
			Messages.errMsg();
			customerMenu();
			break;
		}
	}
	
	public static void employeeMenu() {
		
		templateMenu("EMPLOYEE MENU", 3);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "r":
			registerMenu();
			break;
		case "l":
			loginMenu();
			break;
		case "p": 
			mainMenu();
			break;
		case "q":
			Messages.quitMsg();
			mainMenu();
			break;
		default:
			Messages.errMsg();
			//employeeMenu();
			break;
		}
	}
	
	public static void customerAccountMenu(String screenName) {
		
		templateMenu("ACCOUNT MENU", 4);
		
		//if accounts equal 0
		System.out.println("\n\tCurrently you have 0 accounts with us, " +
				"\n\tApply Now " + screenName + " for great offers!!! \n");
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "a":
			applyMenu();
			break;
		case "d":
			//depositMenu();
			break;
		case "t": 
			//transferMenu();
			break;
		case "v": 
			//viewMenu(); // Layout Customer class here
			break;
		case "q":
			Messages.quitMsg();
			mainMenu();
			break;
		default:
			Messages.errMsg();
			//employeeMenu();
			break;
		}
	}
	
	
	public static void registerMenu() {
		
		String drawLine = "_________________________________";
		
		System.out.println("\tREGISTRATION Menu");
		System.out.println(drawLine);
		
		debugMenu();
	}
	
	public static void loginMenu() {
		
		String drawLine = "_________________________________";
		
		System.out.println("\tLOGIN Menu");
		System.out.println(drawLine);
		
		loginUsers();
	}
	
	
	public static void applyMenu(){
		
		String drawLine = "_________________________________";
		String drawSnowFlakes = "❄❅❆❄❅❆❄❅❆❄❅❆❄❅❆❄❅❆❄❅❆❄❅❆";
		System.out.println("\tApply Menu");
		System.out.println(drawLine);
		
//		System.out.print("How many accounts would you like to open? ");
//		int numOfAcct = scan.nextInt();
//		
//		System.out.println(drawLine);
	
		System.out.println(Character.toChars(0x1F349));
	
		System.out.println("\t[1] Christmas Savings Account");
		System.out.println("\t[2] Election Joint Account");
		System.out.println("\t[3] Primary 'Vanilla' Account");
		System.out.println("\t[4] My Money Is 'Your' Money Joint Account");
		System.out.println("\t[5] My Money is 'My' Money Primary Account");
	
		System.out.print("\n" + drawSnowFlakes + "\n");
	
		
		System.out.print("Select a type of Account: ");
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "1":
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		case "5":
			break;
		default:
			Messages.errMsg();
			//employeeMenu();
			break;
		}
	
		// send all info to employee now
	}	
	
	
	public static void templateMenu(String typeMenu, int version) {
		
		String drawLine= "_________________________________";
		
		System.out.println(drawLine);
		System.out.println("\n\t" +  typeMenu   );
		System.out.println(drawLine);
		
		// MENUS 
		if(version == 1) { // MAIN option(s)
			System.out.println("\n\t[c]ustomer");
			System.out.println("\t[e]mployee");
			System.out.println("\n\t[d]ebug");
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
			//System.out.println("\t[accounts]");
			System.out.println("\t[v]iew info");
		}
		else if(version == 10) { // TRY AGAIN options(s)
			System.out.println("\n\t[y]es");
			System.out.println("\t[n]o");
		}
		
		System.out.println("\n\t[q]uit");
		System.out.println(drawLine);
	}
	

	
	public static void debugMenu() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Hidden Menu");
		
		
		/* README
		 * 
		 * [A] 	Class.method(Class.ArrayList)
		 * 		IOWithCollections.writeInfoFile(IO.registerList)
		 * [1] 	Creates empty register.txt file
		 * [2]	Writes to register.txt File 
		 */
		IOWithCollections.writeInfoFile(IO.registerList);
		
		/* [B] 	Class.method()
		 * 		IOWithCollections.readInfoFile();
		 * [1] 	First it reads out the contents in the file
		 * [2]	Then it stores the content into Class.ArrayList --> (IO.registerList) 
		 */
		IOWithCollections.readInfoFile(); 
		
		/* DEBUG CODE #1
		 * Checks Register array located in Class (IO) 
		 * */
		
		System.out.println("Full Content from register.txt: \n" + IO.registerList + "\n");
		
		/* [C] 	Class object = new Class(var1, var2, var3, var4)
		 * 		Register r1 = new Register(username, password, first, last); 
		 * [1] 	Creates instance of (Register) Class
		 * [2]	Then it stores the values to object --> (r1)
		 * */
		
		Register r1 = new Register("lebron", "password", "Aaliyah", "Haughton"); 
		
		/* DEBUG CODE #2
		 * 1. Print out the values stored in object (r1)
		 * 2. ADD (r1) values into ArrayList --> (registerList)
		 * 3. Write it into a file --> (register.txt)
		 * 4. Next iteration read it back to ArrayList(registerList) before writing something new
		 * */
		
		System.out.println("r1: " + r1); //[D1]
		IO.registerList.add(r1); //[D2]
		IOWithCollections.writeInfoFile(IO.registerList); //[D3]
		
		IOWithCollections.readInfoFile(); //[D4]

		registerUsers();
		
	}
	
	public static void registerUsers() {
		
		String drawLine = "_________________________________";
		
		System.out.println("\n\t Registration \n");
		System.out.println(drawLine);
		
		System.out.println("User: ");
		String user = scan.nextLine();
		
		System.out.println("Password: ");
		String pass = scan.nextLine();
		
		System.out.println("first: ");
		String first = scan.nextLine();
		
		System.out.println("last: ");
		String last = scan.nextLine();
		
		Messages.processMsg();
		
		int size = IO.registerList.size();
		System.out.println("\nTotal Registered Customers: " + size + "\n");
		
		for (int i = 0; i < size ; i++) {
			String registerUser = IO.registerList.get(i).getUsername(); ;
			if(user.equals(registerUser)) {
				System.out.println("Username '" + user + "' already in use!!! \n");
				tryAgainMenu(1);
	
			}
		}
		
		Register r2 = new Register(user, pass, first, last); 
		System.out.println("r2: " + r2);
		IO.registerList.add(r2);
				
		IOWithCollections.writeInfoFile(IO.registerList);
					
		System.out.println("Full Content:" + IO.registerList);
		System.out.println("\n\tRegistration Complete!!!\n");
			
		mainMenu();
	}
	
	public static void loginUsers() {
		
		System.out.println("User: ");
		String user = scan.nextLine();
		
		System.out.println("Password: ");
		String pass = scan.nextLine();
		
		IOWithCollections.readInfoFile(); 
		System.out.println("register.txt: \n" + IO.registerList + "\n"); /* Debug Line */
		
		int size = IO.registerList.size();
		System.out.println("\n Total Registered Customers: " + size + "\n");
		
		for (int i = 0; i < size ; i++) {
			String registerUser = IO.registerList.get(i).getUsername(); 
			String registerPass = IO.registerList.get(i).getPassword();
			if(user.equals(registerUser) &&  pass.equals(registerPass)) {
				
				String screenName  = user.substring(0,1).toUpperCase() + user.substring(1).toLowerCase();
				
				System.out.println(" " + screenName + ", Welcome to Casino Royal Banking ");
				
				customerAccountMenu(screenName);
			}
		}
		System.out.println("\n\tIncorrect Login Attempt!!!\n");
		tryAgainMenu(2);
	}
	
	
	public static void tryAgainMenu(int userType) {
		
		templateMenu("TRY AGAIN?", 10);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "y":
			if(userType == 1)
				registerUsers();
			else if(userType == 2)
				loginUsers();
			break;
		case "n":
			customerMenu();
			break;
		default:
			Messages.errMsg();
			tryAgainMenu(userType);
			break;
		}
	}
	

	
	

} // End of Class
