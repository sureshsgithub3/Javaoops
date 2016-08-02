package Final_With_;

public class Final_method_overload {
	
    int stuid;
	String name;
	String collegename;
	
	public final void  display(int stuid,String name){
		this.stuid=10;
		this.name=name;
		
		
	}
	//final method can be overloaded
	
	public final void display(int id,String n,String cn){
		this.stuid=id;
		this.name=n;
		this.collegename=cn;
	}
    public void print(){
	    System.out.println(name);
    	System.out.println(stuid);
    	System.out.println(collegename);
    }
	public static void main(String[] args) {
		
		Final_method_overload obj= new Final_method_overload();
		obj.display(12, "suresh");
		obj.display(11, "chandra","its");
		obj.print();
		

	}

}
