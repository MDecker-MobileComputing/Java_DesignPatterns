package de.mide.patterns.structural.decorator.coffeedecorators;

import de.mide.patterns.structural.decorator.AbstractCoffee;


/**
 * Decorator to add chocolate sprinkles (German: Schokoladenstreusel) 
 * to the coffee.
 */
public class ChocolateSprinklesDecorator extends AbstractCoffeeDecorator {

	
	/**
	 * Constructor.
	 * 
	 * @param coffee Coffee to be decorated
	 */
	public ChocolateSprinklesDecorator( AbstractCoffee coffee ) {
		
		super( coffee );
	}
	
	
	/**
	 * Price including 40 Cents for the chocolate sprinkles.
	 * 
	 * @return price in cents
	 */
	@Override
	public int getPrice() {

		return _decoratedCoffee.getPrice() + 40;
	}

	
	/**
	 * Name of coffee speciality including "chocolade sprinkles" .
	 * 
	 * @return Name of coffee speciality including additions
	 *         and toppings 
	 */
	@Override
	public String getName() {

		return _decoratedCoffee.getName() + " / chocolate sprinkles";
	}
}
