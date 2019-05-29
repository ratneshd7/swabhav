package com.techlabs.crud;

public class DBTestOperatin {
	public static void main(String[] args) {
		doDBOperation(new InvoiceDB());
		doDBOperation(new CustomerDB());
		doDBOperation(new DepartmentDB());
	}

	private static void doDBOperation(ICrudable x) {
		// TODO Auto-generated method stub
		System.out.println("\nDB Operation:");
		x.create();
		x.read();
		x.update();
		x.delete();
	}
}
