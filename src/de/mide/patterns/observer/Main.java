package de.mide.patterns.observer;


public class Main {

	public static void main( String[] args ) {
		
		StudentRegistration studentRegistration = new StudentRegistration();
		
		CanteenSystem canteen = new CanteenSystem();
		LibrarySystem library = new LibrarySystem();
		
		studentRegistration.registerObserver( canteen );
		studentRegistration.registerObserver( library );
		
		studentRegistration.start();
	}
}
