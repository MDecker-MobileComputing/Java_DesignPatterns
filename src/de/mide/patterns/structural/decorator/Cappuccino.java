package de.mide.patterns.structural.decorator;


/**
 * Cappuccino (espresso with steamed milk and foam).
 */
public class Cappuccino extends AbstractCoffee {

	
    /**
     * Getter for price of coffee in local currency.
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
