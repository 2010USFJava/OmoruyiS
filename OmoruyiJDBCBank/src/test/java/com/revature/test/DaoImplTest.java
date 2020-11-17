package com.revature.test;

import static org.junit.Assert.*;


import java.sql.SQLException;

import org.junit.Test;

import com.revature.beans.Account;
import com.revature.beans.Register;
import com.revature.dao.AccountDao;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.menu.Menu;
import com.revature.validate.Validate;


public class DaoImplTest {

	@Test 
	public void testRegisterpPassword() {
		Register r = new Register("user", "pass", "first", "last");
		String actual = r.getPassword();
		assertEquals("pass",actual);
	}
	@Test
	public void testRegisterFirstName() {
		Register r = new Register("user", "pass", "kelly", "last");
		String actual = r.getFirst();
		assertEquals("kelly",actual);
	}

	@Test 
	public void testInsertAccountBalance() {
		
		int expected = 80;
		Account a = new Account(1, 80.00, 1, 20.00);
		int actual = (int)a.getBalance();
		assertEquals(expected,actual);
	}
	
	@Test 
	public void testInsertAccountDeposit() {
		double expected = 44.44;
		Account a = new Account(1, 80.00, 1, 44.44);
		double actual = a.getDeposit();
		assertEquals(expected,actual, 0.001);
	}
	
	@Test 
	public void testInsertAccountWithdrawal() {
		double expected = 44.44;
		Account a = new Account(1, 80.00, 1, 22.22, 44.44);
		double actual = a.getWithdrawal();
		assertEquals(expected,actual, 0.001);
	}
	
	@Test
	public void testIntegerInput() {
		int expected = 20;
		System.out.print("\n Input any integer: ");
		int actual = Validate.validateIntegerInput();
		assertEquals(expected, actual);	
	}
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
	
	@Test /*Testing aggregation function*/
	public void testDoaImpl() throws SQLException {
		AccountDao adi = new AccountDaoImpl();
		double actual = adi.retrievedAssets();
		assertEquals(80.00, actual, 0.001);
	}

}
