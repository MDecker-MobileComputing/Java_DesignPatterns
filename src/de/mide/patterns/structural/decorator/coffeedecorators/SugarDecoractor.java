package de.mide.patterns.structural.decorator.coffeedecorators;

import de.mide.patterns.structural.decorator.ICoffee;

/**
 * Decorator to add sugar to coffee.
 */
public class SugarDecoractor extends AbstractCoffeeDecorator {

	
	/**
	 * Constructor.
	 * 
	 * @param coffee Coffee to be decorated
	 */
	public SugarDecoractor( ICoffee coffee ) {
		
		super( coffee );
	}
	
	
	/**
	 * Price including 10 Cents for sugar.
	 * 
	 * @return price in cents
	 */
	@Override
	public int getPrice() {
		
		return _decoratedCoffee.getPrice() + 10;
	}

	
	/**
	 * Name of coffee speciality including "sugar".
	 * 
	 * @return Name of coffee speciality including additions
	 *         and toppings
	 */
	@Override
	public String getName() {
		
		return _decoratedCoffee.getName() + " / sugar";
	}

}
