package com.techlabs.junit.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.unit.Calculator;

public class TestRoundOff {
	Calculator cal = new Calculator();
	int output = 0;

	@Test
	public void test_RoundingFor_decimal_less_point_5() {

		output = cal.roundOff(3.4f);
		assertEquals(3, output);
	}

	@Test
	public void test_rounding_For_greater_than_point_5() {
		// TODO Auto-generated method stub
		output = cal.roundOff(4.6f);
		assertEquals(5, output);
	}
}
