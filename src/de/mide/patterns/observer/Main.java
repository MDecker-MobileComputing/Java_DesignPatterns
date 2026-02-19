package de.mide.patterns.observer;

public class Main {

	public static void main( String[] args ) {
		
		StudentRegistration studentRegistration = new StudentRegistration();
		
		CanteenSystem canteen = new CanteenSystem();
		
		studentRegistration.registerObserver( canteen );
		
		studentRegistration.start();
	}
}
