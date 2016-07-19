/**
 * 
 */
package ThisKeyword;

/**
 * this can be used as argument in constructor call;
 * this example is to create instance variable of this in other class and override i in that class with extends this class
 * write function to print i in that class with 
 * call that method in this class 
 * this class has display output of overridden i 
 *
 */
public class This_can_be_argu_in_constrcutorCall5 {
	
	int i=10;
	
	This_can_be_argu_in_constrcutorCall5(){
		
		/*This_can_be_argu_in_constrcutorCall51 obj2= new This_can_be_argu_in_constrcutorCall51(this);
		obj2.display();*/
		
	}
	
	public void display(){
		This_can_be_argu_in_constrcutorCall51 obj2= new This_can_be_argu_in_constrcutorCall51(this);
		obj2.display();
		
	}

	
	public static void main(String[] args) {
		
		This_can_be_argu_in_constrcutorCall5 obj3= new This_can_be_argu_in_constrcutorCall5();
		obj3.display();
		
		

	}

}
