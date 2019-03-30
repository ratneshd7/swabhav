package com.techlabs.person.test;

import java.security.Permissions;
import com.techlabs.person.Person;

public class CheckBMI {
	public static void main(String[] args) {

		Person person = new Person("ratnesh", "male", 21, 2f, 60f);
		person.doWorkOut();
		person.eat();
		printPersonDetail(person);
	}

	private static void printPersonDetail(Person person) {
		// TODO Auto-generated method stub
		System.out.println("Name=" + person.getName() + "\nAge=" + person.getAge() + "\nGender=" + person.getGender()
				+ "\nBMIscore=" + person.calBMIScore() + "\nBMIResult=" + person.calBMI() + "\nHeight="
				+ person.getHeight() + "\nWeight=" + person.getWeight() + "\n");
	}
}