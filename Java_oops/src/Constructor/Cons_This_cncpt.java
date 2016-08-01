/**
 * 
 */
package Constructor;

/**
 *this() is used for calling the default  
       * constructor from parameterized constructor.
       * It should always be the first statement 
       * in constructor body.
 *
 */
public class Cons_This_cncpt {
	private int rollno=100;

	Cons_This_cncpt(){
		
		rollno=100;
		
	}
	
	Cons_This_cncpt(int rno){
		rollno=rollno+rno;
	}
	
	public int getrollno(){
		return rollno;
	}
	
	public void setrollno(int rollno){
		this.rollno=rollno;
	}
	
	
	public static void main(String[] args) {
		Cons_This_cncpt obj1=new Cons_This_cncpt(12);
		System.out.println(obj1.getrollno());

	}

}
