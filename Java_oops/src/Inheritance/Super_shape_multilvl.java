/**
 * 
 */
package Inheritance;

/**
 * The superclass constructor can be called explicitly using the keyword super,
 */
public class Super_shape_multilvl {

	
	private int length;
	private int breadth;
	//setters and getters
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	//constructor
	Super_shape_multilvl(){
		length=0;
		breadth=0;
		System.out.println("default constructor of super_shape");
				
	}
	
	//parameterised constructor
	Super_shape_multilvl(int l,int b){
		length=l;
		breadth=b;
		System.out.println("inside constructor of super_shape");
		System.out.println("length "+ length);
		System.out.println("breadth "+breadth);
	}
	
}
