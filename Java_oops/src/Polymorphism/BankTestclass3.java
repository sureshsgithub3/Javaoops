/**
 * 
 */
package Polymorphism;

/**
 * @author suresh
 *
 */
public class BankTestclass3 {

	
	public static void main(String[] args) {
		Bank3 b= new Hdfc3();
		Bank3 b1=new Icici3();
		Bank3 b2= new Sbi3();
		
		System.out.println("Sbi intersrt:"+b.interset());
		System.out.println("Icici intersrt:"+b1.interset());
		System.out.println("Hdfc intersrt:"+b2.interset());
	}

}
