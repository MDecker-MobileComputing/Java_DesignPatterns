package de.mide.patterns.structural.decorator;


/**
 * Abstract super class for all coffee classes and the decorators. 
 */
public abstract class AbstractCoffee {

	
	/**
	 * Getter for price of coffee in local currency.
	 * 
	 * @return Price of coffee in cents
	 */
	public abstract int getPrice();
	
	
	/**
	 * Getter for name of coffee speciality.
	 * 
	 * @return Name of coffee speciality, e.g., cappuccino or espresso;
	 *         might contain additions (milk, sugar, honey, syrup)  
	 *         or toppings (e.g., chocolate sprinkles)
	 */
	public abstract String getName();
	
	
	/**
	 * Build string representation for object.
	 * 
	 * @return String containing name and price of coffee 
	 */
	@Override
	public String toString() {
				
		return String.format( 
				"Price for \"%s\": %.2f", 
				getName(), 
				getPrice() / 100.0
			);
	}
}
