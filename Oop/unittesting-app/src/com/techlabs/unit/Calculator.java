package com.techlabs.unit;

public class Calculator {

	public long cubeEvenNo(long no) {
		// TODO Auto-generated method stub
		if (no % 2 == 0) {
			return no * no * no;
		} else
			return 0;
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

}
