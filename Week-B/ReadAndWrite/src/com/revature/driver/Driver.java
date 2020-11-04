package com.revature.driver;

import com.revature.bean.*;

/* (WEEK B : Video 3)
 * 
 * [A] IO is the Class we created in "com.revature.bean"
 * [a1] String literal declared
 * [a2] Class.outputmethod(String + String) = "Lady : " + "banana" 
 *      (Note: return type is "void").
 * [a3] Class.inputmethod() (Note: return type is "String" so place 
 * 		inside println(""))
 * 		- Reads my input from a file to the console
 * [a4] Must create a file to read from goto: new > file > create: input.txt 
 * 
 * Notes: 
 * 1. Right-click folder > Refresh > creates: output.txt
 */

public class Driver {

	public static void main(String[] args) {
	
			IO io = new IO(); // [A]
			String a = "banana"; //[a1]
			
			io.writeOutputStream("Lady : " + a + "\n"); //[a2]
			
			System.out.println(io.readInputStream()); //[a3]
			
	}

}
