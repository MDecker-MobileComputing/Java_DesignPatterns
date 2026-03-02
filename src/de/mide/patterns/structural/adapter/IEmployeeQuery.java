package de.mide.patterns.structural.adapter;

import java.util.Optional;

/**
 * Interface of object needed by the new client.
 */
public interface IEmployeeQuery {

	public Optional<EmployeeRecord> queryEmployee( int employeeID ) {
		
	}
}
