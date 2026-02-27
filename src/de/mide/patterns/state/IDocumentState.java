package de.mide.patterns.state;


/**
 * This interface contains methods for state changes.
 * If the state change was successful, then {@code true} 
 * is returned, otherwise {@code false}. 
 */
public interface IDocumentState {
	
	/** 
	 * Getter for name of current status
	 * 
	 * @return Name of current status, e.g., "Draft" or "Review"
	 */
	public String getStatus();
}
