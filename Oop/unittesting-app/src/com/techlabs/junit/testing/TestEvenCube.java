package com.techlabs.junit.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.unit.Calculator;

public class TestEvenCube {
	Calculator cal=new Calculator();
	long output=0;
	@Test
	public void test_Even_Cube_no() {
		//fail("Not yet implemented");
		try{
			output=cal.cubeEvenNo(4l);
			assertEquals(64, output);
		}
		catch(Exception Message){
			assertEquals("passed No is not even", Message.getMessage());	
		}
	}

}
