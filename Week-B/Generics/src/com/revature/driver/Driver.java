package com.revature.driver;
import com.revature.bean.*;

public class Driver {

	public static void main(String[] args) {
		
		/* Create a Gen1 ref for intergers*/
		
		Gen1<Integer> i;
		i = new Gen1<Integer>(88);

		i.showType();
		
		int v = i.getObject();
		System.out.println("Value" + v);
		
		Gen1<String> s = new Gen1<String>("Generics Test");
		s.showType();
		String str = s.getObject();
		System.out.println("Value" + str);
		
		
		
	}

}
