package com.techlabs.junit.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.unit.Calculator;

public class TestOddCube {

	
	public void test() {
		Calculator cal=new Calculator();
		long output=cal.cubeOddNo(4l);
		assertEquals(64, output);	
		}
}
