package Static;

public class Static_class_nexted {
	
	//nested class
	static class X{
		static String str="from insideclass x";
		
	}

	public static void main(String[] args) {
		X x= new X();
		//x.str="overrding  str from outer class";
		//System.out.println(x.str);
		System.out.println(X.str);
		

	}

}
