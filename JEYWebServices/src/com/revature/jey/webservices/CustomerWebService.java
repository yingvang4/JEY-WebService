package com.revature.jey.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.revature.jey.daos.CardDAO;
import com.revature.jey.daos.CustomerDAO;
import com.revature.jey.pojos.Card;
import com.revature.jey.pojos.Customer;

@WebService
public class CustomerWebService {

	CustomerDAO myCustomerDAO = new CustomerDAO();
	CardDAO myCardDAO = new CardDAO();
	
	@WebMethod
	public void createCustomer(Customer newCustomer, Card newCard)
	{
		long customerID = myCustomerDAO.insertIntoCustomer(newCustomer);
		newCard.setCard_ID(customerID);
		myCardDAO.insertIntoCard(newCard);
	}
}
