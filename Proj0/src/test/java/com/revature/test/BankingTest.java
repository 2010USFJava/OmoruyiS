package com.revature.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.menu.Menu;

public class BankingTest {

	@Test
	public void testTemplateMenu() {
	
		String expected = "book";
		
		String typeMenu = "book";
		
		Menu.templateMenu(typeMenu, 1); 
		
		assertEquals( expected, typeMenu );
		
	}
	
	@Test
	public void testTemplateMenuVersion() {
		
		int expected = 2;
		
		int version = 2;
		
		Menu.templateMenu("Menu Type", version); 
		
		assertEquals( expected, version );
		
	}
}
	
