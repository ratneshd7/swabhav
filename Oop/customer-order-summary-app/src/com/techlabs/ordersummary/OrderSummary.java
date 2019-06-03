package com.techlabs.ordersummary;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.techlabs.customerorder.Customer;
import com.techlabs.customerorder.LineItem;
import com.techlabs.customerorder.Order;
import com.techlabs.customerorder.Product;

public class OrderSummary {

	public static void main(String[] args) {
		/*
		 * Order order = null; Order order1 = null; Order order2=null;
		 * 
		 * Product product = new Product(1, "Book", 100d, 0.3f); LineItem item =
		 * new LineItem(1, 2, product); Customer customer = new
		 * Customer("Ratnesh");
		 * 
		 * Product product1 = new Product(2, "pen", 200d, 0.3f); LineItem item1
		 * = new LineItem(2, 3, product1); Customer customer1 = new
		 * Customer("Ravi");
		 * 
		 * Product product2 = new Product(1, "Book", 100d, 0.3f); LineItem item2
		 * = new LineItem(1, 2, product); Customer customer2 = new
		 * Customer("Ratnesh");
		 */

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Customer customer = new Customer("Ratnesh");
		try {
			Date date = formatter.parse("31/03/2015");

			Order order = new Order(date, 1, new LineItem(101, 2, new Product(1, "Book", 100d, 0.3f)));
			//Customer customer = new Customer("Ratnesh");
			customer.addOrder(order);

			Order order1 = new Order(date, 1, new LineItem(102, 4, new Product(2, "hello", 10d, 0.1f)));
			//Customer customer1 = new Customer("Ravi");
			customer.addOrder(order1);

			//customer1.printOrderSummary(customer1);

			Order order3 = new Order(date, 1, new LineItem(101, 2, new Product(1, "Book", 100d, 0.3f)));
			
			customer.addOrder(order3);

			customer.printOrderSummary(customer);

			/*
			 * order = new Order(date, 1); order.addItems(item);
			 * customer.addOrder(order); customer.printOrderSummary(item);
			 * 
			 * order1 = new Order(date, 2); order1.addItems(item1);
			 * customer1.addOrder(order1); customer1.printOrderSummary(item1);
			 * 
			 * order2 = new Order(date, 2); order2.addItems(item2);
			 * customer2.addOrder(order2); customer2.printOrderSummary(item2);
			 */
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	//System.out.println("\n\t\t\t\t\t\tTotal "+customer.checkOutPrice());
	}
}
