package de.mide.patterns.structural.decorator;


/**
 * Abstract class for all coffee specialities; must also be inherited
 * by decorators.
 */
public interface ICoffeeSpeciality {

	
	/**
	 * Getter for price of coffee.
	 * 
	 * @return Price of coffee in cents.
	 */
	public int getPrice();
	
	
	/**
	 * Getter for name of coffee speciality.
	 * 
	 * @return Name of coffee speciality, e.g., cappuccino or espresso;
	 *         might contain toppings (e.g., chocolate sprinkles) 
	 *         or additions (milk, sugar, honey, syrup)
	 */
	public String getName();
}
