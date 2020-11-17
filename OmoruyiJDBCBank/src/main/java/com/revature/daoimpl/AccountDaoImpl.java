package com.revature.daoimpl;

/*
 * (6) Total Account methods to test with JUnit
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.beans.Account;
import com.revature.beans.Register;
import com.revature.dao.AccountDao;
import com.revature.util.ConnFactory;

public class AccountDaoImpl implements AccountDao{
	
public static ConnFactory cf = ConnFactory.getInstance();
	
	@Override
	public void registerAccount(Account p, Register r) throws SQLException {
		
		Connection conn = cf.getConnection();
		
		String sql = "insert into account values(DEFAULT,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		//ps.setInt(1, p.getAid()); // Only referring to 1stps ?
		ps.setDouble(1, p.getBalance()); // referring to 2nd ?
		ps.setDouble(2, p.getQty()); // referring to 2nd ?
		ps.setDouble(3, p.getDeposit()); // referring to 2nd ?
		ps.setDouble(4, p.getWithdrawal()); // referring to 2nd ?
		ps.setString(5, r.getUsername()); // referring to 2nd ?
		ps.executeUpdate();
	}
	
	public void insertAccountBalance(Account p, Register r) throws SQLException {
		
		Connection conn = cf.getConnection();
		String sql = "update account set balance=? where username=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setDouble(1, p.getBalance());
		ps.setString(2, r.getUsername()); 
		ps.executeUpdate();
	}
	
	public void insertAccountDeposit(Account p, Register r) throws SQLException {
		
		Connection conn = cf.getConnection();
		String sql = "update account set deposit=? where username=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setDouble(1, p.getDeposit());
		ps.setString(2, r.getUsername()); 
		ps.executeUpdate();
	}
	
	public void insertAccountWithdrawal(Account p, Register r) throws SQLException {
		
		Connection conn = cf.getConnection();
		String sql = "update account set withdrawal=? where username=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setDouble(1, p.getWithdrawal());
		ps.setString(2, r.getUsername()); 
		ps.executeUpdate();
	}
	
	public void deleteAccount(Account p, Register r) throws SQLException {
		
		Connection conn = cf.getConnection();
		String sql = "delete from account where username=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, r.getUsername()); 
		ps.executeUpdate();
	}
	
	@Override
	public double retrievedAssets() throws SQLException {
		double equity = 0.00;
		Connection conn = cf.getConnection();
		String sql = "select sum(balance) from account as equity";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setDouble(1, equity); // Only referring to 1stps ?
		ResultSet rs = ps.executeQuery();
		return rs.getDouble(1);
	}
	

	
	

}
