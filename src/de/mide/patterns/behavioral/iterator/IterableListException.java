package de.mide.patterns.behavioral.iterator;


/**
 * Custom exception class.
 */
@SuppressWarnings("serial")
public class IterableListException extends Exception {

	public IterableListException( String errorMessage ) {
		
		super( errorMessage );
	}
}
