package de.mide.patterns.structural.proxy;

import java.util.HashMap;


/**
 * This proxy for subjects implementing interface {@link ICalculation}
 * will cache the result of expensive calculations. 
 */
public class CalculationProxy implements ICalculation {

	/** Subject for which the object of this class acts as "proxy". */
	private ICalculation _calcEngine = null;
	
	/** 
	 * This hash map acts as cache for the results of expensive
	 * calculations. It maps strings (keys) to the calculation results.
	 * The keys are constructed by putting an "_" between the two
	 * input numbers a and b.
	 * Example: the key for a=123 and b=234 would be "123_234".
	 */
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
	 * 
	 * @param Input parameter A for calculation
	 * 
	 * @param Input parameter B for calculation
	 * 
	 * @return Result of calculation 
	 */
	@Override
	public int cheapCalculation( int a, int b ) {

		return _calcEngine.cheapCalculation( a , b );
	}

	
	/**
	 * Results for expensive calculation are cached.
	 *
	 * @param Input parameter A for calculation
	 * 
	 * @param Input parameter B for calculation
 
	 * @return Result of calculation, might be obtained from cache
	 */
	@Override
	public int expensiveCalculation( int a, int b ) {
	
		final String cacheKey = "" + a + "_" + b;
		if ( _expensiveCalcCache.containsKey( cacheKey ) ) {
			
			// cache hit: return result from cache
			return _expensiveCalcCache.get( cacheKey );
			
		} else { // cache miss
			
			final int expensiveResult = 
					_calcEngine.expensiveCalculation( a , b );
			
			_expensiveCalcCache.put( cacheKey, expensiveResult );
			
			return expensiveResult;
		}
	}
}
