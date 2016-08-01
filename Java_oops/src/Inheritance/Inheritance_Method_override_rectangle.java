package Inheritance;

public class Inheritance_Method_override_rectangle extends Inheritance_MethodOverride_Shape {
	
	String type;
	
	
	//default constructor
	Inheritance_Method_override_rectangle(){
		super();
		type=null;
		System.out.println("default constructor of Inheritance_Method_override_rectangle");
	}
	
	//parameterrised constructor
	Inheritance_Method_override_rectangle(int l,int b,String typ){
		super(l, b);
		type=typ;
		System.out.println("inside constructor of Inheritance_Method_override_rectangle");
		
	}
	
	@Override
	void showattributes() {
		
		super.showattributes();
		System.out.println("type :"+type);
	}
	
	
	
	

}
