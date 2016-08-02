/**
 * 
 */
package Hierarchical_Inheritance;


public class Bank_TestClass {

	
	public static void main(String[] args) {
		
		//run time polymorpishm  .calling child class constructor by using parent class instance variable
		Bank b= new Hdfc();
		Bank b1=new Icici();
		Bank b2= new Sbi();
		System.out.println(b.getinterset());
		System.out.println(b1.getinterset());
		System.out.println(b2.getinterset());

	}

}
