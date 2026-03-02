package de.mide.patterns.behavioral.iterator;


/**
 * The lists must have a method that returns an object
 * implementing this interface. If you have an object 
 * that implements this interface, you can iterate over 
 * the contents of the list that returned the object 
 * only once!
 * <br><br>
 * 
 * Usually the author adds letter "I" at beginning
 * of interface names, but "IIterator" looks so strange,
 * therefore the name {@code IteratorInterface} was
 * chosen.
 * 
 * @param <T> Type of the objects to iterate over.
 */
public interface IteratorInterface<T> {

	/**
	 * Getter for number of remaining elements 
	 * in iteration.
	 * 
	 * @return Number of remaining elements
	 */
	public int numberOfRemainingElements();
	
	
	/**
	 * Method to check if method {@link #nextElement()}
	 * can be called; when this method returns {@code false},
	 * but method {@link #nextElement()} is still called,
	 * then method {@link #nextElement()} returns {@code null}.
	 * 
	 * @return {@code true} iff this iterator has more
	 *         elements
	 */
	public boolean hasMoreElements();

	
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
	public T nextElement();
}
