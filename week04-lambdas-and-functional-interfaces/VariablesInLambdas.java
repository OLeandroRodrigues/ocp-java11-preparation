/*Notes
 	Variables can appear in three places with respect to lambdas: the parameter list, local
	variables declared inside the lambda body, and variables referenced from the lambda body.
	All three of these are opportunities for the exam to trick you.
*/
import java.util.function.*;
public class VariablesInLambdas {

	public static void main(String[] args) {
		
		/*#Parameter List*/
		Predicate<String> p1 = x -> true;
		Predicate<String> p2 = (var x) -> true;
		Predicate<String> p3 = (String x) -> true;
		
		/*The exam might ask you to identify the type of the lambda parameter. In our example,
		the answer is String.*/
		
		/*
		 * 
		 * public void whatAmI() {
			consume((var x) -> System.out.print(x), 123);
		}
			public void consume(Consumer<Integer> c, int num) {
				c.accept(num);
		 }
		 
		 Integer!
		 
		 public void counts(List<Integer> list) {
			list.sort((var x, var y) -> x.compareTo(y));
		}
		
		Integer also!

		 */
		
		/*#Variables Referenced from the Lambda Body*/
		/*Lambda bodies are allowed to reference some variables from the surrounding code. The
		following code is legal:*/
		
		/*(a, b) -> { int c = 0; return 5;}*/
		
		/*public class Crow {
			private String color;
			public void caw(String name) {
			String volume = "loudly";
			Consumer<String> consumer = s ->
			System.out.println(name + " says "
			+ volume + " that she is " + color);
			}
		}*/
		
		//(a, b) -> { int c = 0; return 5;};
		
		/*11: public void variables(int a) {
			12: int b = 1;
			13: Predicate<Integer> p1 = a -> {
			14: int b = 0;
			15: int c = 0;
			16: return b == c;}
			17: }*/
		// error line 13, 14 and 16
		
		/*#Variables Referenced from the Lambda Body*/
		/*public class Crow {
			private String color;
			public void caw(String name) {
			String volume = "loudly";
			Consumer<String> consumer = s ->
			System.out.println(name + " says "
			+ volume + " that she is " + color);
			}
		}*/
		
		// Add final to be sure! :) It will never change! 
		/*public class Crow {
			private String color;
			public void caw(final String name) {
			final String volume = "loudly";
			Consumer<String> consumer = s ->
			System.out.println(name + " says "
			+ volume + " that she is " + color);
			}
			}*/
		
		/*
			 It gets even more interesting when you look at where the compiler errors occur when the
			variables are not effectively final.
			2: public class Crow {
			3: private String color;
			4: public void caw(String name) {
			5: String volume = "loudly";
			6: name = "Caty";
			7: color = "black";
			8:
			9: Consumer<String> consumer = s ->
			10: System.out.println(name + " says "
			11: + volume + " that she is " + color);
			12: volume = "softly";
			13: }
			14: }
			*/
		
			//In this example, name is not effectively final because it is set on line 6.
			//However, the compiler error occurs on line 10.
			/*It’s not a problem to assign a value to a nonfinal variable.
			However, once the lambda tries to use it, we do have a problem. The variable is no longer
			effectively final, so the lambda is not allowed to use the variable.
			The variable volume is not effectively final either since it is updated*/
		
			/*Table 6.4 Rules for accessing a variable from a lambda body inside a method
			Variable type 						Rule
			Instance variable 					Allowed
			Static variable 					Allowed
			Local variable 						Allowed if effectively final
			Method parameter 					Allowed if effectively final
			Lambda parameter 					Allowed*/
	}

}
