package Constructor;

/*
 *  use of private constructor is to serve singleton classes.
 *   A singleton class is one which limits the number of objects creation to one.
 * 
 * 
 * 

*/
public class Singletonclass {
	
	private Singletonclass(){
		
	}
	
	public void methodsigle10nclass(){
		System.out.println("method in sigle10n class");
	}

	public static void main(String[] args) {
		Singletonclass obj = new Singletonclass();
		obj.methodsigle10nclass();
		
		Singletonclass obj1= new Singletonclass();
		obj1.methodsigle10nclass();
		

	}

}
