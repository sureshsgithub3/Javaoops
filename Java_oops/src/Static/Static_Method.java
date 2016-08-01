package Static;

public class Static_Method {
	/*
	 * Static Methods can access class variables without using object of the class. 
	 *  It can access non-static methods and non-static variables by using objects.
	 * Static methods can be accessed directly in static and non-static methods.
	 * 
	 * 
	 * 
	 * 
	
	
	*/
	
	
	int num;
	static String name;
	
	
	public static String getname(){
		return name;
	}
	
	public static void setname(String name){
		
		//name is static variable so using class name  it was called
		Static_Method.name  =name;
	}
	
	public int getnum(){
		return num;
		
	}
	
	public void setnum(int num){
          this.num=num;		
	}
	
	
	
	public  void display(){
		
		
		System.out.println(num);
	}

	public static void main(String[] args) {
		setname("suresh");
		//name is static variable and main method is also static it doesnt need object
		System.out.println(getname());
		Static_Method obj= new Static_Method();
		//main method is static method  to call any non static methods or variables we need object
		//setnum is non static method so we are using object to call that method
		obj.setnum(10);
		System.out.println(obj.getnum());
		

	}

}
