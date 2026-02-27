package de.mide.patterns.state;

import static java.lang.String.format;


/**
 * In the document workflow example, this class is the context.
 */
public class Document {
	
	/** Title of document. */
	private String _title = "";
	
	/** State object for current state of object. */
	private IDocumentState _documentState = null;
	
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
	 * Method to return string representation of calling
	 * document object. 
	 * 
	 * @return String with title of document and current state
	 */
	@Override
	public String toString() {
		
		return format( "Document \"%s\" is in state \"%s\".",				 
					   _title, _documentState.getStatus() );
	}
}