package com.revature.jey.pojos;

public class Address {
	private long address_Type;
	private String address1;
	private String address2;
	private String address3;
	private String city;
	private String state;
	private long zip_Code;
	private String country;
	
	public Address(long address_Type, String address1, String address2, String address3, String city, String state,
			long zip_Code, String country) {
		super();
		this.address_Type = address_Type;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.city = city;
		this.state = state;
		this.zip_Code = zip_Code;
		this.country = country;
	}
	
	public long getAddress_Type() {
		return address_Type;
	}
	public void setAddress_Type(long address_Type) {
		this.address_Type = address_Type;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZip_Code() {
		return zip_Code;
	}
	public void setZip_Code(long zip_Code) {
		this.zip_Code = zip_Code;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
