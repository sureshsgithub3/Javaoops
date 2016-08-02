/**
 * 
 */
package Multilevel_inheritance;

/**
 * extends Bike class
 *
 */
public class Honda_bike extends Bike{
	
	Honda_bike(){
		System.out.println("Honda_bike");
	}
	
	//overrides run
	public void run(){
		System.out.println("cbr running smothly");
	}

}
