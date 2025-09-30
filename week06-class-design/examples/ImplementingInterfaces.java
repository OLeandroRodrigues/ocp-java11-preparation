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

	}

}
