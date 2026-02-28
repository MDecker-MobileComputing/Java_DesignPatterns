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
	public String getStatusName() { 
		
		return "Review"; 
	}
	
	
	/**
	 * Try to change state to "Review", but document
	 * is already in state "Review."
	 * 
	 * @return {@code false} because transition not  
	 *         possible 
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

		document.logTransition();
		
		return true;
	}


	/**
	 * Change document's state to "Approved".
	 * 
	 * @param document Document whose state is to be changed                 
	 * 
	 * @return {@code true} for successful change 
	 */     
	@Override
	public boolean toApproved( Document document ) {
		
		document.setState( new DocumentStateApproved() );

		document.logTransition();
		
		return true;
	}

	
	/**
	 * Change document's state to "Rejected".
	 * 
	 * @param document Document whose state is to be changed                 
	 * 
	 * @return {@code true} for successful change 
	 */     
	@Override
	public boolean toRejected( Document document ) {

		document.setState( new DocumentStateRejected() );

		document.logTransition();
		
		return true;
	}
}
