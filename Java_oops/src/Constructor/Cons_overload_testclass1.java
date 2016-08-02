package Constructor;

public class Cons_overload_testclass1 {

	public static void main(String[] args) {
		Cons_overload_Student1 obj1=new Cons_overload_Student1();
		obj1.setid(1);;
		obj1.setname("suresh");
		obj1.setage(28);
		System.out.println(obj1.getname());
		System.out.println(obj1.getid());
		System.out.println(obj1.getage());
		
		Cons_overload_Student1 obj2=new Cons_overload_Student1(2, "chandra",28);
		System.out.println(obj2.getname());
		System.out.println(obj2.getid());
		System.out.println(obj2.getage());

	}

}
