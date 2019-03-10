package com.chap7;

class A1 {
int ivar = 7;
void m1() {
System.out.print("A’s m1, ");
}
void m2() {
System.out.print("A’s m2, ");
}
void m3() {
System.out.print("A’s m3, ");
}
}
class B1 extends A1 {
void m1() {
System.out.print("B’s m1, ");
}
}
class C1 extends B1 {
void m3() {
System.out.print("C’s m3, "+(ivar + 6));
}
}
public class Mixedmsg2 {
public static void main(String [] args) {
A1 a = new A1();
B1 b = new B1();
C1 c = new C1();
A1 a2 = new C1();
c.m1(); 
c.m2();
c.m3();
}
}