/**
 * 
 */
package ThisKeyword;

/**
 * This keyword can invoke current class constructor
 *
 */

  



public class ThisKeyword_Can_invoke_Current_Class_Constructor2 {
	
	int i;
	String name;
	
	
	
	ThisKeyword_Can_invoke_Current_Class_Constructor2(){
		System.out.println("Default constructor");
	}
	ThisKeyword_Can_invoke_Current_Class_Constructor2(int i ,String name){
		this();//This keyword can invoke current class constructor
		this.i=i;
		this.name=name;
	}
	
	public void display(){
		System.out.println(i);
		System.out.println(name);
	}
	
	
	
	

	
	public static void main(String[] args) {
		
		ThisKeyword_Can_invoke_Current_Class_Constructor2 obj= new ThisKeyword_Can_invoke_Current_Class_Constructor2(10, "suresh");
		
		obj.display();
	     
 
	}

}
