package com.revature.jey.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.revature.jey.daos.CustomerDAO;
import com.revature.jey.pojos.Customer;

@WebService
public class CustomerWebService {

	CustomerDAO myCustomerDAO = new CustomerDAO();
	
	@WebMethod
	public long createCustomer(Customer newCustomer)
	{
		return myCustomerDAO.insertIntoCustomer(newCustomer);
	}
	
	@WebMethod
	public Customer getCustomer(long customerID)
	{
		return myCustomerDAO.getCustomer(customerID);
	}
	
	@WebMethod
	public void updateCustomer(Customer updatedCustomer)
	{
		myCustomerDAO.updateCustomer(updatedCustomer);
	}
	
	@WebMethod
	public void deleteCustomer(long customerID)
	{
		myCustomerDAO.deleteCustomer(customerID);
	}
	
	@WebMethod
	public void approveCustomer(long customerID, long adminApproveID)
	{
		myCustomerDAO.approveCustomer(customerID, adminApproveID);
	}
	
	@WebMethod
	public void archiveCustomer(long customerID, long adminArchiveID)
	{
		myCustomerDAO.archiveCustomer(customerID, adminArchiveID);
	}
}
