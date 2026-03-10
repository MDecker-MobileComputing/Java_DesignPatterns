package de.mide.patterns.behavioral.state;

import static java.lang.String.format;

import de.mide.patterns.behavioral.state.docstates.DocumentStateDraft;
import de.mide.patterns.behavioral.state.docstates.IDocumentState;


/**
 * In the document workflow example, this class is the context.
 */
public class Document {
	
	/** Title of document. */
	private String _title = "";
	
	/** 
	 * State object for current state of object; the initial
	 * state is "Draft". 
	 */
	private IDocumentState _documentState = new DocumentStateDraft();
	

	/**
	 * Constructor to create new document with initial
	 * state "Draft".
	 * 
	 * @param title Title of the document
	 */
	public Document( String title ) {
		
		_title = title;
	}
	
	
	/**
	 * Getter for title of document.
	 * 
	 * @return Title of document, e.g., "Annual Report 2026"
	 */
	public String getTitle() {
		
		return _title;
	}


	/**
	 * Set new state of the document.
	 * 
	 * @param state New state of document
	 */
	public void setState( IDocumentState state ) {
	
		_documentState = state;
	}
	
	
	/**
	 * Send document to review.
	 * 
	 * @return {@code true} iff successful, namely 
	 *         when document was in state "Draft".
	 */
	public boolean toReview() {
		
		return _documentState.toReview( this );
	}
	
	
	/**
	 * Send document back to state "draft".
	 * 
	 * @return {@code true} iff successful, namely 
	 *         when document was in state "Review".
	 */
	public boolean toDraft() {
		
		return _documentState.toDraft( this );
	}
	
	
	/**
	 * Set document to state "Approved" (final state).
	 * 
	 * @return {@code true} iff successful, namely 
	 *         when document was in state "Review".
	 */
	public boolean toApproved() {
		
		return _documentState.toApproved( this );
	}

	
	/**
	 * Set document to state "Rejected" (final state).
	 * 
	 * @return {@code true} iff successful, namely 
	 *         when document was in state "Review".
	 */	
	public boolean toRejected() {
		
		return _documentState.toRejected( this );
	}
	
	
	/**
	 * Set document to state "Discarded" (final state).
	 * 
	 * @return {@code true} iff successful, namely 
	 *         when document was in state "Draft".
	 */	
	public boolean toDiscarded() {
		
		return _documentState.toDiscarded( this );
	}
	
	
	/**
	 * Write message to STDOUT that describes a successful state transition.
	 * <br>
	 * 
	 * Example:
	 * <pre>
	 * Document "Annual Report 2026" was moved to state "Approved".
	 * </pre>
	 * 
	 * @param oldState State before the transition
	 */
	public void logTransition() {
		
		final String str = 
			format(
				"Document \"%s\" was moved to state \"%s\".",
				_title, _documentState.getStatusName() );
		
		System.out.println( str );
	}
	
	
	/**
	 * Write message to STDOUT with the titel and
	 * current state of the document.<br>
	 * 
	 * Example:
	 * <pre>
	 * Document "Annual report 2026" is now in state "Draft".
	 * </pre>
	 */
	public void logCurrentState() {
		
		System.out.println( toString() );
	}	
	
	
	/**
	 * Write message to STDOUT, that document is already
	 * in a particular state.
	 * <br>
	 * 
	 * Example:
	 * <pre>
	 * Document "Annual report 2026" is already in state "Review".
	 * </pre>
	 */
	public void logAlreadyInState() {
		
		final String str = 
			format( "Document \"%s\" is already in state \"%s\".", 
					_title, _documentState.getStatusName() );
		
		System.out.println( str );
	}
	
	
	/**
	 * Write message to STDOUT that says that the requested state transition
	 * is not allowed.<br>
	 * 
	 * Example:
	 * <pre>
	 * Document "Annual Report 2026" is in state "Approved" and therefore 
	 * cannot be moved to state "Draft". 
	 * </pre>
	 * 
	 * @param targetState Target state which is not reachable from
	 *                    the current state
	 */
	public void logTransitionNotAllowed( String targetState ) {

		final String str = 
			format( 
				"Document \"%s\" is in state \"%s\" and therefore " + 
			    "cannot be moved to state \"%s\".", 
			    _title, _documentState.getStatusName(), targetState );
			
		System.out.println( str );
	}
	
			
	/**
	 * Method to return string representation of calling
	 * document object. 
	 * 
	 * @return String with title of document and current state, e.g.: 
	 *         <pre>
	 *         Document "Annual report 2026" is in state "Draft".
	 *         </pre>
	 */
	@Override
	public String toString() {
		
		return format( "Document \"%s\" is in state \"%s\".",				 
					   _title, _documentState.getStatusName() );
	}
}