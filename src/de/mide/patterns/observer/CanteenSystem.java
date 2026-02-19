package de.mide.patterns.observer;

public class CanteenSystem implements IStudentObserver {
	
	public void studentEnrolled( int enrollmentNumber, String name ) {
		
		System.out.println( "Canteen informed about new student: " + name );
	}
}
