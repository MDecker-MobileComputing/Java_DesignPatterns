package de.mide.patterns.structural.proxy;

import java.util.HashMap;

/**
 * This proxy for subjects implementing interface {@link ICalculation}
 * will cache the result of expensive calculations. 
 */
public class CalculationProxy implements ICalculation {

	/** Subject for which the object of this class acts as "proxy". */
	private ICalculation _calcEngine = null;
	
	private HashMap<String, Integer> _expensiveCalcCache = new HashMap<>();  
	
	/**
	 * Constructor
	 * 
	 * @param calc Object to be "proxied"
	 */
	public CalculationProxy( ICalculation calc ) {
		
		_calcEngine = calc;
	}
	
	
	/**
	 * Results for cheap calculation are not to be cached.
	 */
	@Override
	public int cheapCalculation( int a, int b ) {

		return _calcEngine.cheapCalculation( a , b );
	}

	/**
	 * Results for expensive calculation are cached.
	 */
	@Override
	public int expensiveCalculation(int a, int b) {
	
		final String cacheKey = "" + a + "_" + b;
		if ( _expensiveCalcCache.containsKey( cacheKey ) ) { // cache hit?
			
			return _expensiveCalcCache.get( cacheKey );
			
		} else { // cache miss
			
			final int expensiveResult = _calcEngine.expensiveCalculation( a , b );
			
			_expensiveCalcCache.put( cacheKey, expensiveResult );
			
			return expensiveResult;
		}
	}
}
