package com.revature.io;

import java.sql.SQLException;


import com.revature.beans.Account;
import com.revature.beans.Register;
import com.revature.dao.AccountDao;
import com.revature.dao.CustomerDao;
import com.revature.dao.RegisterDao;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.daoimpl.CustomerDaolmpl;
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
	
	
	public static void dbRegisterRetrieve(int uid) { //retrieve (r1)
		RegisterDao pd = new RegisterDaoImpl();
		try {
			Register p = pd.retrievedById(uid);
			System.out.println(p.toString());
			} catch (SQLException e) {
				e.printStackTrace();
				}
		}
	
	
	public static void dbAccount(int aid) {
		AccountDao pd = new AccountDaoImpl();
		try {
			//pd.registerAccount(new Account(1, 40.00)); //sets data
			Account p = pd.retrievedById(1); // Retrieves data
			System.out.println(p.toString());
			} catch (SQLException e) {
				e.printStackTrace();
				}
		}
	
	public static void dbCustomer() {
		CustomerDao pd = new CustomerDaolmpl();
//		try {
//			pd.registerAccount(new Customer());
//			Account p = pd.retrievedById(1);
//			System.out.println(p.toString());
//			} catch (SQLException e) {
//				e.printStackTrace();
//				}
		}

}
