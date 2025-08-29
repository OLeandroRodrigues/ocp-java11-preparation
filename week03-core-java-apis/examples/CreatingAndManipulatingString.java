/*
 Notes
 	Concatenation
 		Placing one String before the other String and combining them is called string concatenation. The
		exam creators like string concatenation because the + operator can be used in two ways
		within the same line of code.
 */


public class CreatingAndManipulatingString {
	
	public CreatingAndManipulatingString(){}

	public static void main(String[] args) {
		// 
		String name1 = "Fluffy";
		String name2 = new String("Fluffy");
		
		// Both snippets are equal, (“The String Pool” will be study later on). String class 
		// is special and doesn’t need to be instantiated with new
		
		/*CONCATENATION - BEGIN*/
		CreatingAndManipulatingString.Concatenation.Samples();
		/*CONCATENATION - END*/
		
		/*STRING MAIN METHODS- BEGIN*/
		CreatingAndManipulatingString.StringMethods.Samples();
		/*STRING MAIN METHODS- BEGIN*/
	}
	
	class Concatenation{

		public Concatenation() {}
		public static void Samples() {
		
			// Sample 1
			System.out.println("Concatenation String + Numbers");
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
		
		class StringMethods{

			public StringMethods() {}
			public static void Samples() {
			
			
				// Sample 1
				System.out.println("Main methods from String");
				//length()
				String string = "animals";
				System.out.println(string.length()); // 7
				//charAt()
				//char charAt(int index)
				System.out.println(string.charAt(0)); // a
				System.out.println(string.charAt(6)); // s
				//System.out.println(string.charAt(7)); // throws exception (since indexes start counting with 0)
				
				//indexOf()
				/*
				 * The method signatures are as follows:
					int indexOf(int ch)
					int indexOf(int ch, int fromIndex)
					int indexOf(String str)
					int indexOf(String str, int fromIndex)
					 * */
				
				System.out.println(string.indexOf('a')); // 0
				System.out.println(string.indexOf("al")); // 4
				System.out.println(string.indexOf('a', 4)); // 4
				System.out.println(string.indexOf("al", 5)); // -1
				
				//substring()
				/*The method signatures are as follows:
					String substring(int beginIndex)
					String substring(int beginIndex, int endIndex)*/
				//The substring() method is the trickiest String method on the exam.
				System.out.println(string.substring(3)); // mals
				System.out.println(string.substring(string.indexOf('m'))); // mals
				System.out.println(string.substring(3, 4)); // m
				System.out.println(string.substring(3, 7)); // mals
				
				//The next examples are less obvious:
				System.out.println(string.substring(3, 3)); // empty string
				System.out.println(string.substring(3, 2)); // throws exception because the indexes can’t be backward.
				System.out.println(string.substring(3, 8)); // throws exception because there is no eighth position
				
				//toLowerCase() and toUpperCase()
				/*The method signatures are as follows:
					String toLowerCase()
					String toUpperCase()
				*/
				
				System.out.println(string.toUpperCase()); // ANIMALS
				System.out.println("Abc123".toLowerCase()); // abc123
				
				//equals() and equalsIgnoreCase()
				/*
				 The equals() method checks whether two String objects contain exactly the same characters
				in the same order. The equalsIgnoreCase() method checks whether two String
				objects contain the same characters with the exception that it will convert the characters’
				case if needed. The method signatures are as follows:
					boolean equals(Object obj)
					boolean equalsIgnoreCase(String str)
				 */
				System.out.println("abc".equals("ABC")); // false
				System.out.println("ABC".equals("ABC")); // true
				System.out.println("abc".equalsIgnoreCase("ABC")); // true
				
				/*
				 *  startsWith() and endsWith()
					The startsWith() and endsWith() methods look at whether the provided value matches
					part of the String. The method signatures are as follows:
						boolean startsWith(String prefix)
						boolean endsWith(String suffix)
				 */
				System.out.println("abc".startsWith("a")); // true
				System.out.println("abc".startsWith("A")); // false
				System.out.println("abc".endsWith("c")); // true
				System.out.println("abc".endsWith("a")); // false
				
				//replace()
				/*The replace() method does a simple search and replace on the string. There’s a version
				that takes char parameters as well as a version that takes CharSequence parameters. The
				method signatures are as follows:
					String replace(char oldChar, char newChar)
					String replace(CharSequence target, CharSequence replacement)*/
				
				System.out.println("abcabc".replace('a', 'A')); // AbcAbc
				System.out.println("abcabc".replace("a", "A")); // AbcAbc
				
				//contains()
				/*The contains() method looks for matches in the String . It isn’t as particular as
				startsWith() and endsWith() —the match can be anywhere in the String . The method
				signature is as follows:
					boolean contains(CharSequence charSeq)*/
				System.out.println("abc".contains("b")); // true
				System.out.println("abc".contains("B")); // false
				
				// trim(), strip(), stripLeading(), and stripTrailing()
				/*The strip() and trim() methods remove whitespace from the beginning and end of a String
				  The method signatures are as follows:
					String strip()
					String stripLeading()
					String stripTrailing()
					String trim()*/
				
				System.out.println("abc".strip()); // abc
				System.out.println("\t a b c\n".strip()); // a b c
				String text = " abc\t ";
				System.out.println(text.trim().length()); // 3
				System.out.println(text.strip().length()); // 3
				System.out.println(text.stripLeading().length()); // 5
				System.out.println(text.stripTrailing().length());// 4
				
				//intern()
				/*	The intern() method returns the value from the string pool if it is there. Otherwise, it
					adds the value to the string pool.*/
			}	
		}
	}

