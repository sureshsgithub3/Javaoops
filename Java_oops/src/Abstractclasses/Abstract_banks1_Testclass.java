package Abstractclasses;

public class Abstract_banks1_Testclass {

	public static void main(String[] args) {
		Abstract_exmp_bank1 b= new Sbi1_bank1();
		Abstract_exmp_bank1 b1= new Icici_bank1();
		System.out.println(b.getintersetrate());
		System.out.println(b1.getintersetrate());

	}

}
