package com.revature.jey.pojos;

import java.sql.Date;

public class Customer {
	private long customer_ID;
	private long admin_Approve;
	private long admin_Archive;
	private String first_Name;
	private String middle_Name;
	private String last_Name;
	private long gender;
	private Date DOB;
	private String email;
	private String phone_Number;
	private Date date_Registered;
	private Date date_Approved;
	private Date date_Archived;
	
	public Customer(long customer_ID, String first_Name, String middle_Name, String last_Name, long gender, Date dOB,
			String email, String phone_Number) {
		super();
		this.customer_ID = customer_ID;
		this.first_Name = first_Name;
		this.middle_Name = middle_Name;
		this.last_Name = last_Name;
		this.gender = gender;
		DOB = dOB;
		this.email = email;
		this.phone_Number = phone_Number;
	}
	
	public long getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(long customer_ID) {
		this.customer_ID = customer_ID;
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
	public long getGender() {
		return gender;
	}
	public void setGender(long gender) {
		this.gender = gender;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
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
	public Date getDate_Registered() {
		return date_Registered;
	}
	public void setDate_Registered(Date date_Registered) {
		this.date_Registered = date_Registered;
	}

	public long getAdmin_Approve() {
		return admin_Approve;
	}

	public void setAdmin_Approve(long admin_Approve) {
		this.admin_Approve = admin_Approve;
	}

	public long getAdmin_Archive() {
		return admin_Archive;
	}

	public void setAdmin_Archive(long admin_Archive) {
		this.admin_Archive = admin_Archive;
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
}
