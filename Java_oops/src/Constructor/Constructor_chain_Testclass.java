/**
 * 
 */
package Constructor;

/**
 * @author suresh
 *
 */
public class Constructor_chain_Testclass extends Constructor_Chaing_Student {

	/**
	 * if you create the object of child class then first super class(or parent class) 
	 * constructor will be invoked and then child class constructor will be invoked.
	 */
	
	
	public void display(){
		System.out.println("Output from Super class  :" + s1);
		//overriding s2 in child class
		s2="child class";
		System.out.println("Output from child class :" +s2);
	}
	public static void main(String[] args) {
		
		Constructor_chain_Testclass obj1= new Constructor_chain_Testclass();
		obj1.display();
		
	}

}
