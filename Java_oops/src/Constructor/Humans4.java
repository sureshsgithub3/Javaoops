package Constructor;
/*
 * if parent class wiht constructors overloaded 
 * that many u should call here  to intialize values
 * 
*/
public class Humans4 extends Speicies4{

	

	Humans4(int age) {
		super(age);
		
	}
	Humans4(String  name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	Humans4(){
		
	}
	void display(){
		System.out.println(age+" "+name);
	}

	public static void main(String[] args) {
		Humans4 h1= new Humans4(25);
		Humans4 h2= new Humans4("Humans");
		Humans4 h3=new Humans4();
		h3.age=h1.age;//copying values of  h1 to h3
		h3.name=h2.name;//copying values of  h1 to h3
		h3.display();		

	}

}
