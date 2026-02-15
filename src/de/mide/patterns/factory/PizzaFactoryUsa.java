package de.mide.patterns.factory;

import de.mide.patterns.factory.pizzas.AbstractPizza;
import de.mide.patterns.factory.pizzas.HawaiianPizzaUsa;
import de.mide.patterns.factory.pizzas.PepperoniPizzaUsa;


/**
 * This class could also be named "Pizzeria USA".
 */
public class PizzaFactoryUsa extends AbstractPizzaFactory {

	@Override
	protected AbstractPizza createPizza( String pizzaType ) throws PizzaException {
		
		pizzaType = pizzaType.toLowerCase();
		
		switch ( pizzaType ) {
		
			case "hawaii":
				return new HawaiianPizzaUsa();
			
			case "pepperoni":
				return new PepperoniPizzaUsa();
			
			default:
				throw new PizzaException( 
						"Pizza type \"" + pizzaType + "\" not supported for USA." );
		}
	}
}
