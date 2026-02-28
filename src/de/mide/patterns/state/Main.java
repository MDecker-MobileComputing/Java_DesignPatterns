package de.mide.patterns.state;


/**
 * Testdriver for "document workflow", which is demo application
 * for pattern "state".
 */
public class Main {

	/**
	 * Entrance method.
	 * 
	 * @param args Not evaluated
	 */
	public static void main( String[] args ) {
		
		System.out.println();
		
		final Document doc = new Document( "Annual Report 2026" );
		
		doc.logCurrentState();
		
		doc.toReview();
		doc.toReview();
		
		System.out.println();
	}
}
