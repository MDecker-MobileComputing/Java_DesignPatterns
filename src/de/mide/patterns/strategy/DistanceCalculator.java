package de.mide.patterns.strategy;

/**
 * "Context" object using a strategy object.
 */
public class DistanceCalculator {

	/** Strategy object for distance calculation */
	private IDistanceStrategy _strategy = null;
	
	
	/**
	 * Constructor to pass strategy for distance calculation.
	 * 
	 * @param strategy Strategy object for distance calculation,
	 *                 e.g., {@link EuclidianDistanceStrategy}
	 *                 or {@link CityBlockDistanceStrategy}
	 */
	public DistanceCalculator( IDistanceStrategy strategy ) {
		
		_strategy = strategy;
	}

	
	/**
	 * Method calculates the distance between the points in the 
	 * two arrays using the metric defined by the strategy object
	 * passed when then calling object was constructoed.
	 * Both arrays should have the same length (if not, then the  
	 * length of the shorter array is used).
	 * 
	 * @param xPoints Array of points, should be as long as {@code yPoints}
	 * 
	 * @param yPoints Array of points, should be as long as {@code xPoints}
	 */
	public void calcDistances( Point[] xPoints, Point[] yPoints ) {
		
		final int minLength = Math.min( xPoints.length, yPoints.length );
		
		for ( int i = 0; i < minLength; i++ ) {

			final Point p1 = xPoints[i];
			final Point p2 = yPoints[i];
			
			final double distance = _strategy.calculateDistance( p1, p2 );
			
			System.out.println( 
					"Distance between " + p1 + " and " + p2 + ": " + distance );
		}
	}	
}
