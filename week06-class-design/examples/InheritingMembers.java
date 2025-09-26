package examples;

public class InheritingMembers {

	public static void main(String[] args) {
		
		/*#Calling Inherited Members*/
		
		//Remember, you can use this to access visible members of the
		//current or a parent class, and you can use super to access visible members of a parent class
		/*public void displaySharkDetails() {
			System.out.print("Shark with age: "+super.getAge());
			System.out.print(" and "+super.size+" meters long");
			System.out.print(" with "+this.numberOfFins+" fins");
			}*/
		
		/*#Inheriting Methods*/
		/*Overriding a Method*/
		
		//To override a method, you must follow a number of rules. The compiler performs the
		//following checks when you override a method:
		
		/*1. The method in the child class must have the same signature as the method in the
			parent class.
		2. The method in the child class must be at least as accessible as the method in the
			parent class.
		3. The method in the child class may not declare a checked exception that is new or
			broader than the class of any exception declared in the parent class method.
		4. If the method returns a value, it must be the same or a subtype of the method in the
			parent class, known as covariant return types.*/
		
		/*Defining Subtype and Supertype
		When discussing inheritance and polymorphism, we often use the word subtype rather
		than subclass, since Java includes interfaces. A subtype is the relationship between two
		types where one type inherits the other. If we define X to be a subtype of Y, then one of
		the following is true:
			-> X and Y are classes, and X is a subclass of Y.
			-> X and Y are interfaces, and X is a subinterface of Y.
			-> X is a class and Y is an interface, and X implements Y (either directly or through an
					inherited class).
			Likewise, a supertype is the reciprocal relationship between two types where one type
			is the ancestor of the other. Remember, a subclass is a subtype, but not all subtypes are
			subclasses.*/
		
		/*IMPORTANT:
		Any time you see a method on the exam with the same name as a method in the parent
		class, determine whether the method is being overloaded or overridden first; doing so
		will help you with questions about whether the code will compile.*/
		
		/*#Overriding a Generic Method*/
		/*Overriding methods is complicated enough, but add generics to it and things only get more
		challenging*/
		
		/*We cannot overload methods by changing the generic type
		due to type erasure*/
		
		/*public class LongTailAnimal {
			protected void chew(List<Object> input) {}
			protected void chew(List<Double> input) {} // DOES NOT COMPILE
			}*/
		
		//For the same reason, you also can’t overload a generic method in a parent class.
		
		/*public class LongTailAnimal {
			protected void chew(List<Object> input) {}
			}
			public class Anteater extends LongTailAnimal {
			protected void chew(List<Double> input) {} // DOES NOT COMPILE
			}*/
		
		//#Generic Method Parameters
		//On the other hand, you can override a method with generic parameters, but you must
		//match the signature including the generic type exactly.
		
		/*public class LongTailAnimal {
			protected void chew(List<String> input) {}
			}
		public class Anteater extends LongTailAnimal {
			protected void chew(List<String> input) {}
			}*/
		
		//#Generic Return Types
		/*
		 	When you’re working with overridden methods that return generics, the return values must
			be covariant. In terms of generics, this means that the return type of the class or interface
			declared in the overriding method must be a subtype of the class defined in the parent class.
*/
		/*
		 	public class Mammal {
				public List<CharSequence> play() { ... }
				public CharSequence sleep() { ... }
			}
			public class Monkey extends Mammal {
				public ArrayList<CharSequence> play() { ... }
			}
			public class Goat extends Mammal {
				public List<String> play() { ... } // DOES NOT COMPILE
				public String sleep() { ... }
			} 
		 
		 */
		
		//#Redeclaring private Methods
		
		//Java permits you to redeclare a new method in the child class with the same or modified
		//signature as the method in the parent class
		
		//#Hiding Static Methods
		
		/*A hidden method occurs when a child class defines a static method with the same name
		and signature as an inherited static method defined in a parent class.*/
		
		//#Creating final Methods
		//By marking a method final, you forbid a child class from replacing this method.
		
		//#Hiding Variables
		/*A hidden variable occurs when a child class defines a variable with the same name as an
		inherited variable defined in the parent class. This creates two distinct copies of the variable
		within an instance of the child class: one instance defined in the parent class and one
		defined in the child class.*/
		

	}
	
	class Canine {
		 double getAverageWeight() {
			return 0;
		}
	}
	
	class Wolf extends Canine {
		double getAverageWeight() {
			return super.getAverageWeight()+20;
		}
	}

}
