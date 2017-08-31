package com.revature.jey.pojos;

public class Card {
	private long card_ID;
	private long card_Type;
	private long customer_ID;
	private String card_Number;
	
	public Card(long card_ID, long card_Type, long customer_ID, String card_Number) {
		super();
		this.card_ID = card_ID;
		this.card_Type = card_Type;
		this.customer_ID = customer_ID;
		this.card_Number = card_Number;
	}

	public long getCard_ID() {
		return card_ID;
	}

	public void setCard_ID(long card_ID) {
		this.card_ID = card_ID;
	}

	public long getCard_Type() {
		return card_Type;
	}

	public void setCard_Type(long card_Type) {
		this.card_Type = card_Type;
	}

	public long getCustomer_ID() {
		return customer_ID;
	}

	public void setCustomer_ID(long customer_ID) {
		this.customer_ID = customer_ID;
	}

	public String getCard_Number() {
		return card_Number;
	}

	public void setCard_Number(String card_Number) {
		this.card_Number = card_Number;
	}
}
