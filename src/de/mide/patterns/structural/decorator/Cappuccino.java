package de.mide.patterns.structural.decorator;


/**
 * Cappuccino (espresso with steamed milk and foam).
 */
public class Cappuccino implements ICoffeeSpeciality {

    /**
     * Getter for price.
     * 
     * @return 350 (3.50)
     */
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 450;
	}

	
    /**
     * Getter for name.
     * 
     * @return "Cappuccino"
     */
	@Override
	public String getName() {

		return "Cappuccino";
	}
}
