package de.mide.patterns.structural.decorator;

import de.mide.patterns.structural.decorator.coffeedecorators.SugarDecoractor;


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
	
		
		AbstractCoffee filterCoffee = new FilterCoffee();
		AbstractCoffee filterCoffeeWithSugar = new SugarDecoractor( filterCoffee );
		
		System.out.println( filterCoffeeWithSugar );
		
		System.out.println();
	}
	
}
