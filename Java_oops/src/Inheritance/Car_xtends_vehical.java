package Inheritance;

public class Car_xtends_vehical extends Vehicals {
	
	/*
	 * The constructor in the superclass is responsible for building the object of the superclass.
	 *  the constructor of the subclass builds the object of subclass..
	 *  When the subclass constructor is called during object creation, it by default invokes the default constructor of super-class. 
	 *  Hence, in inheritance the objects are constructed top-down
	 *  
	 *  
	
	
	*/
	
	int cc;
	int gear;
	void car_arttributes(){
		//it shares properties of vehical class 
		System.out.println("car color :"+color);
		System.out.println("car size :"+size);
		System.out.println("car speed  :"+speed);
		System.out.println("car cc :"+cc);
		System.out.println("car gears :"+gear);
	}

}
