package Inheritance;

public class Final_method_of_bikeclass_exentendingby_Honda  extends Final_method_class_Bike {
	/*
	 * final method can be inherited but cannot be override
	 * 
	
	*/
	
	Final_method_of_bikeclass_exentendingby_Honda(){
		System.out.println("default constructor of honda class");
	}
	

	public static void main(String[] args) {
		
		Final_method_of_bikeclass_exentendingby_Honda obj= new Final_method_of_bikeclass_exentendingby_Honda();
		obj.run();
	

	}

}
