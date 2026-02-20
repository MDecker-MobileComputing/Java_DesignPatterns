package de.mide.patterns.observer;

import static java.awt.event.ItemEvent.SELECTED;
import static javax.swing.SwingConstants.CENTER;


import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class FontAndName {
	
	private Font _font = null;
	
	private String _name = null;
	
	public FontAndName( String name, int fontSize ) {

		_name = name;
		
		_font = new Font( "Arial", Font.PLAIN, fontSize );
	}
	
	public Font getFont() { return _font; }
	
	@Override
	public String toString() { return _name; }
}


@SuppressWarnings("serial")
public class ComboBoxDemo extends JFrame {

	private JLabel _label = null;
	
	private JComboBox<FontAndName> _comboBox = null;
	
	
	
	/**
	 * Constructor, set ups the UI.
	 */
	public ComboBoxDemo() {
		
		final Container container = getContentPane();
		
		final FontAndName[] optionsArray = { 
				new FontAndName( "Small" , 10 ),
				new FontAndName( "Medium", 15 ),
				new FontAndName( "Large" , 25 ),
				new FontAndName( "Huge"  , 35 )
		};
		_comboBox = new JComboBox<>( optionsArray );
		
		_label = new JLabel( "Lorem Ipsum", CENTER );
		
		JPanel fontSizePanel = new JPanel();
		fontSizePanel.add( new JLabel( "Font Size: ") );
		fontSizePanel.add( _comboBox );
		
		container.setLayout( new GridLayout( 0, 1 ) );
		container.add( fontSizePanel );
		container.add( _label );
		
		ComboBoxObserver cbo = new ComboBoxObserver();
		_comboBox.addItemListener( cbo );
		
		_comboBox.setSelectedIndex( 1 );
	}
	

	private class ComboBoxObserver implements ItemListener {
		
		@Override
		public void itemStateChanged( ItemEvent event ) {
			
			if ( event.getStateChange() == SELECTED ) {
			
				FontAndName newFontAndName = (FontAndName) event.getItem();
				
				Font newFont = newFontAndName.getFont();
				_label.setFont( newFont );
			}			
		}
	}
	
	
	/**
	 * Entrance method 
	 * 
	 * @param args Not evaluated
	 */
	public static void main( String[] args ) {
		
		ComboBoxDemo comboBoxDemo = new ComboBoxDemo();
		comboBoxDemo.setSize( 500, 250 );
		comboBoxDemo.setTitle( "ComboBoxDemo" );
		comboBoxDemo.setVisible( true );
		comboBoxDemo.setLocation( 300, 300 );
		comboBoxDemo.setDefaultCloseOperation( EXIT_ON_CLOSE );
	}
	
}
