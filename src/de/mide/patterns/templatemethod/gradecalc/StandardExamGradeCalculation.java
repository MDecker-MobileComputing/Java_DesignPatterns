package de.mide.patterns.templatemethod.gradecalc;

import static java.lang.String.format;
import static java.math.RoundingMode.HALF_UP;
import static java.util.Optional.empty;

import java.math.BigDecimal;
import java.util.Optional;


/**
 * Grade calculation for an ordinary exam. 
 * Point values greater than 100.0% are allowed because of possible
 * bonus points; however, points greater than 100.0% won't be 
 * considered.
 */
public class StandardExamGradeCalculation extends AbstractGradeCalculation {

	/**
	 * Check if {@code pointsArray} has at least one entry and that
	 * all these values are greater than 0.0. This allows bonus points,
	 * e.g., 110.0% would be a valid point value.
	 * 
	 * @param pointsArray Array of points to be checks 
	 * 
	 * @return Optional will be empty if no error was found, but
	 *         will contain error message 
	 */
	@Override
	protected Optional<String> checkInput( double[] pointsArray ) {

		final int numberOfValues = pointsArray.length; 
		
		if ( numberOfValues < 1 ) {
			
			return Optional.of( 
					"Number of point values is less than 1: " + 
			        numberOfValues );
		}
		
		for ( int i = 0; i < pointsArray.length; i++ ) {
						
			double value = pointsArray[i];
			
			if ( value < 0.0  ) {
				
				final String errorMessage = format(  
						"Point value %d less than 0.0: %.2f", 
						i, value ); 								 
				
				return Optional.of( errorMessage ); 						    						 
			}
		}
		
		return empty();
	}

	
	/**
	 * If a value is more than 100.0 (because of bonus points) 
	 * it will be reduced to 100.0.
	 * 
	 * @param pointsArray Array of points value to be processed
	 * 
	 * @return Array with points that won't contain values
	 *         bigger than 100.0
	 */
	@Override
	protected double[] preprocessPoints( double[] pointsArray ) {

	    final double[] resultArray = new double[ pointsArray.length ];
	    
	    for ( int i = 0; i < pointsArray.length; i++ ) {
	    	
	    	double value = pointsArray[ i ];
	        
	    	if ( value > 100.0 ) {
	    	
	    		resultArray[i] = 100.0;
	    				
	    	} else {
	    	
	    		resultArray[i] = value;
	    	}
	    }
	    
	    return resultArray;
	}

	
	/**
	 * Calculate average value of points. 
	 *
	 * @param pointsArray Input array of points for calculation  
	 *                    of average value
	 * 
	 * @return Average point value (not rounded)
	 */	
	@Override
	protected double calculateAverage( double[] pointsArray ) {

		double sum = 0.0;
		
		for ( double point : pointsArray ) {
			
			sum += point;
		}
		
		double average = sum / pointsArray.length;
		
		return average;
	}

	
	/**
	 * Calculation of final grade (number and text).
	 * Grade will have at most one decimal point with
	 * rounding "half up" (round to neared).
	 * Examples: "2.25" will be rounded to "2.3",
	 * "2.24" will be rounded to "2.2". 
	 * The best grade is "1.0", the worst "5.0".
	 * 
	 * @return Final grade, e.g., "3.0 (satisfactory)". 
	 */
	@Override
	protected String averagePoints2FinalGrade( double averagePoints ) {

		final double gradeOriginal = -3.0/50 * averagePoints + 7;
		
		// truncate all decimals but the first one 
		final BigDecimal bigDecimal = new BigDecimal( gradeOriginal );
		double gradeRounded = bigDecimal.setScale( 1, HALF_UP ).doubleValue();		 
		
		if ( gradeRounded > 5.0 ) { gradeRounded = 5.0; }
		
		String gradeText = "";
        if ( gradeRounded <= 1.5 ) {
        	
        	gradeText = "Excellent";
            
        } else if ( gradeRounded <= 2.5 ) {
        	
        	gradeText = "Good";
            
        } else if ( gradeRounded <= 3.5 ) {
        	
        	gradeText = "Satisfactory";
            
        } else if ( gradeRounded <= 4.5 ) {
        	
        	gradeText = "Sufficient";
            
        } else {
        	
        	gradeText = "Insufficient";
        }		
				
		return gradeRounded + " (" + gradeText + ")";
	}
}
