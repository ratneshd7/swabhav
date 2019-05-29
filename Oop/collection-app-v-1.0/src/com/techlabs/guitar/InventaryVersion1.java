package com.techlabs.guitar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InventaryVersion1 {
	private List guitars;

	public InventaryVersion1() {
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
			// Builder builder = searchGuitar.getBuilder();
			if (searchGuitar.getBuilder() != guitar.getBuilder())
				continue;
			String model = searchGuitar.getModel();
			if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel())))
				continue;
			if (searchGuitar.getType() != guitar.getType())
				continue;
			if (searchGuitar.getBackWood() != guitar.getBackWood())
				continue;
			if (searchGuitar.getTopWood() != guitar.getTopWood())
				continue;
			matchguitar.add(guitar);
		}
		return matchguitar;

	}
}
