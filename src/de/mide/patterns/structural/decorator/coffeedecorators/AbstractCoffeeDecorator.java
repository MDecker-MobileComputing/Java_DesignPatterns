package de.mide.patterns.structural.decorator.coffeedecorators;

import de.mide.patterns.structural.decorator.AbstractCoffee;


/**
 * Abstract super class for all coffee decorators.
 */
public abstract class AbstractCoffeeDecorator extends AbstractCoffee { 
							

	/** Coffee speciality to be decorated. */
	protected AbstractCoffee _decoratedCoffee = null;
	
	
	/**
	 * This constructor must be called by all sub-classes.
	 * 
	 * @param coffeeSpeciality Coffee to be decorated
	 */
	public AbstractCoffeeDecorator( AbstractCoffee coffeeSpeciality ) {
		
		_decoratedCoffee = coffeeSpeciality;
	}	
}
