package com.chap7;

class A3 {
int ivar = 7;
void m1() {
System.out.print("A3’s m1, ");
}
void m2() {
System.out.print("A3’s m2, ");
}
void m3() {
System.out.print("A3’s m3, ");
}
}
class B3 extends A3 {
void m1() {
System.out.print("B3’s m1, ");
}
}
class C3 extends B3 {
void m3() {
System.out.print("C’s m3, "+(ivar + 6));
}
}
public class MixedMsg3 {
public static void main(String [] args) {
A3 a3 = new A3();
B3 b3 = new B3();
C3 c3 = new C3();
A3 a32 = new C3();
a3.m1();
b3.m2();
c3.m3();
a32.m1();
a32.m2();
a32.m3();
}
}