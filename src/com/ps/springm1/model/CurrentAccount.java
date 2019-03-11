package com.ps.springm1.model;

import com.ps.springm1.Account;
import com.ps.springm1.Card;

public class CurrentAccount implements Account {

	private Card creditCard;
	
	@Override
	public String createAccount() {
		return "Current account created successfuly";
	}

	@Override
	public String cardDetails() {

		return this.creditCard.cardDetails();
	}

	public void setCreditCard(Card creditCard) {
		this.creditCard = creditCard;
	}

}
