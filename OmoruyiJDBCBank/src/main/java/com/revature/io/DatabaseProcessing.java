package com.revature.io;

import java.sql.SQLException;


import com.revature.beans.Account;
import com.revature.beans.Register;
import com.revature.dao.AccountDao;
import com.revature.dao.RegisterDao;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.daoimpl.RegisterDaoImpl;

public class DatabaseProcessing {
	
	public static void dbRegisterinsert(Register registeringCustomer) { //pass (r1)
		RegisterDao pd = new RegisterDaoImpl();
		try {
			pd.registerCustomer(registeringCustomer);
			} catch (SQLException e) {
				e.printStackTrace();
				}
		}
	
	public static void dbRegisterRetrieve() { //retrieve (r1)
		RegisterDao pd = new RegisterDaoImpl();
		try {
			Register p = pd.retrievedById(3);
			System.out.println(p.toString());
		} catch (SQLException e) {
				e.printStackTrace();
				}
		}
		
	public static void dbAccountinsert(Account accountingCustomer) {
		AccountDao pd = new AccountDaoImpl();
		try {
			pd.registerAccount(accountingCustomer);
			} catch (SQLException e) {
				e.printStackTrace();
				}
		}
	
}
