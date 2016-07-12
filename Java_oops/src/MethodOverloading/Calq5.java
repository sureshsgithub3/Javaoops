package MethodOverloading;

public class Calq5 {
	
	void sum(int  a, int b){
		System.out.println("A+b:  "+(a+b));
		
		
	}
	
	 void  sum (double a, int b){
		 System.out.println("A+b:  "+(a+b));
		
	}


	public static void main(String[] args) {
		Calq5 c= new Calq5();
		c.sum(10,'C' );//type promotion 

	}

}
