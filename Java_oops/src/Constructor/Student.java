package Constructor;

public class Student{
	/*
	 * 
	 * 
	 * constructor overloading
	 * 
	 * 
	
	
    */
	
	
	int id;
	String name;
	String branch;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	Student(int id,String name, String branch){
		this.id=id;
		this.name=name;
		this.branch=branch;
	}
	
	
	public static void main(String[] args) {
		Student s= new Student(1, "illena");
		Student s1= new Student(2,"Dcruz","It");
		System.out.println(s.id+" "+s.name);
		System.out.println(s1.id+" "+s1.name+" "+s1.branch);
		
		

	}

}
