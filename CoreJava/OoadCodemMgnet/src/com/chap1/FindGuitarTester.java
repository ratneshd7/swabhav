package com.chap1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventary inventary = new Inventary();
		initializeInventary(inventary);

		Guitar whatEnriksLike = new Guitar("", Builder.FENDER, "stratocaster", Type.ELECTRIC, Wood.MAPPLE, Wood.MAPPLE,
				0);
		List matchguitar = (List) inventary.search(whatEnriksLike);
		if (!matchguitar.isEmpty()) {
			System.out.println("enrikes you might have this guitar");
			for (Iterator i = matchguitar.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();

				System.out.println("Enriks,you might like this " + guitar.getBuilder() + " " + guitar.getModel() + " "
						+ guitar.getType() + "guitar:\n " + guitar.getBackWood() + "back and sides,\n "
						+ guitar.getTopWood() + "top.\nYou can have it for only $ " + guitar.getPrice() + "! ");
			}
		} else
			System.out.println("Sorry, Enrikes, we have nothing for you");
	}

	private static void initializeInventary(Inventary inventary) {
		// TODO Auto-generated method stub
		inventary.addGuitar("v675", Builder.FENDER, "stratocaster", Type.ELECTRIC, Wood.MAPPLE, Wood.MAPPLE, 900);
	}
}

