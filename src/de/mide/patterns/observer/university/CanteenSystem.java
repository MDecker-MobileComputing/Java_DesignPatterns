package de.mide.patterns.observer.university;


public class CanteenSystem implements IStudentObserver {
	
	@Override
	public void studentEnrolled( int enrollmentNumber, String name ) {
		
		System.out.println( "Canteen informed about new student: " + name );
	}
}
