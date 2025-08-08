/*
	Distinguishing between Primitives and Reference Types
	There are a few important differences you should know between primitives and reference
	types. First, reference types can be assigned null, which means they do not currently refer
	to an object. Primitive types will give you a compiler error if you attempt to assign them
	null. In this example, value cannot point to null because it is of type int:
	int value = null; // DOES NOT COMPILE
	String s = null;
	But what if you don’t know the value of an int and want to assign it to null? In that
	case, you should use a numeric wrapper class, such as Integer, instead of int. Wrapper
	classes will be covered in Chapter 5.
	Next, reference types can be used to call methods, assuming the reference is not null.
	Primitives do not have methods declared on them. In this example, we can call a method on
	reference since it is of a reference type. You can tell length is a method because it has ()
	after it. See if you can understand why the following snippet does not compile:
	4: String reference = "hello";
	5: int len = reference.length();
	6: int bad = len.length(); // DOES NOT COMPILE
	Line 6 is gibberish. No methods exist on len because it is an int primitive. Primitives
	do not have methods. Remember, a String is not a primitive, so you can call methods like
	length() on a String reference, as we did on line 5.
	Finally, notice that all the primitive types have lowercase type names. All classes that
	come with Java begin with uppercase. Although not required, it is a standard practice, and
	you should follow this convention for classes you create as well.

 */


class PrimitivesTypes{
	
	/*
	Primitive types
	Keyword			Type							Example
	boolean 		true or false (0 or 1) 			true
	byte			8-bit integral value 			123
	short			16-bit integral value 			123
	int 			32-bit integral value 			123
	long 			64-bit integral value 			123L
	float 			32-bit floating-point value 	123.45f
	double 			64-bit floating-point value 	123.456
	char 			16-bit Unicode value 			'a'

	A primitive is not an object in Java
	nor does it represent an object. A primitive is just a single value in memory, such as a number
	or character.

	 */
	
	public PrimitivesTypes() {}
	
	public void conceptShortAndChar() {
		short bird = 'd';
		char mammal = (short)83;
		
		System.out.println(bird); // Prints 100
		System.out.println(mammal); // Prints S
	}
	
}

class ReferenceTypes{
	
	/*
	A reference type refers to an object (an instance of a class). Unlike primitive types that
	hold their values in the memory where the variable is allocated, references do not hold the
	value of the object they refer to. Instead, a reference “points” to an object by storing the
	memory address where the object is located, a concept referred to as a pointer. Unlike other
	languages, Java does not allow you to learn what the physical memory address is. You can
	only use the reference to refer to the object.


	A value is assigned
	to a reference in one of two ways:
	■■ A reference can be assigned to another object of the same or compatible type.
	■■ A reference can be assigned to a new object using the new keyword.

	 */
	
	public ReferenceTypes() {}
	
	public void showStatementsAssign() {
		java.util.Date today = new java.util.Date();
		String greeting = new String("How are you?");
	}
	
}
public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimitivesTypes primitivesTypes = new PrimitivesTypes ();
		primitivesTypes.conceptShortAndChar();
		
		ReferenceTypes referenceTypes = new ReferenceTypes();
		referenceTypes.showStatementsAssign();
		
	}

}
