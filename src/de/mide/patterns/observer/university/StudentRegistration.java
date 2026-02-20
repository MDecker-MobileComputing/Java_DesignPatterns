package de.mide.patterns.observer.university;

import java.util.ArrayList;
import java.util.List;


public class StudentRegistration extends Thread {

	private List<IStudentObserver> _studentObserverList = new ArrayList<>( 5 );

	
	/**
	 * Register as observer.
	 * 
	 * @param observer Observer to be registered
	 */
	public void registerObserver( IStudentObserver observer ) {
		
		_studentObserverList.add( observer );
	}
	

	/**
	 * Remove {@code observer} as observer of the subject.
	 * 
	 * @param observer Observer that no longer wants to observe the
	 *                 calling object
	 * 
	 * @return {@code true} if observer was contained in list and was removed
	 */
	public boolean unregisterObserver( IStudentObserver observer ) {
		
		return _studentObserverList.remove( observer );
	}
	
	
	/**
	 * Register a new student. 
	 * 
	 * @param enrollmentNumber Enrollment number of new student
	 * 
	 * @param name First and last name of new student
	 */
	private void registerNewStudent( int enrollmentNumber, String name ) {
	
		System.out.println( 
				"\nNew student registered: " + name + " (" + enrollmentNumber + ")" );
		
		for ( IStudentObserver observer : _studentObserverList ) {
			
			observer.studentEnrolled( enrollmentNumber, name );
		}
	}
	
	
	/**
	 * Method in background thread to simulate data changes. 
	 */
	@Override
	public void run() {
	
		try {
			
			registerNewStudent( 123123, "Alice Ackerman" );
			
			Thread.sleep( 800 );
			
			registerNewStudent( 234234, "Bob Bayer" );
			
			Thread.sleep( 500 );
			
			registerNewStudent( 345345, "Claire Cramer" );
			
			Thread.sleep( 800 );
			
			registerNewStudent( 456456, "Daniel Davenport" );
		}
		catch ( InterruptedException ex ) {}		
	}
}
