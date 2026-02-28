package de.mide.patterns.state.docstates;

import de.mide.patterns.state.Document;

/**
 * Initial state for the document workflow. A reviewer can
 * request changes, which reverts the document into this
 * state.
 */
public class DocumentStateDraft implements IDocumentState {

	/**
	 * Getter for name of current status.
	 * 
	 * @return "Draft"
	 */
	@Override
	public String getStatusName() { return "Draft"; }

	
	/**
	 * Change to state "Review".
	 * 
	 * @return {@code true} for successful change 
	 */
	@Override
	public boolean toReview( Document document ) {

		document.setState( new DocumentStateReview() );

		System.out.println( document.toString() );
		
		return true;
	}
	
	
	/**
	 * Change to state "Draft".
	 * 
	 * @return {@code false} because document is
	 *         already in state "draft
	 */
	@Override
	public boolean toDraft( Document document ) {

		document.logAlreadyInState();
		
		return false;
	}
}
