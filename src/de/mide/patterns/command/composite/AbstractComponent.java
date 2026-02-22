package de.mide.patterns.command.composite;


public abstract class AbstractComponent {

	/** Name of composite or piece. */
	private String _name;
	
	
	/**
	 * Constructor for creation of new component.
	 * 
	 * @param name Name of component, e.g., "electric engine"
	 */
	public AbstractComponent( String name ) {
		
		_name = name;
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
	public abstract int getWeight();		
}
