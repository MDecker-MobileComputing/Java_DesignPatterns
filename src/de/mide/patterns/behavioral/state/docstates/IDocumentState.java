package de.mide.patterns.behavioral.state.docstates;

import de.mide.patterns.behavioral.state.Document;


/**
 * This interface contains methods for state changes.
 * If the state change was successful, then {@code true} 
 * is returned, otherwise {@code false}. 
 * All methods to change the state must start with
 * "to" (e.g., {@code toReview()}) and accept an
 * object of class {@link Document} as argument.
 * <br><br>
 * 
 * If an implementing class of this interface represents
 * a terminal state, then all state changes must be
 * denied.
 */
public interface IDocumentState {
	

	/** 
	 * Getter for name of current status.
	 * 
	 * @return Name of current status, e.g., 
	 *         "Draft" or "Approved (terminal state)"
	 */
	public String getStatusName();
	
	
	/**
	 * Try to change document's state to "Review".
	 * 
	 * @param document Document for which the state is
	 *                 to be changed
	 * 
	 * @return {@code true} iff the state change was successful
	 */
	public boolean toReview( Document document );
	
	
	/**
	 * Try to change document's state to "Draft"
	 * (reviewer requests changes).
	 * 
	 * @param document Document for which the state is
	 *                 to be changed
	 * 
	 * @return {@code true} iff the state change was successful
	 */
	public boolean toDraft( Document document );
	
	
	/**
	 * Try to change document's state to "Approved" (final state).
	 * 
	 * @param document Document for which the state is
	 *                 to be changed
	 * 
	 * @return {@code true} iff the state change was successful
	 */
	public boolean toApproved( Document document );

	
	/**
	 * Try to change document's state to "Rejected" (final state).
	 * 
	 * @param document Document for which the state is
	 *                 to be changed
	 * 
	 * @return {@code true} iff the state change was successful
	 */
	public boolean toRejected( Document document );

	
	/**
	 * Try to change document's state to "Discarded" (final state).
	 * 
	 * @param document Document for which the state is
	 *                 to be changed
	 * 
	 * @return {@code true} iff the state change was successful
	 */
	public boolean toDiscarded( Document document );
	 
}
