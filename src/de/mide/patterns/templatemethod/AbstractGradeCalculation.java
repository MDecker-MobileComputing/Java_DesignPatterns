package de.mide.patterns.templatemethod;

import java.util.Optional;

/**
 * Class with template method for calculation of final grade
 * based on an array of point values.
 */
public abstract class AbstractGradeCalculation {
	
	/**
	 * Template method for defining the steps of the algorithm.
	 * This method calls the abstract methods with the implementation
	 * of the actual steps in the right order. 
	 * <br><br>
	 * 
	 * This method has modified {@code final}, so it cannot be
	 * overwritten.
	 * 
	 * @param pointsArray Array of points from which the grade 
	 *                    is to be calculated
	 * 
	 * @return Final grade for {@code pointsArray}
	 * 
	 * @throws GradeException Inconsistency in {@code pointsArray} found.
	 */
	public final String pointsToGrade( double[] pointsArrayInput ) throws GradeException  {
		
		final Optional<String> checkResultOptional = checkInput( pointsArrayInput );
		if ( checkResultOptional.isPresent() ) {
			
			final String errorMessage = checkResultOptional.get();
			throw new GradeException( "Invalid input data: " + errorMessage );
		}
		
		double[] pointsArrayPreprocessed = preprocessPoints( pointsArrayInput );
		
		double pointsAverage = calculateAverage( pointsArrayPreprocessed );
		
		String finalGrade = averagePoints2FinalGrade( pointsAverage );
		
		return finalGrade;
	}

	
	/**
	 * Check if {@code pointsArray} is valid, i.e., has sufficient
	 * length and all values are in the valid range.
	 * 
	 * @param pointsArray Input array to be checked
	 * 
	 * @return {@code Optional} will be empty when no error was found,
	 *         otherwise it will contain error message
	 */
	protected abstract Optional<String> checkInput( double[] pointsArray );

	
	/**
	 * Perform preprocessing of points array, e.g., rounding, removing
	 * worst entry, or normalization.
	 * 
	 * @param pointsArray Array of points to be preprocessed
	 * 
	 * @return Preprocessed array (might be same as input)
	 */
	protected abstract double[] preprocessPoints( double[] pointsArray );
	
	
	/**
	 * Calculate average of preprocessed points; might include rounding
	 * of individual values or result value.
	 * 
	 * @param pointsArray Array of points from which average value is
	 *                    to be calculated
	 * 
	 * @return Average value of {@code pointsArray}
	 */
	protected abstract double calculateAverage( double[] pointsArray );
	
	
	/**
	 * Calculate final mark based on average points. 
	 * 
	 * @param averagePoints Average point value 
	 * 
	 * @return Final mark, e.g., "Passed", "1.3" or "2.3 (good)"
	 */
	protected abstract String averagePoints2FinalGrade( double averagePoints );
}
