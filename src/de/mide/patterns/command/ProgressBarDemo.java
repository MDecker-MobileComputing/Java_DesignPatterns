package de.mide.patterns.command;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;


@SuppressWarnings("serial")
public class ProgressBarDemo extends JFrame implements ActionListener {
	
	private static final int MAX_PROGRESS_VALUE = 20;
	
	private final JButton _startButton = new JButton( "Start" );
	
	private final JProgressBar _progressBar = new JProgressBar( 0, MAX_PROGRESS_VALUE );
	
	
	/**
	 * Constructor, sets up the user interface.
	 */
	public ProgressBarDemo() {
		
		_startButton.addActionListener( this );
				
		_progressBar.setValue( 0 );
		_progressBar.setStringPainted( true ); // display value
		
		final Container container = getContentPane();
		
		container.setLayout( new GridLayout( 0, 1 ) );
		container.add( _startButton );
		container.add( _progressBar );				
	}
	
	
	/** Inner class to simulate a calculation needing several seconds. */
	class BackgroundThread extends Thread {
		
		@Override
		public void run() {
			
			for ( int progress = 1; progress <= MAX_PROGRESS_VALUE; progress++ ) {
				 
				final int currentProgress = progress; 
				
				SwingUtilities.invokeLater( new Runnable() {

					@Override
					public void run() { _progressBar.setValue( currentProgress ); }
				});
												
				try {
					Thread.sleep( 100 ); // sleep 100ms
				}
				catch ( InterruptedException ex ) {}
			}
			
			SwingUtilities.invokeLater( new Runnable() {

				@Override
				public void run() { _startButton.setEnabled( true ); }
			});			
			
		}				
		
	} // end of class BackgroundThread
	
	
	/**
	 * Event handler for start button.
	 */
	public void actionPerformed( ActionEvent e ) {
		
		// still in main thread, we can directly change the UI
		_progressBar.setValue( 0 );
		_startButton.setEnabled( false );
		
		new BackgroundThread().start();
	}	


	
	
	/**
	 * Entrance method 
	 * 
	 * @param args Not evaluated
	 */
	public static void main( String[] args ) {
		
		ProgressBarDemo progressBarDemo = new ProgressBarDemo();
		progressBarDemo.setSize( 500, 150 );
		progressBarDemo.setTitle( "ProgressBarDemo" );
		progressBarDemo.setVisible( true );
		progressBarDemo.setLocation( 300, 300 );
		progressBarDemo.setDefaultCloseOperation( EXIT_ON_CLOSE );
	}
	
}