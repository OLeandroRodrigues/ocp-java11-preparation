/*	Notes
  	When creating a new class in Java, you can define the class as inheriting from an existing
	class. Inheritance is the process by which a subclass automatically includes any public or
	protected members of the class, including primitives, objects, or methods, defined in the
	parent class.
*/
package examples;

public class UnderstandingInheritance {

	public static void main(String[] args) {
		
		//we refer to any class that inherits from another class as a
		//subclass or child class
		//Alternatively, we refer to the class that the child inherits 
		//from as the superclass or parent class,
		
		/*#Single vs. Multiple Inheritance*/
		//By design, Java doesn’t support multiple inheritance
		//Java does allow one exception to the single inheritance
		//rule that you’ll see in Chapter 9—a class may implement multiple interfaces.
		
		//It is possible in Java to prevent a class from being extended by marking the class with the
		//final modifier.
		
		//#Inheriting Object
		//In Java, all classes inherit from a single class: java.lang.Object, or Object for short.
		//public class Zoo { }
		//public class Zoo extends java.lang.Object { }
		
		/*The result is that every class gains access to any accessible methods in the Object class. For
		example, the toString() and equals() methods are available in Object; therefore, they are
		accessible in all classes.*/
		
	}
	
	public class BigCat{
		public double size;
	}
	
	public class Jaguar extends BigCat{
		public Jaguar() {
			size = 10.2;
		}
		
		public void printDetails() {
			System.out.println(size);
		}
	}

}
