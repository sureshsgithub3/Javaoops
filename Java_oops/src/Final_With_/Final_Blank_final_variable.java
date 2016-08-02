package Final_With_;

public class Final_Blank_final_variable {
	/*
	 * blank final variable can be initialized  by constructor
	 * 
	*/
	final int a;//final variable
	
	Final_Blank_final_variable(int a){
		this.a=a;
		
	}
	

	public static void main(String[] args) {
		
		Final_Blank_final_variable obj= new Final_Blank_final_variable(100);
		System.out.println("final value is :"+obj.a);

	}

}
