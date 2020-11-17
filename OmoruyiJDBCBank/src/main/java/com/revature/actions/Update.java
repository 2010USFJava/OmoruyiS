package com.revature.actions;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Register;
import com.revature.dao.RegisterDao;
import com.revature.daoimpl.RegisterDaoImpl;
import com.revature.io.IO;
import com.revature.menu.CustomerMenu;
import com.revature.msg.Msg;

public class Update {
	
	static Scanner scan = new Scanner(System.in);
	public static RegisterDao adi = new RegisterDaoImpl();
	
	public static void update(int customerTag){
	
		String user = IO.registerList.get(customerTag).getUsername();
		String screenName  = user.substring(0,1).toUpperCase() + user.substring(1).toLowerCase();
		
		String starLine = "********************************";
		
		System.out.println(starLine);
		System.out.println("\n\t" + screenName +  ", UPDATE(S)"  );
		System.out.println(starLine);
		
		System.out.println(
				  "\n\t[u]pdate user info"
				+ "\n\t[c]reate another account" //add by 1000 again for new number
				+ "\n\n\t[p]revious"
				
		);
		
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
		case "u":
			personInfo(customerTag);
			break;
		case "c":
			//newAccount(customerTag);
			break;
		case "p":
			CustomerMenu.customerAccountMenu(screenName, customerTag);
			break;
		default:
			Msg.errMsg();
			update(customerTag);
			break;
		}
	
	}
	
	public static void personInfo(int customerTag){
		
		//int uid = IO.registerList.get(customerTag).getUid();
		String user = IO.registerList.get(customerTag).getUsername();
		String first = IO.registerList.get(customerTag).getFirst();
		String last = IO.registerList.get(customerTag).getLast();
		String pass = IO.registerList.get(customerTag).getPassword();
		
		
		first = updatepersonInfo(customerTag, first, "First ");
		IO.registerList.get(customerTag).setFirst(first);
		
		last = updatepersonInfo(customerTag, last, "Last ");
		IO.registerList.get(customerTag).setLast(last);
		
		pass = updatepersonInfo(customerTag, pass, "Password ");
		IO.registerList.get(customerTag).setPassword(pass);
		
		Register customer = new Register(user, pass, first, last);
		try {
			adi.insertUserUpdates(customer);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//InitializeData.writeToDatabase();
		
		
		System.out.print("\n Personal info Updated\n");
		update(customerTag);
	}
	
	public static String updatepersonInfo(int customerTag, String field, String name) {
	
		System.out.println(" Would you like to change " + name + "?");
		String ans = scan.nextLine();
	
		if(ans.equals("yes")) {
			System.out.print(" " + name + ": ");
			field = scan.nextLine();
			return field;
		} else if(ans.equals("no")) {
			return field;
		} else {
			System.out.print("\n invalid enter 'yes/no' \n");
			return updatepersonInfo(customerTag,field, name);
		}
	}
	
	
	
	
	

}
