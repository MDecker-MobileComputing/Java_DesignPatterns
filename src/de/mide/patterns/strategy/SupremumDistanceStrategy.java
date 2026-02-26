package de.mide.patterns.strategy;


/**
 * Strategy for "Supremum Distance".
 */
public class SupremumDistanceStrategy implements IDistanceStrategy {

	public double calculateDistance( Point point1, Point point2 ) {
		
		double deltaX = point2.x() - point1.x();
		double deltaY = point2.y() - point1.y();
				
		deltaX = Math.abs( deltaX );
		deltaY = Math.abs( deltaY );
		
		return Math.max( deltaX, deltaY );
	}
}
