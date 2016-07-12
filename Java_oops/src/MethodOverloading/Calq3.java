/**
 * 
 */
package MethodOverloading;


public class Calq3 {

	/**
	 * change/different return type overloaded methods.
	 * Method return type doesn’t matter in case of overloading.
	 * One type is promoted to another implicitly if no matching datatype is found. 
	 * 
	 */
	
	 int sum(int a, int b){
		int c=a+b;
		return c;
		
	}
	
	 int sum (int a, int b ,int c){
		 int d=a+b+c;
			return d;
	}
	
	 double sum(double a, double b,double c){
		double d=a+b+c;
		return d;
	}
	
	public static void main(String[] args) {
		Calq3 obj = new Calq3();
		System.out.println(obj.sum(10, 20));
		System.out.println(obj.sum(2000000, 20, 30));//One type is promoted to another implicitly if no matching datatype is found. 
		System.out.println(obj.sum(100000, 200000, 3000000.909090));
		
		

	}

}
