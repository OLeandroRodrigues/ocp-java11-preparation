/*Notes 
 Using Operators and Decision Constructs
 
 The structure of an if statement runtime
 */

public class MakingDecisions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SWITCH - BEGIN
		/*
		samples that doesn't compile  
		
		int month = 5;
		switch month { // DOES NOT COMPILE
		case 1: System.out.print("January");
		}
		switch (month) // DOES NOT COMPILE
		case 1: System.out.print("January");
		switch (month) {
		case 1: 2: System.out.print("January"); // DOES NOT COMPILE
		}
		switch (month) {
		case 1 || 2: System.out.print("January"); // DOES NOT COMPILE
		}*/
		
		//switch (month) {} IT IS VALID \0/
		
		/* Operator not valid in the Switch variableToTest 
		 * 	boolean , long , float , and double are excluded from switch
			statements, as are their associated Boolean , Long , Float , and Double
			classes. 
			For the exam, though, you just need to know that they are not permitted in
			switch statements.*/
		
			/*The following is a list of all data types supported by switch statements:
			■ int and Integer
			■ byte and Byte
			■ short and Short
			■ char and Character
			■ String
			■ enum values
			■ var (if the type resolves to one of the preceding types)*/
		
		// Switch Control Flow
		/*int dayOfWeek = 5;
		switch(dayOfWeek) {
			default:
				System.out.println("Weekday");
				break;
			case 0:
				System.out.println("Sunday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
		}
		Weekday*/
		
		var dayOfWeek = 5;
		switch(dayOfWeek) {
			case 0:
				System.out.println("Sunday");
			default:
				System.out.println("Weekday");
			case 6:
				System.out.println("Saturday");
			case 7:
				System.out.println("Hello world!");
				break;
		}
		
		//Acceptable Case Values to Switch case
		/*We conclude our discussion of switch statements by talking about acceptable values for
		case statements, given a particular switch variable. Not just any variable or value can be
		used in a case statement!
		First off, the values in each case statement must be compile-time constant values of the
		same data type as the switch value. This means you can use only literals, enum constants,
		or final constant variables of the same data type. By final constant, we mean that the
		variable must be marked with the final modifier and initialized with a literal value in
		the same expression in which it is declared.*/
		//SWITCH - END
	}

}
