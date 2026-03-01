package de.mide.patterns.state.docstates;

import de.mide.patterns.state.Document;


/**
 * One of the terminal states for the document workflow:
 * The document was approved.
 */
public class DocumentStateApproved implements IDocumentState {

	/**
	 * Getter for name of current status.
	 * 
	 * @return "Approved (terminal state)"
	 */
	@Override
	public String getStatusName() { 
		
		return "Approved (terminal state)"; 
	}

	
	/**
	 * Try to change document's state to "Review" (won't work, 
	 * because document is in terminal state).
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
	 * Try to change document's state to "Approved" (won't work,
	 * because document is already in this state).
	 * 
	 * @param document Document whose state is to be changed
	 * 
	 * @return {@code false} because requested state transition 
	 *         is not allowed
	 */
	@Override
	public boolean toApproved( Document document ) {
		
		document.logAlreadyInState();
		
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

		document.logTransitionNotAllowed( "Discarded" );
		
		return false;
	}
}
