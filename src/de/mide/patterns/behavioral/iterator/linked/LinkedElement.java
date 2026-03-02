package de.mide.patterns.behavioral.iterator.linked;


/**
 * Objects of this class are the nodes for a single linked list. 
 * 
 * @param <T> Type for elements to be stored in the linked list
 */
public class LinkedElement<T> {

	/** Content to be stored. */ 
	private T _content;
	
	/** Reference to following element. */
	private LinkedElement<T> _next;
	
	
	/**
	 * Constructor to create new node for 
	 * 
	 * @param element Element to be stored
	 */
	public LinkedElement( T element ) {
		
		_content = element;
		_next    = null;
	}
	
	
	/**
	 * Set reference to next element in linked list.
	 * 
	 * @param nextElement Next Element (following element)
	 */
	public void setNext( LinkedElement<T> nextElement ) {
	
		_next = nextElement;
	}		
	
	
	/**
	 * Getter for content stored in this node of the linked list.
	 * 
	 * @return Content
	 */
	public T getContent() {
		
		return _content;
	}
	
	
	/**
	 * Getter for next node.
	 * 
	 * @return Reference to following node
	 */
	public LinkedElement<T> getNext() {
		
		return _next;
	}
}
