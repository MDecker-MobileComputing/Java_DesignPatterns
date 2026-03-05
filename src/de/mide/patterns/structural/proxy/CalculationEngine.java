package de.mide.patterns.structural.proxy;


public class CalculationEngine implements ICalculation {

	@Override
	public int cheapCalculation( int a, int b ) {

		return a + b;
	}
	
	@Override
	public int expensiveCalculation( int a, int b ) {

		try {
			Thread.sleep( 1_000 ); // simulate long runtime of calculation
		}
		catch ( InterruptedException ex ) {}					
		
		return a * b;
	}	
}
