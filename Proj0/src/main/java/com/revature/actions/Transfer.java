package com.revature.actions;

import com.revature.io.IO;

public class Transfer {

	public static void transferMenu(int customerTag) {
		
		
		String user = IO.registerList.get(customerTag).getUsername();
		String screenName  = user.substring(0,1).toUpperCase() + user.substring(1).toLowerCase();
		
		
	}
}
