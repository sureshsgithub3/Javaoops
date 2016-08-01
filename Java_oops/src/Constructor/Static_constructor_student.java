package Constructor;

public class Static_constructor_student {
	
	int stuid;
	String name;
	
	static  Static_constructor_student(){
		
		/*
		 * 
		 *  A constructor can not be static in Java. 
		
		*/
	}
	
	

	public int getStuid() {
		return stuid;
	}



	public void setStuid(int stuid) {
		this.stuid = stuid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public void display(){
		System.out.println("student name :"+name);
		System.out.println("student id :"+stuid);
	}



	public static void main(String[] args) {
		Static_constructor_student obj= new Static_constructor_student();
		obj.display();
		

	}

}
