package de.mide.patterns.creational.factory.pizzas;


public class PepperoniPizzaGermany extends AbstractPizza {

	public PepperoniPizzaGermany() {
		
		super( "Pepperoni Pizza (Germany)", 
			   DIAMETER_CENTIMETRES_GERMANY, 
			   "Tomato sauce", "Cheese", "Chili", "Gouda cheese", "Emmentaler cheese", "Salami sausage" );
	}
}
