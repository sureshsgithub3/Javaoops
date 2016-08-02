/**
 * 
 */
package Constructor;

/**
 * Constructors can be overloaded but cannt be ovverride
 *
 */
public class Cons_overload_Student1 {
	
	private int stuid;
	private String stuname;
	private int stuage;
	
	
	Cons_overload_Student1(){
		//default constructor
		stuid=1;
		stuage=20;
		stuname="suresh";
		
	}
	
	Cons_overload_Student1(int id,String name,int age){
		
		//constructor overloaded
		stuage=age;
		
		stuid=id;
		stuname=name;
	}
	
	public String getname(){
		return stuname;
		
	}
	
	public void setname(String name){
		stuname=name;
	}
	
	public int getid(){
		return stuid;
	}
	
	public void setid(int id){
	 stuid=id;
	}
	
	public int getage(){
		return stuage;
	}
	public void setage(int age){
		stuage=age;
	}
	
	
	
	
	
	
	

}
