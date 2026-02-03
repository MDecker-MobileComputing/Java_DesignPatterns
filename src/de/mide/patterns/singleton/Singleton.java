package de.mide.patterns.singleton;

public class Singleton {
	
	/** This class variable references the only instance of this class. */
	private static Singleton _singleton = null;
	
	/**
	 * Private constructore, so instances can only be created by the
	 * class itself.
	 */
	private Singleton() {
		
		System.out.println( "Singleton was created" );
	}
	
	
	public static Singleton getSingelton() {
		
		if ( _singleton == null ) {
			
			_singleton = new Singleton();
		}
				
		return _singleton;
	}
	
}