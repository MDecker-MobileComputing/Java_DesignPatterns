package de.mide.patterns.behavioral.templatemethod;


/**
 * Custom exception type for grade calculation.
 */
@SuppressWarnings("serial")
public class GradeException extends Exception {

	public GradeException( String errorMessage ) {
		
		super( errorMessage );
	}
}
