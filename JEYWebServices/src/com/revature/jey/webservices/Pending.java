package com.revature.jey.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.revature.jey.pojos.Address;
import com.revature.jey.pojos.Card;
import com.revature.jey.pojos.Customer;

@WebService
public class Pending {

	@WebMethod
	public boolean createCustomer(Customer newCustomer, Address newAddress, Card newCard)
	{
		
		return true;
	}
}
