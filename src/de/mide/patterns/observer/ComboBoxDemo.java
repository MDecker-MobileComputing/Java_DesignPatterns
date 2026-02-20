package de.mide.patterns.observer;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



@SuppressWarnings("serial")
public class ComboBoxDemo extends JFrame {

	final JLabel _label = new JLabel( "Lorem Ipsum", SwingConstants.CENTER );
	
	/**
	 * Constructor, set ups the UI.
	 */
	public ComboBoxDemo() {
		
		final Container container = getContentPane();
		
		final String[] optionsArray = { "Small", "Medium", "Large" };
		final JComboBox<String> comboBox = new JComboBox<>( optionsArray );
		
		container.setLayout( new GridLayout( 0, 1 ) );
		container.add( comboBox );
		container.add( _label );
	}
	
	/**
	 * Entrance method 
	 * 
	 * @param args Not evaluated
	 */
	public static void main( String[] args ) {
		
		ComboBoxDemo comboBoxDemo = new ComboBoxDemo();
		comboBoxDemo.setSize( 500, 150 );
		comboBoxDemo.setTitle( "ComboBoxDemo" );
		comboBoxDemo.setVisible( true );
		comboBoxDemo.setLocation( 300, 300 );
		comboBoxDemo.setDefaultCloseOperation( EXIT_ON_CLOSE );
	}
	
}
