package com.revature.io;

public class InitializeData {
	
	public static void writeToDatabase() {
		IOWithCollections.writeInfoFile(IO.registerList, IO.accountList); 
	}
	
	public static void readFromDatabase(){
		IOWithCollections.readInfoFile(); 
	}
	

}
