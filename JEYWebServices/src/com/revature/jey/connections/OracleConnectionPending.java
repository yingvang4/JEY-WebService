package com.revature.jey.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionPending {
	private static Connection connection;
	
	private OracleConnectionPending() 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// may want to use data source and JNDO for practice
			String url = "pendingcustomers.c9xv5z6yf0yo.us-west-2.rds.amazonaws.com:1521:ORCL";
			String username = "training";
			String password = "p4ssw0rd";
			connection = DriverManager.getConnection(url, username, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getOracleConnection()
	{
		if (connection == null)
		{
			new OracleConnectionPending();
		}
		return connection;
	}
}
