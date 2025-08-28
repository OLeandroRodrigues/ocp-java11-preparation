/*
 Notes
 	Concatenation
 		Placing one String before the other String and combining them is called string concatenation. The
		exam creators like string concatenation because the + operator can be used in two ways
		within the same line of code.
 */

public class CreatingAndManipulatingString {

	public static void main(String[] args) {
		// 
		String name1 = "Fluffy";
		String name2 = new String("Fluffy");
		
		// Both snippets are equal, (“The String Pool” will be study later on). String class 
		// is special and doesn’t need to be instantiated with new
		
		/*CONCATENATION - BEGIN*/
		CreatingAndManipulatingString.Concatenation.Samples();
		/*CONCATENATION - END*/
	}
	
	class Concatenation{

		public Concatenation() {}
		public static void Samples() {
		
			// Sample 1
			/*There aren’t a lot of rules to know for this, but you have to
			know them well:
			1. If both operands are numeric, + means numeric addition.
			2. If either operand is a String, + means concatenation.
			3. The expression is evaluated left to right.
			Now let’s look at some examples:*/
			System.out.println(1 + 2); // 3
			System.out.println("a" + "b"); // ab
			System.out.println("a" + "b" + 3); // ab3
			System.out.println(1 + 2 + "c"); // 3c
			System.out.println("c" + 1 + 2); // c12
			System.out.println("c" + 1 + 2 + "d"); // c12d
			
		}
	}

}
