package de.mide.idiom;


/**
 * One object of this class represents a student at a university.
 * The equals method is an example for an "idiom".
 */
public class Student {

	/** First and last name of student */
	private String _name;
	
	/** Matriculation number */
	private int _enrollmentNumber;
	
	public Student( String name, int enrollmentNumber ) {
		
		_name             = name;
		_enrollmentNumber = enrollmentNumber;
	}
	

	public String getName() { return _name; }
	

	public int getEnrollmentNumber() { return _enrollmentNumber; }
	

	/**
	 * The way this method is implemented can be considered as IDIOM
	 * (but not a design pattern): It is a "programming pattern" that 
	 * can be used in many cases and is considered as good practice,  
	 * but is only applicable for Java).
	 */	
	@Override
	public boolean equals( Object object ) {
		
		if ( object == this ) { return true; }
		
		if ( object == null ) { return false; }
		
		if ( object instanceof Student otherStudi ) {
		
			return _name.equals( otherStudi.getName() ) &&
				   _enrollmentNumber == otherStudi.getEnrollmentNumber();
			
		} else {
			
			return false;
		}		
	}
}
