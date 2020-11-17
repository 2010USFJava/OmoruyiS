package com.revature.dao;

import java.sql.SQLException;

import com.revature.beans.Account;
import com.revature.beans.Register;

/*
 * (6) Total Account methods
 */
public interface AccountDao {
	
	//Insert by uid
	public void registerAccount(Account p, Register r) throws SQLException;
	public void insertAccountBalance(Account p, Register r) throws SQLException;
	public void insertAccountDeposit(Account p, Register r) throws SQLException;
	public void insertAccountWithdrawal(Account p, Register r) throws SQLException;
	public void deleteAccount(Account p, Register r) throws SQLException;
	public double retrievedAssets() throws SQLException;
}
