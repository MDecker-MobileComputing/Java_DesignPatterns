package de.mide.patterns.structural.proxy;


/**
 * This interface has to be implemented by the class
 * to be proxied (the subject) and also the proxy class.
 * It contains abstract methods that returns calculated
 * values based on input parameters.
 */
public interface ICalculation {

	public int cheapCalculation( int a, int b );
	
	public int expensiveCalculation( int a, int b );		
}
