package com.revature.jey.daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.revature.jey.pojos.Address;

public class AddressDAO {
	Connection conn;
	
	// function that will insert a new address into the Pending Database's address table
	// input: the new address to be inserted, the ID of the customer who inputed the address
	// output: none
	public void insertIntoAddress(Address newAddress, long customerID)
	{
		try {
			String sqlCommand = "call CREATE_ADDRESS(?,?,?,?,?,?,?,?)";
			CallableStatement insertAddrCallableStmt = conn.prepareCall(sqlCommand);
			
			// set the columns
			insertAddrCallableStmt.setString(2, newAddress.getAddress1());
			insertAddrCallableStmt.setString(3, newAddress.getAddress2());
			insertAddrCallableStmt.setString(5, newAddress.getCity());
			insertAddrCallableStmt.setString(6, newAddress.getState());
			
			insertAddrCallableStmt.executeUpdate();
			
		} catch (SQLException sqlE) {
			sqlE.printStackTrace();
		}
	}
}
