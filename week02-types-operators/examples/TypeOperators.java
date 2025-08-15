
/*Notes
 In general, three flavors of operators are available in Java: unary, binary, and ternary.
 These types of operators can be applied to one, two, or three operands, respectively.
 For the exam, you’ll need to know a specific subset of Java operators, how to apply them, and the
 order in which they should be applied.
 
 Table 3.1 Order of operator precedence
	Operator 							Symbols and examples
	Post-unary operators 				expression++, expression--
	Pre-unary operators 				++expression, --expression
	Other unary operators 				-, !, ~, +, (type)
	Multiplication/division/modulus 	*, /, %
	Addition/subtraction 				+, -
	Shift operators 					<<, >>, >>>
	Relational operators 				<, >, <=, >=, instanceof
	Equal to/not equal to 				==, !=
	Logical operators 					&, ^, |
	Short-circuit logical operators 	&&, ||
	Ternary operators 					boolean expression ? expression1 : expression2
	Assignment operators 				=, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=

 */

public class TypeOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cookies = 4;
		double reward = 3 + 2 * --cookies;
		System.out.print("Zoo animal receives: "+reward+" reward points");
		
		//Applying Unary Operators
		//By definition, a unary operator is one that requires exactly one operand, or variable, to
		//function.
		
		/*
		Table 3.2 Unary operators
		--------------------------------------------------------------------------------------|
		|Operator |Description																  |	
		|! 		  |Inverts a boolean’s logical value                                          |
		|+ 		  |Indicates a number is positive, although numbers are assumed to be positive|
		|		  |in Java unless accompanied by a negative unary operator                    |
		|- 		  |Indicates a literal number is negative or negates an expression            |
		|++ 	  |Increments a value by 1                                                    |
		|-- 	  |Decrements a value by 1                                                    |
		|(type)   |Casts a value to a speci|fic type.                                         |
		--------------------------------------------------------------------------------------*/
		
	}

}
