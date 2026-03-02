package de.mide.patterns.behavioral.templatemethod;

import de.mide.patterns.behavioral.templatemethod.gradecalc.AbstractGradeCalculation;
import de.mide.patterns.behavioral.templatemethod.gradecalc.MockExamGradeCalculation;
import de.mide.patterns.behavioral.templatemethod.gradecalc.StandardExamGradeCalculation;


/**
 * Test driver for grade calculation.
 */
public class Main {

	private static AbstractGradeCalculation sGradeCalculation = null;
	
	private static int sNumberCalculations = 0;

	
	/**
	 * Entrace method.
	 * 
	 * @param args Not evaluated
	 * 
	 * @throws GradeException Invalid point values passed
	 */
	public static void main( String[] args ) throws GradeException {

		System.out.println( "\n## Mock Exam ##\n" );
		
		sGradeCalculation = new MockExamGradeCalculation();

		perform( new double[]{ 60.0, 70.0 } );
		
		perform( new double[]{ 49.5, 49.0 } );
		
		perform( new double[]{ 90.0, 0.0 } );
		
		perform( new double[]{ 60.0 } );        // invalid input: only one value
		
		perform( new double[]{ 10.0, 110.0 } ); // invalid input: 2nd value too big
		
		perform( new double[]{ -5.0, 90.0 } );  // invalid input: 1st value too small		
		
		
		System.out.println( "\n\n## Standard Exam ##\n" );
					
		sGradeCalculation = new StandardExamGradeCalculation();
		sNumberCalculations = 0;
		
		perform( new double[]{ 100.0 } );
		
		perform( new double[]{ 100.0, 90.0 } );
		
		perform( new double[]{ 25.0, 30.5 } );
		
		perform( new double[]{ 110.0, 63.0, 50.0 } );
		
		perform( new double[]{ 90.5, -1.0, 50.0 } ); // invalid input: 2nd grade is negative
		
		System.out.println();
	}
	
	
	/**
	 * Performs a single grade calcuation and writes result to STDOUT. 
	 * 
	 * @param pointsArray array of points
	 */
	private static void perform( double[] pointsArray ) {
		
		sNumberCalculations++;
		
		try {
		
			 final String finalGrade = 
					 	sGradeCalculation.pointsToGrade( pointsArray );
			 
			 System.out.println( "Grade " + sNumberCalculations + ": " + 					  
			                     finalGrade ); 					 
			 
			 System.out.println();
		}
		 catch ( GradeException ex ) {
			 
			 System.out.println( 
					 "Error for grade " + sNumberCalculations + ": " + 			          
				     ex.getMessage() );
		 }
	}
}
