package de.mide.patterns.command.composite;


@SuppressWarnings("serial")
public class CompositeException extends Exception {

	public CompositeException( String errorMessage ) {
		
		super( errorMessage );
	}
}
