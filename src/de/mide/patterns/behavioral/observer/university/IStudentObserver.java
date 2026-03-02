package de.mide.patterns.behavioral.observer.university;


/**
 * Interface that mus be implemented by objects who want to be notified when
 * a new student is registered.
 */
public interface IStudentObserver {

	public void studentEnrolled( int enrollmentNumber, String name );
}
