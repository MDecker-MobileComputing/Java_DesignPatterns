package de.mide.patterns.factory.pizzas;

public class PepperoniPizzaUsa extends AbstractPizza {

    public PepperoniPizzaUsa() {
    	
        super( "Pepperoni Pizza (USA)", 
        		DIAMETER_CENTIMETRES_USA,
               "Tomato sauce", "Mozzarella cheese", "Pepperoni sausage" );
    }
}
