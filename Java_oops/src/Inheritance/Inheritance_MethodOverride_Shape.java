package Inheritance;

public class Inheritance_MethodOverride_Shape {
	private int length;
	private int breadth;
	//default constructor
	
	Inheritance_MethodOverride_Shape(){
		length=0;
		breadth=0;
		System.out.println("default constructor of Inheritance_MethodOverride_Shape");
				
	}
	//Parameterized constructor
	Inheritance_MethodOverride_Shape(int l,int b){
		length=l;
		breadth=b;
		System.out.println("inside constructor of Inheritance_MethodOverride_Shape");
		
	}
	
	void showattributes(){
		System.out.println("length :"+ length);
		System.out.println("breadth : "+breadth);
	}
	
	
	

}
