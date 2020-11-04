package com.revature.driver;
import com.revature.bean.*;

public class Driver {

	
	
	public static void main(String[] args) {
		double weight = 45.68;
		
		Integer i = 4;
		
		Animal a = new Animal("brown", "dog"); /* 1. Exact Match */
		
		Animal b = new Animal((int)weight); /* 2. Conversion */
		
		Animal c = new Animal(i); /* 3.  Boxing / Unboxing */
		
		Animal d = new Animal(1,2,3); /* 4. vararg */
		
	
			
		
		
		
				
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
