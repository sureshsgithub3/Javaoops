package Static;

public class Static_block1 {
	/*
	 * Static block is mostly used for changing the default values of static variables.
	 * .This block gets executed when the class is loaded in the memory.
	 *  class can have multiple Static blocks, which will execute in the same sequence in which they have been written into the program.
	 * 
	 * 
	 * 
*/
	
	static int num;
	static String name;
	
	static {
		num=100;
		name="suresh";
		
	}
	public static void main(String[] args) {
		
		System.out.println("num :"+num);
		System.out.println("name "+name);
		

	}

}
