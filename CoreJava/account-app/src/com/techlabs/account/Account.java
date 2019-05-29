package com.techlabs.account;

public class Account {
	private String accno, name;
	private double amount;

	public Account(String acc_no, String name, double amount) {

		this.accno = acc_no;
		this.name = name;
		this.amount = amount;
	}

	public Account(String acc_no, String name) {

		this(acc_no, name, 500);
	}

	public String getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public void deosite(double amount) {
		this.amount = this.amount + amount;
	}

	public void withdraw(double amount) {
		if ((this.amount - amount) < 500) {
		}
		else{
			this.amount = this.amount - amount;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "\nName="+this.name+"\nAmount="+this.amount+"\nAccont no="+accno+"\nparentToString:"+super.toString();
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Account ac=(Account)obj;
		if((ac.getName().equals(this.name))  && (ac.getAccno().equals(this.accno)))
		return true;
		else
			return false;
	}

	/*public boolean equals(Account obj) {
		// TODO Auto-generated method stub
		if((obj.getName()==this.name)  && (obj.getAccno()==this.accno))
		return true;
		else
			return false;
	}*/
}
