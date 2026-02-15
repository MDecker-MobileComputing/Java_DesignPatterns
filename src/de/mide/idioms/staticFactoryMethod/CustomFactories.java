package de.mide.idioms.staticFactoryMethod;

import java.util.HashMap;

public class CustomFactories {

	/**
	 * Creates a hash map configured with an initial capacity
	 * of 100 (internal array size) and a load factory of 0.75;
	 * when the number of entries exceeds {@code capacity x 0.75},
	 * then the size of the internal array is doubled. 
	 * 
	 * @return HashMap for mapping of "string to string"
	 */
	public static HashMap<String,String> createHashMap() {
		
		return new HashMap<String,String>( 100, 0.75f );
	}

	
	/**
	 * Small test: Using the HashMap returned by the static
	 * factory method for a little glossary.
	 */
	public static void main( String[] args ) {
		
		HashMap<String,String> map = createHashMap();
		
		map.put( "RAM", "Random Access Memory"    );
		map.put( "CPU", "Central Processing Unit" );
		
		System.out.println( map.get( "RAM" ) ); // output: Random Access Memory 
	}
}
