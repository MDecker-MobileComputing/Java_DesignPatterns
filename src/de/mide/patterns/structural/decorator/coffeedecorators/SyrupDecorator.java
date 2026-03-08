package de.mide.patterns.structural.decorator.coffeedecorators;

import de.mide.patterns.structural.decorator.AbstractCoffee;


/**
 * Decorator to add syrup to the coffee.
 */
public class SyrupDecorator extends AbstractCoffeeDecorator {

	/**
	 * Constructor.
	 * 
	 * @param coffee Coffee to be decorated with syrup
	 */
	public SyrupDecorator( AbstractCoffee coffeeSpeciality ) {
		
		super( coffeeSpeciality );		
	}

	/**
	 * 
	 * Price including 50 Cents for the syrup.
	 * 
	 * @return price in cents
	 */
	@Override
	public int getPrice() {

		return _decoratedCoffee.getPrice() + 50;
	}

	
	/**
	 * Name of coffee speciality including "syrup" .
	 * 
	 * @return Name of coffee speciality including additions
	 *         and toppings 
	 */
	@Override
	public String getName() {
		
		return _decoratedCoffee.getName() + " + syrup";
	}
}
