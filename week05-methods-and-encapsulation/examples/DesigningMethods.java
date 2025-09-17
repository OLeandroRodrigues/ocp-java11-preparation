/*Notes
  Explore methods in depth, including overloading
*/
package examples;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Optional;

public class DesigningMethods {

	public static void main(String[] args) {
	
		/*Table 7.1 Parts of a method declaration
		Element 					Value in nap() example 					Required?
		Access modifier 			public 									No
		Optional specifier 			final 									No
		Return type 				void 									Yes
		Method name 				nap 									Yes
		Parameter list 				(int minutes) 							Yes, but can be empty parentheses
		Optional exception list 	throws InterruptedException 			No
		Method body* 				{										Yes, but can be empty
										// take a nap
									}*/
		
		/*#Access Modifiers*/
		//Java offers four choices of access modifier:
		/**private** The private modifier means the method can be called only from within the same
		class.*/
		
		/**Default (Package-Private) Access** With default access, the method can be called only from
		classes in the same package. This one is tricky because there is no keyword for default
		access. You simply omit the access modifier.*/
		
		/***protected** The protected modifier means the method can be called only from classes in
		the same package or subclasses. You’ll learn about subclasses in Chapter 8, “Class Design.”*/
		
		/*public** The public modifier means the method can be called from any class.*/
		
		/*#Optional Specifiers*/
		/*	 	static
				The static modifier is used for class methods and will be covered later in this chapter.

				abstract
				The abstract modifier is used when a method body is not provided.

				final
				The final modifier is used when a method is not allowed to be overridden by a subclass

				synchronized
				The synchronized modifier is used with multithreaded code. It is on the 1Z0-816 exam, but not the 1Z0-815 exam.

				native
				native The native modifier is used when interacting with code written in another language such as C++. It is not on either OCP 11 exam.

				strictfp	
				The strictfp modifier is used for making floating-point calculations portable. It is not on either OCP 11 exam.			
		*/

		/*#return Type*/
		/*
		 		The return type might be an actual Java type such as String or int . If there is no return type, the void keyword is used.
				This special return type comes from the English language: void means without contents. In Java, there is no type there.
		 */

		/*#Method Name*/
		/*
		 		An identifier may only contain letters, numbers, $, or _. Also, the first character is not allowed to be a number, and reserved words are not allowed.
				Finally, the single underscore character is not allowed. By convention, methods begin with
				a lowercase letter but are not required to

				public void walk1() {}
				public void 2walk() {} // DOES NOT COMPILE
				public walk3 void() {} // DOES NOT COMPILE
				public void Walk_$() {}
				public _() {} // DOES NOT COMPILE
				public void() {} // DOES NOT COMPILE
		 */
		
		 /*#Parameter List*/
		 /* 
		  		There are a couple more rules for the parameter list that you’ll see when we cover varargs shortly. For now,
				let’s practice looking at method declaration with “regular” parameters:

				public void walk1() {}
				public void walk2 {} // DOES NOT COMPILE
				public void walk3(int a) {}
				public void walk4(int a; int b) {} // DOES NOT COMPILE
				public void walk5(int a, int b) {}
		 */

		 /*#Optional Exception List*/
		 /*
		  		You can list as many types of exceptions as you want in this clause separated by commas. Here’s an example:

				public void zeroExceptions() {}
				public void oneException() throws IllegalArgumentException {}
				public void twoExceptions() throws IllegalArgumentException, InterruptedException {}
		  */

		  /*#Method Body*/
		  /*
		   * 	The final part of a method declaration is the method body (except for abstract methods and interfaces, but you don’t need to know about either of those yet). A method body is simply
				a code block. It has braces that contain zero or more Java statements. We’ve spent several chapters looking at Java statements by now, so you should find it easy to figure out why
				these compile or don’t:
				public void walk1() {}
				public void walk2() // DOES NOT COMPILE
				public void walk3(int a) { int name = 5; }
		   */

		   /*#Working with Varargs*/
		   /*
		   		A varargs parameter must be the last element in a method’s parameter list.

				When calling a method with a varargs parameter, you have a choice. You can pass in
				an array, or you can list the elements of the array and let Java create it for you. You can
				even omit the varargs values in the method call and Java will create an array of length
				zero for you.
			

				15: public static void walk(int start, int... nums) {
				16: System.out.println(nums.length);
				17: }
				18: public static void main(String[] args) {
				19: walk(1); // 0
				20: walk(1, 2); // 1
				21: walk(1, 2, 3); // 2
				22: walk(1, new int[] {4, 5}); // 2
				23: }


				You’ve seen that Java will create an empty array if no parameters are passed for a
				vararg. However, it is still possible to pass null explicitly:
				walk(1, null); // throws a NullPointerException in walk()


				Accessing a varargs parameter is just like accessing an array. It uses array indexing.
				Here’s an example:
				16: public static void run(int... nums) {
				17: System.out.println(nums[1]);
				18: }
				19: public static void main(String[] args) {
				20: run(11, 22); // 22
				21: }

		   */

	}

}
