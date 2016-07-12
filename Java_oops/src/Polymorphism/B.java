package Polymorphism;

public class B extends A {
	/*
	 * an overridden method is called through the reference variable of a superclass
	*/
	void run(){
		System.out.println("Run method in B class");
	}

	public static void main(String[] args) {
		
		A a= new A();
		a.run();//invokes parent class  method
		
		A a1= new B();//refernce variable of A class and object of B class
		a1.run();//invokes overriden method.this is called run time polymorphism
		
		

	}

}
