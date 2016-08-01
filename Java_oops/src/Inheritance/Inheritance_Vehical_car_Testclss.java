package Inheritance;

public class Inheritance_Vehical_car_Testclss {

	public static void main(String[] args) {
		//When the subclass constructor is called during object creation, it by default invokes the default constructor of super-class. 
		//here super class is vehical and child class is car 
		// here car class object is created 
		Car_xtends_vehical c= new Car_xtends_vehical();
		c.speed=200;
		c.size=5;
		c.gear=5;
		c.color="blue";
		c.cc=2000;
		c.car_arttributes();

	}

}
