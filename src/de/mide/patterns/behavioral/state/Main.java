package de.mide.patterns.behavioral.state;


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
		
		final Document docHappyPath5 = new Document( "Test: Discarded after review" );
		docHappyPath5.logCurrentState();
		docHappyPath5.toReview();
		docHappyPath5.toDraft(); // reviewer requests changes
		docHappyPath5.toDiscarded();
				
		System.out.println();
		
		final Document docHappyPath6 = new Document( "Test: Try illegal transitions on way to approval" );
		docHappyPath6.logCurrentState();
		docHappyPath6.toDraft();     // illegal: already in this state
		docHappyPath6.toApproved();  // illegal: unreachable state
		docHappyPath6.toRejected();  // illegal: unreachable state
		docHappyPath6.toReview();    // legal
		docHappyPath6.toReview();    // illegal: already in this state
		docHappyPath6.toDiscarded(); // illegal: unreachable state
		docHappyPath6.toApproved();  // legal
		docHappyPath6.toReview();    // illegal: unreachable state
		docHappyPath6.toRejected();  // illegal: unreachable state
		docHappyPath6.toDraft();     // illegal: unreachable state
		docHappyPath6.toDiscarded(); // illegal: unreachable state
				
		System.out.println();
	}
}
