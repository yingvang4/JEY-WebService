package com.revature.jey.webservices;

import java.sql.Date;

import com.revature.jey.pojos.Customer;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerWebService myCustomerWebService = new CustomerWebService();
		
		Customer a = new Customer();
		
		a.setFirst_Name("asdf");
		a.setLast_Name("fghj");
		a.setSSN("222-33-4444");
		a.setGender(1L);
		a.setEmail("asdf@gmail.com");
		a.setPhone_Number("235.555.6666");
		a.setDOB(new Date(0));
		a.setResidential_Address(1001);
		a.setMailing_Address(1001);
		
		//long cust_id = myCustomerWebService.createCustomer(a);
		a.setCustomer_ID(1020);
		a.setFirst_Name("ghj");
		a.setGender(2);
		a.setPhone_Number("123");
		
		myCustomerWebService.updateCustomer(a);
		
		System.out.println(myCustomerWebService.getCustomer(1020L));
		
		myCustomerWebService.deleteCustomer(1022);
	}

}
