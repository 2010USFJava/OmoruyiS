package com.revature.io;

public class InitializeData {
	
	public static void initializeRegistrationDatabase() {
		
		/* Used for debugging register method 
		 * 
		 * [A] 	Class.method(Class.ArrayList)
		 * 		IOWithCollections.writeInfoFile(IO.registerList)
		 * [1] 	Creates empty register.txt file (Run once)
		 * [2]	Writes to register.txt File 
		 */
		
		//IOWithCollections.writeInfoFile(IO.registerList); //[A]
		 
		/* [B] 	Class.method()
		 * 		IOWithCollections.readInfoFile();
		 * [1] 	First it reads out the contents in the file
		 * [2]	Then it stores the content into Class.ArrayList --> (IO.registerList) 
		 * [3]  Print out contents from register.txt
		 */
		
		IOWithCollections.readInfoFile();  //[B1-B2]
		  
		 /*
		  * System.out.println("Content from register.txt : \n" + IO.registerList + "\n"); //[B3]
		 */
		
		/* [D] 	DEBUG CODE #1 : Hard-Coded registration info for testing 
		 * [1]	Class object = new Class(var1, var2, var3, var4)
		 * 		Register r1 = new Register(username, password, first, last); 
		 * [2] 	Creates instance of (Register) Class
		 * [3]	Then it stores the values to object --> (r1)
		 * [4]  Write it to register.txt
		 * [5] Stores contents from register.txt into array before (each) registration.		 
		 * * */
		
		/*
		 *  Register r1 = new Register("admin", "admin", "admin", "admin"); //[D1]
		 *  System.out.println("r1: " + r1); //[D2]
		 *  IO.registerList.add(r1); //[D3]
		 *  IOWithCollections.writeInfoFile(IO.registerList); //[D4]
		 *  IOWithCollections.readInfoFile(); //[D5]
		 */
	}
	

}
