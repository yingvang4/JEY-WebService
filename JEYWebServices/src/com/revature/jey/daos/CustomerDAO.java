package com.revature.jey.daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.jey.connections.OracleConnection;
import com.revature.jey.pojos.Customer;

import oracle.jdbc.OracleTypes;

public class CustomerDAO {
	
	Connection conn;
	
	// method that will insert a new customer into Customers table
	// input: the new customer to be inserted
	// output: the generated ID of the new Customer
	public long insertIntoCustomer(Customer newCustomer)
	{
		long newCustomerID = -1L;
		conn = OracleConnection.getOracleConnection();
		try {
			String sqlCommand = "call CREATE_CUSTOMER(?,?,?,?,?,?,?,?,?,?,?)";
			
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
	
	// method that will update a Customer's information in the Customers table
	// input: new Customer POJO with updated information
	// output: none
	public void updateCustomer(Customer newCustomer)
	{
		conn = OracleConnection.getOracleConnection();
		try {
			String sqlCommand = "call UPDATE_CUSTOMER(?,?,?,?,?,?,?,?,?,?,?)";
			
			CallableStatement updateCustCallableStmt = conn.prepareCall(sqlCommand);
			
			// set the columns to the values of the 
			updateCustCallableStmt.setLong(1, newCustomer.getCustomer_ID());
			updateCustCallableStmt.setString(2, newCustomer.getFirst_Name());
			updateCustCallableStmt.setString(3, newCustomer.getMiddle_Name());
			updateCustCallableStmt.setString(4, newCustomer.getLast_Name());
			updateCustCallableStmt.setString(5, newCustomer.getSSN());
			updateCustCallableStmt.setLong(6, newCustomer.getGender());
			updateCustCallableStmt.setString(7, newCustomer.getEmail());
			updateCustCallableStmt.setString(8, newCustomer.getPhone_Number());
			updateCustCallableStmt.setDate(9, newCustomer.getDOB());
			updateCustCallableStmt.setLong(10, newCustomer.getResidential_Address());
			updateCustCallableStmt.setLong(11, newCustomer.getMailing_Address());
			
			updateCustCallableStmt.executeUpdate();
	
			
		} catch (SQLException sqlE) {
			sqlE.printStackTrace();
		}
	}
	
	// method that will get a Customer record in the Customers table
	// input: ID of the customer of interest
	// output: the Customer POJO representing their record in the table 
	public Customer getCustomer(long customerID)
	{
		Customer outputCustomer = null;
		
		conn = OracleConnection.getOracleConnection();
		try {
			String sqlCommand = "call GET_CUSTOMER(?,?)";
			
			CallableStatement getCustCallableStmt = conn.prepareCall(sqlCommand);
			getCustCallableStmt.setLong(1, customerID);
			getCustCallableStmt.registerOutParameter(2, OracleTypes.CURSOR);
			
			getCustCallableStmt.executeQuery();
			
			ResultSet rs = (ResultSet) getCustCallableStmt.getObject(2);
			while (rs.next())
			{
				outputCustomer = new Customer(
						rs.getLong(1), // ID
						rs.getLong(2), // Status
						rs.getString(3), // First Name
						rs.getString(4), // Middle Name
						rs.getString(5), // Last Name
						rs.getString(6), // SSN
						rs.getLong(7), // Gender
						rs.getString(8), // Email
						rs.getString(9), // Phone Number
						rs.getDate(10), // DOB
						rs.getLong(11), // Residential Address
						rs.getLong(12), // Mailing Address
						rs.getDate(13), // Date Registered
						rs.getDate(14), // Date Approved
						rs.getDate(15), // Date Archived
						rs.getLong(16), // Admin Approved
						rs.getLong(17)); // Admin Archived
			}
			
		} catch(SQLException sqlE) {
			sqlE.printStackTrace();
		}
		return outputCustomer;
	}
	
	// method that will delete a Customer record in the Customers table
	// input: ID of the customer to be deleted
	// output: none
	public void deleteCustomer(long customerID)
	{
		conn = OracleConnection.getOracleConnection();
		try {
			String sqlCommand = "call DELETE_CUSTOMER(?)";
			
			CallableStatement deleteCustCallableStmt = conn.prepareCall(sqlCommand);
			deleteCustCallableStmt.setLong(1, customerID);
			
			deleteCustCallableStmt.executeUpdate();
		} catch (SQLException sqlE) {
			sqlE.printStackTrace();
		}
	}
	
	// method that will approve a customer record in the Customers table (set approve status, approve date, and add admin approve)
	// input: ID of the customer to approve, ID of the admin who approved the customer
	// output: none
	public void approveCustomer(long customerID, long adminApproveID)
	{
		conn = OracleConnection.getOracleConnection();
		try {
			String sqlCommand = "call APPROVE_CUSTOMER(?,?)";
			CallableStatement approveCustCallableStmt = conn.prepareCall(sqlCommand);
			
			approveCustCallableStmt.setLong(1, customerID);
			approveCustCallableStmt.setLong(2, adminApproveID);
			
			approveCustCallableStmt.executeUpdate();
		} catch(SQLException sqlE) {
			sqlE.printStackTrace();
		}
	}
	
	// method that will archive a customer record in the Customers table (set archive status, archive date, and add admin archive)
	// input: ID of the customer to approve, ID of the admin who approved the customer
	// output: none
	public void archiveCustomer(long customerID, long adminArchiveID)
	{
		conn = OracleConnection.getOracleConnection();
		try {
			String sqlCommand = "call ARCHIVE_CUSTOMER(?,?)";
			CallableStatement approveCustCallableStmt = conn.prepareCall(sqlCommand);
			
			approveCustCallableStmt.setLong(1, customerID);
			approveCustCallableStmt.setLong(2, adminArchiveID);
			
			approveCustCallableStmt.executeUpdate();
		} catch(SQLException sqlE) {
			sqlE.printStackTrace();
		}
	}
}
