package Constructor;

public class Copy_cons1_student {
	
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
	
	Copy_cons1_student(int id,String name){
		stuid=id;
		stuname=name;
		
	}
	
	//We can copy the values of one object into another by assigning the objects values to another object. 
	//In this case, there is no need to create the constructor.
	
	Copy_cons1_student(){
		
	}
	
	void display(){
		System.out.println("student id " +stuid);
		System.out.println("stident name " +stuname);
	}

	public static void main(String[] args) {
		Copy_cons1_student obj= new Copy_cons1_student(10, "suresh");
		Copy_cons1_student obj1= new Copy_cons1_student();
		obj1.stuid=obj.stuid;
		obj1.stuname=obj.stuname;
		obj.display();
		obj1.display();
	}

}
