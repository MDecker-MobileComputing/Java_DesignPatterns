package de.mide.patterns.observer;


/**
 * Interface that mus be implemented by objects who want to be notified when
 * a new student is registered.
 */
public interface IStudentObserver {

	public void studentEnrolled( int enrollmentNumber, String name );
}
