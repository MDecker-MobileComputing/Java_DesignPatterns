package de.mide.patterns.behavioral.strategy;


/**
 * Strategy for "Euclidian Distance" (linear distance between two points, 
 * in German: "Luftlinie").
 */
public class EuclidianDistanceStrategy implements IDistanceStrategy {

	
	/**
	 * Calculate the distance between two points with the Euclidian 
	 * distance metric.
	 * 
	 * @param point1 First point
	 * 
	 * @param point2 Second Point
	 * 
	 * @return Distance between {@code point1} und {@code point2}
	 */
	@Override
	public double calculateDistance( Point point1, Point point2 ) {

		double deltaX = point2.x() - point1.x();
		double deltaY = point2.y() - point1.y();
				
		return Math.sqrt( deltaX * deltaX + deltaY * deltaY );
	}
}
