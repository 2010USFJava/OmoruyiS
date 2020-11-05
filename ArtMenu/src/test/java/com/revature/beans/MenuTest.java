package com.revature.beans;

import static org.junit.Assert.*;

import org.junit.Test;

public class MenuTest {


	@Test
	public void testTotal() {
		assertEquals( 20, Menu.totalCost(10, 2) );
		
		
	}



}
