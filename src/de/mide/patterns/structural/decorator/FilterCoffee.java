package de.mide.patterns.structural.decorator;


/**
 * Filter coffee (drip coffee).
 */
public class FilterCoffee implements ICoffeeSpeciality {

	/**
	 * Getter for price.
	 * 
	 * @return 250 (2.50)
	 */
	@Override
	public int getPrice() {

		return 250;
	}

	
	/**
	 * Getter for name.
	 * 
	 * return "Filter Coffee"
	 */
	@Override
	public String getName() {
		
		return "Filter Coffee";
	}
}
