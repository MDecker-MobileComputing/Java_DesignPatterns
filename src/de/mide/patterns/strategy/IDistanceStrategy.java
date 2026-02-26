package de.mide.patterns.strategy;


/**
 * Interface for different strategies to calculate the distance
 * between two points. 
 */
public interface IDistanceStrategy {
	
	public double calculateDistance( Point point1, Point point2 );	
}
