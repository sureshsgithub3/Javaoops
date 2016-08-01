package Static;

public class Static_class_nexted1 {
	//this outer class varibable
	int num;
	
	//nested class
	static class x{
		static String str="am from x";
		//inner class cannot access outer class variables
		// num=100;
		
	}

	public static void main(String[] args) {
		//calling inner class constructor
		Static_class_nexted1.x obj= new Static_class_nexted1.x();
		System.out.println(obj.str);
				
		
		

	}

}
