package com.revature.bean;

import java.util.Arrays;

/*
 * ()
 * 1. Exact Match
 * 2. Conversion
 * 3. Boxing / Unboxing 
 * 4. vararg 
 */

public class Animal {
	
	public String color;
	public String type;
	public int weight;
	public int[] age;
	public Integer rating;

	public Animal(){ 
	}
	
	
	public Animal(String color, String type) { /* 1. Exact Match */
		this.color = color;
		this.type = type;
	}
	
	public Animal(int weight){ /* 2. Conversion */
		this.weight = weight;
	} 
	
	public Animal(Integer rating){  /* 3. boxing */
		this.rating = rating; 
	}
	
	public Animal(int...age){ /* 4. vararg */
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [color=" + color + ", type=" + type + ", weight=" + weight + ", age=" + Arrays.toString(age)
				+ ", rating=" + rating + "]";
	}
	
	
}
