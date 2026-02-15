package de.mide.patterns.factory;

/**
 * Custom exception class
 */
@SuppressWarnings("serial")
public class PizzaException extends Exception {

	public PizzaException( String message ) {
		
		super( message );
	}
}
