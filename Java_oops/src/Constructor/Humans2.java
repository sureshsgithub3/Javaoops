/**
 * 
 */
package Constructor;

/**
 * @author suresh
 *
 */
public class Humans2 extends Speicies2 {

	Humans2(String name, int ageonearth) {
		super("humans", 2000);
		
	}


	void print(){
		System.out.println(name+" "+ageonearth);
	}
	
	
	public static void main(String[] args) {
		Humans2 h= new Humans2("Humans", 2000);
		h.print();

	}

}
