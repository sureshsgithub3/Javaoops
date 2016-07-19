/**
 * 
 */
package ThisKeyword;

/**
 * @author suresh
 *
 */
public class This_can_be_argu_in_constrcutorCall51 {

	This_can_be_argu_in_constrcutorCall5 obj;// reference variable of other class(This_can_be_argu_in_constrcutorCall5)
	
	
	//constructor of this class
	This_can_be_argu_in_constrcutorCall51(This_can_be_argu_in_constrcutorCall5 obj)
	
	{
		this.obj=obj;
	}
	
	public void display(){
		obj.i=20;//overriding other class variable using class instance variable obj
		System.out.println(obj.i);
	}
	

}
