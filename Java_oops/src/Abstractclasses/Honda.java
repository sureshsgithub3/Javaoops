package Abstractclasses;

public class Honda extends Bike {

	
	public void run(){
		System.out.println("cbr 250");
	}
	
	public static void main(String[]  args){
		Bike b= new Honda();
		b.run();
	}

}
