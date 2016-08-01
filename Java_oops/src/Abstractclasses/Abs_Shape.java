package Abstractclasses;

public abstract class Abs_Shape {
	
	//abstract method 
	abstract void draw();
	
	//constructor
	Abs_Shape(){
		System.out.println("default constructor in abstract class shape");
	}
	//non abstract method in abstract method
	void defaultshape(){
		System.out.println("non abstract method in abstract class");
	}

}
