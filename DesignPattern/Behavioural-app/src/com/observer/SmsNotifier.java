package com.observer;

public class SmsNotifier implements IBalanceChangeNotifier {

	@Override
	public void update(Account account) {
		
		System.out.println("This is SMS generated Notification");
		System.out.println(account.getInfo());
	}

}
