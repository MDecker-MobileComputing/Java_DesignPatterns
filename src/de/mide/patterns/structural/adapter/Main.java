package de.mide.patterns.structural.adapter;

import java.util.Optional;


/**
 * Test driver for example "Employee query" for design pattern "Adapter".
 */
public class Main {

	
	/**
	 * Entrance method.
	 * 
	 * @param args Not evaluated
	 */
	public static void main( String[] args ) {
		
		System.out.println();
		
		final LegacyEmployeeDatabase legacyDB = new LegacyEmployeeDatabase();
		final IEmployeeQuery employeeDataProvider = new EmployeeAdapter( legacyDB );
		
		final String[] employeeIdArray = { "123456", "223344", "123344", "344123" };
		
		for ( String employeeID : employeeIdArray ) {
			
			System.out.println( "Query for employeeID=" + employeeID + ":" );
			
			final Optional<EmployeeRecord> employeeOptional = 
					employeeDataProvider.queryEmployee( employeeID );
			
			if ( employeeOptional.isPresent() ) {
				
				EmployeeRecord employeeRecord = employeeOptional.get();
				System.out.println( "\t" + employeeRecord );
				
			} else {
				
				System.out.println( "\tNot found");
			}
			
			System.out.println();
		}
		
		System.out.println();
	}
}
