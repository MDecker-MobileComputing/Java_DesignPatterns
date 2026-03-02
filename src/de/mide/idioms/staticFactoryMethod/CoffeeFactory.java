package de.mide.idioms.staticFactoryMethod;


@SuppressWarnings("serial")
class CoffeeException extends Exception {
	
	public CoffeeException( String msg ) {
		
		super( msg );
	}
}

/** Interface all types of coffee must implement */
interface ICoffee {}


/** Equal parts espresso, steamed milk, thick foam */ 
class Cappuccino implements ICoffee {}

/** 
 * Concentrated coffee beverage brewed by forcing hot water under 
 * high pressure through finely ground coffee beans.
 */
class Espresso implements ICoffee {}

/** Ordinary coffee */
class FilterCoffee implements ICoffee {}

/**  Espresso "marked" with a dollop of foam. */
class Macchiato implements ICoffee {}



public class CoffeeFactory {
	
	public static ICoffee getCoffee( String coffeeType ) throws CoffeeException {
		
		coffeeType = coffeeType.toLowerCase();
		
		switch ( coffeeType ) {
		
			case "cappuccino":
				return new Cappuccino();
		
			case "espresso":
				return new Espresso();							
				
			case "filter":
				return new FilterCoffee();
								
			case "macchiato":
				return new Macchiato();
		
			default:
				throw new CoffeeException( 
						"Coffee type \"" + coffeeType + "\" not supported." );
		}
	}	
}
