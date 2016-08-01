package Abstractclasses;

public class Abs_rectangle extends Abs_Shape {

	@Override
	void draw() {
		System.out.println("draw rectangle");
		
	}
	
	public static void main(String[] args){
		
		Abs_Shape as= new Abs_rectangle();
		//calling of non abstract method abstract method
		as.defaultshape();
		as.draw();
	}

}
