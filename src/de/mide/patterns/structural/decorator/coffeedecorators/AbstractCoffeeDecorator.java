package de.mide.patterns.structural.decorator.coffeedecorators;

import de.mide.patterns.structural.decorator.ICoffee;


/**
 * Abstract super class for all coffee decorators.
 */
public abstract class AbstractCoffeeDecorator 
							implements ICoffee {

	/** Coffee speciality to be decorated. */
	protected ICoffee _decoratedCoffee = null;
	
	
	/**
	 * This constructor must be called by all sub-classes.
	 * 
	 * @param coffeeSpeciality Coffee to be decorated
	 */
	public AbstractCoffeeDecorator( ICoffee coffeeSpeciality ) {
		
		_decoratedCoffee = coffeeSpeciality;
	}	
}
