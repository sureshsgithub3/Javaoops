/**
 * 
 */
package Inheritance;

/**
 * @author suresh
 *
 */
public class ColoredRectangle extends Rectangle{

	String color;
	
	public String getcolor(){
		return color;
		
		
	}
	
	public void setcolor(String c){
		color=c;
	}
	
	ColoredRectangle(){
		System.out.println("inside default constructor of the coloredrectangle");
	}
	
	ColoredRectangle(String co,String ty,int l,int b){
		super(ty, l, b);
		System.out.println("length :"+length);
		System.out.println("breadth :"+breadth);
		System.out.println("type :"+type);
		System.out.println("color :"+color);
		System.out.println("inside default constructor of the coloredrectangle");
	}
	
	public static void main(String[] args) {
		ColoredRectangle obj= new ColoredRectangle();
		ColoredRectangle ob1= new ColoredRectangle("yellow", "rect", 10, 20);
		

	}

}
