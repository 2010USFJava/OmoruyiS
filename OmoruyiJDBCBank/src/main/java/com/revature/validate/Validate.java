package com.revature.validate;

import java.util.Scanner;

import com.revature.io.IO;


public class Validate {
	
	static Scanner scan = new Scanner(System.in);
	
	public static int validateIntegerInput() {
		int num;
		do {			
			while (!scan.hasNextInt()) {
		        System.out.println("Invalid input");
		        scan.next(); // this is important!
		    }
			num = scan.nextInt();
		} while (num < 0);
		
		return num;
	}
	
	public static double validateDoubleInput() {
		double num;
		do {			
			while (!scan.hasNextDouble()) {
		        System.out.println("Invalid input");
		        scan.next(); // this is important!
		    }
			num = scan.nextDouble();
		} while (num < 0);
		
		return num;
	}
	
	public static int validateUid() {
		return 0;
	}


}