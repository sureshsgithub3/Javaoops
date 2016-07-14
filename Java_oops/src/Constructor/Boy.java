/**
 * 
 */
package Constructor;


public class Boy extends Human{

	/**
	 * boy class extends human class
	 * when we creating object of child class then first super class /parent class constructor will be invoked first then 
	 * child class constructor
	 * 
	 */

	
	Boy(){
		
		//here we are overriding s2 value in the child class constructor
		s2="child/boy class class";
	}
	
	public void print(){
		System.out.println(s1+" "+s2);
	}
	public static void main(String[] args) {
		Boy b= new Boy();//creating object to child class
		b.print();
		

	}

}
