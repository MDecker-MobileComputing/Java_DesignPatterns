package de.mide.patterns.behavioral.strategy;


/**
 * Interface for different strategies to calculate the distance
 * between two points. 
 */
public interface IDistanceStrategy {
	
	
	/**
	 * Calculate the distance between two points.
	 * 
	 * @param point1 First point
	 * 
	 * @param point2 Second Point
	 * 
	 * @return Distance between {@code point1} und {@code point2}
	 */
	public double calculateDistance( Point point1, Point point2 );	
}
