package de.mide.patterns.command.composite;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Composite component.
 */
public class Compositum extends AbstractComponent {

	/** List of all components. */
	private ArrayList<AbstractComponent> _componentList = new ArrayList<>( 5 );
	
	
	/**
	 * Create new composition consisting of pieces.
	 * 
	 * @param name Name of the Composition, e.g., "gear".
	 */
	public Compositum( String name ) {
		
		super( name );
	}
	

	/**
	 * Add component to compositum.
	 * 
	 * @param newComponent Component to be added
	 */
	public void addComponent( AbstractComponent newComponent ) {
						
		_componentList.add( newComponent );
	}
	
	
	/**
	 * Calculate total weight.
	 * 
	 * @return Weight of all parts of the compositum in grams
	 */
	@Override
	public int getWeight() {
		
		int weightSum = 0;
		
		Iterator<AbstractComponent> iterator = _componentList.iterator();
		
		while( iterator.hasNext() ) {
			
			weightSum += iterator.next().getWeight();
		}
		
		return weightSum;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		
		return String.format( "Total weight of \"%s\": %d grams", 
							   getName(), getWeight() );
	}
}
