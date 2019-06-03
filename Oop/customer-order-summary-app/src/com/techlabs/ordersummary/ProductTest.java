package com.techlabs.ordersummary;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.customerorder.Product;

public class ProductTest {

	Product prod=new Product(1, "Book", 100d, 0.3f);
	@Test
	public void test_for_Product_id() {
		assertEquals(1, prod.getId());
	}
	
	@Test
	public void test_for_product_name(){
		assertEquals("Book",prod.getName());
	}

	
	
	
}
