package Final_With_;

public class Final_static_Blank_final_variable2 {
	/*
	 * final variable can be static
	 * static final variable can be initialized in static block
	 * 
	
	*/
	final static int a;// final variable
	
	 /*Final_static_Blank_final_variable2(int a){
		this.a=a;
		
	}*/
	 
	 static {
		 a =300;
	 }
	
	

	public static void main(String[] args) {
		// obj= new Final_static_Blank_final_variable2(200);
		System.out.println(a);

	}

}
