package de.mide.patterns.structural.facade.component;


/**
 * Controller for the display.
 */
public class ScreenController {

	/** Custom enumeration type with different states for a screen/display. */
	public enum ScreenState { ON, OFF, STANDBY };
	
	
	/**
	 * Set state of the screen: on, off, standby.
	 * In standby the screen will start faster when
	 * switched to on, but also needs a bit of 
	 * electricity.
	 *  
	 * @param state {@link ScreenState#ON}, 
	 *              {@link ScreenState#OFF}, 
	 *              {@link ScreenState#STANDBY}
	 */
	public void setState( ScreenState state ) {
		
		System.out.println( "[Screen] State=" + state );
	}
}
