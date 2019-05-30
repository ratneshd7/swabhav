package com.teclabs.guitar.test;

import java.util.Iterator;
import java.util.List;

import com.techlabs.guitar.Builder;
import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.Inventary;
import com.techlabs.guitar.InventaryVersion1;
import com.techlabs.guitar.Type;
import com.techlabs.guitar.Wood;

public class FindGuitarTester1 {
	public static void main(String[] args) {
		InventaryVersion1 inventary = new InventaryVersion1();
		initializeInventaryV1(inventary);

		Guitar whatEnriksLike = new Guitar("", Builder.FENDER, "stratocaster", Type.ELECTRIC, Wood.MAPPLE, Wood.MAPPLE,
				0);
		List matchguitar =inventary.search(whatEnriksLike);
		if (!matchguitar.isEmpty()) {
			System.out.println("enrikes you might have this guitar");
			for (Iterator i = matchguitar.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();

				System.out.println("Enriks,you might like this " + guitar.getBuilder() + " " + guitar.getModel() + " "
						+ guitar.getType() + "guitar:\n " + guitar.getBackWood() + "back and sides,\n "
						+ guitar.getTopWood() + "top.\nYou can have it for only $ " + guitar.getPrice() + "! ");
			}
		}else
			System.out.println("Sorry, Enrikes, we have nothing for you");
}

	private static void initializeInventaryV1(InventaryVersion1 inventary) {
		// TODO Auto-generated method stub
		inventary.addGuitar("v675", Builder.FENDER, "stratocaster", Type.ELECTRIC, Wood.MAPPLE, Wood.MAPPLE, 900);

	}
}
