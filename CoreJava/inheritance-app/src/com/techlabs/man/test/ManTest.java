package com.techlabs.man.test;

import com.techlabs.man.Boy;
import com.techlabs.man.Child;
import com.techlabs.man.Kid;
import com.techlabs.man.Man;

public class ManTest {
public static void main(String[] args) {
	case1();
	case2();
	case3();
	case4();
	case5();
	
}

private static void case5() {
	// TODO Auto-generated method stub
	Object x;
	x=10;
	x="hello";
	x=new Man();
	
}

private static void case4() {
	// TODO Auto-generated method stub
	atThePark(new Man());
	atThePark(new Boy());
	atThePark(new Kid());
	atThePark(new Child());
}

private static void atThePark(Man x) {
	// TODO Auto-generated method stub
	System.out.println("At The Park");
	x.play();
}

private static void case3() {
	// TODO Auto-generated method stub
	Man x;
	x=new Boy();
	
	 x.read();
	 x.walk();
	 x.play();
}

private static void case1() {
	// TODO Auto-generated method stub
	Man x;//x expexts man object
	x=new Man();
	
	x.play();
	x.read();
	x.walk();
}

private static void case2() {
	// TODO Auto-generated method stub
	Boy y;// y expects boy 
	y=new Boy();
	
	y.read();
	y.walk();
	y.eat();
	y.run();
	y.play();
}

}
