/**
 * 
 */
package Constructor;

/**
 * @author suresh
 *when we are extending a class with contructor with parameterised then it should be in invoked in child class
 */
public class Boy1 extends Human1 {
	
static	String race="Humans";
	
	
	
	
  // when we are extending a class with contructor with parameterised then it should be in involed in child class
  Boy1(){
	  super(race);
	 
	}
  
 void details(){
	  System.out.println(speices);
  }
	
	public static void main(String[] args) {
		
		Boy1 b= new Boy1();
		
		b.details();
		
	}

}
