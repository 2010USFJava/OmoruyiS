package com.revature.depend;

import java.util.Arrays;

/**************** BEAN PAGE *********************/


public class Examples {
	
	/* CALL CODE BLOCKS
	 *	- static: call class
	 *	- instance: call instance of that class
	 */
	
	static {
		//Static CODE BLOCK : runs when this class is 1st loaded into the compiler
		System.out.println("I am in a static code block");
	}
	{	//Instance CODE BLOCK
		System.out.println("I am in an instance code block");
	}
	
	// Array example
	public static void arrayTest() {
		
		// int myArray[] = new int[7]; //Allocated 7 spaces
		 
		int [] chaos = {1,2,3,3,4,5,6,7};
		 System.out.println(chaos[6]);
		 
		 Arrays.sort(chaos);
		 System.out.println(Arrays.toString(chaos));
	}
}
