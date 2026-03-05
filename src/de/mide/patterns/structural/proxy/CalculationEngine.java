package de.mide.patterns.structural.proxy;



public class CalculationEngine implements ICalculation {

	
	/**
	 * Perform cheap calculation (addition).
	 * 
	 * @param Input parameter A for calculation
	 * 
	 * @param Input parameter B for calculation
	 * 
	 * @return Sum of both input parameters 
	 */
	@Override
	public int cheapCalculation( int a, int b ) {

		return a + b;
	}

	
	/**
	 * Perform expensive calculation (multiplication), 
	 * will take at least one second.
	 * 
	 * @param Input parameter A for calculation
	 * 
	 * @param Input parameter B for calculation
	 * 
	 * @return Product of both input parameters 
	 */	
	@Override
	public int expensiveCalculation( int a, int b ) {

		try {
			
			Thread.sleep( 1_000 ); // simulate long runtime of calculation
		}
		catch ( InterruptedException ex ) {}					
		
		return a * b;
	}	
}
