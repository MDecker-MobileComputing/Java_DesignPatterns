package de.mide.patterns.command.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The composition itself does have no weight, i.e., it is
 * not a physical objects, but only a logical objects
 * that contains several components.
 */
public class Compositum extends AbstractComponent {

	private ArrayList<AbstractComponent> _componentList = new ArrayList<>( 5 );
	
	/**
	 * Create new composition consisting of pieces.
	 * 
	 * @param name Name of the Composition, e.g., "gear".
	 */
	public Compositum( String name ) {
		
		super( name );
	}

		
	public void addComponent( AbstractComponent newComponent ) {
						
		_componentList.add( newComponent );
	}
	
	
	/**
	 * Calculate total weight.
	 * 
	 * @return Weight of all parts of the compositum in grams
	 */
	public int getWeight() {
		
		int weightSum = 0;
		
		Iterator<AbstractComponent> iterator = _componentList.iterator();
		
		while( iterator.hasNext() ) {
			
			weightSum += iterator.next().getWeight();
		}
		
		return weightSum;
	}
	
	
	@Override
	public String toString() {
		
		return String.format( "Total weight of \"%s\": %d grams", 
							   getName(), getWeight() );
	}
}
