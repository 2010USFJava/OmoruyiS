package com.revature.actions;

import com.revature.io.IO;

public class View {
	
	
	public static void viewMenu( int customerTag ) {
		
		
		System.out.println( IO.registerList.get(customerTag));
		System.out.println( IO.registerList.get(customerTag).getUsername() );
		
		
	}

}
