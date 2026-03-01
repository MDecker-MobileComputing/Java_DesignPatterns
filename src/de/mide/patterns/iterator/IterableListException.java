package de.mide.patterns.iterator;


/**
 * Custom exception class.
 */
@SuppressWarnings("serial")
public class IterableListException extends Exception {

	public IterableListException( String errorMessage ) {
		
		super( errorMessage );
	}
}
