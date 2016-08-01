package Inheritance;


public class Super_Colored_Rectangle_multilvl_inher extends Super_Rectangle_multilvl {
	
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Super_Colored_Rectangle_multilvl_inher(){
		super();
		System.out.println("default constructor of Super rectangle super colored rectangle");
	}
	
	//parameterised constructor
   public Super_Colored_Rectangle_multilvl_inher(String c,String typ,int len,int bdth) {
	   super(len, bdth, typ);
	   color=c;
	   System.out.println("inside constructor of super colored rectangle ");
	   
		System.out.println("length :"+len);
		System.out.println("breadth :"+bdth);
		System.out.println("type :" +typ);
	
}
	

}
