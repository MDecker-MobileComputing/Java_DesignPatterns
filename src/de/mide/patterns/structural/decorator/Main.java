package de.mide.patterns.structural.decorator;

import de.mide.patterns.structural.decorator.coffeedecorators.SugarDecoractor;
import de.mide.patterns.structural.decorator.coffeedecorators.SyrupDecorator;


/**
 * Test driver for example "Coffee Specialities" with decorator pattern.
 */
public class Main {

	
	/** 
	 * Entrance method.
	 * 
	 * @param args Not evaluated
	 */
	public static void main( String[] args ) {
		
		System.out.println();
	
		
		final AbstractCoffee filterCoffee = new FilterCoffee();
		final AbstractCoffee filterCoffeeWithSugar 
							= new SugarDecoractor( filterCoffee );
		
		System.out.println( filterCoffeeWithSugar );
		
		// several decorators can be added to the same coffee
		final AbstractCoffee filterCoffeeWithSugarAndSyrup 
						= new SyrupDecorator( filterCoffeeWithSugar );
		
		System.out.println( filterCoffeeWithSugarAndSyrup );
		
		System.out.println();
	}	
}
