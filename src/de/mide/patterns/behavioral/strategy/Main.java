package de.mide.patterns.behavioral.strategy;


/**
 * Test driver for distance calculation (demo for pattern "strategy").
 */
public class Main {

	
	/**
	 * Entrance method.
	 * 
	 * @param args Not evaluated
	 */
	public static void main( String[] args ) {
		
		System.out.println();
		
		Point p1a = new Point( 1, 1 );
		Point p1b = new Point( 1, 2 );

		Point p2a = new Point( 0, 0 );
		Point p2b = new Point( 1, 1 );

		Point p3a = new Point( 1, 2 );
		Point p3b = new Point( 3, 4 );

		Point[] xPointsArray = new Point[]{ p1a, p2a, p3a };
		Point[] yPointsArray = new Point[]{ p1b, p2b, p3b };
		
		
		DistanceCalculator distanceCalculator = null;
		IDistanceStrategy  distanceStrategy   = null;
		
		
		// do the calculations with Euclidian distance
		System.out.println( "\nEuclidian Distance:" );
		
		distanceStrategy   = new EuclidianDistanceStrategy();
		distanceCalculator = new DistanceCalculator( distanceStrategy );
				
		distanceCalculator.calcDistances( xPointsArray, yPointsArray );
		
		
		// do the calculations with City Block distance
		System.out.println( "\nCity Block Distance:" );
		
		distanceStrategy   = new CityBlockDistanceStrategy();
		distanceCalculator = new DistanceCalculator( distanceStrategy );
				
		distanceCalculator.calcDistances( xPointsArray, yPointsArray );		
		
		
		// do the calculations with Supremum distance
		System.out.println( "\nSupremum Distance:" );
		
		distanceStrategy   = new SupremumDistanceStrategy();
		distanceCalculator = new DistanceCalculator( distanceStrategy );
				
		distanceCalculator.calcDistances( xPointsArray, yPointsArray );
		
		System.out.println();
	}
	
}
