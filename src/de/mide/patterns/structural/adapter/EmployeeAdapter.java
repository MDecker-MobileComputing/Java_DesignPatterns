package de.mide.patterns.structural.adapter;

import static java.util.Optional.empty;
import static java.lang.Integer.parseInt;

import java.util.Optional;


/**
 * Adapter for class {@link LegacyEmployeeDatabase} and
 * interface {@link IEmployeeQuery}.
 */
public class EmployeeAdapter implements IEmployeeQuery {

	/** Reference to Legacy Employee Database to be used via adapter. */ 
	private LegacyEmployeeDatabase _adaptee;
	
	
	/**
	 * Constructor for passing the adaptee.
	 * 
	 * @param adaptee Legacy Employee Database to be used via adapter
	 */
	public EmployeeAdapter( LegacyEmployeeDatabase adaptee ) {
		
		_adaptee = adaptee;
	}
	
	
	/**
	 * Query employee data.
	 * 
	 * @param employeeID Unique ID of the employee to be queried,
	 *                   e.g., personnel number
	 *                   
	 * @return Optional will be empty when no employee for {@code employeeID}
	 *         found or {@code employeeID} cannot be parsed to an {@code int} 
	 *         value, other optional will contain 
	 */
	@Override
	public Optional<EmployeeRecord> queryEmployee( String employeeID ) {

		int employeeNumber = -1;
		try {
			
			employeeNumber = parseInt( employeeID );
		}
		catch ( NumberFormatException ex ) {

			System.out.println( 
					"Error: EmployeeID \"" + employeeID + 
					"\" cannot be parsed to int." );

			return empty();
		}
		
		final String resultArray[] = 
					_adaptee.getEmployeeData( employeeNumber ); // calling adapted method
		if ( resultArray == null ) { // employee found?
			
			return empty();
		}
				
		final String firstname = resultArray[0];
		final String lastname  = resultArray[1];
		final String jobtitle  = resultArray[2];
		final EmployeeRecord resultRecord = 
				new EmployeeRecord( firstname, lastname, jobtitle );
		
		return Optional.of( resultRecord );
	}

}
