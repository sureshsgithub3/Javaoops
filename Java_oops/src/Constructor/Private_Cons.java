package Constructor;

public class Private_Cons {
	
	String name;
	
	private static Private_Cons obj=null;
	
	private Private_Cons(){
		
		//private constructor
		/* use of private constructor is to serve singleton classes.
		 * A singleton class is one which limits the number of objects creation to one.
		 * Using private constructor we can ensure that no more than one object can be created at a time.
		 * We will see in the below example how to use private constructor for limiting the number of objects for a singleton class.
		 * 
		
		*/
		}
	
	public String getname(){
		return name;
	}
	
	public void setname(String name){
		this.name=name;
		
	}
	
	public void display(){
		obj.getname();
	}
    
	public static Private_Cons createmethod(){
		if(obj==null){
			obj= new Private_Cons();
		}
		return obj;
	}
	
	public static void main(String[] args) {
		
		Private_Cons obj1=new Private_Cons();
		obj1.setname("suresh");
		System.out.println(obj1.getname());
		
		Private_Cons obj2=new Private_Cons();
		obj2.setname("chandra");
		System.out.println(obj2.getname());
		

	}

}
