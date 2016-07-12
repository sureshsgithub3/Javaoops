package Polymorphism;

public class BankTestclass4 {
	/*
	 * Multi level inheritance
	 * 
	 * 
	 * 
	*/
	public static void main(String[] args) {
		
		Bank4 b= new IngVysa4();
		IngVysa4 i=new KotakM();
		System.out.println(b.interset());
		System.out.println(i.interset());
		
	

	}

}
