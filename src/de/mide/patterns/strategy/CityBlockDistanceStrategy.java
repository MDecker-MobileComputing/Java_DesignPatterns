package de.mide.patterns.strategy;


/**
 * Strategy for "City Block Distance" (also called "Manhattan Distance").
 */
public class CityBlockDistanceStrategy implements IDistanceStrategy {

	@Override
	public double calculateDistance( Point point1, Point point2 ) {

		double deltaX = point2.x() - point1.x();
		double deltaY = point2.y() - point1.y();
				
		deltaX = Math.abs( deltaX );
		deltaY = Math.abs( deltaY );
		
		return deltaX + deltaY;
	}
}
