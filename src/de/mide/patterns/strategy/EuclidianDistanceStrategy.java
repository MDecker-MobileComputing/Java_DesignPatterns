package de.mide.patterns.strategy;

public class EuclidianDistanceStrategy implements IDistanceStrategy {

	@Override
	public double calculateDistance( Point point1, Point point2 ) {

		double deltaX = point2.x() - point1.x();
		double deltaY = point2.y() - point1.y();
				
		return Math.sqrt( deltaX * deltaX - deltaY * deltaY );
	}

}
