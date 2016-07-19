/**
 * 
 */
package Inheritance;

/**
 * @author suresh
 *
 */
public class Shape {
	
	public int length;
	public int breadth;
	
	
	public int getbreadth(){
		return breadth;
	}
	
	public int getlength(){
		return length;
	}
	
	public void setlength(int l){
		length=l;
		
		
	}
	
	public void setbreadth(int b){
		breadth =b;
	}
	
	Shape(){
		System.out.println("default constructor");
	}
	
	//parameterised constructor
	Shape(int l,int b){
		length=l;
		breadth=b;
		System.out.println("length:"+length);
		System.out.println("breadth: "+breadth);
	}
	

}
