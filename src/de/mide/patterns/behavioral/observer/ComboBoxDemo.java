package de.mide.patterns.behavioral.observer;

import static java.awt.Font.PLAIN;
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


/**
 * Class for named font sizes.
 * 
 * Objects of this class are to be used as entries in the ComboBox. 
 * Each object contains a font (only the font size is different) 
 * and the name of the font size for displaying. 
 */
class FontSizeAndName {
	
	/** Arial font with particular size. */
	private Font _font = null;
	
	/** Name of font size to be shown in ComboBox. */
	private String _displayName = null;
	
	
	/**
	 * Constructor to create new named font size.
	 * 
	 * @param displayName Displaying name of font size in ComboBox
	 * 
	 * @param fontSize Font size
	 */
	public FontSizeAndName( String displayName, int fontSize ) {

		_displayName = displayName;
		
		_font = new Font( "Arial", PLAIN, fontSize );
	}
	 
	/**
	 * Getter for font with particular font size.
	 */
	public Font getFont() { return _font; }
	
	/** 
	 * String returned by this method is used as ComboBox entry.
	 */ 
	@Override
	public String toString() { return _displayName; }
}


// ---------------------------------------------------------------------


/**
 * The program shows a UI, in which a font size can be selected from a
 * ComboBox. The selected font size is applied to the text shown below
 * the ComboBox.
 */
@SuppressWarnings("serial")
public class ComboBoxDemo extends JFrame {
	
	/** ComboBox with different font sizes; the subject for the observer pattern. */
	private JComboBox<FontSizeAndName> _comboBox = null;

	/** Label with text for which the font size can be selected. */
	private JLabel _label = null;
	
	
	/**
	 * Constructor, set ups the UI.
	 */
	public ComboBoxDemo() {
		
		final FontSizeAndName[] optionsArray = {
				new FontSizeAndName( "Tiny"  , 10 ),
				new FontSizeAndName( "Small" , 15 ),
				new FontSizeAndName( "Medium", 20 ),
				new FontSizeAndName( "Large" , 25 ),
				new FontSizeAndName( "Huge"  , 30 )
		};
		_comboBox = new JComboBox<>( optionsArray );
		
		JPanel fontSizePanel = new JPanel();
		fontSizePanel.add( new JLabel( "Font Size: " ) );
		fontSizePanel.add( _comboBox );
		
		_label = new JLabel( "Lorem Ipsum", CENTER );
				
		final Container container = getContentPane();
		
		container.setLayout( new GridLayout( 0, 1 ) );
		container.add( fontSizePanel );
		container.add( _label );
		
		ComboBoxObserver cbo = new ComboBoxObserver();
		_comboBox.addItemListener( cbo );
		
		_comboBox.setSelectedIndex( 1 );
	}
	

	/**
	 * Inner Class for event handler (=observer) for
	 * state changes of ComboBox.
	 */
	private class ComboBoxObserver implements ItemListener {
		
		@Override
		public void itemStateChanged( ItemEvent event ) {
			
			if ( event.getStateChange() == SELECTED ) {
			
				FontSizeAndName newFontAndName = 
						(FontSizeAndName) event.getItem();
				
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
		comboBoxDemo.setTitle( "ComboBox Demo" );
		comboBoxDemo.setVisible( true );
		comboBoxDemo.setLocation( 300, 300 );
		comboBoxDemo.setDefaultCloseOperation( EXIT_ON_CLOSE );
	}
	
}
