package examples;

public class DeclaringConstructors {

	public static void main(String[] args) {
			
		/*#Creating a Constructor*/
		
		/*Let’s start with a simple constructor:
			public class Bunny {
			public Bunny() {
			System.out.println("constructor");
			}
		}*/
		
		/*Like method parameters, constructor parameters can be any valid class, array, or primitive
		type, including generics, but may not include var. The following does not compile:*/
		
		/*class Bonobo {
			public Bonobo(var food) { // DOES NOT COMPILE
			}
		}*/
		
		/*Declaring multiple constructors with different
		signatures is referred to as constructor overloading. The following Turtle class has four
		distinct overloaded constructors:*/
		/*public class Turtle {
			private String name;
			public Turtle() {
				name = "John Doe";
			}
			public Turtle(int age) {}
			public Turtle(long age) {}
			public Turtle(String newName, String... favoriteFoods) {
				name = newName;
			}
		}*/
		
		/*#Default Constructor*/
		/*public class Rabbit {
			public static void main(String[] args) {
			Rabbit rabbit = new Rabbit(); // Calls default constructor
			}
		}*/
		
		/*#Calling Overloaded Constructors with this()*/
		
	    
	}

}
