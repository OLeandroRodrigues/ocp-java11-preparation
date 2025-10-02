/*
 Note
 	There are four types of nested classes you will need
	to know about: member inner classes, local classes, anonymous classes,
	and static nested classes. You’ll also need to know more detail about
	member inner classes
 */
package examples;

public class IntroducingInnerClasses {

	public static void main(String[] args) {
		
		//#Defining a Member Inner Class
		
		/*A member inner class is a class defi ned at the member level of a class (the same level as the
		methods, instance variables, and constructors). It is the opposite of a top-level class, in that
		it cannot be declared unless it is inside another class.*/
		
		//The following is an example of an outer class Zoo with an inner class Ticket :
		/*public class Zoo {
			public class Ticket {}
		}
		//We can expand this to include an interface.
		public class Zoo {
			private interface Paper {}
			public class Ticket implements Paper {}
		}*/
		
		//A member inner class can be declared with all of the same access modifiers as a 
		//class member, such as public, protected, default (package-private), or private.
		
		//#Using a Member Inner Class
		/*One of the ways a member inner class can be used is by calling it in the outer class.
		Continuing with our previous example, let’s define a method in Zoo that makes use of the
		member inner class with a new sellTicket() method.*/
		
		/*public class Zoo {
			private interface Paper {
				public String getId();
			}
			public class Ticket implements Paper {
				private String serialNumber;
				public String getId() { return serialNumber; }
			}
			public Ticket sellTicket(String serialNumber) {
				var t = new Ticket();
				t.serialNumber = serialNumber;
				return t;
			}
		}
			}*/
		
		/*The advantage of using a member inner class in this example is that the Zoo class completely
		manages the lifecycle of the Ticket class.
		Let’s add an entry point to this example.*/
		
		/*public class Zoo {
			...
			public static void main(String... unused) {
			var z = new Zoo();
			var t = z.sellTicket("12345");
			System.out.println(t.getId()+" Ticket sold!");
			}
		}
		
		This compiles and prints 12345 Ticket sold! at runtime
		*/

	}

}
