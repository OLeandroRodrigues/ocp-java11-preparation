package examples;

public class AdvancedClassDesign {

	public static void main(String[] args) {


		/*You learned that a subclass can override an inherited method defined in a
		parent class. Overriding a method potentially changes the behavior of a method in the parent
		class. For example, take a look at the following Bird class and its Stork subclass:*/
		
		/*class Bird {
			public String getName() { return null; }
			public void printName() {
				System.out.print(getName());
			}
		}
		
		public class Stork extends Bird {
			public String getName() { return "Stork!"; }
			public static void main(String[] args) {
				new Stork().printName();
			}
		}*/
		
		//#abstract class
		/*An abstract class is a class that cannot be instantiated and may
		contain abstract methods. An abstract method is a method that does not define an implementation
		when it is declared. Both abstract classes and abstract methods are denoted with
		the abstract modifier.*/
		
		/*Compare our previous implementation with this new one using an
		abstract Bird class:*/
		/*abstract class Bird {
			public abstract String getName();
			public void printName() {
				System.out.print(getName());
			}
		}
		public class Stork extends Bird {
			public String getName() { return "Stork!"; }
			public static void main(String[] args) {
				new Stork().printName();
			}
		}
		 
		The following implementation does not compile because Stork does not override the required
		abstract getName() method:
		
		public class Stork extends Bird {} // DOES NOT COMPILE
		
		 */
		
		/*Earlier, we said that an abstract class is one that cannot be instantiated. This means that
		if you attempt to instantiate it, the compiler will report an exception, as in this example:
		abstract class Alligator {
			public static void main(String... food) {
				var a = new Alligator(); // DOES NOT COMPILE
			}
		}
		An abstract class can be initialized, but only as part of the instantiation of a nonabstract
		subclass.*/
		
		//#Defining Abstract Methods
	}

}
