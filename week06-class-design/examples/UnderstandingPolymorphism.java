/*
 * Notes
   Polymorphism, the property of an object to take on many different forms.
   To put this more precisely, a Java object may be accessed using a reference with the same type
   as the object, a reference that is a superclass of the object, or a reference that defines an
   interface the object implements, either directly or through a superclass.
*/

package examples;

public class UnderstandingPolymorphism {

	public static void main(String[] args) {
		
		//IllustratING this polymorphism property with the following example:
		
		/*
		public class Primate {
			public boolean hasHair() {
			return true;
			}
		}
		public interface HasTail {
			public abstract boolean isTailStriped();
		}
		
		public class Lemur extends Primate implements HasTail {
			public boolean isTailStriped() {
				return false;
			}
			public int age = 10;
			public static void main(String[] args) {
				Lemur lemur = new Lemur();
				System.out.println(lemur.age);
				HasTail hasTail = lemur;
				System.out.println(hasTail.isTailStriped());
				Primate primate = lemur;
				System.out.println(primate.hasHair());
			}
		}
		
		This code compiles and prints the following output:
		10
		false
		true

		*/
		
		//#Object vs. Reference
		/*In Java, all objects are accessed by reference, so as a developer you never have direct access
		to the object itself. Conceptually, though, you should consider the object as the entity that
		exists in memory, allocated by the Java runtime environment*/
		
		//#Casting Objects
		/*In the previous example, we created a single instance of a Lemur object and accessed it via
		superclass and interface references. Once we changed the reference type, though, we lost
		access to more specific members defined in the subclass that still exist within the object. We
		can reclaim those references by casting the object back to the specific subclass it came from:
			
		Primate primate = new Lemur(); // Implicit Cast
		Lemur lemur2 = primate; // DOES NOT COMPILE
		System.out.println(lemur2.age);
		Lemur lemur3 = (Lemur)primate; // Explicit Cast
		System.out.println(lemur3.age);*/
		
		//#The instanceof Operator
		//to prevent ClassCastExceptions at runtime.
		/*performs the cast only if the instanceof operator returns true:
		if(rodent instanceof Capybara) {
			Capybara capybara = (Capybara)rodent;
		}*/
		
		//#Polymorphism and Method Overriding
		
		/*class Penguin {
			public int getHeight() { return 3; }
			public void printInfo() {
				System.out.print(this.getHeight());
			}
		}
		
		public class EmperorPenguin extends Penguin {
			public int getHeight() { return 8; }
			public static void main(String []fish) {
				new EmperorPenguin().printInfo();
			}
		}*/
		//If you said 8, then you are well on your way to understanding polymorphism.
		/*The facet of polymorphism that replaces methods via overriding is one of the most
		important properties in all of Java.*/
		
		/*#Overriding vs. Hiding Members*/
		/*class Penguin {
			public static int getHeight() { return 3; }
			public void printInfo() {
				System.out.println(this.getHeight());
			}
		}
		public class CrestedPenguin extends Penguin {
			public static int getHeight() { return 8; }
			public static void main(String... fish) {
				new CrestedPenguin().printInfo();
			}
		}*/
		/*The CrestedPenguin example is nearly identical to our previous EmporerPenguin example,
		although as you probably already guessed, it prints 3 instead of 8.*/
		//Let’s try a more complex example:
		/*class Marsupial {
			protected int age = 2;
			public static boolean isBiped() {
				return false;
			}
		}
		
		public class Kangaroo extends Marsupial {
			protected int age = 6;
			public static boolean isBiped() {
				return true;
			}
			public static void main(String[] args) {
				Kangaroo joey = new Kangaroo();
				Marsupial moey = joey;
				System.out.println(joey.isBiped());
				System.out.println(moey.isBiped());
				System.out.println(joey.age);
				System.out.println(moey.age);
			}
		}*/
		/*
		 	The program prints the following:
			true
			false
			6
			2
		*/
		/*
		 	Remember, in this example, only one object, of type Kangaroo, is created and stored in
			memory. Since static methods can only be hidden, not overridden, Java uses the reference
			type to determine which version of isBiped() should be called, resulting in joey.isBiped()
			printing true and moey.isBiped() printing false.
			Likewise, the age variable is hidden, not overridden, so the reference type is used to determine
			which value to output. This results in joey.age returning 6 and moey.age returning 2
		*/
		
		

	}

}
