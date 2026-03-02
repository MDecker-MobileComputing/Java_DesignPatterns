package de.mide.patterns.behavioral.iterator;


/**
 * Abstract superclass for iterable lists.
 * 
 * @param <T> Type of the objects to be stored in this list
 */
public abstract class AbstractIteratableList<T> {

	/**
	 * Add element to list.
	 * 
	 * @param element Element to be stored in list
	 * 
	 * @throws IterableListException No more capacity left
	 */
	public abstract void add( T element ) 
						throws IterableListException;
	
	
	/**
	 * Get number of elements that are actually stored in 
	 * the list (not the capacity).
	 * 
	 * @return Number of elements in list (zero or greater).
	 */
	public abstract int getNumberOfElements();
	
	
	/**
	 * Get iterator object for a non-empty list.
	 * 
	 * @return Iterator object to iterate over the elements
	 *         in the calling list
	 * 
	 * @throws IterableListException List is empty, so nothing
	 *                               to iterate over
	 */
	public abstract IteratorInterface<T> getIterator() 
								throws IterableListException;
}
