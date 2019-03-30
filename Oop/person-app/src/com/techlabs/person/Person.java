package com.techlabs.person;

public class Person {
	final String name, gender;
	final int age;
	private float height, weight,index;

	public Person(String name, String gender, int age,float height,float weight) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height=height;
		this.weight=weight;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public float getHeight() {
		return height;
	}
	public float getIndex() {
		return index;
	}

	public float getWeight() {
		return weight;
	}

	public BMICategori calBMI() {
		// TODO Auto-generated method stub
		index=calBMIScore();
		if(index<=29&&index>=25)
			return BMICategori.OVERWEIGHTED;
		else if(index<=24.9&&index>=18.5)
			return BMICategori.NORMAL;
	
		else if(index<18.5)
			return BMICategori.UNDERWEIGHTED;
		else
		return BMICategori.OBESE;
	}

	public void doWorkOut() {
		// TODO Auto-generated method stub
		this.weight = this.weight - this.weight * 0.1f;
	}

	public void eat() {
		// TODO Auto-generated method stub
		this.height = this.height + this.height * 0.02f;
		this.weight = this.weight - this.weight * 0.5f;

	}

	public float calBMIScore() {
		// TODO Auto-generated method stub
		return (weight/(height*height));
		
	}

	

}
