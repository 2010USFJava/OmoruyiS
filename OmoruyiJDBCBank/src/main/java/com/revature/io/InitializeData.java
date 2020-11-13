package com.revature.io;

public class InitializeData {
	
	public static void writeToDatabase() {
		
		IOWithCollections.writeInfoFile(IO.registerList); 
	}
	
	public static void readFromDatabase(){
		
		IOWithCollections.readInfoFile(); 
	}
	

}
