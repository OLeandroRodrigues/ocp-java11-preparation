package examples;

public class CreatingAbstractClasses {

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
		//One of the most important features of an abstract class is that it is not actually required
		//to include any abstract methods.
		// sample 
		/*public abstract class Llama {
			public void chew() {}
		}*/
		
		/*Although an abstract class doesn’t have to declare any abstract methods, an abstract
		method can only be defi ned in an abstract class (or an interface, as you will see shortly).*/
		
		/*public class Egret { // DOES NOT COMPILE
			public abstract void peck();
		}*/
		
		//#Constructors in Abstract Classes
		
		/*
		abstract class Bear {
			abstract CharSequence chew();
			public Bear() {
			System.out.println(chew()); // Does this compile?
			}
		}
		
		public class Panda extends Bear {
			String chew() { return "yummy!"; }
			public static void main(String[] args) {
				new Panda();
				}
		}
		
		This code compiles and prints yummy! at runtime.
		For the exam, remember that abstract classes are initialized with constructors in the
		same way as nonabstract classes.
		
		*/
		
		/*#Invalid Abstract Method Declarations*/
		/*#Invalid Modifiers*/
		//#abstract and final Modifiers
		   //->These concepts are in direct confl ict with each other
			/*public abstract final class Tortoise { // DOES NOT COMPILE
				public abstract final void walk(); // DOES NOT COMPILE
			}*/
		//#abstract and private Modifiers
		/*A method cannot be marked as both abstract and private . This rule makes sense if you
		think about it. How would you define a subclass that implements a required method if the
		method is not inherited by the subclass? The answer is you can’t, which is why the compiler
		will complain if you try to do the following:
		public abstract class Whale {
			private abstract void sing(); // DOES NOT COMPILE
		}
		public class HumpbackWhale extends Whale {
			private void sing() {
				System.out.println("Humpback whale is singing");
			}
		}*/
		//#abstract and static Modifiers
		/*a static method cannot be overridden. It is defined as belonging
		to the class, not an instance of the class. If a static method cannot be overridden, then
		it follows that it also cannot be marked abstract since it can never be implemented. For
		example, the following class does not compile:
		abstract class Hippopotamus {
			abstract static void swim(); // DOES NOT COMPILE
		}
		For the exam, make sure you know which modifiers can and cannot be used with one
		another, especially for abstract classes and interfaces.*/
		
		//#Creating a Concrete Class
		/*An abstract class becomes usable when it is extended by a concrete subclass. A concrete
		class is a nonabstract class. The first concrete subclass that extends an abstract class is
		required to implement all inherited abstract methods.*/
		
		/*abstract class Mammal {
			abstract void showHorn();
			abstract void eatLeaf();
		}
		abstract class Rhino extends Mammal {
			void showHorn() {}
		}
		public class BlackRhino extends Rhino {
			void eatLeaf() {}
		}*/
		
		/*In this example, the BlackRhino class is the first concrete subclass, while the Mammal and
		Rhino classes are abstract. The BlackRhino class inherits the eatLeaf() method as abstract
		and is therefore required to provide an implementation, which it does.
		What about the showHorn() method? Since the parent class, Rhino, provides
		an implementation of showHorn(), the method is inherited in the BlackRhino as a
		nonabstract method. For this reason, the BlackRhino class is permitted but not required
		to override the showHorn() method. The three classes in this example are correctly
		defined and compile.*/
		
		//#Reviewing Abstract Class Rules
		
		/*For the exam, you should know the following rules about abstract classes and abstract
		methods. While it may seem like a lot to remember, most of these rules are pretty
		straightforward. For example, marking a class or method abstract and final makes it
		unusable. Be sure you can spot contradictions such as these if you come across them on the
		exam.
		Abstract Class Definition Rules
		1. Abstract classes cannot be instantiated.
		2. All top-level types, including abstract classes, cannot be marked protected or
		private.
		3. Abstract classes cannot be marked final.
		4. Abstract classes may include zero or more abstract and nonabstract methods.
		5. An abstract class that extends another abstract class inherits all of its abstract
		methods.
		6. The first concrete class that extends an abstract class must provide an implementation
		for all of the inherited abstract methods.
		7. Abstract class constructors follow the same rules for initialization as regular constructors,
		except they can be called only as part of the initialization of a subclass.
		These rules for abstract methods apply regardless of whether the abstract method is
		defined in an abstract class or interface.*/
		
		//Abstract Method Definition Rules
		/*1. Abstract methods can be defined only in abstract classes or interfaces.
		2. Abstract methods cannot be declared private or final.
		3. Abstract methods must not provide a method body/implementation in the abstract
		class in which they are declared.
		4. Implementing an abstract method in a subclass follows the same rules for overriding a
		method, including covariant return types, exception declarations, etc.*/
	}

}
