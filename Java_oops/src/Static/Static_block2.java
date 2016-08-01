package Static;

public class Static_block2 {
	
	/*
	 * Static block is mostly used for changing the default values of static variables.
	 * .This block gets executed when the class is loaded in the memory.
	 *  class can have multiple Static blocks, which will execute in the same sequence in which they have been written into the program.
	 * static blocks can access only static things  
	 * 
	 * 
*/     
	
	static int num;
	static String name;
	
	static {
		System.out.println("s block 1");
		num=100;
		name="suresh";
	}
	
	static{
		System.out.println("s block 2");
		num=200;
		name="chandra";
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("num "+num);
		System.out.println("name "+name);

	}

}
