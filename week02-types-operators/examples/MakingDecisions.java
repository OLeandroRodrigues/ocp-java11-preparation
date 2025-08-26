import java.util.ArrayList;
import java.util.List;

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
		
		/*WRITING WHILE LOOPS - BEGIN*/
		MakingDecisions.WritingWhileLoops.Samples();
		/*WRITING WHILE LOOPS - END*/
		
		/*WRITING FOR LOOPS - BEGIN*/
		MakingDecisions.ForLoops.Samples();
		/*WRITING FOR LOOPS - END*/
		
		/*WRITING FOR EACH LOOPS - BEGIN*/
		MakingDecisions.WritingForEachLoops.Samples();
		/*WRITING FOR EACH LOOPS - END*/
		
		/*CONTROLLING FLOW WITH BRANCHING - BEGIN*/
		MakingDecisions.ControllingFlowWithBranching.Samples();
		/*CONTROLLING FLOW WITH BRANCHING- END*/
		
	}
	
	public class WritingWhileLoops{
		
		public WritingWhileLoops() {}
		
		public static void Samples() {
			
			System.out.println("WRITING WHILE LOOPS");
			System.out.println("Sample 1");
			// Sample 1 
			int counter = 0;
			while (counter < 10) {
				double price = counter * 10;
				System.out.println(price);
				counter++;
			}
			
		}
	}
		
	public class ForLoops{
		
			/*For the exam, you are going to have to know how to read forward and
				backward for loops. When you see a for loop on the exam, pay close
				attention to the loop variable and operations if the decrement operator, -- ,
				is used. While incrementing from 0 in a for loop is often straightforward,
				decrementing tends to be less intuitive. In fact, if you do see a for loop
				with a decrement operator on the exam, you should assume they are trying
				to test your knowledge of loop operations.*/
		
			public ForLoops() {}
			
			public static void Samples() {
				
				System.out.println("WRITING FOR LOOPS");
				System.out.println("Sample 1");
				// Sample 1 
				for(int i = 0; i < 5; i++) {
					System.out.print(i + " ");
				}
				
				System.out.println("Sample 2");
				// Sample 2
				int x = 0;
				for(long y = 0, z = 4, w = 5; x < 5 && y < 10; x++, y++, z++) {
					System.out.print(y + " "); 
				}
				System.out.print(x + " ");
			}
			
			/*You should familiarize yourself with
			the following five examples; variations of these are likely to be seen on the exam.*/
			
			/*
			 * 	1. Creating an Infinite Loop
					for( ; ; )
						System.out.println("Hello World");
						
			  	2. Adding Multiple Terms to the for Statement
					int x = 0;
					for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
						System.out.print(y + " "); 
					}
					System.out.print(x + " ");
					
				3. Redeclaring a Variable in the Initialization Block
					int x = 0;
					for(int x = 4; x < 5; x++) { // DOES NOT COMPILE
						System.out.print(x + " ");
					}
					
				4. Using Incompatible Data Types in the Initialization Block
					int x = 0;
					for(long y = 0, int z = 4; x < 5; x++) { // DOES NOT COMPILE
					System.out.print(y + " ");
					}
					
					variables must have same type!
					
				5. Using Loop Variables Outside the Loop
					for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
						System.out.print(y + " ");
					}
					System.out.print(x); // DOES NOT COMPILE
			  */
		}
	
		public class WritingForEachLoops{
				
				public WritingForEachLoops() {}
				
				public static void Samples() {
					
					System.out.println("WRITING FOR EACH LOOPS");
					System.out.println("Sample 1");
					// Sample 1 
					
					List<String> values = new ArrayList<String>();
					values.add("Lisa");
					values.add("Kevin");
					values.add("Roger");
					for(var value : values) {
						System.out.print(value + ", ");
					}
					
				}
			}
		
		public class ControllingFlowWithBranching{
			
			public ControllingFlowWithBranching() {}
			
			public static void Samples() {
				
				System.out.println("CONTROLLING FLOW WITH BRANCHING");
				System.out.println("Sample 1");
				// Sample 1 
				int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
				for(int[] mySimpleArray : myComplexArray) {
					for(int i=0; i<mySimpleArray.length; i++) {
							System.out.print(mySimpleArray[i]+"\t");
					}
					System.out.println();
				}
				
				// Sample 2 
				int hungryHippopotamus = 8;
				while(hungryHippopotamus>0) {
					do {
						hungryHippopotamus -= 2;
					} while (hungryHippopotamus>5);
					hungryHippopotamus--;
					System.out.print(hungryHippopotamus+", ");
				}
				
			}
		}
}



