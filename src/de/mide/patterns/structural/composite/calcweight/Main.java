package de.mide.patterns.structural.composite.calcweight;


/**
 * Class with test for example for design pattern "composite".
 */
public class Main {

	/**
	 * Entrance method.
	 * 
	 * @param args Not evaluated
	 */
	public static void main( String[] args ) {
		
		System.out.println();
		
		AbstractComponent coverFront = new IndivisibleComponent( "Front Cover", 20 );
		AbstractComponent coverBack  = new IndivisibleComponent( "Back Cover" , 40 );
		
		CompositeComponent housing  = new CompositeComponent( "Housing", 5 ); // 5g for frame or glue
		housing.addComponent( coverFront );
		housing.addComponent( coverBack );
		System.out.println( housing.toString() );
		
		AbstractComponent display = new IndivisibleComponent( "OLED Display"        , 50 );
		AbstractComponent battery = new IndivisibleComponent( "Battery"             , 60 );
		AbstractComponent soc     = new IndivisibleComponent( "System on Chip (SoC)", 40 );
		
		CompositeComponent electronics = new CompositeComponent( "Electronic parts", 0 ); 
		electronics.addComponent( display );
		electronics.addComponent( battery );
		electronics.addComponent( soc     );
		System.out.println( electronics.toString() );
		
		CompositeComponent smartphone = new CompositeComponent( "Smartphone", 0 );
		smartphone.addComponent( housing     );
		smartphone.addComponent( electronics );
		
		System.out.println( "\n" + smartphone.toString() );
	}
}
