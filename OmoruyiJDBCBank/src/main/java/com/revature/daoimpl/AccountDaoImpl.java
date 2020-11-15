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
		String sql = "insert into account values(?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, p.getAid()); // Only referring to 1stps ?
		ps.setDouble(2, p.getBalance()); // referring to 2nd ?
		ps.executeUpdate();
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
