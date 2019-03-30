package com.reflection.test;

import com.reflection.ReflectionDetails;
import com.techlabs.rectangle.Rectangle;

public class ReflectionDetailsTest {
public static void main(String[] args) {
	ReflectionDetails detail=new ReflectionDetails();
	Rectangle r=new Rectangle();
	detail.printDetails(r.getClass());
	detail.printConstructor(r.getClass());
	detail.printMethod(r.getClass());
	detail.printField(r.getClass());
}
}
