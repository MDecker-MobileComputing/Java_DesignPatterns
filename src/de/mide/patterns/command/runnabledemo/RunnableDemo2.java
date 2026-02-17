package de.mide.patterns.command.runnabledemo;


class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		
		for ( int i = 1; i <= 5; i++ ) {
			
			try {
				Thread.sleep( 500 ); // wait for half a second
				
				System.out.println( "MyRunnable: " + i );
			}
			catch ( InterruptedException ex ) {} 			
		}
	}
} 

public class RunnableDemo2 {
	 	
	public static void main( String[] args )  {
		
		System.out.println( "\nProgram started" );
		
		
		MyRunnable myRunnable = new MyRunnable(); 
		
		Thread thread = new Thread( myRunnable );
		
		thread.start();
		
		System.out.println( "\nProgram finished\n" );
	}
	
}