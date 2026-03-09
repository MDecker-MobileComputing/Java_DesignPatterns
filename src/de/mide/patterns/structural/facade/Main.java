package de.mide.patterns.structural.facade;


/**
 * Test driver for example 
 */
public class Main {

	
	/**
	 * Entrance method. 
	 * 
	 * @param args Not evaluated
	 */
	public static void main( String[] args ) {
		
		System.out.println();
			
		final HomeCinemaFacade facade = new HomeCinemaFacade();
		
		
		facade.startTV( 42 );
		
		System.out.println();
		
		facade.switchToChannel( 64 );
		
		System.out.println();
		
		facade.increaseLoudness();
		facade.increaseLoudness();
		
		System.out.println();
		
		facade.switchOff();
		
		System.out.println();
	}	
}
