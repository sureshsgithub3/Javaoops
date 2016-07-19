/**
 * 
 */
package Inheritance;

/**
 * this class extends shape
 *
 */
public class Rectangle  extends Shape{
	public String type;
	
	
	//default constructor
	
	Rectangle(){
		super();
		System.out.println("default constructor of rectangle");
	}
	
	Rectangle(String ty,int len,int bre){
		super(len, bre);
		System.out.println("inside parametrised constructor of rectangle");
		System.out.println("length :"+len);
		System.out.println("breadth :"+breadth);
		System.out.println("type "+type);
	}
	
	public String gettype(){
		return type;
	}
	public void settype(String t){
		type=t;
	}
	
	

}
