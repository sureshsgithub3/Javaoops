/**
 * 
 */
package Inheritance;

/**
 * super rectangle class extends super shape
 *
 */
public class Super_Rectangle_multilvl extends Super_shape_multilvl {
	
	private String type;
	
	//constructor
	Super_Rectangle_multilvl(){
		super();
		type=null;
		System.out.println("default constructor of Super rectangle");
		
	}
	//parameterised constructor
	
	Super_Rectangle_multilvl(int len,int bdth,String typ){
	super(len, bdth);
	System.out.println("inside constructor of super rectangle");
	System.out.println("length :"+len);
	System.out.println("breadth :"+bdth);
	System.out.println("type :"+type);
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	
	

}
