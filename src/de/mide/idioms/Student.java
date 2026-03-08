package de.mide.idioms;


/**
 * One object of this class represents a student at a university.
 * The implementation of method {@link #equals(Object)} an example 
 * for an "idiom".
 */
public class Student {

	/** First and last name of student */
	private String _name;
	
	/** Matriculation number */
	private int _enrollmentNumber;
	
	
	/**
	 * Constructor to create new student object.
	 */
	public Student( String name, int enrollmentNumber ) {
		
		_name             = name;
		_enrollmentNumber = enrollmentNumber;
	}
	

	/**
	 * Getter for student's full name.
	 * 
	 * @return Name of student (first and last name)
	 */
	public String getName() { return _name; }
	

	/**
	 * Getter for student's enrollment/matriculation number.
	 * 
	 * @return Enrollment number of student
	 */
	public int getEnrollmentNumber() { return _enrollmentNumber; }
	

	/**
	 * The way this method is implemented can be considered as IDIOM
	 * (but not a design pattern): It is a "programming pattern" that 
	 * can be used in many cases and is considered as good practice,  
	 * but is only applicable for Java).
	 * 
	 * <ul>
	 * <li>It is first checked if the object passed as argument is {@code this}
	 *     or {@code null}.</li>
	 * <li>Then it is checked if the object passed as argument is an object
	 *     of the same class or a subclass of the class of the calling object.</li>
	 * <li>If the object passed as argument can be casted to the class of the
	 *     calling object, then all attributes are compared.</li>
	 * </ul>
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
