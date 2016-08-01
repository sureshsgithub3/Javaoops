package ThisKeyword;

public class This_used_constructor_chaining {
	
	int num;
	String name;
	String city;
	
	This_used_constructor_chaining(int i,String n){
		this.num=i;
		this.name=n;
	}
	
	This_used_constructor_chaining(int i,String n,String c){
		this(i, n);//now no need to initialize num and name  
		this.city=c;
		
	}
    
	
	public void display(){
		System.out.print("city "+city +" name  :"+name +" num    "+num);
	}
	public static void main(String[] args) {
		This_used_constructor_chaining obj= new This_used_constructor_chaining(10, "suresh", "hyd");
		obj.display();
		

	}

}
