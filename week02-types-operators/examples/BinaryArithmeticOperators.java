/*Notes
 Binary arithmetic operators
 
 Table 3.3 			Binary arithmetic operators
 	Operator 		Description
	+ 				Adds two numeric values
	- 				Subtracts two numeric values
 	* 				Multiplies two numeric values
	/ 				Divides one numeric value by another
	% 				Modulus operator returns the remainder after division of one numeric
					value by another

    The modulus operation is not limited to positive integer values in Java; it
    may also be applied to negative integers and floating-point numbers. For
    example, if the divisor is 5, then the modulus value of a negative number is
    between -4 and 0 . For the exam, though, you are not required to be able to
    take the modulus of a negative integer or a floating-point number.

    Numeric Promotion!!! SUPER IMPORTANT
	You need to memorize certain rules Java will follow when applying operators to data types:				

    Numeric Promotion Rules
    1. If two values have different data types, Java will automatically promote one of the values
    to the larger of the two data types.
    2. If one of the values is integral and the other is floating-point, Java will automatically
    promote the integral value to the floating-point value’s data type.
    3. Smaller data types, namely, byte , short , and char , are first promoted to int any time
    they’re used with a Java binary arithmetic operator, even if neither of the operands is int .
    4. After all promotion has occurred and the operands have the same data type, the resulting
    value will have the same data type as its promoted operands.
	
 */

public class BinaryArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Arithmetic Operators: left-to-right order,
		/*But you can change the order of operation
		explicitly by wrapping parentheses around the sections you want evaluated first*/
		
		/*Verifying Parentheses Syntax
		
		long pigeon = 1 + ((3 * 5) / 3; // DOES NOT COMPILE
		int blueJay = (9 + 2) + 3) / (2 * 4; // DOES NOT COMPILE
		short robin = 3 + [(4 * 2) + 4]; // DOES NOT COMPILE
		[] it doesn't work*/

      

	}

}
