package de.mide.patterns.state.docstates;

import de.mide.patterns.state.Document;

/**
 * One of the terminal states for the document workflow:
 * The document was approved.
 */
public class DocumentStateRejected implements IDocumentState {

	/**
	 * Getter for name of current status.
	 * 
	 * @return "Rejected (terminal state)"
	 */
	@Override
	public String getStatusName() { 
		
		return "Rejected (terminal state)"; 
	}

	@Override
	public boolean toReview( Document document ) {

		return false;
	}

	@Override
	public boolean toDraft( Document document ) {

		return false;
	}

	@Override
	public boolean toApproved( Document document ) {

		return false;
	}

	@Override
	public boolean toRejected( Document document ) {

		return false;
	}
}
