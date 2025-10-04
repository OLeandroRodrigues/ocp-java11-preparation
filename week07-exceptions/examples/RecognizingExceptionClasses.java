package examples;

public class RecognizingExceptionClasses {

	public static void main(String[] args) {
		
		
		/*
		 	You need to recognize three groups of exception classes for the exam: 
			-> RuntimeException,
			-> checked Exception
			-> Error
			
			
			For the exam, you’ll need to recognize which type of an exception it is and whether it’s thrown by
			the Java virtual machine (JVM) or a programmer.
			
			#RuntimeException Classes
			
			RuntimeException and its subclasses are unchecked exceptions that don’t have to be
			handled or declared. They can be thrown by the programmer or by the JVM. Common
			RuntimeException classes include the following:
			
			-> ArithmeticException Thrown when code attempts to divide by zero
			-> ArrayIndexOutOfBoundsException Thrown when code uses an illegal index to access an array
			-> ClassCastException Thrown when an attempt is made to cast an object to a class of 
			which it is not an instance
			-> NullPointerException Thrown when there is a null reference where an object is required
			-> IllegalArgumentException Thrown by the programmer to indicate that a method has
			been passed an illegal or inappropriate argument
			-> NumberFormatException Subclass of IllegalArgumentException thrown when an
			attempt is made to convert a string to a numeric type but the string doesn’t have an appropriate
			format
			
			#Checked Exception Classes
			
			Checked exceptions have Exception in their hierarchy but not RuntimeException. They
			must be handled or declared. Common checked exceptions include the following:
				-> IOException
				-> FileNotFoundException
				
			#Error Classes
			Errors are unchecked exceptions that extend the Error class. They are thrown by the JVM
			and should not be handled or declared. Errors are rare, but you might see these:
				-> ExceptionInInitializerError
				-> StackOverflowError
				-> NoClassDefFoundError
			
			ExceptionInInitializerError: Java runs static initializers the first time a class is used. If one of the static initializers
				throws an exception, Java can’t start using the class
			StackOverflowError: When Java calls methods, it puts parameters and local variables on the stack. After
				doing this a very large number of times, the stack runs out of room and overflows
				Most of the time, this error occurs when a method calls itself. :D
			NoClassDefFoundError
				A NoClassDefFoundError occurs when Java can’t find the class at runtime. Generally, this
				means a library available when the code was compiled is not available when the code is
				executed.
			

		*/

	}

}
