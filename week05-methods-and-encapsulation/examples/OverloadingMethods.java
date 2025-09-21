/*
 * 	Notes
 	Method overloading occurs when methods have the same name but different method signatures
*/
package examples;

public class OverloadingMethods {

	public static void main(String[] args) {
		
		// Everything other than the method name can vary for overloading methods
		//These are all valid overloaded methods:
		
		/*
		public void fly(int numMiles) {}
		public void fly(short numFeet) {}
		public boolean fly() { return false; }
		void fly(int numMiles, short numFeet) {}
		public void fly(short numFeet, int numMiles) throws Exception {}*/
		
		//Now let’s look at an example that is not valid overloading:
		/*
		public void fly(int numMiles) {}
		public int fly(int numMiles) {} // DOES NOT COMPILE
		
		public void fly(int numMiles) {}
		public static void fly(int numMiles) {} // DOES NOT COMPILE

		*/
		
		//Let’s look at some more complex scenarios that you may encounter on the exam.
		//#Varargs
		
		/*public void fly(int[] lengths) {}
		public void fly(int... lengths) {} // DOES NOT COMPILE*/
		// int... lengths = int[] :D
		
		//#Autoboxing
		/*public void fly(int numMiles) {}
		public void fly(Integer numMiles) {} :D*/
		
		//#Reference Types
		/*public class ReferenceTypes {
			public void fly(String s) {
			System.out.print("string");
		}
		public void fly(Object o) {
			System.out.print("object");
		}
		public static void main(String[] args) {
			ReferenceTypes r = new ReferenceTypes();
			r.fly("test");
			System.out.print("-");
			r.fly(56);
			}*/
		// the outcome will be string-object
		
		//What does this print?
		
		/*public static void print(Iterable i) {
			System.out.print("I");
			}
			public static void print(CharSequence c) {
			System.out.print("C");
			}
			public static void print(Object o) {
			System.out.print("O");
			}
			public static void main(String[] args){
			print("abc");
			print(new ArrayList<>());
			print(LocalDate.of(2019, Month.JULY, 4));
			}
			*/
		
     	// CIO :D
		/*#Generics*/
		//You might be surprised to learn that these are not valid overloads:
		/*public void walk(List<String> strings) {}
		public void walk(List<Integer> integers) {} // DOES NOT COMPILE*/
		
		/*Java has a concept called type erasure where generics are used only at compile time.
		That means the compiled code looks like this:
		public void walk(List strings) {}
		public void walk(List integers) {} // DOES NOT COMPILE
		We clearly can’t have two methods with the same method signature, so this doesn’t
		compile*/
		
		/*#Arrays*/
		}
	
	

}
