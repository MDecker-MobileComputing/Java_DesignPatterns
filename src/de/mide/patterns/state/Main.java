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
		
		final Document docHappyPath1 = new Document( "Test: Happy Path" );		
		docHappyPath1.logCurrentState();
		docHappyPath1.toReview();
		docHappyPath1.toApproved();
		
		System.out.println();
				
		final Document docHappyPath2 = new Document( "Test: Accepted after revision" );
		docHappyPath2.logCurrentState();
		docHappyPath2.toReview();
		docHappyPath2.toDraft();  // reviewer requests changes
		docHappyPath2.toReview(); // 2nd review
		docHappyPath2.toApproved();
		
		System.out.println();
		
		final Document docHappyPath3 = new Document( "Test: Directly rejected" );
		docHappyPath3.logCurrentState();
		docHappyPath3.toReview();
		docHappyPath3.toRejected();
		
		System.out.println();
		
		final Document docHappyPath4 = new Document( "Test: Rejected after 2nd review" );
		docHappyPath4.logCurrentState();
		docHappyPath4.toReview();
		docHappyPath4.toDraft();  // reviewer requests changes
		docHappyPath4.toReview(); // 2nd review
		docHappyPath4.toRejected();
		
		System.out.println();
	}
}
