package com.ps.springm1.model;

import com.ps.springm1.Account;

public class SavingAccount implements Account {
	
	@Override
	public String createAccount() {
		return "Saving account created successfuly";
	}
}
