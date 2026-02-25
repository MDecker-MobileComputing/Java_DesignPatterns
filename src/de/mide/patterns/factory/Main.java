package de.mide.patterns.factory;

import de.mide.patterns.factory.pizzas.AbstractPizza;


/**
 * Test driver for example for factory pattern (pizza example).
 */
public class Main {

	/**
	 * Entrace method.
	 * 
	 * @param args Not evaluated.
	 * 
	 * @throws PizzaException Unsupported pizza type
	 */
	public static void main( String[] args ) throws PizzaException {
		
		System.out.println();
		
		AbstractPizzaFactory pizzeriaGermany = new PizzaFactoryGermany();
		AbstractPizza pizzaGermany = pizzeriaGermany.orderPizza( "hawaii" );
		System.out.println( "Pizza was served: " + pizzaGermany );
		
		System.out.println();
		
		AbstractPizzaFactory pizzeriaUsAbstractPizzaFactory = new PizzaFactoryUsa();
		AbstractPizza pizzaUsa = pizzeriaUsAbstractPizzaFactory.orderPizza( "pepperoni" );
		System.out.println( "Pizza was served: " + pizzaUsa );
		
		System.out.println();
	}
}
