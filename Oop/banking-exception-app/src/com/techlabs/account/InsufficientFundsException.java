package com.techlabs.account;

public class InsufficientFundsException extends RuntimeException {
	Account acc;
	public InsufficientFundsException(Account acc) {
		// TODO Auto-generated constructor stub
		
		super("\n your Account"+acc.getAcc_no()+" has insufficient balance");
		this.acc=acc;
	}
	
	/*@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return ("\n your Account"+acc.getAcc_no()+" has insufficient balance");
	}*/
}
