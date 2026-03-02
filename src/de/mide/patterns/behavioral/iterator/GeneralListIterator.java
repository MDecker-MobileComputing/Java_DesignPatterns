package de.mide.patterns.behavioral.iterator;


/**
 * Iterator for elements stored in an {@link AbstractIteratableList}.
 * Internally, the elements are stored in an array. 
 * 
 * @param <T> Type for elements
 */
public class GeneralListIterator<T> implements IteratorInterface<T> {

	/** Array with data for iteration. */
	private T[] _array = null;
	
	/** Index of next element to be returned by iterator. */
	private int _indexOfNextElement = 0;
	
	
	/**
	 * Constructor to pass copy of array with elements to
	 * iterate over.
	 * 
	 * @param array Array with elements for iteration
	 */
	public GeneralListIterator( T[] array ) {
		
		_array = array;
	}
	
	
	/**
	 * Getter for number of elements that haven't returned
	 * yet by this iterator. 
	 * 
	 * @return Number of elements left for iteration
	 */
	@Override
	public int numberOfRemainingElements() {
		
		return _array.length - _indexOfNextElement;
	}

	
	/**
	 * Method to check if method {@link #nextElement()}
	 * can be called; when this method returns {@code false},
	 * but method {@link #nextElement()} is still called,
	 * then method {@link #nextElement()} returns {@code null}.
	 * 
	 * @return {@code true} iff this iterator has more
	 *         elements
	 */
	@Override
	public boolean hasMoreElements() {
		
		return _indexOfNextElement < _array.length;
	}

	
	/**
	 * Call this method to get the next element.
	 * Call method {@link #hasMoreElements()} to
	 * check if this method can deliver at least
	 * one more element (otherwise you might
	 * obtain {@code null} as return value}.
	 * 
	 * @return Next element or {@code null} if 
	 *         no more elements left.
	 */
	public T nextElement() {
		
		if ( hasMoreElements() == false ) {
			
			return null;
		}
		
		final T result = _array[ _indexOfNextElement ];
		
		_indexOfNextElement++;
		
		return result;
	}
}
