package de.mide.patterns.state.docstates;

import de.mide.patterns.state.Document;

/**
 * State for document that is under review.
 */
public class DocumentStateReview implements IDocumentState {

	/**
	 * Getter for name of status.
	 * 
	 * @return "Review"
	 */
	public String getStatusName() { return "Review"; }
	
	
	/**
	 * Change to state "Review".
	 * 
	 * @return {@code true} for successful change 
	 */
	@Override
	public boolean toReview( Document document ) {

		document.logAlreadyInState();
		
		return false;
	}


	/**
	 * Change to state "Draft" (reviewer requests changes).
	 * 
	 * @return {@code true} for successful change
	 */
	@Override
	public boolean toDraft( Document document ) {

		document.setState( new DocumentStateDraft() );

		System.out.println( document.toString() );
		
		return true;
	}
}
