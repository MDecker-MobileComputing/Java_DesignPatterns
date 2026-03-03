package de.mide.patterns.structural.adapter;

import java.util.Optional;

/**
 * Interface of object needed by the new client.
 */
public interface IEmployeeQuery {

	/**
	 * Query details about employee.
	 * 
	 * @param employeeID String with employee ID, e.g. personnel number
	 * 
	 * @return Optional will contain object with employee record if
	 *         an employee was found for {@code employeeID}
	 */
	public Optional<EmployeeRecord> queryEmployee( String employeeID );
}
