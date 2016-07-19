/**
 * 
 */
package ThisKeyword;

/**
 * this keyword can refer to current class instance variable
 *
 */



public class ThisKeyword_referTo_Current_Class_Instance_var1 {
	
	int i;
	String name;
	ThisKeyword_referTo_Current_Class_Instance_var1(int i,String name){
		this.i=i;  // this keyword refer to class instance variable 
		this.name=name;// this keyword refer to class instance variable 
		
	}
	
	ThisKeyword_referTo_Current_Class_Instance_var1(ThisKeyword_referTo_Current_Class_Instance_var1 obj){
		obj.i=i;
		obj.name=name;
		
	}
	

	
	public static void main(String[] args) {
		
		ThisKeyword_referTo_Current_Class_Instance_var1 obj1=new ThisKeyword_referTo_Current_Class_Instance_var1(10, "suresh");
		ThisKeyword_referTo_Current_Class_Instance_var1 obj2= new ThisKeyword_referTo_Current_Class_Instance_var1(obj1);
		obj2.i=obj1.i;
		obj2.name=obj1.name;
		
		
		

	}

}
