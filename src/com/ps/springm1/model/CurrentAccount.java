package com.ps.springm1.model;

import com.ps.springm1.Account;

public class CurrentAccount implements Account {

	@Override
	public String createAccount() {
		return "Current account created successfuly";
	}

	@Override
	public String cardDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
