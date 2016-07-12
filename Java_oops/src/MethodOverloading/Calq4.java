package MethodOverloading;
/*
 * One type is not de-promoted implicitly for example double cannot be depromoted to any type implicitely.
 *  there are no matching type arguments in the method, and each method promotes similar number of arguments, 
 *  there will be ambiguity.

*/
public class Calq4 {
	
	
	void sum(double  a, int b){
		System.out.println("A+b:  "+(a+b));
		
		
	}
	
	 void  sum (int a, double b){
		 System.out.println("A+b:  "+(a+b));
		
	}

	public static void main(String[] args) {
		
		Calq4 c= new Calq4();
		c.sum(10, 2000);//now ambiguity

	}

}
