package de.mide.patterns.singleton;

public class SingletonDriver {

	public static void main( String[] args ) {
		
		System.out.println();
		
		Singleton s1 = Singleton.getSingelton(); 
		System.out.println( "s1=" + s1 );
		
		Singleton s2 = Singleton.getSingelton();
		System.out.println( "s2=" + s2 );
		
		System.out.println();
	}	
}



