package de.mide.patterns.observer.university;


public class LibrarySystem implements IStudentObserver {

	@Override
	public void studentEnrolled( int enrollmentNumber, String name ) {
		
		System.out.println( "Library informed about new student: " + name );
	}
}
