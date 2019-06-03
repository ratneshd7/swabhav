package com.techlabs.unit;

public class Calculator {

	public long cubeEvenNo(long no)throws Exception {
		// TODO Auto-generated method stub
		if (no % 2 == 0) {
			return no * no * no;
		} else
		throw new Exception("passed No is not even");
	}

	public long cubeOddNo(long no) {
		// TODO Auto-generated method stub
		if (no % 2 != 0) {
			return no * no * no;
		} else
			return 0;
	}

	public int roundOff(float no) {
		// TODO Auto-generated method stub
		if ((no - (int) no) >= 0.5) {
			no = no + 1;
			return (int) no;
		} else 
			return (int) no;
	}

	public int test_Negative_Cube_of_EvenNo(int n) {
		// TODO Auto-generated method stub
		if(n%2 !=0){
			throw new RuntimeException("No Should be even negative");
		}
		else 
		return n*n*n;
	}

	public int decimalRoundOff(float i) {
		// TODO Auto-generated method stub
		return (int)i;
	}

}
