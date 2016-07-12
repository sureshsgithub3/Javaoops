package Constructor;

public class Student1 {
	/*
	 * In this example, we are going to copy the values of one object into another using java constructor.
	
	*/
	int id;
	String name;
	String branch;
	
	Student1(int id,String name){
		this.id=id;
		this.name=name;
	}
	Student1(Student1 s,String branch){
		//we are copying the values of one object into another using java constructor
		id=s.id;
		name=s.name;
		this.branch=branch;
	}
	
	

	public static void main(String[] args) {
		Student1 s1= new Student1(1, "illena");
		Student1 s2= new Student1(s1, "It");
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name+" "+s2.branch);
		

	}

}
