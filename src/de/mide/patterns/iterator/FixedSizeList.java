package de.mide.patterns.iterator;

import static java.util.Arrays.copyOf;


/**
 * This list internally uses an array that cannot be enlarged!
 * 
 * @param <T> Type of the objects to be stored in this list
 */
public class FixedSizeList<T> extends AbstractIteratableList<T> {

	/** Array of elements stored in the list, won't be enlarged. */
	private T[] _array;
	
	/** Index in array for next element to be stored. */
	private int _nextInsertIndex = 0;
	
	
	/**
	 * Constructor to create an object of this list.
	 * 
	 * @param numberOfElements Number of elements in the list,
	 *                         cannot be changed afterwards!
	 *                         Must be greater than zero.
	 *                         
	 * @throws IterableListException {@code numberOfElements} 
	 *                               was less than 1
	 */
	@SuppressWarnings("unchecked")
	public FixedSizeList( int numberOfElements ) 
						throws IterableListException {
		
		if ( numberOfElements < 1 ) {
			
			throw new IterableListException( 
					"Illegal size for list: " + numberOfElements );
		}
		
		_array = (T[]) new Object[ numberOfElements ];
	}
	
	
	/**
	 * Add element to list.
	 * 
	 * @param element Element to be added
	 * 
	 * @throws IterableListException No more space to store the 
	 *                               element
	 */
	@Override
	public void add( T element ) throws IterableListException {
		
		if ( _nextInsertIndex == _array.length ) {
			
			throw new IterableListException( 
					"No more space to store element" );
		}
		
		_array[ _nextInsertIndex ] = element;
		_nextInsertIndex++;
	}


	/** 
	 * Getter for number of elements already stored in the 
	 * list. 
	 * 
	 * @return Number of elements, won't be greater than
	 *         {@code numberOfElements} passed as argument
	 *         for constructor
	 */
	@Override
	public int getNumberOfElements() {
		
		return _nextInsertIndex;
	}

	
	/**
	 * Get iterator object to iterate once over the elements
	 * in the list. The iterator will contain a copy of the
	 * data at the point in time during creation, so elements
	 * added afterward to the list won't be returned by an
	 * iterator object that was created before.
	 * <br><br>
	 * 
	 * Do not call on an empty list!
	 * 
	 * @return Iterator object to iterate once over the
	 *         elements in this list
	 *         
	 * @throws IterableListException List was empty 
	 */
	@Override
	public IteratorInterface<T> getIterator() 
						throws IterableListException {

		if ( _nextInsertIndex == 0 ) {
			
			throw new IterableListException( 
					"Cannot create iterator for empty list" );
		}
		
		final T[] arrayCopy = copyOf( _array, _array.length );
		
		return new FixedSizeListIterator<>( arrayCopy );
	}
}
