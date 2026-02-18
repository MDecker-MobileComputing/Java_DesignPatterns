package de.mide.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {

	private List<IStudentObserver> _studentObserverList = new ArrayList<>( 5 );
	
	
	public void registerObserver( IStudentObserver observer ) {
		
		_studentObserverList.add( observer );
	}
	

	/**
	 * 
	 * @param observer Observer that no longer wants to observe the
	 *                 calling object
	 * 
	 * @return {@code true} if observer was contained in list and was removed
	 */
	public boolean unregisterObserver( IStudentObserver observer ) {
		
		return _studentObserverList.remove( observer );
	}
	
}
