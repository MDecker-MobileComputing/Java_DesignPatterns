package de.mide.patterns.command.composite;

public class Main {

	public static void main( String[] args ) {
		
		System.out.println();
		
		AbstractComponent coverFront = new IndivisibleComponent( "Front Cover", 20 );
		AbstractComponent coverBack  = new IndivisibleComponent( "Back Cover" , 40 );
		
		CompositeComponent housing  = new CompositeComponent( "Housing", 0 );
		housing.addComponent( coverFront );
		housing.addComponent( coverBack );
		System.out.println( housing.toString() );
		
		AbstractComponent display = new IndivisibleComponent( "OLED Display"        , 50 );
		AbstractComponent battery = new IndivisibleComponent( "Battery"             , 60 );
		AbstractComponent soc     = new IndivisibleComponent( "System on Chip (SoC)", 40 );
		
		CompositeComponent electronics = new CompositeComponent( "Electronic parts", 5 ); // 5g for cables & connectors
		electronics.addComponent( display );
		electronics.addComponent( battery );
		electronics.addComponent( soc     );
		System.out.println( electronics.toString() );
		
		CompositeComponent smartphone = new CompositeComponent( "Smartphone", 0 );
		smartphone.addComponent( housing     );
		smartphone.addComponent( electronics );
		
		System.out.println( smartphone.toString() );
	}
}
