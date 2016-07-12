/**
 * 
 */
package Constructor;


public class Student2 {

	/**
	 * We can copy the values of one object into another by assigning the objects values to another object.
	 * in this case no need of constructor.
	 * Yes, like object creation, starting a thread, calling method etc. 
	 * You can perform any operation in the constructor as you perform in the method.
	 */
	
	
	int id;
	String name;
	String branch;
	
	Student2(int id,String name,String branch){
		this.id=id;
		this.name=name;
		this.branch=branch;
	}
	Student2(){
		
	}
	
	
	public static void main(String[] args) {
		Student2 s1= new Student2(1, "illeana","It");
		Student2 s2= new Student2();
		s2.id=s1.id;
		s2.name=s1.name;
		s2.branch=s1.branch;
		
		System.out.println(s1.id+" "+s1.name);
		
		System.out.println(s2.id+" "+s2.name+" "+s2.branch);

	}

}
