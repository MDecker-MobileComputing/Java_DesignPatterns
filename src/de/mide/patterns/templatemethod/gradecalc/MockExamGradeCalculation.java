package de.mide.patterns.templatemethod.gradecalc;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.util.Optional.empty;

import java.util.Optional;


/**
 * Grade calculation for "Mock Exams" (in German: Scheinklausur):
 * The grade does not count towards the final certificate; it is only 
 * a matter of passing (with at least 50% of points) or failing.   
 * <br><br>
 * 
 * Generous calculation: If individual values and average 
 * values are not whole points, they are rounded up to the
 * next full number.
 */
public class MockExamGradeCalculation extends AbstractGradeCalculation {

	
	/**
	 * Checks if {@code pointsArray} has at least two entries and
	 * all values are in the range of 0.0 and 100.0.
	 *
	 * @param pointsArray Array of points to be checks 
	 * 
	 * @return Optional will be empty if no error was found, but
	 *         will contain error message 
	 */
	@Override
	protected Optional<String> checkInput( double[] pointsArray ) {

		final int numberOfValues = pointsArray.length; 
		
		if ( numberOfValues < 2 ) {
			
			return Optional.of( 
					"Number of point values is less than 2: " + 
			        numberOfValues );
		}
		
		for ( int i = 0; i < pointsArray.length; i++ ) {
						
			double value = pointsArray[i];
			
			if ( value < 0.0 || value > 100.0 ) {
				
				final String errorMessage = String.format(  
						"Point value %d outside of range [0.0, 100.0]: %.2f", 
						i+1, value ); 								 
				
				return Optional.of( errorMessage ); 						    						 
			}
		}
		
		return empty();
	}

	
	/**
	 * Helper method:
	 * Round up {@code value} to the next full value
	 * if not already a full value.
	 * <br><br>
	 * 
	 * Example: {@code 10.1} will become {@code 11.0},
	 * but {@code 12.0} will stay {@code 12.0}. 
	 * 
	 * @param value Value that might have to be rounded
	 *              up
	 * 
	 * @return Same as input value or rounded up.
	 */
	private double roundUp( double value ) {
		
		// Instead of the simple comparison value==floor(value)
		// we check if the delta value is below a small value  
		// ("epsilon"), so the comparison also works for small  
		// rouding errors which can occur in floating point 
		// operations   
		
		final double delta = Math.abs( value - floor( value ) );
		
        if ( delta < 0.0001 ) {
        	
        	return value;
        		        	
        } else {
        	
        	return ceil( value );
        }
	}
	
	
	/**
	 * Rounding up points which are not full points (i.g., not ending
	 * with {@code .0}), e.g., {@code 10.3} will become {@code 11.0}.
	 * 
	 * @param pointsArray Array of point values to be preprocessed, 
	 *                    won't be changed
	 *                    
	 * @return Preprocessed array with rounded up point values 
	 */
	@Override
	protected double[] preprocessPoints( double[] pointsArray ) {
		
	    final double[] resultArray = new double[ pointsArray.length ];
	    
	    for ( int i = 0; i < pointsArray.length; i++ ) {
	    	
	    	double value = pointsArray[ i ];
	        
	        resultArray[i] = roundUp( value );
	    }
	    
	    return resultArray;
	}

	
	/**
	 * Calculate average value of points. 
	 *
	 * @param pointsArray Input array of points for calculation  
	 *                    of average value
	 * 
	 * @return Average point value; will be rounded up if not
	 *         a full point value.
	 */
	@Override
	protected double calculateAverage( double[] pointsArray ) {

		double sum = 0.0;
		
		for ( double point : pointsArray ) {
			
			sum += point;
		}
		
		double average = sum / pointsArray.length;
		
		return roundUp( average );
	}

	
	/**
	 * Determine final grade: "Passed" or "Failed".
	 * 
	 * @param averagePoints Average points value to be evaluated. 
	 * 
	 * @return Final grade: "Passed" for at least 50.0 points, 
	 *         "Failed" otherwise; example output: "Pass (65.0 %)".
	 */
	@Override
	protected String averagePoints2FinalGrade( double averagePoints ) {
		
		if ( averagePoints >= 50.0 ) { 
			
			return "Pass (" + averagePoints + " %)";
			
		} else {
			
			return "Failed (" + averagePoints + " %)";			
		}		
	}
}
