package de.mide.patterns.structural.facade.components;


/**
 * Ambient lighting is a soft light source used to illuminate 
 * the walls near a screen or display with colors that match 
 * the currently displayed image.
 */
public class AmbientLighting {

	
	/**
	 * Switch ambient lighting on. 
	 */
	public void switchOn() {
		
		System.out.println( "[AbmientLighting] Switched on" );
	}

	/**
	 * Switch ambient lighting off. 
	 */
	public void switchOff() {
		
		System.out.println( "[AbmientLighting] Switched off" );
	}
}
