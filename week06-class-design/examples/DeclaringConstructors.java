/*Notes
  When taking the exam, pay close attention to any question involving two
	or more classes related by inheritance. Before even attempting to answer
	the question, you should check that the constructors are properly defined
	using the previous set of rules. You should also verify the classes include
	valid access modifiers for members. Once those are verified, you can continue
	answering the question.
 */
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
		
		/*#Calling Parent Constructors with super()*/
		/*public class Animal {
			private int age;
			public Animal(int age) {
			super(); // Refers to constructor in java.lang.Object
			this.age = age;
			}
		}
		
		public class Zebra extends Animal {
			public Zebra(int age) {
			super(age); // Refers to constructor in Animal
			}
			public Zebra() {
				this(4); // Refers to constructor in Zebra with int argument
			}
		}

		this() -> call a constructor of the same class
		super() -> class a constructor of the parent class
		*/
		
		/*#Missing a Default No-Argument Constructor*/
		
		/*public class Mammal {
			public Mammal(int age) {}
			}
			public class Elephant extends Mammal { // DOES NOT COMPILE
			}
		public class Elephant extends Mammal {
			public Elephant() {
			super(); // DOES NOT COMPILE
			}
		}			
			*/
		
		/*#Constructors and final Fields*/
		//final static variables must be assigned a value exactly once.
		/*
		 	public class MouseHouse {
				private final int volume;
				private final String name = "The Mouse House";
				{
					volume = 10;
				}
			}
		  // Like other final variables, once the value is assigned, it cannot be changed
		   
		   On the exam, be wary of any instance variables marked final . Make
			sure they are assigned a value in the line where they are declared, in an
			instance initializer, or in a constructor. They should be assigned a value
			only once, and failure to assign a value is considered a compiler error in
			the constructor.
		  
		 */
		
		/*#Order of Initialization*/
		//We summarize the order of initialization for a class as follows:
		//Initialize Class X
		/*	1. If there is a superclass Y of X, then initialize class Y first.
			2. Process all static variable declarations in the order they appear in the class.
			3. Process all static initializers in the order they appear in the class.*/
		
		/*#Instance Initialization*/
		/*Instance initialization is a bit more complicated than class initialization, because a class or superclass
		may have many constructors declared but only a handful used as part of instance
		initialization.*/
		//We summarize the order of initialization for an instance as follows:
		//Initialize Instance of X
		/*	1. If there is a superclass Y of X, then initialize the instance of Y first.
			2. Process all instance variable declarations in the order they appear in the class.
			3. Process all instance initializers in the order they appear in the class.
			4. Initialize the constructor including any overloaded constructors referenced with this().*/
		
		
	    
	}

}
