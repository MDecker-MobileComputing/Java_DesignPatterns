package de.mide.patterns.templatemethod;


/**
 * Test driver for grade calculation for a mock exam.
 */
public class MainMockExam {

	private static final AbstractGradeCalculation GRADE_CALCULATOR = 
											new MockExamGradeCalculation();
	
	private static int sNumberCalculations = 0;

	
	/**
	 * Entrace method.
	 * 
	 * @param args Not evaluated
	 * 
	 * @throws GradeException Invalid point values passed
	 */
	public static void main( String[] args ) throws GradeException {

		perform( new double[]{ 60.0, 70.0 } );
		
		perform( new double[]{ 49.5, 49.0 } );
		
		perform( new double[]{ 90.0, 0.0 } );
		
		perform( new double[]{ 60.0 } ); // invalid input: only one value
		
		perform( new double[]{ 10.0, 110.0 } ); // invalid input: 2nd value too big
	}
	
	
	/**
	 * Perform single grade calcuation for a mock exam 
	 * 
	 * @param pointsArray array of points
	 */
	private static void perform( double[] pointsArray ) {
		
		System.out.println();
		
		sNumberCalculations++;
		
		try {
		
			 final String finalGrade = 
					 	GRADE_CALCULATOR.pointsToGrade( pointsArray );
			 
			 System.out.println( 
					 "Grade " + sNumberCalculations + " for mock exam: " + 
			         finalGrade ); 					 
			 
			 System.out.println();
		}
		 catch ( GradeException ex ) {
			 
			 System.out.println( "Exception: " + ex );
		 }
	}
}
