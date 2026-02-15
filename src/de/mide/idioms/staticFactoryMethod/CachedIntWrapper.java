package de.mide.idioms.staticFactoryMethod;


/**
 * {@code Integer.valueOf(int)} is a <i>static factory method</i>
 * from the Java SDK that created a wrapper object for the
 * {@code int} value passed as argument. The returned objects
 * are cached, i.e., for the same {@code int} value the same
 * object will be returned. Since {@code Integer} objects cannot
 * be changed after creation (i.e., their {@code int} value
 * cannot be altered), it cannot cause problems when different
 * clients use the same instance of the same object.
 */
public class CachedIntWrapper {

	public static void main( String[] args ) {
		
		Integer i1 = Integer.valueOf( 123 );
		Integer i2 = Integer.valueOf( 123 );
		
		System.out.println( i1 == i2 ); // will return true
	}
}

