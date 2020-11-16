package com.revature.dao;

import java.sql.SQLException;

import com.revature.beans.Account;


public interface AccountDao {
	
	//Insert by uid
	public void registerAccount(Account p) throws SQLException;
	
	public void insertAccountBalance(Account p) throws SQLException;
	
	public void insertAccountDeposit(Account p) throws SQLException;
	
	public void insertAccountWithdrawal(Account p) throws SQLException;
	
	public void deleteAccount(Account p) throws SQLException;
	
	public double retrievedAssets() throws SQLException;
	
	//Retrieve by uid
	public Account retrievedById(int aid) throws SQLException;

}
