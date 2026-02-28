package de.mide.patterns.state.docstates;


import de.mide.patterns.state.Document;

/**
 * This interface contains methods for state changes.
 * If the state change was successful, then {@code true} 
 * is returned, otherwise {@code false}. 
 * All methods to change the state must start with
 * "to" (e.g., {@code toReview()}) and accept an
 * object of class {@link Document} as argument.
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
	 * @param document Document for which the state is
	 *                 to be changed
	 * 
	 * @return {@code true} iff the state change was successful
	 */
	public boolean toReview( Document document );
	
	
	/**
	 * Send document from state "review" to "draft"
	 * (reviewer requests changes).
	 * 
	 * @param document Document for which the state is
	 *                 to be changed
	 * 
	 * @return {@code true} iff the state change was successful
	 */
	public boolean toDraft( Document document );
	 
}
