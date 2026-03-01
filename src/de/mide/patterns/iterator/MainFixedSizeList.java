package de.mide.patterns.iterator;


/**
 * Test for class {@link FixedSizeList}.
 */
public class MainFixedSizeList {

	 
	/**
	 * Entrance method.
	 * 
	 * @param args Not evaluated
	 */
	public static void main( String[] args ) throws IterableListException {
		
		final AbstractIteratableList<String> fixedSizeList = new FixedSizeList<>( 3 );
		
		try {
			
			fixedSizeList.getIterator();
		}
		catch ( IterableListException ex ) {
			
			System.out.println( 
					"Exception for attempt to get iterator from empty list: " + 
			        ex.getMessage() );
		}
		
		try {
			
			fixedSizeList.add( "abc" );
			fixedSizeList.add( "def" );
			fixedSizeList.add( "ghi" );
			fixedSizeList.add( "jkl" ); // will throw exception
		}
		catch ( IterableListException ex ) {
			
			System.out.println( 
					"Exception when adding element to list: " + ex.getMessage() );
		}
		
		System.out.println( 
				"Number of elements in list: " + fixedSizeList.getNumberOfElements() );
		
		System.out.println();
		
		final IteratorInterface<String> iterator = fixedSizeList.getIterator();
		while ( iterator.hasMoreElements() ) {
			
			String element = iterator.nextElement();
			System.out.println( "Element from iterator: " + element );
			System.out.println( "Elements remaining in iterator: " + iterator.remainingSize() );
		}
	
		System.out.println( "Element after last element:" + iterator.nextElement() );
	}
}
