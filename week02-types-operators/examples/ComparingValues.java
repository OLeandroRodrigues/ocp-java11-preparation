/*Notes
    Equality Operators
 	Determining equality in Java can be a nontrivial endeavor as there’s a semantic difference
	between “two objects are the same” and “two objects are equivalent.” It is further complicated
	by the fact that for numeric and boolean primitives, there is no such distinction.
	
	Table 3.6 Equality operators
	Operator 				Apply to primitives 				Apply to objects
	== 						Returns true if the two values 		Returns true if the two values reference
							represent the same value			the same object
	!= 						Returns true if the two values      Returns true if the two values do not
							represent different values			reference the same object
							
	Relational Operators
	Table 3.7 Relational operators
	Operator 					Description
	< 							Returns true if the value on the left is strictly less than the value on the
								right
	<= 							Returns true if the value on the left is less than or equal to the value on
								the right
	> 							Returns true if the value on the left is strictly greater than the value on
								the right
	>= 							Returns true if the value on the left is greater than or equal to the value
								on the right
	a instanceof b 				Returns true if the reference that a points to is an instance of a class,
								subclass, or class that implements a particular interface, as named in b
								
	Logical Operators
	Operator 					Description
	& 							Logical AND is true only if both values are true.
	| 							Inclusive OR is true if at least one of the values is true.
	^ 							Exclusive XOR is true only if one value is true and the other is false.
	
	Short-Circuit Operators
	Operator 					Description
	&& 							Short-circuit AND is true only if both values are true. If the left side is false,
								then the right side will not be evaluated.
	|| 							Short-circuit OR is true if at least one of the values

    Numeric Promotion
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

public class ComparingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*File monday = new File("schedule.txt");
		File tuesday = new File("schedule.txt");
		File wednesday = tuesday;
		System.out.println(monday == tuesday); // false
		System.out.println(tuesday == wednesday); 
		
		System.out.print(null == null); // true
		// true*/
		
		//Numeric Comparison Operators
		int gibbonNumFeet = 2, wolfNumFeet = 4, ostrichNumFeet = 2;
		System.out.println(gibbonNumFeet < wolfNumFeet); // true
		System.out.println(gibbonNumFeet <= wolfNumFeet); // true
		System.out.println(gibbonNumFeet >= ostrichNumFeet); // true
		System.out.println(gibbonNumFeet > ostrichNumFeet); // false
		
		//instanceof Operator
		/*
		 It is useful for determining whether an arbitrary object is a member of
		a particular class or interface at runtime -> all classes inherit
		from java.lang.Object*/
		
		//Logical Operators
		boolean eyesClosed = true;
		boolean breathingSlowly = true;
		boolean resting = eyesClosed | breathingSlowly;
		boolean asleep = eyesClosed & breathingSlowly;
		boolean awake = eyesClosed ^ breathingSlowly;
		System.out.println(resting); // true
		System.out.println(asleep); // true
		System.out.println(awake); // false
		
		//Short-Circuit Operators
		/*The short-circuit operators are nearly identical to the logical operators, & and |, except
		that the right side of the expression may never be evaluated if the final result can be determined
		by the left side of the expression.
		*/
		int hour = 10;
		boolean zooOpen = true || (hour < 4); // dead code (hour < 4) 
		System.out.println(zooOpen); // true
		
		//Avoiding a NullPointerException
		
		/*Making Decisions with the
		Ternary Operator*/
		
		
	}

}
