package de.mide.patterns.observer;

public interface IStudentObserver {

	public void studentEnrolled( int enrollmentNumber, String name );
	
	public void studentUnenrolled( int enrollmentNumber );
}
