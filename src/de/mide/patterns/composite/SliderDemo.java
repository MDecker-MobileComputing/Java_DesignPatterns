package de.mide.patterns.composite;

import static java.awt.Font.PLAIN;
import static javax.swing.SwingConstants.CENTER;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


@SuppressWarnings("serial")
public class SliderDemo extends JFrame implements ChangeListener {

	/** Label with caption for Slider. */
	private JLabel _fontSizeLabel   = null;
	
	/** Label with sample text whose font size is changed. */
	private JLabel _loremIpsumLabel = null;
	
	/** Slider to choose font size. */
	private JSlider _slider = null;
	
	
	/**
	 * Constructor, sets up the user interface.
	 */
	public SliderDemo() {
												
		_fontSizeLabel   = new JLabel( "Font Size: " );
		_loremIpsumLabel = new JLabel( "Lorem Ipsum", CENTER ); 
		
		_slider = new JSlider( 5, 35, 15 ); // min, max, value
				
		JPanel fontSizePanel = new JPanel();
		fontSizePanel.add( _fontSizeLabel );
		fontSizePanel.add( _slider );
		
		JPanel wholePanel = new JPanel();					
		wholePanel.setLayout( new GridLayout( 0, 1 ) );
		wholePanel.add( fontSizePanel );
		wholePanel.add( _loremIpsumLabel );
				
		Container container = getContentPane();
		container.add( wholePanel, BorderLayout.CENTER );
		
		_slider.addChangeListener( this );
		stateChanged( null );
	}
	

	/**
	 * Implementation of the only method from {@code ChangeListener}.
	 * This method is called when the slide value was changed.
	 * The new value is used as font size for the label.
	 */
	@Override
	public void stateChanged( ChangeEvent event ) {
		
		int sliderValue = _slider.getValue();
		
		Font font = new Font( "Arial", PLAIN, sliderValue );
		_loremIpsumLabel.setFont( font );
	}
	
	
	/**
	 * Entrance method.
	 * 
	 * @param args Not evaluated
	 */
	public static void main( String[] args ) {
		
		SliderDemo sliderDemo = new SliderDemo();
		sliderDemo.setSize( 500, 150 );
		sliderDemo.setTitle( "Slider Demo" );
		sliderDemo.setVisible( true );
		sliderDemo.setLocation( 300, 300 );
		sliderDemo.setDefaultCloseOperation( EXIT_ON_CLOSE );		
	}
}
