/**
 * 
 */
package ThisKeyword;

/**
 * this keyword can call current class method
 *
 */
public class This_can_invoke_current_class_method3 {
	
	int i;
	String name;
	
	public void display(int i,String name){
		this.name=name;
		this.i=i;
		
	}
	
	public void print(){
		this.display(10, "suresh");//this keyword can call/invoke current class method
		System.out.println(i);
		System.out.println(name);
	}

	
	public static void main(String[] args) {
		This_can_invoke_current_class_method3 obj = new This_can_invoke_current_class_method3();
		obj.print();
	}

}
