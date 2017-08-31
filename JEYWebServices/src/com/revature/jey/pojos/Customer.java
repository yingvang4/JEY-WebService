package com.revature.jey.pojos;

import java.sql.Date;

public class Customer {
	private long customer_ID;
	private long status;
	private String first_Name;
	private String middle_Name;
	private String last_Name;
	private String SSN;
	private long gender;
	private String email;
	private String phone_Number;
	private Date DOB;
	private long residential_Address;
	private long mailing_Address;
	private Date date_Registered;
	private Date date_Approved;
	private Date date_Archived;
	private long admin_Approved;
	private long admin_Archived;
	
	public Customer(long customer_ID, long status, String first_Name, String middle_Name, String last_Name, String sSN,
			long gender, String email, String phone_Number, Date dOB, long residential_Address, long mailing_Address,
			Date date_Registered, Date date_Approved, Date date_Archived, long admin_Approved, long admin_Archived) {
		super();
		this.customer_ID = customer_ID;
		this.status = status;
		this.first_Name = first_Name;
		this.middle_Name = middle_Name;
		this.last_Name = last_Name;
		SSN = sSN;
		this.gender = gender;
		this.email = email;
		this.phone_Number = phone_Number;
		DOB = dOB;
		this.residential_Address = residential_Address;
		this.mailing_Address = mailing_Address;
		this.date_Registered = date_Registered;
		this.date_Approved = date_Approved;
		this.date_Archived = date_Archived;
		this.admin_Approved = admin_Approved;
		this.admin_Archived = admin_Archived;
	}

	public long getCustomer_ID() {
		return customer_ID;
	}

	public void setCustomer_ID(long customer_ID) {
		this.customer_ID = customer_ID;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getMiddle_Name() {
		return middle_Name;
	}

	public void setMiddle_Name(String middle_Name) {
		this.middle_Name = middle_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public long getGender() {
		return gender;
	}

	public void setGender(long gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_Number() {
		return phone_Number;
	}

	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public long getResidential_Address() {
		return residential_Address;
	}

	public void setResidential_Address(long residential_Address) {
		this.residential_Address = residential_Address;
	}

	public long getMailing_Address() {
		return mailing_Address;
	}

	public void setMailing_Address(long mailing_Address) {
		this.mailing_Address = mailing_Address;
	}

	public Date getDate_Registered() {
		return date_Registered;
	}

	public void setDate_Registered(Date date_Registered) {
		this.date_Registered = date_Registered;
	}

	public Date getDate_Approved() {
		return date_Approved;
	}

	public void setDate_Approved(Date date_Approved) {
		this.date_Approved = date_Approved;
	}

	public Date getDate_Archived() {
		return date_Archived;
	}

	public void setDate_Archived(Date date_Archived) {
		this.date_Archived = date_Archived;
	}

	public long getAdmin_Approved() {
		return admin_Approved;
	}

	public void setAdmin_Approved(long admin_Approved) {
		this.admin_Approved = admin_Approved;
	}

	public long getAdmin_Archived() {
		return admin_Archived;
	}

	public void setAdmin_Archived(long admin_Archived) {
		this.admin_Archived = admin_Archived;
	}
}
