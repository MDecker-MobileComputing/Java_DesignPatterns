package de.mide.patterns.factory;

import de.mide.patterns.factory.pizzas.AbstractPizza;
import de.mide.patterns.factory.pizzas.HawaiianPizzaGermany;
import de.mide.patterns.factory.pizzas.PepperoniPizzaGermany;


/**
 * This class could also be named "Germany Pizzeria".
 */
public class PizzaFactoryGermany extends AbstractPizzaFactory {
	
	@Override
	protected AbstractPizza createPizza( String pizzaType ) throws PizzaException {
		
		pizzaType = pizzaType.toLowerCase();
		
		switch ( pizzaType ) {
		
			case "hawaii":
				return new HawaiianPizzaGermany();
			
			case "pepperoni":
				return new PepperoniPizzaGermany();
			
			default:
				throw new PizzaException( 
						"Pizza type \"" + pizzaType + "\" not supported for Germany." );
		}
	}
}
