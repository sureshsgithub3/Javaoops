package Constructor;

public class ConstructorConcepts {
	/*Every class has a constructor whether it�s normal one or a abstract class.
	 * constructor are not methods and they don�t have any return type.
	 * Constructor name and class name should be the same.
	 * Constructor can use any access specifier, they can be declared as private also.  
	 * Private constructors are possible in java but there scope is within the class only.
	 * Like constructors method can also have name same as class name, but still they have return type, 
	 * though which we can identify them that they are methods not constructors.
	 * If you don�t define any constructor within the class, 
	 * compiler will do it for you and it will create a constructor for you.
	 * this() and super() should be the first statement in the constructor code.If you don�t mention them, compiler does it for you accordingly.
	 * Constructor overloading is possible but overriding is not possible.
	 * Constructors can not be inherited.
	 * If Super class doesn�t have a no-arg(default) constructor then compiler would not define a default one in child class as it does in normal scenario.
	 * Interfaces do not have constructors.
	 * Abstract can have constructors and these will get invoked when a class, which implements interface, gets instantiated. (i.e. object creation of concrete class).
	 * A constructor can also invoke another constructor of the same class � By using this(). If you wanna invoke a arg-constructor then give something like: this(parameter list).
	 * 
	 * Constructor is a block of code that allows you to create an object of class.
	 * Java constructor is invoked at the time of object creation. 
	 * It constructs the values i.e. provides data for the object that is why it is known as constructor.
	 * There are basically two rules defined for the constructor.
	 * 1.Constructor name must be same as its class name
	 * 2.Constructor must have no explicit return type.
	 * There are three types of constructors: 
	 * 1. default, 
	 * 2. no-arg and
	 * 3.parameterised.
	 * If there is no constructor in a class, compiler automatically creates a default constructor.
	 * this is called default constructor
	 * constructor cannot be override .
	 * when we are extending a class with contructor with parameterised then it should be in involed in child class.
	 * 

     
      
	
     */
}
