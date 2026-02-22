package de.mide.patterns.command.composite;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Composite component (compositum).
 */
public class CompositeComponent extends AbstractComponent {

	/** List of all components (either indivisible components or composite components. */
	private ArrayList<AbstractComponent> _componentList = new ArrayList<>( 5 );
	
	
	/**
	 * Create new composite component.
	 * 
	 * @param name Name of the Composition, e.g., "gear".
	 * 
	 * @param weightInGrams Weight of the compositum itself, but
	 *                      not of its sub-components; might be
	 *                      zero when the compositum itself is
	 *                      a logical object
	 */
	public CompositeComponent( String name, int weightInGrams ) {
		
		super( name, weightInGrams );
	}
	
	
	/**
	 * Convenience constructor for a logical compositum that
	 * has a weight of 0 grams.
	 * 
	 * @param name Name of logical compositum
	 */
	public CompositeComponent( String name ) {
		
		super( name, 0 );
	}

	
	/**
	 * Add component to compositum: This might be either an
	 * indivisible component or and further composite component.
	 * 
	 * @param newComponent Component to be added
	 */
	public void addComponent( AbstractComponent newComponent ) {
						
		_componentList.add( newComponent );
	}
	
	
	/**
	 * Calculate total weight.
	 * 
	 * @return Sum of the composite component's weight and
	 *         all its subcomponents
	 */
	@Override
	public int getWeight() {
		
		int weightSum = _weightInGrams;
		
		Iterator<AbstractComponent> iterator = 
							_componentList.iterator();
		
		while( iterator.hasNext() ) {
			
			weightSum += iterator.next().getWeight();
		}
		
		return weightSum;
	}
}
