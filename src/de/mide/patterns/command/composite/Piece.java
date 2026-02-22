package de.mide.patterns.command.composite;

/**
 * A "piece" does not have further parts.
 */
public class Piece extends AbstractComponent {

	/** Weight of the piece grams, must be greater than 0. */
	private int _weight = 0;
	
	
	/**
	 * Create new "atomic" piece that cannot be further divided.
	 * 
	 * @param name Name of the piece, e.g., "bottom plate"
	 * 
	 * @param weight Weight of the piece in grams
	 * 
	 * @throws CompositeException {@code weight} was less then 1 unit
	 */
	public Piece( String name, int weight ) throws CompositeException {
		
		super( name );
		
		if ( weight < 1 ) {
			
			throw new CompositeException( 
				"Illegal weight \"" + weight + "\" for piece \"" + name + "\"" );		
		}			 
		
		_weight = weight;
	}
		
	/**
	 * Getter for weight of the piece.
	 * 
	 * @return Weight in grams.
	 */
	@Override
	public int getWeight() {
		
		return _weight;
	}		 
}
