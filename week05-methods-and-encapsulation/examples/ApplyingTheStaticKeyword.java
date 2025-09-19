/*
 * 	Notes
 	When the static keyword is applied to a variable, method, or class, it applies to the class
	rather than a specific instance of the class. In this section, you will see that the static keyword
	can also be applied to import statements.
*/
package examples;

public class ApplyingTheStaticKeyword {

	public static void main(String[] args) {

		/*#Designing static Methods and Fields*/
		
		//Static methods have two main purposes:
		/* 	-> For utility or helper methods that don’t require any object state. Since there is no need
				to access instance variables, having static methods eliminates the need for the caller
				to instantiate an object just to call the method.
			-> For state that is shared by all instances of a class, like a counter. All instances must
				share the same state. Methods that merely use that state should be static as well.
		*/
		
		/*#Accessing a static Variable or Method*/
		/*5: Koala k = new Koala();
		6: System.out.println(k.count); // k is a Koala
		7: k = null;
		8: System.out.println(k.count); // k is still a Koala*/
		//Believe it or not, this code outputs 0 twice.
		//Java doesn’t care that k happens to be null . 
		//Since we are looking for a static , it doesn’t matter.
		
		/*Note!
		Remember to look at the reference type for a variable when you see a
		static method or variable. The exam creators will try to trick you into
		thinking a NullPointerException is thrown because the variable happens
		to be null . Don’t be fooled!*/
		
		/*#Static vs. Instance*/
		/*
		 	There’s another way the exam creators will try to trick you regarding static and instance
			members. A static member cannot call an instance member without referencing an
			instance of the class. This shouldn’t be a surprise since static doesn’t require any instances
			of the class to even exist.
			The following is a common mistake for rookie programmers to make:
		 */
		/*
			public class Static {
				private String name = "Static class";
				public static void first() { }
				public static void second() { }
				public void third() { System.out.println(name); }
				public static void main(String args[]) {
					first();
					second();
					third(); // DOES NOT COMPILE
					}
				}
		 */
		
		/*
		public class Giraffe {
			public void eat(Giraffe g) {}
			public void drink() {};
			public static void allGiraffeGoHome(Giraffe g) {}
			public static void allGiraffeComeOut() {}
			}*/
		
		/*Table 7.3 Static vs. instance calls
		Type 						Calling 			Legal?
		allGiraffeGoHome() 			allGiraffeComeOut() Yes
		allGiraffeGoHome() 			drink() 			No
		allGiraffeGoHome() 			g.eat() 			Yes
		eat() 						allGiraffeComeOut() Yes
		eat() 						drink() 			Yes
		eat() 						g.eat() 			Yes*/
		
		/*#static Variables*/
		/*	Some static variables are meant to change as the program runs. Counters are a common
			example of this.
			
			public class Initializers {
				private static int counter = 0; // initialization
			}
		*/
		/*	Other static variables are meant to never change during the program. This type of
			variable is known as a constant.
			
			public class Initializers {
				private static final int NUM_BUCKETS = 45;
				public static void main(String[] args) {
				NUM_BUCKETS = 5; // DOES NOT COMPILE
				}
			}
		*/
		
		/*#Static Initialization*/
		/*
			private static final int NUM_SECONDS_PER_MINUTE;
			private static final int NUM_MINUTES_PER_HOUR;
			private static final int NUM_SECONDS_PER_HOUR;
			static {
			NUM_SECONDS_PER_MINUTE = 60;
			NUM_MINUTES_PER_HOUR = 60;
			}
			static {
			NUM_SECONDS_PER_HOUR
			= NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR;
			}	
		 */
		/*
			14: private static int one;
			15: private static final int two;
			16: private static final int three = 3;
			17: private static final int four; // DOES NOT COMPILE
			18: static {
			19: one = 1;
			20: two = 2;
			21: three = 3; // DOES NOT COMPILE
			22: two = 4; // DOES NOT COMPILE
			23: }
			*/
		
		  /*#Static Imports*/
		  //Static imports are for importing static members of classes
		  //Note
		  /*
		   	In a large program, static imports can be overused. When importing from
			too many places, it can be hard to remember where each static member
			comes from.*/
		  //The previous method has one static method call: Arrays.asList . Rewriting the code
		  //to use a static import yields the following:
		
			/*	import java.util.List;
				import static java.util.Arrays.asList; // static import
				public class StaticImports {
					public static void main(String[] args) {
						List<String> list = asList("one", "two"); // no Arrays.
					}
				}*/

	}

}
