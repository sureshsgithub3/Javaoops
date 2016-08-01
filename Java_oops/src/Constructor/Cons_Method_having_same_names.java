package Constructor;

public class Cons_Method_having_same_names {
	/*
	 * 
	 * 
	 * Like constructors method can also have name same as class name, but still they have return type.
	 * 
	 * 
	 * 
	
	
	*/
	/*Cons_Method_having_same_names(){
		System.out.println("default constructor");
	}*/
	
	public String Cons_Method_having_same_names(){
		
		String s1="same name";
		return s1;
		
	}
	

	public static void main(String[] args) {
		
		Cons_Method_having_same_names obj1= new Cons_Method_having_same_names();
		System.out.println(obj1.Cons_Method_having_same_names());
		

	}

}
