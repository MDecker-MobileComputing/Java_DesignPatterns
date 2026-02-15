package de.mide.patterns.factory.pizzas;


public class HawaiianPizzaGermany extends AbstractPizza {

	public HawaiianPizzaGermany() {
		
		super( "Hawaiian Pizza (Germany)", 
			   DIAMETER_CENTIMETRES_GERMANY, 
			   "Pineapple", "Corn", "Ham", "Gouda cheese", "Tomato sauce" );
	}
	
}
