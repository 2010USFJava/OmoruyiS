package com.revature.dao;

import java.sql.SQLException;

import com.revature.beans.Account;


public interface AccountDao {
	
	//Insert by uid
	public void registerAccount(Account p) throws SQLException;

	//Retrieve by uid
	public Account retrievedById(int aid) throws SQLException;

}
