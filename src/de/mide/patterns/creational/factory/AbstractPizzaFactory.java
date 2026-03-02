package de.mide.patterns.creational.factory;

import de.mide.patterns.creational.factory.pizzas.AbstractPizza;


/**
 * Instead of "Pizza Factory" we could also use the word "Pizzeria".
 */
public abstract class AbstractPizzaFactory {

	public AbstractPizza orderPizza( String pizzaType ) throws PizzaException {
		
		AbstractPizza pizza = createPizza( pizzaType );
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		
		return pizza;
	}
	
	
    protected abstract AbstractPizza createPizza( String pizzaType ) throws PizzaException;

}