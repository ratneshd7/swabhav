package com.techlabs.junit.testing;

import static org.junit.Assert.*;
import org.junit.Test;

import com.techlabs.unit.Calculator;

public class CalculatorTesting {
	// Arrange
	Calculator calci = new Calculator();
	int expected = 0;
	String message = "No Should be even negetive ";

	@Test
	public void test_cudeOFEven_Negative_no() {
		// TODO Auto-generated method stub
		// Act
		try {
			int actual = calci.test_Negative_Cube_of_EvenNo(-3);
			//assert
			assertEquals(-8, actual);
		} catch (Exception e) {
			assertEquals("No Should be even negetive", e.getMessage());
		}

	}
	
	@Test
	private void testRoundoff_ForNonDecimal_Input() {
		// TODO Auto-generated method stub
		//Arrange
		try{
		int actual = calci.decimalRoundOff(10);
		assertEquals(10, actual);
		}
		catch(Exception e){
			assertEquals("",e.getMessage() );
		}
	}

}
