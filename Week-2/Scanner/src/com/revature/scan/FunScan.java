package com.revature.scan;
import java.util.Scanner;

public class FunScan {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void printMe() {
		
		while(true) {
		
		/* Ex. 1 */	
		String content;
		System.out.println("Print: ");
		content=sc.nextLine();
		
		System.out.println(content);
		
		//System.out.println("Print: ");
		//String moreContent=sc.nextLine();
		//System.out.println(moreContent);
		
		/* Ex. 2 */
		System.out.println("Num: ");
		// int num = sc.nextInt(); /* Option 1 */
		
		String sNum = sc.nextLine(); /* Option 2 */
		int num = Integer.parseInt(sNum);
		 
		System.out.println(num+4);
		
		}
		
	}

	public static void main(String[] args) {
		printMe();
		

	}

}
