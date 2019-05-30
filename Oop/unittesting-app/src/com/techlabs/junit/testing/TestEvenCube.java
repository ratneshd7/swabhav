package com.techlabs.junit.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.unit.Calculator;

public class TestEvenCube {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Calculator cal=new Calculator();
		long output=cal.cubeEvenNo(4l);
		assertEquals(64, output);
		
	}

}
