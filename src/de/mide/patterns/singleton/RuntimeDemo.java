package de.mide.patterns.singleton;

/**
 * This program shows how to use class {@code java.lang.Runtime},
 * from the Java SDK, which is a singleton class. 
 */
public class RuntimeDemo {

	public static void main( String[] args ) {
		
		System.out.println();
		
		// get singleton instance of class runtime
		final Runtime runtime1 = Runtime.getRuntime();
		final Runtime runtime2 = Runtime.getRuntime();
		
		System.out.println( "runtime1 == runtime2 : " + ( runtime1 == runtime2 ) );
		
		long freeBytes      = runtime1.freeMemory(); // bytes
		long freeMemoryKiB  = freeBytes / 1024;
		long freeMemoryMiB  = freeMemoryKiB / 1024;
		
		String msg = 
				String.format( "Free Memory: %d Bytes = %d KiB = %d MiB", 
						       freeBytes, freeMemoryKiB, freeMemoryMiB );
		System.out.println( msg );
		
		System.out.println();
	}
	
}
