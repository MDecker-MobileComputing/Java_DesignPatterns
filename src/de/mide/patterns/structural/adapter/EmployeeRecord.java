package de.mide.patterns.structural.adapter;


/**
 * Record (class) for details about an employee. 
 * <br><br>
 * 
 * Example of string representation of an object of
 * this record:
 * <pre>
 * EmployeeRecord[firstname=Yvonne, lastname=Young, jobtitle=Human Resources Manager]
 * </pre>
 */
public record EmployeeRecord( String firstname, 
		                      String lastname, 
		                      String jobtitle )  {
}
