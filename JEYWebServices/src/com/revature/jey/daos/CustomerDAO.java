package com.revature.jey.daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.revature.jey.connections.OracleConnectionPending;
import com.revature.jey.pojos.Address;
import com.revature.jey.pojos.Card;
import com.revature.jey.pojos.Customer;

import oracle.jdbc.OracleTypes;

public class CustomerDAO {
	
	Connection conn;
	
	// function that will insert a new customer into the Pending Database's Customer table
	// input: the new customer to be inserted
	// output: the generated ID of the new Customer
	public long insertIntoCustomer(Customer newCustomer)
	{
		long newCustomerID = -1L;
		conn = OracleConnectionPending.getOracleConnection();
		try {
			String sqlCommand = "call CREATE_CUSTOMER(?,?,?,?,?,?,?,?,?)";
			
			CallableStatement insertCustCallableStmt = conn.prepareCall(sqlCommand);
			
			// set the columns to the values of the 
			insertCustCallableStmt.setString(1, newCustomer.getFirst_Name());
			insertCustCallableStmt.setString(2, newCustomer.getMiddle_Name());
			insertCustCallableStmt.setString(3, newCustomer.getLast_Name());
			insertCustCallableStmt.setString(4, newCustomer.getSSN());
			insertCustCallableStmt.setLong(5, newCustomer.getGender());
			insertCustCallableStmt.setString(6, newCustomer.getEmail());
			insertCustCallableStmt.setString(7, newCustomer.getPhone_Number());
			insertCustCallableStmt.setDate(8, newCustomer.getDOB());
			insertCustCallableStmt.setLong(9, newCustomer.getResidential_Address());
			insertCustCallableStmt.setLong(10, newCustomer.getMailing_Address());
			insertCustCallableStmt.registerOutParameter(11, OracleTypes.NUMBER);
			
			insertCustCallableStmt.executeUpdate();
			
			// save the newCustomerID
			newCustomerID = insertCustCallableStmt.getLong(11);
			
		} catch (SQLException sqlE) {
			sqlE.printStackTrace();
		}
		return newCustomerID;
	}
}
