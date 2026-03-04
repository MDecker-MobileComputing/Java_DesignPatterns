package de.mide.patterns.structural.facade.component;


/**
 * Receiver for Television.
 */
public class TVReceiver {

	/** Flag to store if receiver is currently on or off. */
	private boolean _isOn = false;
	
	/** TV channel currently received. */
	private int _channel = 1; 
	
	
	/** 
	 * Switch receiver on or off.
	 * 
	 * @param isOn {@code true} if to be switched on, 
	 *        {@code false} if to be switched off.
	 */
	public void setState( boolean isOn ) {
		
		if ( _isOn ) {
		
			System.out.println( 
					"[TVReceiver] Switched on, showing channel " + _channel + "." );
			
		} else {
		
			System.out.print( "[TVReceiver] Switched off" );
		}						
	}
	
	
	/**
	 * Set new TV channel; will only work, when TV is switched on. 
	 * 
	 * @param channel New channel to be shown, must be between in range
	 *                from 1 till 100
	 */
	public void setChannel( int channel ) {
		
		if ( channel < 1 || channel > 100 ) {
			
			System.out.println( 
					"[TVReceiver] ERROR: illegal channel number requested: " + 
			        channel );
			return;
		}
		
		if ( _isOn ) {
			
			_channel = channel; 
			System.out.println( "[TVReceiver] Switched to channel " + _channel );
			
		} else {
			
			System.out.println( 
					"[TVReceiver] ERROR: cannot switch channel when receiver is off." );
		}
	}
}
