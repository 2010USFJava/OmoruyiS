package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.beans.Account;
import com.revature.dao.AccountDao;
import com.revature.util.ConnFactory;

public class AccountDaoImpl implements AccountDao{
	
public static ConnFactory cf = ConnFactory.getInstance();
	
	@Override
	public void registerAccount(Account p) throws SQLException {
		
		Connection conn = cf.getConnection();
		
		String sql = "insert into account values(?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, p.getAid()); // Only referring to 1stps ?
		ps.setDouble(2, p.getBalance()); // referring to 2nd ?
		ps.setDouble(3, p.getQty()); // referring to 2nd ?
		ps.setDouble(4, p.getDeposit()); // referring to 2nd ?
		ps.setDouble(5, p.getWithdrawal()); // referring to 2nd ?
		ps.executeUpdate();
	}
	
	public void insertAccountBalance(Account p) throws SQLException {
		
		Connection conn = cf.getConnection();
		String sql = "update account set balance=? where aid=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setDouble(1, p.getBalance());
		ps.setInt(2, p.getAid()); 
		ps.executeUpdate();
	}
	
	public void insertAccountDeposit(Account p) throws SQLException {
		
		Connection conn = cf.getConnection();
		String sql = "update account set deposit=? where aid=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setDouble(1, p.getDeposit());
		ps.setInt(2, p.getAid()); 
		ps.executeUpdate();
	}
	
	public void insertAccountWithdrawal(Account p) throws SQLException {
		
		Connection conn = cf.getConnection();
		String sql = "update account set withdrawal=? where aid=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setDouble(1, p.getWithdrawal());
		ps.setInt(2, p.getAid()); 
		ps.executeUpdate();
	}
	
	public void deleteAccount(Account p) throws SQLException {
		
		Connection conn = cf.getConnection();
		String sql = "delete from account where aid=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, p.getAid()); 
		ps.executeUpdate();
	}
	
	public double retrievedAssets() throws SQLException {
		double equity = 0.00;
		Connection conn = cf.getConnection();
		String sql = "select sum(balance) from account as equity";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setDouble(1, equity); // Only referring to 1stps ?
		ResultSet rs = ps.executeQuery();
		return rs.getDouble(1);
	}
	

	@Override
	public Account retrievedById(int aid) throws SQLException {
		
		Connection conn = cf.getConnection();
		String sql = "select * from account where aid=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, aid); // Only referring to 1stps ?
		ResultSet rs = ps.executeQuery();
		Account a1 = null;
		while(rs.next()) {
			a1 = new Account(rs.getInt(1), rs.getConcurrency());
			}
		return a1;
	}
	
	
	

}
