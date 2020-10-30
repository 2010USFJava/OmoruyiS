package com.revature.bean;

/*
 * <T> : Type T
 */

public class Gen1<T> {

	public T obj;			                                /* Declare and obj of type T*/
	public Gen1(T objParameter){							/* Pass the constructor a ref to an obj of type T */
		obj = objParameter;
	}
	
	public T getObject(){                                  /* Return obj*/
		return obj;
	}
	
	public void showType() {                               /* Show the type of T */
		System.out.println( obj.getClass().getName() );
	}
}
