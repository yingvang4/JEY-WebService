package com.revature.jey.pojos;

public class Admin {
	private long admin_ID;
	private String username;
	private String password;
	private String first_Name;
	private String last_Name;
	
	public Admin(long admin_ID, String username, String password, String first_Name, String last_Name) {
		super();
		this.admin_ID = admin_ID;
		this.username = username;
		this.password = password;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
	}

	public long getAdmin_ID() {
		return admin_ID;
	}

	public void setAdmin_ID(long admin_ID) {
		this.admin_ID = admin_ID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
}
