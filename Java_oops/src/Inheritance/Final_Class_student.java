/**
 * 
 */
package Inheritance;

/**
 * final class cannot be inherited 
 *
 */
public final class Final_Class_student {
	
	
	int stuid;
	String name;
	
	Final_Class_student(int id){
		stuid =id;
		
	}
	Final_Class_student(int id,String name){
		this(id);
		this.name=name;
	}
	
	
	
	
	

}
