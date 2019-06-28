package com.observer;

public class EmailNotifier implements IBalanceChangeNotifier {

	@Override
	public void update(Account account) {
		
		System.out.println("This is an Email generated Notification");
		System.out.println(account.getInfo());
		
	}

}
