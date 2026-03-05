package de.mide.patterns.structural.proxy;

public interface ICalculation {

	public int cheapCalculation( int a, int b );
	
	public int expensiveCalculation( int a, int b );		
}
