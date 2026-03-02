package de.mide.patterns.behavioral.state.docstates;

import de.mide.patterns.behavioral.state.Document;


/**
 * One of the terminal states for the document workflow:
 * The author has discarded the document.
 */
public class DocumentStateDiscarded implements IDocumentState {

	/**
	 * Getter for name of current status.
	 * 
	 * @return "Discarded (terminal state)"
	 */
	@Override
	public String getStatusName() { 
		
		return "Discarded (terminal state)"; 
	}

	
	/**
	 * Try to change document's state to "Review" (won't work). 
	 * 
	 * @param document Document whose state is to be changed
	 * 
	 * @return {@code false} because requested state transition 
	 *         is not allowed
	 */     
	@Override
	public boolean toReview( Document document ) {

		document.logTransitionNotAllowed( "Review" );
		
		return false;
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

		document.logTransitionNotAllowed( "Draft" );
		
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
	 * Try to change document's state to "Discarded" (won't work). 
	 * 
	 * @param document Document whose state is to be changed
	 * 
	 * @return {@code false} because requested state transition 
	 *         is not allowed
	 */
	@Override
	public boolean toDiscarded( Document document ) {

		document.logAlreadyInState();
		
		return false;
	}
}
