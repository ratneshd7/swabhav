package com.chap16;

public class TestGenerics1 {
public static void main(String[] args) {
	new TestGenerics1().go();
}

public  void go() {
	// TODO Auto-generated method stub
	Animal[] animals = {new Dog(), new Cat(), new Dog()};
	Dog[] dogs = {new Dog(), new Dog(), new Dog()};
	takeAnimals(animals);
	takeAnimals(dogs);
	
}

public void takeAnimals(Animal[] animals) {
for(Animal a: animals) {
a.eat();
}
}
}
