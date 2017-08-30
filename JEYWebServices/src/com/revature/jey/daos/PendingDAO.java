package com.revature.jey.daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.revature.jey.connections.OracleConnectionPending;
import com.revature.jey.pojos.Address;
import com.revature.jey.pojos.Card;
import com.revature.jey.pojos.Customer;

import oracle.jdbc.OracleTypes;

public class PendingDAO {
	
	Connection conn;
	
	// function that will insert a new customer into the Pending Database's Customer table
	// input: the new customer to be inserted
	// output: the generated ID of the new Customer
	public long insertIntoCustomer(Customer newCustomer)
	{
		long newCustomerID = -1L;
		conn = OracleConnectionPending.getOracleConnection();
		try {
			String sqlCommand = "call CREATE_CUSTOMER(?,?,?,?,?,?,?,?)";
			
			CallableStatement insertCustCallableStmt = conn.prepareCall(sqlCommand);
			
			// set the columns to the values of the 
			insertCustCallableStmt.registerOutParameter(1, OracleTypes.NUMBER);
			insertCustCallableStmt.setString(1, newCustomer.getFirst_Name());
			insertCustCallableStmt.setString(2, newCustomer.getMiddle_Name());
			insertCustCallableStmt.setString(3, newCustomer.getLast_Name());
			insertCustCallableStmt.setLong(4, newCustomer.getGender());
			insertCustCallableStmt.setDate(5, newCustomer.getDOB());
			insertCustCallableStmt.setString(6, newCustomer.getEmail());
			insertCustCallableStmt.setString(7, newCustomer.getEmail());
			insertCustCallableStmt.setDate(8, newCustomer.getDate_Registered());
			
			insertCustCallableStmt.executeUpdate();
			
			// save the newCustomerID
			newCustomerID = insertCustCallableStmt.getLong(1);
			
		} catch (SQLException sqlE) {
			sqlE.printStackTrace();
		}
		return newCustomerID;
	}
	
	// function that will insert a new address into the Pending Database's address table
	// input: the new address to be inserted, the ID of the customer who inputed the address
	// output: none
	public void insertIntoAddress(Address newAddress, long customerID)
	{
		try {
			String sqlCommand = "call CREATE_ADDRESS(?,?,?,?,?,?,?,?)";
			CallableStatement insertAddrCallableStmt = conn.prepareCall(sqlCommand);
			
			// set the columns
			insertAddrCallableStmt.setLong(1, newAddress.getAddress_Type());
			insertAddrCallableStmt.setString(2, newAddress.getAddress1());
			
			
			insertAddrCallableStmt.executeUpdate();
			
		} catch (SQLException sqlE) {
			sqlE.printStackTrace();
		}
	}
	
	// function that will insert a new card into the Pending Database's Card table
	// input: the new card to be inserted, the ID of the customer who inputed that card
	// output: none
	public void insertIntoCard(Card newCard, long customerID)
	{
		conn = OracleConnectionPending.getOracleConnection();
		try {
			String sqlCommand = "call CREATE_CARD(?,?,?)";
			CallableStatement insertCardCallableStmt = conn.prepareCall(sqlCommand);
			
			// set the columns
			
			insertCardCallableStmt.executeUpdate();
			
		} catch (SQLException sqlE) {
			sqlE.printStackTrace();
		}
	}
}
