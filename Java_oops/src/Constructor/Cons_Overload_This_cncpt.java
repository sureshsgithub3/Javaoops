package Constructor;

public class Cons_Overload_This_cncpt {

	int rollno;
	
	Cons_Overload_This_cncpt(){
		rollno=100;
	}
	
	Cons_Overload_This_cncpt(int rno){
		this();
		//this should be first at first
	}
	

}
