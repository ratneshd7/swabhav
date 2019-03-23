package com.chap1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Inventary {
	private List guitars;

	public Inventary() {
		guitars = new LinkedList();
	}

	public void addGuitar(String serialNo, Builder builder, String model, Type type, Wood backWood, Wood topWood,
			double price) {
		Guitar guitar = new Guitar(serialNo, builder, model, type, backWood, topWood, price);
		guitars.add(guitar);

	}

	public Guitar getGuitar(String serialNo) {
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNo().equals(serialNo))
				return guitar;
		}
		return null;
	}

	public List search(Guitar searchGuitar) {
		List matchguitar = new LinkedList();
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			Builder builder = searchGuitar.getBuilder();
			if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder())))
				continue;
			String model = searchGuitar.getModel().toLowerCase();
			if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase())))
				continue;
			Type type = searchGuitar.getType();
			if ((type != null) && (!type.equals("")) && (!type.equals(guitar.getType())))
				continue;
			Wood backWood = searchGuitar.getBackWood();
			if ((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood())))
				continue;
			Wood topWood = searchGuitar.getTopWood();
			if ((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood())))
				continue;
			matchguitar.add(guitar);
		}
		return matchguitar;

	}
}
