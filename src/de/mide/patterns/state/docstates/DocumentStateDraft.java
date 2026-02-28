package de.mide.patterns.state.docstates;

import de.mide.patterns.state.Document;


/**
 * Initial state for the document workflow. This is the only
 * state, in which the document can be edited by the author.
 */
public class DocumentStateDraft implements IDocumentState {

	/**
	 * Getter for name of current status.
	 * 
	 * @return "Draft"
	 */
	@Override
	public String getStatusName() { 
		
		return "Draft"; 
	}

	
	/**
	 * Change document's state to "Review".
	 * 
	 * @param document Document whose state is to be changed                 
	 * 
	 * @return {@code true} for successful change 
	 */
	@Override
	public boolean toReview( Document document ) {

		document.setState( new DocumentStateReview() );

		document.logTransition();
		
		return true;
	}
	
	
	/**
	 * Try to change document's state to "Draft" (won't work). 
	 * 
	 * @param document Document whose state is to be changed
	 * 
	 * @return {@code false} because requested state transition 
	 *         is not allowed
	 */
	@Override
	public boolean toDraft( Document document ) {

		document.logAlreadyInState();
		
		return false;
	}


	/**
	 * Try to change document's state to "Approved" (won't work). 
	 * 
	 * @param document Document whose state is to be changed
	 * 
	 * @return {@code false} because requested state transition 
	 *         is not allowed
	 */
	@Override
	public boolean toApproved( Document document ) {

		document.logTransitionNotAllowed( "Approved" );
		
		return false;
	}

	
	/**
	 * Try to change document's state to "Rejected" (won't work). 
	 * 
	 * @param document Document whose state is to be changed
	 * 
	 * @return {@code false} because requested state transition
	 *         is not allowed
	 */
	@Override
	public boolean toRejected( Document document ) {

		document.logTransitionNotAllowed( "Rejected" );
		
		return false;
	}


	/**
	 * Change document's state to "Discarded".
	 * 
	 * @param document Document whose state is to be changed                 
	 * 
	 * @return {@code true} for successful change 
	 */
	@Override
	public boolean toDiscarded( Document document ) {

		document.setState( new DocumentStateDiscarded() );

		document.logTransition();
		
		return true;
	}
}
