package com.revature.jey.daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.revature.jey.connections.OracleConnection;
import com.revature.jey.pojos.Card;

public class CardDAO {
	Connection conn;

	// function that will insert a new card into the Pending Database's Card
	// table
	// input: the new card to be inserted, the ID of the customer who inputed
	// that card
	// output: none
	public void insertIntoCard(Card newCard) 
	{
		conn = OracleConnection.getOracleConnection();
		try {
			String sqlCommand = "call CREATE_CARD(?,?,?)";
			CallableStatement insertCardCallableStmt = conn.prepareCall(sqlCommand);

			// set the columns
			insertCardCallableStmt.setLong(1, newCard.getCard_Type());
			insertCardCallableStmt.setLong(2, newCard.getCustomer_ID());
			insertCardCallableStmt.setString(3, newCard.getCard_Number());
			
			insertCardCallableStmt.executeUpdate();

		} catch (SQLException sqlE) {
			sqlE.printStackTrace();
		}
	}
}
