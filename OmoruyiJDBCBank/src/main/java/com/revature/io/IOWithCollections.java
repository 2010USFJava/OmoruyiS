package com.revature.io;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Account;
import com.revature.beans.Register;

public class IOWithCollections {
	//private static final String customerFile = "customer.txt"; 
	private static final String registerFile = "register.txt"; 
	
	
	
	public static void writeInfoFile(List<Register> registerList, List<Account> accountList){ //[A]
		
		try { 
			ObjectOutputStream objectout = new ObjectOutputStream( new FileOutputStream(registerFile) ); 
			objectout.writeObject(registerList);
			objectout.writeObject(accountList);
			objectout.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	
	
	@SuppressWarnings("unchecked")
	public static void readInfoFile(){ //[B]
		
		try {
			ObjectInputStream objectIn = new ObjectInputStream( new FileInputStream(registerFile) ); 
			IO.registerList = (ArrayList<Register>)objectIn.readObject();
			IO.accountList = (ArrayList<Account>)objectIn.readObject();
			objectIn.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}
}
