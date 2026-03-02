package de.mide.patterns.behavioral.iterator.linked;

import de.mide.patterns.behavioral.iterator.AbstractIteratableList;
import de.mide.patterns.behavioral.iterator.GeneralListIterator;
import de.mide.patterns.behavioral.iterator.IterableListException;
import de.mide.patterns.behavioral.iterator.IteratorInterface;


/**
 * (Single) Linked List which can return an iterator.
 * 
 * @param <T> Data type to be stored in linked list
 */
public class LinkedList<T> extends AbstractIteratableList<T> {
	
	/** Head of linked list (reference for first element). */
	private LinkedElement<T> _head = null;
	
	/** Number of elements stored in linked list. */
	private int _counter = 0;
	
	
	/**
	 * Insert {@code element} at beginning of linked list.
	 * 
	 * @param element Element to be added
	 */
	@Override
	public void add( T element ) 
				throws IterableListException {
		
		final LinkedElement<T> newElement = 
							new LinkedElement<>( element );
		
		if ( _head != null ) {

			newElement.setNext( _head );			
		}
		
		_head = newElement;
		_counter++;
	}

	
	/**
	 * Getter for number of elements stored in this list.
	 * 
	 * @return Number of elements, will be zero or greater
	 */
	@Override
	public int getNumberOfElements() {

		return _counter;
	}

	
	/**
	 * Get iterator object for a non-empty linked list.
	 * 
	 * @return Iterator object to iterate over the elements
	 *         in the linked list
	 * 
	 * @throws IterableListException List is empty, so nothing
	 *                               to iterate over
	 */
	@SuppressWarnings("unchecked")	
	@Override
	public IteratorInterface<T> getIterator() 
							throws IterableListException {

		if ( _counter == 0 ) {
			
			throw new IterableListException( 
					"Cannot create iterator for empty LinkedList" 
			);
		}
		
		final T[] array = (T[]) new Object[ _counter ];
		
		LinkedElement<T> help = _head;
		
		int i = 0; 
		while ( help != null ) {
			
			array[i] = help.getContent();
			help = help.getNext();
			i++;
		}
		
		return new GeneralListIterator<>( array );
	}
}
