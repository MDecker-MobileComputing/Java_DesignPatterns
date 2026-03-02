package de.mide.patterns.behavioral.strategy;


/**
 * Strategy for "Supremum Distance".
 */
public class SupremumDistanceStrategy implements IDistanceStrategy {

	
	/**
	 * Calculate the distance between two points with the metric 
	 * "supremum distance".
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
				
		deltaX = Math.abs( deltaX );
		deltaY = Math.abs( deltaY );
		
		return Math.max( deltaX, deltaY );
	}
}
