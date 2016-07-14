/**
 * 
 */
package Constructor;

/**
 * if constructors are overloaded in parent we must define same number of constructor here 
 * but using defferent objects we can need access those
 *
 */
public class Humans3 extends Speicies3 {

	Humans3(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}
	Humans3(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	void Print(){
		System.out.println(age+" "+name);
	}

	
	public static void main(String[] args) {
		Humans3 h= new Humans3(25);//accessing different objects using different variables
		Humans3 h1= new Humans3("humans");//accessing different objects using different variables
		h1.Print();
		

	}

}
