package de.mide.patterns.factory.pizzas;

import java.util.ArrayList;
import java.util.List;


/**
 * Abstract superclass for pizzas. Since this class is abstract, no
 * objects can be created from it, it is to be used as superclass.
 */
public abstract class AbstractPizza {
	
	/** Standard diameter for pizza in USA. */
	public static final int DIAMETER_CENTIMETRES_USA = 36;
	
	/** Standard diameter for pizza in Germany. */
	public static final int DIAMETER_CENTIMETRES_GERMANY = 30;

	/** Name of the Pizza, e.g., "Hawaiian pizza (USA)" */
	private String _name; 
	
	/** Diameter of Pizza in Centimetres. */
	private int _diameterCm;
	
	/** List of toppings, e.g., Mozzarella (cheese), Salami (sausage). */
	private List<String> _toppingsArray = new ArrayList<>( 10 );
	
	
	/**
	 * Create a new pizza.
	 * 
	 * @param name Name of the pizza, e.g., "Pizza Quattro Formaggi (DE)"
	 * 
	 * @param diameterCm Diameter of pizza in Centimetres.
	 * 
	 * @param toppings Varargs of toppings, e.g., Pineapple, tomato sauce
	 */
	public AbstractPizza( String name, int diameterCm, String... toppings ) {
		
		_name       = name;
		_diameterCm = diameterCm;
		
	    for( String topping : toppings ) {
	    	
	        _toppingsArray.add( topping );
	    }
	}
	
	
	/**
	 * Returns a string with a summary of the calling object,
	 * e.g., name of pizza and toppings.
	 * 
	 * @return Description of pizza
	 */
	@Override
	public String toString() {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append( _name ).append( ", diameter=" ).append( _diameterCm ).append( " cm; ");
		
		sb.append( " toppings: " ).append( _toppingsArray );
		
		return sb.toString();
	}
	
	public void prepare() {
		
		System.out.println( _name + " is prepared ..." );
	}
	
	public void bake() {
		
		System.out.println( _name + " is being baked ..." );
	}
	
	public void cut() {
		
		System.out.println( _name + " is being cut ..." );
	}
}
