package examples;

public class HandlingExceptions {

	public static void main(String[] args) {
		// Using try and catch Statements
		
		/*3: void explore() {
		4: 	try {
		5: 		fall();
		6: 		System.out.println("never get here");
		7: 	} catch (RuntimeException e) {
		8: 		getUp();
		9: 	}
		10:	seeAnimals();
		11: }
		12: void fall() { throw new RuntimeException(); }*/
		
		/*#Chaining catch Blocks*/
		
		/*class AnimalsOutForAWalk extends RuntimeException { }
		class ExhibitClosed extends RuntimeException { }
		class ExhibitClosedForLunch extends ExhibitClosed { }
		
		In this example, there are three custom exceptions. All are unchecked exceptions
		because they directly or indirectly extend RuntimeException. Now we chain both types
		of exceptions with two catch blocks and handle them by printing out the appropriate
		message:
			
		public void visitPorcupine() {
			try {
				seeAnimal();
			} catch (AnimalsOutForAWalk e) { // first catch block
				System.out.print("try back later");
			} catch (ExhibitClosed e) { // second catch block
				System.out.print("not today");
			}
		}*/
		
		//#Applying a Multi-catch Block
		
		/*public static void main(String[] args) {
			try {
				System.out.println(Integer.parseInt(args[1]));
			} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
				System.out.println("Missing or invalid input");
			}
		}
		That one I liked a lot! :D
		
		//#Adding a finally Block
		 * 
		    There is one exception to “the finally block always be executed” rule: Java defines a
			method that you call as System.exit(). It takes an integer parameter that represents the
			error code that gets returned.
			
			try {
					System.exit(0);
			} finally {
				System.out.print("Never going to get here"); // Not printed
			}
		  
		*/
		
		//#Finally Closing Resources
		
		//Writing code that simplifies closing resources is what this section is about. Let’s take a
		//look at a method that opens a file, reads the data, and closes it:
		/*4: public void readFile(String file) {
		5: 		FileInputStream is = null;
		6: 		try {
		7: 			is = new FileInputStream("myfile.txt");
		8: 			// Read file data
		9: 		} catch (IOException e) {
		10: 		e.printStackTrace();
		11: 	} finally {
		12: 		if(is != null) {
		13: 		try {
		14: 				is.close();
		15: 		} catch (IOException e2) {
		16: 			e2.printStackTrace();
		17: 		}
		18: 	}
		19: }
		20: }*/
		
		
		/*Wow, that’s a long method! Why do we have two try and catch blocks? Well, the code
		on lines 7 and 14 both include checked IOException calls, so they both need to be caught
		in the method or rethrown by the method.*/
		
		//You also don’t want an exception from closing one resource to prevent the closing of
		//another resource.
		
		/*To solve this, Java includes the try-with-resources statement to automatically close
		all resources opened in a try clause. This feature is also known as automatic resource
		management , because Java automatically takes care of the closing.*/
		
		//Let’s take a look at our same example using a try-with-resources statement:
			
		/*4: public void readFile(String file) {
		5: 		try (FileInputStream is = new FileInputStream("myfile.txt")) {
		6: 			// Read file data
		7: 		} catch (IOException e) {
		8: 			e.printStackTrace();
		9: 		}
		10: }*/
		
		//Implicit finally Blocks
		//Behind the scenes, the compiler replaces a try-with-resources block with a try and
		//finally block
		
		//#Throwing Additional Exceptions
		/*26: try {
		27: 	throw new RuntimeException();
		28: } catch (RuntimeException e) {
		29: 	throw new RuntimeException();
		30: } finally {
		31: 	throw new Exception();
		32: }*/
		
		/*Next we are going to show you one of the hardest examples you can be asked related to
		exceptions. What do you think this method returns? Go slowly. It’s tricky.*/
		/*30: public String exceptions() {
		31: StringBuilder result = new StringBuilder();
		32: String v = null;
		33: try {
		34: 	try {
		35: 		result.append("before_");
		36: 		v.length();
		37: 		result.append("after_");
		38: 	} catch (NullPointerException e) {
		39: 		result.append("catch_");
		40: 		throw new RuntimeException();
		41: 	} finally {
		42: 		result.append("finally_");
		43: 		throw new Exception();
		44: 	}
		45: } catch (Exception e) {
		46: 	result.append("done");
		47: }
		48: return result.toString();
		49: }*/
		
		// before_catch_finally_done :D
		
		//#Calling Methods That Throw Exceptions
		/*When you see a checked exception declared inside a catch block on the
		exam, check and make sure the code in the associated try block is capable
		of throwing the exception or a subclass of the exception. If not, the code
		is unreachable and does not compile. Remember that this rule does not
		extend to unchecked exceptions or exceptions declared in a method
		signature.*/
		
		//#Declaring and Overriding Methods with Exceptions
		/*When a class overrides a method from a superclass
		or implements a method from an interface, it’s not allowed to add new checked exceptions
		to the method signature. For example, this code isn’t allowed:
		
		class CanNotHopException extends Exception { }
		class Hopper {
		public void hop() { }
		}
		class Bunny extends Hopper {
		public void hop() throws CanNotHopException { } // DOES NOT COMPILE
		}*/
		
		/*An overridden method in a subclass is allowed to declare fewer exceptions than the
		superclass or interface. This is legal because callers are already handling them.*/
		
		/*class Hopper {
			public void hop() throws CanNotHopException { }
			}
			class Bunny extends Hopper {
			public void hop() { }
		 }*/
			
		//#Printing an Exception
		/*There are three ways to print an exception. You can let Java print it out, print just the message,
		or print where the stack trace comes from. This example shows all three approaches:*/
		
		/*5: public static void main(String[] args) {
		6: try {
		7: hop();
		8: } catch (Exception e) {
		9: System.out.println(e);
		10: System.out.println(e.getMessage());
		11: e.printStackTrace();
		12: }
		13: }
		14: private static void hop() {
		15: throw new RuntimeException("cannot hop");
		16: }*/

	}

}
