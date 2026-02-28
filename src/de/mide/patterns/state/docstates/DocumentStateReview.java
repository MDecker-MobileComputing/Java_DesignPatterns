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
	 * Change to review state.
	 * 
	 * @return {@code true} for successful change 
	 */
	@Override
	public boolean toReview( Document document ) {

		document.logAlreadyInState();
		
		return false;
	}
}
