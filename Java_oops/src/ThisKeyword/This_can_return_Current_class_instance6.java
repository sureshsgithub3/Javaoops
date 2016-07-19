/**
 * 
 */
package ThisKeyword;

/**
 * this keyword can return current class keyword
 *
 */
public class This_can_return_Current_class_instance6 {

	
	This_can_return_Current_class_instance6 getclassinstance()// method  returns class instance
	{
		return this;//this keyword can return current class keyword
	}
	
	public static void main(String[] args) {
		This_can_return_Current_class_instance6 obj= new This_can_return_Current_class_instance6();
		System.out.println(obj);
		System.out.println(obj.getclassinstance());

	}

}
