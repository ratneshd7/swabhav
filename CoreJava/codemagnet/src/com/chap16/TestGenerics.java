package com.chap16;

public class TestGenerics {
public static void main(String[] args) {
new TestGenerics().go();
}
public void go() {
Animal1[] animals = {new Dog1(), new Cat1(), new Dog1()};
Dog1[] dogs = {new Dog1(), new Dog1(), new Dog1()};
takeAnimals(animals);
takeAnimals(dogs);
}
public void takeAnimals(Animal1[] animals) {
for(Animal1 a: animals) {
a.eat();
}
}
}
abstract class Animal1 {
void eat() {
System.out.println("animal eating");
}
}
class Dog1 extends Animal1 {
void bark() { }
}
class Cat1 extends Animal1 {
void meow() { }
}
