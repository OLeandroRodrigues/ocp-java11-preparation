/*Notes
 	Compilation errors from assignment operators are often overlooked on the exam, in part
	because of how subtle these errors can be. To master the assignment operators, you should
	be fluent in understanding how the compiler handles numeric promotion and when casting
	is required. Being able to spot these issues is critical to passing the exam, as assignment
	operators appear in nearly every question with a code snippet.
	
	Compound Assignment Operators
	Besides the simple assignment operator (=) Java supports numerous compound assignment
	operators. For the exam, you should be familiar with the compound operators in Table 3.5.
	
	Table 3.5 Compound assignment operators
	Operator 		Description
	+= 				Adds the value on the right to the variable on the left and assigns the sum to
					the variable
	-= 				Subtracts the value on the right from the variable on the left and assigns the
					difference to the variable
 	*= 				Multiplies the value on the right with the variable on the left and assigns the
					product to the variable
	/= 				Divides the variable on the left by the value on the right and assigns the quotient
					to the variable
*/

public class AssigningValues {

	public static void main(String[] args) {

		//Assignment Operator
		int herd = 1;
		
		/*Java will automatically promote from smaller to larger data types, as you saw in the
		previous section on arithmetic operators, but it will throw a compiler exception if it detects
		that you are trying to convert from larger to smaller data types without casting*/
		
		//Here are some examples of casting:
		int fur = (int)5;
		int hair = (short) 2;
		String type = (String) "Bird";
		
		/*long reptile = 192301398193810323; // DOES NOT COMPILE
		Finally, the last statement does not compile because Java interprets the literal as an int and
		notices that the value is larger than int allows. The literal would need a postfix L or l to be
		considered a long.*/
		
		//long goat = 10;
		//int sheep = 5;
		//sheep = sheep * goat; // DOES NOT COMPILE
		
		/* Weare trying to assign a long value to an int variable. This last line could be fixed with an
		explicit cast to (int), but there’s a better way using the compound assignment operator:*/
		long goat = 10;
		int sheep = 5;
		sheep *= goat;
		
		//Assignment Operator Return Value : IMPORTANT!
		/*One final thing to know about assignment operators is that the result of an assignment is
		an expression in and of itself, equal to the value of the assignment. For example, the following
		snippet of code is perfectly valid, if not a little odd-looking:
		long wolf = 5;
		long coyote = (wolf=3);
		System.out.println(wolf); // 3
		System.out.println(coyote); // 3*/
		
		boolean healthy = false;
		if(healthy = true)
			System.out.print("Good!");
		
		/*While this may look like a test if healthy is true, it’s actually assigning healthy a value
		of true. The result of the assignment is the value of the assignment, which is true, resulting
		in this snippet printing Good!. */
	}

}
