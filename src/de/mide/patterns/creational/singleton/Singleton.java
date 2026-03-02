package de.mide.patterns.creational.singleton;


public class Singleton {

    
	private static Singleton _singleton = null;

	
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



