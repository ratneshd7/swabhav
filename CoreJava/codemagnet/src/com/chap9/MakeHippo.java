package com.chap9;
abstract class Animal1 {
private String name;
 public String getName() {
return name;
}
public Animal1(String theName) {
name = theName;
}
}
class Hippo1 extends Animal1 {
public Hippo1(String name) {
super(name);
}
}
public class MakeHippo {
public static void main(String[] args) {
Hippo1 h = new Hippo1("Buffy");
System.out.println(h.getName());
}
}