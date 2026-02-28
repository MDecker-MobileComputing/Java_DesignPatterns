package de.mide.patterns.state.docstates;

import de.mide.patterns.state.Document;

/**
 * This interface contains methods for state changes.
 * If the state change was successful, then {@code true} 
 * is returned, otherwise {@code false}. 
 */
public interface IDocumentState {
	
	/** 
	 * Getter for name of current status.
	 * 
	 * @return Name of current status, e.g., "Draft" or "Review"
	 */
	public String getStatusName();
	
	
	/**
	 * Send document from state "draft" to "review".
	 * 
	 * @return {@code true} iff the state change was successful
	 */
	public boolean toReview( Document document );
	 
}
