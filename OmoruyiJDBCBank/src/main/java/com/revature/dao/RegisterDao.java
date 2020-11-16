package com.revature.dao;

import java.sql.SQLException;

import com.revature.beans.Register;



public interface RegisterDao {
	
	//Insert by uid
	public void registerCustomer(Register p) throws SQLException;
	
	public void insertUserUpdates(Register p) throws SQLException;

	public void deleteUser(Register p) throws SQLException;
		
	//Retrieve by uid
	public Register retrievedById(int uid) throws SQLException;
	
}
