package de.mide.patterns.command.composite;


public abstract class AbstractComponent {

	private String _name;
	
	public AbstractComponent( String name ) {
		
		_name = name;
	}
	
	public String getName() {
		
		return _name;
	}
	
	/**
	 * Getter for weight
	 * 
	 * @return Weight in grams
	 */
	public abstract int getWeight();		
}
