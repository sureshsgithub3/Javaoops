/**
 * 
 */
package ThisKeyword;

/**
 * this can passes as an argument to the method
 *
 */
public class This_can_passed_asan_argu_method4 {
	
	int i;
	String name;
	
	This_can_passed_asan_argu_method4(int i,String name){
		this.i=i;
		this.name=name;
		
	}
	
	
	
	public void print(This_can_passed_asan_argu_method4 obj){
		System.out.println(name);
		System.out.println("a :"+i);
		
	}
	
	public  void display(){
		print(this);//this can be passed as an argument to the method
	}
	
	

	
	public static void main(String[] args) {
		This_can_passed_asan_argu_method4 obj1= new This_can_passed_asan_argu_method4(10, "suresh");
		obj1.display();
		
		

	}

}
