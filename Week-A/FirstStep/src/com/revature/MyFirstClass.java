
/* **************** MAIN PAGE *********************
 * Section 1 : Naming Conventions
 * 1.1 : Sub-directories: (Ex. src > com > revature)
 * 1.2 : Class: Capitalize each word (Ex. Vehicles)
 * 1.3 : Method & Variable: Cammel case (Ex. theCar)
 * 1.4 : Constant : ALL CAPS (Ex. static final double THIS_IS_PI=3.14;)
 */
/*
 * Section 2 : Keywords
 * 2.1 public : access modifier - any class can see it
 * 2.2 static : belongs to the class, don't have to create an obj instance to access class
 * 2.3 void : does not return anything
 * 2.4 main : name of method
 * 2.5 string [] args : method parameter, arg is name of the variable
 */
package com.revature; /* 1.1 */

import com.revature.depend.*;

/*
 * static import: Imports only the static members of a class
 * 	- ex. static import com.revature.beans.Player;
 */


public class MyFirstClass { /* 3 */
	public static void main(String [] args) {  /* 4 */
		int num = 10;
		
		// Date Example (can import as well)
		java.util.Date d = new java.util.Date();
		System.out.println("Date: " + d);
		
		Examples a = new Examples();
		
		// Array example
		Examples.arrayTest();
		//or 
		a.arrayTest();
		
//		forLoop(num);  /* 5.a */
//		int[] myArray = {4, 7, 8, 12, 3, 100}; /* 6.a */
//		forEachFun(myArray); 
//		whileExample(num); /* 7.a */
//		doWhileExample(num); /* 8.a */
		
		
	}
	
	public static void forLoop(int a){ /* 5 */
		System.out.println("\nFor Each Loop: ");
		for(int i=0 ; i<a ; i++ ) {
			System.out.println("i: " + i);
		}
	}
	public static void forEachFun(int [] a) { /* 6 */ // a = name of array
		System.out.println("\nFor Each Loop: ");
		for(int i:a)
			System.out.println("i: " + i+5);
		//for(int i=0 ; i<a.lenght ; i++)	same as above
			//System.out.println(a[i]+5); 	same as above
	}
	public static void whileExample(int i){ /* 7 */
		System.out.println("\nWhile Loop Example: ");
		while(i++<20)
			System.out.println("i: " + i);
			//i++;	
	}
	public static void doWhileExample(int i){ /* 8 */
		System.out.println("\nDo While Loop Example: ");
		do{
			System.out.println("i: " + i);
			i++;
		}while(i<=25); // Conditional	
	}
	
	/* CODE BLOCKS:
	 * static void method(int var, int var) {  [method scope]
	 *  	for (){
	 *			[block scope]
	 *  	}
	 * }
	 */
}
