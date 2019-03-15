package com.chap16;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {
static ArrayList<Integer> l=new ArrayList<Integer>();
public static void main(String[] args) {
	l.add(3);
	l.add(2);
	l.add(1);
	System.out.println(l);
	Collections.sort(l);
	System.out.print(l);
}

}
