package de.mide.patterns.structural.composite.calcweight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Composite component (compositum).
 */
public class CompositeComponent extends AbstractComponent {

	/** 
	 * List of all components (either indivisible components or composite components. 
	 * The list will be enlarged automatically if needed.
	 */
	private List<AbstractComponent> _componentList = new ArrayList<>( 5 );
	
	
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
	 * Getter for number of components belonging to the calling
	 * composite component. 
	 * 
	 * @return Number of components
	 */
	public int getNumOfComponents() {
		
		return _componentList.size();
	}
	
	
	/**
	 * Getter for list of components belonging to the calling
	 * composite component.
	 *  
	 * @return List of components
	 */
	public List<AbstractComponent> getComponents() {
		
		return _componentList;
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
			
			AbstractComponent comp = iterator.next();
			weightSum += comp.getWeight();
		}
		
		return weightSum;
	}
}
