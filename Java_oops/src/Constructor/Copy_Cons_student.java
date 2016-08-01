package Constructor;

public class Copy_Cons_student {
	
	/*There is no copy constructor in java. But, we can copy the values of one object to another like copy constructor in C++.
	 * There are many ways to copy the values of one object into another in java.
	 * By constructor
       By assigning the values of one object into another
	 * By clone() method of Object class
	 * 
	 * 
	
	*/
	
	
	int stuid;
	String stuname;
	
	Copy_Cons_student(int id,String name){
		stuid=id;
		stuname=name;
		
	}
	
	//we are going to copy the values of one object into another using java constructor.
	
	Copy_Cons_student(Copy_Cons_student obj){
		stuid=obj.stuid;
		stuname=obj.stuname;
	}
	
	void display(){
		System.out.println("student id"+stuid);
		System.out.println("stident name"+stuname);
	}
	
	

	public static void main(String[] args) {
		Copy_Cons_student obj1= new Copy_Cons_student(10, "suresh");
		//we are going to copy the values of one object into another using java constructor.
		Copy_Cons_student obj2= new Copy_Cons_student(obj1);
		obj1.display();
		obj2.display();
	

	}

}
