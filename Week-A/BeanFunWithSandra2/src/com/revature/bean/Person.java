package com.revature.bean;

/* Note References:
 * 1. Person Class
 * 1.1 - 1.3 Private variables
 * 1.4 Constructor
 */
public class Person { 	/* 1 */
	private String name; 	/* 1.1 */
	private String color; 	/* 1.2 */
	private int rating;		 	/* 1.3 */
	
	public Person(String name, String color, int rating) { /* 1.4 */
		this.name = name;
		this.color = color;
		this.rating = rating;
	}
	
	public String getName() {	 /* 2.1 */
		return this.name;
	}
	public void setName(){		/* 2.2 */
		//this.name=name;
	}
	
	public String getColor() {  /* 3.1 */
		return this.color;
	}
	public void setColor() { 	/* 3.2 */
		//this.color=color;
	}
	
	public int getRating() {  /* 4.1 */
		return this.rating;
	}
	public void setRating() {	/* 4.2 */
		//this.rating=rating;
	}
	
	//@override
	//public String toString() {
		//return "Person[" "]";
	//}
}

