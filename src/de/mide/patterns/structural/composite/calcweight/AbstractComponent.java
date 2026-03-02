package de.mide.patterns.structural.composite.calcweight;


/**
 * Abstract super-class for the objects in the hierarchy tree.
 */
public abstract class AbstractComponent {

	/** Name of composite or piece. */
	private String _name;
	
	/** Weight of indivisible or composite component. */
	protected int _weightInGrams = 0;
	
	
	/**
	 * Constructor for creation of new component, must be
	 * called by constructors of non-abstract sub-classes.
	 * 
	 * @param name Name of component, e.g., "electric engine"
	 * 
	 * @param weightInGrams Weight of composite component or
	 *                      piece
	 */
	public AbstractComponent( String name, int weightInGrams ) {
		
		_name          = name;
		_weightInGrams = weightInGrams;
	}
	
	
	/**
	 * Getter for name of component.
	 * 
	 * @return Name of component, e.g., "housing"
	 */
	public String getName() {
		
		return _name;
	}
	
	
	/**
	 * Getter for total weight of all direct or indirect pieces
	 * and composites.
	 * 
	 * @return Weight in grams
	 */
	public int getWeight() {
		
		return _weightInGrams;
	}
	
	
	/**
	 * Method returns string representation of calling object.
	 * 
	 * @return String with name and weight of calling object
	 */
	@Override
	public String toString() {
		
		return String.format( "Total weight of \"%s\": %d grams", 
							   getName(), getWeight() );
	}
}
