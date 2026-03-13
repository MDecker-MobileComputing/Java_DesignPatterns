package de.mide.patterns.creational.factory.pizzas;


public class HawaiianPizzaUsa extends AbstractPizza {

	public HawaiianPizzaUsa() {
		
		super( "Hawaiian Pizza (USA)", 
			   DIAMETER_CENTIMETRES_USA, 
			   "Pineapple", "Canadian Ham", "Mozzarella cheese", "Tomato sauce" );
	}
}
