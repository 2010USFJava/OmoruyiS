package com.revature.daoimpl;

/*
 * (4) Total methods to test in JUnit
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.beans.Register;
import com.revature.dao.RegisterDao;
import com.revature.util.ConnFactory;

public class RegisterDaoImpl implements RegisterDao{

	public static ConnFactory cf = ConnFactory.getInstance();
	
	@Override
	public void registerCustomer(Register p) throws SQLException {
		Connection conn = cf.getConnection();
		
		String sql = "insert into register values(DEFAULT,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		//ps.setInt(1, p.getUid()); // Only referring to 1stps ?
		ps.setString(1,  p.getUsername()); // referring to 2nd ?
		ps.setString(2,  p.getPassword()); // referring to 3nd ?
		ps.setString(3,  p.getFirst()); // referring to 4nd ?
		ps.setString(4,  p.getLast()); // referring to 5nd ?
		ps.executeUpdate();
	}
	
	public void insertUserUpdates(Register p) throws SQLException {
		Connection conn = cf.getConnection();
		
		String sql = "update register set first=?, last=?, password=? where username=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,  p.getFirst()); // referring to 4nd ?
		ps.setString(2,  p.getLast()); // referring to 5nd ?
		ps.setString(3,  p.getPassword()); // referring to 3nd 
		ps.setString(4, p.getUsername()); 
		ps.executeUpdate();
	}
	
	@Override
	public Register retrievedById(int uid) throws SQLException {
		Connection conn = cf.getConnection();
		
		String sql = "select * from register where uid=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, uid); // Only referring to 1st ps ?
		ResultSet rs = ps.executeQuery();
		Register r1 = null;
		while(rs.next()) {
			r1 = new Register(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
				}		
		return r1;
	}
	
	public void deleteUser(Register p) throws SQLException {
		Connection conn = cf.getConnection();
		
		String sql = "delete from register where username=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, p.getUsername()); 
		ps.executeUpdate();
	}
}