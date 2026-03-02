package de.mide.patterns.behavioral.command.runnabledemo;


/**
 * Very basic example for usage of interface {@code java.lang.Runtime}, 
 * which is Java's interface for the design pattern "Command".   
 */
public class RunnableDemo1 {
	 	
	/**
	 * Main method: Defines simple command that is executed after 
	 * a few seconds.
	 * 
	 * @param args Is not evaluated
	 * 
	 * @throws InterruptedException Might be thrown by {@code Thread.sleep()}
	 */
	public static void main( String[] args ) throws InterruptedException {
		
		System.out.println();
		
		// define the command by implement interface Runnable
		final Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println( "\nCommand was executed." );
			}
		};
	
		
		final int numberOfSeconds = 2;
		System.out.println( "Waiting for " + numberOfSeconds + " seconds ..." );
		Thread.sleep( numberOfSeconds * 1_000 );
		
		runnable.run();
		
		System.out.println( "\nProgram finished" );
	}
	
}