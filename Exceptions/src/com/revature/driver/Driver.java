package com.revature.driver;
import com.revature.bean.*;

public class Driver {

	public static void main(String[] args) {
		
		Person a = new Person(31);

		try {
			a.increaseAgeBy(20);
			System.out.println(a.getAge());
		}catch( ExceptionProgram e ) {
			e.printStackTrace();
		}

	}

}
