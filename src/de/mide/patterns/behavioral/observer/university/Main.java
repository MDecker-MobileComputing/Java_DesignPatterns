package de.mide.patterns.behavioral.observer.university;

/**
 * Test driver for pattern "Observer" (university example).
 */
public class Main {

	/**
	 * Entrance method.
	 * 
	 * @param args Not evaluated
	 */
	public static void main( String[] args ) {
		
		StudentRegistration studentRegistration = new StudentRegistration();
		
		CanteenSystem canteen = new CanteenSystem();
		LibrarySystem library = new LibrarySystem();
		
		studentRegistration.registerObserver( canteen );
		studentRegistration.registerObserver( library );
		
		studentRegistration.start();
	}
}
