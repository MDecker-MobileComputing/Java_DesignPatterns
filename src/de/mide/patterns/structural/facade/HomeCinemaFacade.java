package de.mide.patterns.structural.facade;

import static de.mide.patterns.structural.facade.components.ScreenController.ScreenState.OFF;
import static de.mide.patterns.structural.facade.components.ScreenController.ScreenState.ON;

import de.mide.patterns.structural.facade.components.AmbientLighting;
import de.mide.patterns.structural.facade.components.AudioManager;
import de.mide.patterns.structural.facade.components.ScreenController;
import de.mide.patterns.structural.facade.components.TVReceiver;


/**
 * The facade hides the complexity of several subsystems
 * needed for a home cinema system.
 */
public class HomeCinemaFacade {
	
	private AmbientLighting _ambientLighting = new AmbientLighting();
	
	private AudioManager _audioManager = new AudioManager(); 
		
	private ScreenController _screenController = new ScreenController();
	
	private TVReceiver _tvReceiver = new TVReceiver();
		
	
	/**
	 * Switch all systems on. 
	 *  
	 * @param channel TV channel to be shown
	 */
	public void startTV( int channel ) {
		
		_ambientLighting.switchOn();
		_screenController.setState( ON );
		
		_tvReceiver.setState( true );
		_tvReceiver.setChannel( channel );
		
		_audioManager.setLoudness( 1 );
	}
	
	
	/**
	 * Switch to another TV channel.
	 * 
	 * @param newChannel TV channel to be shown
	 */
	public void switchToChannel( int newChannel ) {
				
		_tvReceiver.setChannel( newChannel );
	}
	
	
	/**
	 * Increase loudness by one unit.
	 */
	public void increaseLoudness() {
		
		final int loudnessOld = _audioManager.getLoudness();
		final int loudnessNew = loudnessOld + 1;
		_audioManager.setLoudness( loudnessNew );
	}

	
	/**
	 * Decrease loudness by one unit.
	 */
	public void decreaseLoudness() {

		final int loudnessOld = _audioManager.getLoudness();
		final int loudnessNew = loudnessOld - 1;
		_audioManager.setLoudness( loudnessNew );
	}
	
	
	/**
	 * Switch all systems off.
	 */
	public void switchOff() {
		
		_ambientLighting.switchOff();
		_screenController.setState( OFF );
		_tvReceiver.setState( false );
	}
}
