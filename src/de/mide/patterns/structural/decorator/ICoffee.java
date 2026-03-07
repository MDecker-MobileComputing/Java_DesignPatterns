package de.mide.patterns.structural.decorator;


/**
 * Interface to be implemented by all classes representing coffee
 * specialities; must also be inherited by decorators. 
 */
public interface ICoffee {

	
	/**
	 * Getter for price of coffee in local currency.
	 * 
	 * @return Price of coffee in cents
	 */
	public int getPrice();
	
	
	/**
	 * Getter for name of coffee speciality.
	 * 
	 * @return Name of coffee speciality, e.g., cappuccino or espresso;
	 *         might contain additions (milk, sugar, honey, syrup)  
	 *         or toppings (e.g., chocolate sprinkles)
	 */
	public String getName();
}
