package MethodOverloading;
/*
 * static method overloading : complile time polymorphism
*/
public class Calq2 {
	//below methods having same names but parameters are different and data types are different 
	static void sum(int a, int b){
		System.out.println("A+b:  "+(a+b));
		
	}
	
	static void sum (int a, int b ,int c){
		System.out.println("a+b+c: "+(a+b+c));
	}
	
	static void sum(double a, double b,double c){
		System.out.println("a+b+c: "+(a+b+c));
	}
	

	public static void main(String[] args) {
		Calq2.sum(10, 30);
		Calq2.sum(10, 10, 30);
		Calq2.sum(30, 20, 50);
		
		

	}

}
