/**
 * 
 */
package MethodOverloading;


public class Calq6 {

	/**
	 * static method overloading : complile time polymorphism.
	 * static method with return statements overloading
	 */
	
	
	static int sum(int a, int b){
		// static method with return statements overloading
		
		return a+b;
		
	}
	
	static int sum (int a, int b ,int c){
		return a+b+c;
		
	}
	
	static double sum(double a, double b,double c){
		return a+b+c;
		
	}
	public static void main(String[] args) {
		
		System.out.println(Calq6.sum(10, 20000));
		System.out.println(Calq6.sum(30, 40000, 50000));
		System.out.println(Calq6.sum('c', 70000, 10));
		

	}

}
