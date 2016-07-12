package MethodOverloading;
/*
 * Method overloading

*/
public class Calq1 {
	
	
	//below methods having same names but parameters are different and data types are different 
	void sum(int a, int b){
		System.out.println("A+b:  "+(a+b));
		
	}
	
	void sum (int a, int b ,int c){
		System.out.println("a+b+c: "+(a+b+c));
	}
	
	void sum(double a, double b,double c){
		System.out.println("a+b+c: "+(a+b+c));
	}
	
	

	public static void main(String[] args) {
		
		Calq1 c= new Calq1();
		c.sum(10, 20);
		c.sum(20, 30,40);
		c.sum(10000, 200000, 100000);
		

	}

}
