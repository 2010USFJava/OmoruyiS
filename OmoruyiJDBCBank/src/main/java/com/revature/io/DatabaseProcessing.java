package com.revature.io;
/*
 * (3) methods to test in JUnit
 */
import java.sql.SQLException;


import com.revature.beans.Account;
import com.revature.beans.Register;
import com.revature.dao.AccountDao;
import com.revature.dao.RegisterDao;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.daoimpl.RegisterDaoImpl;

public class DatabaseProcessing {
	
	/* Insert handling register class*/
	public static void dbRegisterinsert(Register registeringCustomer) { //pass (r1)
		RegisterDao pd = new RegisterDaoImpl();
		try {
			pd.registerCustomer(registeringCustomer);
			} catch (SQLException e) {
				e.printStackTrace();
				}
		}
	/* Insert handling account class*/
	public static void dbAccountinsert(Account accountingCustomer, Register registeringCustomer ) {
		AccountDao pd = new AccountDaoImpl();
		try {
			pd.registerAccount(accountingCustomer, registeringCustomer);
			} catch (SQLException e) {
				e.printStackTrace();
				}
		}
	
	/* retrieve handling for register class*/
	public static void dbRegisterRetrieve() { //retrieve (r1)
		RegisterDao pd = new RegisterDaoImpl();
		try {
			Register p = pd.retrievedById(3);
			System.out.println(p.toString());
		} catch (SQLException e) {
				e.printStackTrace();
				}
		}
		
	
}
