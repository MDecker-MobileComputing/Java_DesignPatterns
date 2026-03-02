package de.mide.patterns.behavioral.iterator.linked;

import de.mide.patterns.behavioral.iterator.AbstractIteratableList;
import de.mide.patterns.behavioral.iterator.IterableListException;
import de.mide.patterns.behavioral.iterator.IteratorInterface;


/**
 * Test for class {@link LinkedList}.
 */
public class Main_LinkedList {

	
	/**
	 * Entrace method.
	 * 
	 * @param args Not evaluated
	 */
	public static void main( String[] args ) throws IterableListException {
		
		System.out.println();
		
		final AbstractIteratableList<String> linkedList = new LinkedList<>();
		
		try {
			
			linkedList.getIterator();
		}
		catch ( IterableListException ex ) {
			
			System.out.println( 
					"Exception for attempt to get iterator from empty list: " + 
			        ex.getMessage() );
		}
		
		linkedList.add( "a1" );
		linkedList.add( "b2" );
		linkedList.add( "c3" );
		
		System.out.println( 
				"Number of elements in linked list: " + 
		        linkedList.getNumberOfElements() );
		
		final IteratorInterface<String> iterator = linkedList.getIterator();
		
		linkedList.add( "d4" ); // will not appear in iterator
		
		while ( iterator.hasMoreElements() ) {
			
			final String element = iterator.nextElement();
			System.out.println( "Element from iterator: " + element );
			System.out.println( "Elements remaining in iterator: " + 
									iterator.numberOfRemainingElements() );			
		}
		
		System.out.println();
	}
}
