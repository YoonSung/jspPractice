package com.headfirst.model;
import java.util.*;

public class BeerExpert {
	public ArrayList getBrands(String color) {
		ArrayList brands = new ArrayList();

		if ( color.equals("amber")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		}else {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
		}
		return brands;
	}
}
