package de.mide.patterns.structural.composite.calcweight;


/**
 * A indivisible component can be considered of the leaf
 * of the tree representing the composite component.
 */
public class IndivisibleComponent extends AbstractComponent {
	
	/**
	 * Create new indivisible component.
	 * 
	 * @param name Name of the component, e.g., "left screw"
	 * 
	 * @param weightInGrams Weight of the component in grams,
	 *                      must be greater than zero
	 */
	public IndivisibleComponent( String name, int weightInGrams ) {
		
		super( name, weightInGrams );
	} 
}
