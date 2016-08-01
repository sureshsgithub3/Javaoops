/**
 * 
 */
package Constructor;

/**
 * @author suresh
 *
 */
public class Cons_overload_Student5 {

	int stuid;
	String stuname;
	
	Cons_overload_Student5(int id){
		stuid=id;
		
	}
	//constructor overloaded
	
	Cons_overload_Student5(int id,String name ){
		stuid=id;
		stuname=name;
	}
	void display(){
		System.out.println("student name "+ stuname);
		System.out.println("student  id  "+stuid);
	}
	
	public static void main(String[] args) {
		Cons_overload_Student5 obj= new Cons_overload_Student5(10, "suresh");
		obj.display();
		Cons_overload_Student5 obj1= new Cons_overload_Student5(11);
		obj1.display();

	}

}
