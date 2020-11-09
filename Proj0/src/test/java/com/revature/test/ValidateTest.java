package com.revature.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.validate.Validate;

public class ValidateTest {

	@Test
	public void testIntegerInput() {
		
		int expected = 20;
		
		System.out.print("\n Input any integer: ");
		int actual = Validate.validateIntegerInput();
		
		assertEquals(expected, actual);
			
	}
	

}
