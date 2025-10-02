package examples;

public class ImplementingInterfaces {

	public static void main(String[] args) {
		//#Defining an Interface
		/*For brevity, we sometimes say “an instance of an interface” to mean an
		instance of a class that implements the interface.*/
		
		//How do you use an interface?
		/*interface Climb {
			Number getSpeed(int age);
			}
		public class FieldMouse implements Climb, OtherInterface{
				public Float getSeepd(int age){
					return 11f;
				}
		}
			*/
		
		//Like a class, an interface can extend another interface using the extends keyword.
		/*interface Nocturnal {}
		public interface HasBigEyes extends Nocturnal {}*/
		
		//Many of the rules for class declarations also apply to interfaces including the following:
		/*-> A Java file may have at most one public top-level class or interface, and it must match
		the name of the file.
		-> A top-level class or interface can only be declared with public or package-private
		access.*/
		
		//#Inserting Implicit Modifiers
		/*The following list includes the implicit modifiers for interfaces that you need to know for
		the exam:
		-> Interfaces are assumed to be abstract.
		-> Interface variables are assumed to be public, static, and final.
		-> Interface methods without a body are assumed to be abstract and public.*/
		
		/*For example, the following two interface definitions are equivalent, as the compiler will
		convert them both to the second declaration:
		public interface Soar {
			int MAX_HEIGHT = 10;
			final static boolean UNDERWATER = true;
			void fly(int speed);
			abstract void takeoff();
			public abstract double dive();
		}
		public abstract interface Soar {
			public static final int MAX_HEIGHT = 10;
			public final static boolean UNDERWATER = true;
			public abstract void fly(int speed);
			public abstract void takeoff();
			public abstract double dive();
		}*/
		
		//#Conflicting Modifiers
		/*What happens if a developer marks a method or variable with a modifier that conflicts with
		an implicit modifier? For example, if an abstract method is assumed to be public, then can
		it be explicitly marked protected or private?
		public interface Dance {
			private int count = 4; // DOES NOT COMPILE
			protected void step(); // DOES NOT COMPILE
		}*/
		
		//#Differences between Interfaces and Abstract Classes
		
		/*
		abstract class Husky {
			abstract void play();
		}
		interface Poodle {
			void play();
		}
		class Webby extends Husky {
			void play() {}
		}
		class Georgette implements Poodle {
			void play() {}
		}
		The Webby class compiles, but the Georgette class does not. (package-private)
		*/
		
		//#Inheriting an Interface
		//An interface can be inherited in one of three ways.
		/*
		-> An interface can extend another interface.
		-> A class can implement an interface.
		-> A class can extend another class whose ancestor implements an interface.
		*/
		
		//abstract class that implements an interface:
		/*public interface HasTail {
			public int getTailLength();
		}
		public interface HasWhiskers {
				public int getNumberOfWhiskers();
		}
		public abstract class HarborSeal implements HasTail, HasWhiskers {}
		public class CommonSeal extends HarborSeal { // DOES NOT COMPILE }*/
			
		/*The HarborSeal class is not required to implement any of the abstract methods it inherits
		from the HasTail and HasWhiskers because it is marked abstract. The concrete class
		CommonSeal, which extends HarborSeal, is required to implement all inherited abstract
		methods. In this example, CommonSeal doesn’t provide an implementation for the inherited
		abstract interface methods, so CommonSeal doesn’t compile.*/
		
		//#Mixing Class and Interface Keywords
		/*public interface CanRun {}
		public class Cheetah extends CanRun {} // DOES NOT COMPILE
		public class Hyena {}
		public interface HasFur extends Hyena {} // DOES NOT COMPILE*/
		
		//#Duplicate Interface Method Declarations
		/*
		public interface Herbivore {
			public void eatPlants();
			}
		public interface Omnivore {
			public void eatPlants();
			public void eatMeat();
		}
		In this scenario, the signatures for the two interface methods eatPlants() are duplicates.
		As they have identical method declarations, they are also considered compatible
		
		No errors


		But 
		interface Dances {
			int countMoves();
		}
		interface EatsFish {
			boolean countMoves();
		}
		public class Penguin implements Dances, EatsFish { // DOES NOT COMPILE
			...
		}
		
		Since it is not possible to define a version of countMoves() that returns both int and
		boolean, there is no implementation of the Penguin that will allow this declaration to compile

		with abstract class we have the same behaviour above
		*/
		
		//#Polymorphism and Interfaces
		
		//#Abstract Reference Types
		/*When working with abstract types, you may prefer to work with the abstract reference
		types, rather than the concrete class. This is especially common when defining method
		parameters. Consider the following implementation:*/
		
		/*
		import java.util.*;
		public class Zoo {
			public void sortAndPrintZooAnimals(List<String> animals) {
				Collections.sort(animals);
				for(String a : animals) {
					System.out.println(a);
				}
			}
		}*/
		
		//#Casting Interfaces
		/*Let’s say you have an abstract reference type variable, which has been instantiated by a
		concrete subclass. If you need access to a method that is only declared in the concrete subclass,
		then you will need to cast the interface reference to that type, assuming the cast is
		supported at runtime*/
		
		//#Interfaces and the instanceof Operator
		/*public class MyNumber extends Number implements List
		Integer tickets = 6;
		if(tickets instanceof List) {} // DOES NOT COMPILE*/
		
		/*The compiler rejects this code because the Integer class is marked final and does not
		inherit List. Therefore, it is not possible to create a subclass of Integer that inherits the
		List interface.*/
		
		//#Reviewing Interface Rules
		
		/*Interface Definition Rules
		1. Interfaces cannot be instantiated.
		2. All top-level types, including interfaces, cannot be marked protected or private.
		3. Interfaces are assumed to be abstract and cannot be marked final.
		4. Interfaces may include zero or more abstract methods.
		5. An interface can extend any number of interfaces.
		6. An interface reference may be cast to any reference that inherits the interface, although
		this may produce an exception at runtime if the classes aren’t related.
		7. The compiler will only report an unrelated type error for an instanceof operation
		with an interface on the right side if the reference on the left side is a final class that
		does not inherit the interface.
		8. An interface method with a body must be marked default, private, static, or
		private static (covered when studying for the 1Z0-816 exam).
		The following are the five rules for abstract methods defined in interfaces.
		
		Abstract Interface Method Rules
		1. Abstract methods can be defined only in abstract classes or interfaces.
		2. Abstract methods cannot be declared private or final.
		3. Abstract methods must not provide a method body/implementation in the abstract
		class in which is it declared.
		4. Implementing an abstract method in a subclass follows the same rules for overriding a
		method, including covariant return types, exception declarations, etc.
		5. Interface methods without a body are assumed to be abstract and public.
		Notice anything? The first four rules for abstract methods, whether they be defined in
		abstract classes or interfaces, are exactly the same! The only new rule you need to learn for
		interfaces is the last one.
		
		Interface Variables Rules
		1. Interface variables are assumed to be public, static, and final.
		2. Because interface variables are marked final, they must be initialized with a value
		when they are declared.*/

	}

}
