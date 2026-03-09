package de.mide.patterns.structural.facade.components;


/**
 * Audio Manager for controlling amplifier, especially the loudness. 
 */
public class AudioManager {

	/** Value for maximal loudness. */
	public static final int LOUDNESS_MAX = 20;
	
	
	/** Loudness is value between 0 (muted) and 20 (max loudness). */
	private int _loudness = 0;
	
	
	/**
	 * Getter for current loudness value. 
	 * 
	 * @return Value between 0 (muted) and {@link #LOUDNESS_MAX}
	 */
	public int getLoudness() {
		
		return _loudness;
	}
	
	
	/**
	 * Set loundess value. When {@code loudness} is a value outside
	 * the allowed range, then it will be corrected to the nearest
	 * allowed value. 
	 * 
	 * @param loudness Value between 0 (muted) and {@link #LOUDNESS_MAX}
	 */
	public void setLoudness( int loudness ) {
		
		_loudness = 
				Math.clamp( loudness, 0, LOUDNESS_MAX );
		
		System.out.println( 
				"[AudioManager] New loudness value: " + _loudness );
	}	
}
