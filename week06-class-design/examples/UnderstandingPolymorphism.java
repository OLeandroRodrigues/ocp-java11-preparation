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

	}

}
