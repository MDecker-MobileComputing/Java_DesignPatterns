package de.mide.patterns.creational.factory;

/**
 * Custom exception class
 */
@SuppressWarnings("serial")
public class PizzaException extends Exception {

	public PizzaException( String message ) {
		
		super( message );
	}
}
