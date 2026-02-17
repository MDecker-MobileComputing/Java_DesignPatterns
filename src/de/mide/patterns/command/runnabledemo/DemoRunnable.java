package de.mide.patterns.command.runnabledemo;

public class DemoRunnable {
	 	
	public static void main( String[] args ) throws InterruptedException {
		
		System.out.println();
		
		// define the command
		final Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println( "\nCommand was executed." );
			}
		};
	
		
		final int numberOfSeconds = 2;
		System.out.println( "Waiting for " + numberOfSeconds + " seconds ...");
		Thread.sleep( numberOfSeconds * 1_000 );
		
		runnable.run();
		
		System.out.println( "\nProgram finished" );
	}
	
}