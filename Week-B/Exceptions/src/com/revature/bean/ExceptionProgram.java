package com.revature.bean;

public class ExceptionProgram extends RuntimeException{

	/*public Person() {
		
	}*/
	
	public void increaseAgeBy(int x) throws ExceptionProgram {
		if(x<=0) {
			throw new ExceptionProgram();
		}
		//this.age+=2;
	}
	
