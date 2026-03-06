package de.mide.patterns.structural.proxy;


/**
 * Test driver for example for design pattern "Proxy":
 * Caching results of expensive operations. 
 */
public class Main {

	
	/**
	 * Entrance method.
	 * 
	 * @param args Not evaluated.
	 */
	public static void main( String[] args ) {
		
		System.out.println();
		
		final ICalculation calcProxy = new CalculationProxy();
		
		System.out.println( "1+2: " + calcProxy.cheapCalculation( 1, 2 )    );
		
		System.out.println( "2*3: " + calcProxy.expensiveCalculation( 2, 3) );
		System.out.println( "3*4: " + calcProxy.expensiveCalculation( 3, 4) );
		System.out.println( "2*3: " + calcProxy.expensiveCalculation( 2, 3) ); // cache hit
				
		System.out.println();
	}
}
