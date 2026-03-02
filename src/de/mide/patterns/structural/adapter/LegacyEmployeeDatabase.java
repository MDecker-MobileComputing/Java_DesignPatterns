package de.mide.patterns.structural.adapter;


/**
 * Old implementation of the employee database (the vendor is no longer existing), 
 * which we cannot change but still have to use.
 */
public class LegacyEmployeeDatabase {

	private static final String[] FIRST_NAMES_ARRAY = {
	        "Andrew", "Benjamin", "Charles", "Daniel", "Emily", "Frederick", "George", "Henry",
	        "Isabella", "James", "Kevin", "Laura", "Michael", "Natalie", "Oliver", "Peter",
	        "Quentin", "Rebecca", "Samuel", "Thomas", "Ulysses", "Victoria", "William",
	        "Xavier", "Yvonne", "Zachary"
	};
	
	private static final String[] LAST_NAMES_ARRAY = {
	        "Anderson", "Brown", "Clark", "Davis", "Evans", "Foster", "Green", "Harris",
	        "Irwin", "Johnson", "King", "Lewis", "Miller", "Nelson", "Owens", "Parker",
	        "Quinn", "Robinson", "Smith", "Taylor", "Underwood", "Vaughn", "Wilson",
	        "Xanders", "Young", "Zimmerman"
	};
	
	private static final String[] JOB_TITLES_ARRAY = {
	        "Chief Executive Officer",
	        "Chief Financial Officer",
	        "Chief Technology Officer",
	        "Chief Operating Officer",
	        "Human Resources Manager",
	        "Finance Manager",
	        "Marketing Manager",
	        "Sales Manager",
	        "Operations Manager",
	        "Project Manager",
	        "Product Manager",
	        "Business Analyst",
	        "Software Engineer",
	        "Systems Administrator",
	        "Data Analyst",
	        "Accountant",
	        "Sales Representative",
	        "Customer Support Specialist",
	        "Administrative Assistant",
	        "Office Manager",
	        "Procurement Specialist",
	        "Quality Assurance Engineer",
	        "Logistics Coordinator",
	        "Legal Counsel",
	        "Research and Development Engineer",
	        "Intern"
	};
	
	private String getRandomFirstname( int employeeID ) {
		
		final long employeeIdSquare = Math.abs( employeeID * employeeID ); 
		final int index = (int) ( employeeIdSquare % FIRST_NAMES_ARRAY.length );
		return FIRST_NAMES_ARRAY[ index ];
	}
	
	private String getRandomLastname( int employeeID ) {
		
		final long employeeIdTimes3 = Math.abs( employeeID * 3 ); 
		final int index = (int) ( employeeIdTimes3 % LAST_NAMES_ARRAY.length );
		return LAST_NAMES_ARRAY[ index ];
	}

	
	/**
	 * Query employee data.
	 * <br><br>
	 * 
	 * The method returns randomly generated but stable data
	 * (i.e., for the same {@code employeeId} always the
	 * same randomly generated data will be returned).
	 * 
	 * @param employeeID Unique ID of employee
	 * 
	 * @return Will be {@code null} if no employee with
	 *         {@code employeeNumber} is found.
	 *         When employee is found, then the array
	 *         will contain the following data in its
	 *         components in that order: 
	 *         firstname, lastname, jobtitle
	 */
	public String[] getEmployeeData( int employeeID ) {
		
		if ( employeeID % 7 == 0 ) { return null; }
		
		
		
		return null;
	}
}
