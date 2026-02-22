package de.mide.patterns.command.composite;

public class Main {

	public static void main( String[] args ) throws CompositeException {
		
		AbstractComponent machine = new Compositum( "Machine" );
		
		
		System.out.println( machine.toString() );
	}
}
