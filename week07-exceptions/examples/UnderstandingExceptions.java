package examples;

public class UnderstandingExceptions {

	public static void main(String[] args) {
		//#The Role of Exceptions
		//#Understanding Exception Types
		
		/*As we’ve explained, an exception is an event that alters program flow. Java has a
		Throwable superclass for all objects that represent these events. Not all of them have the
		word exception in their class name, which can be confusing. Figure 10.1 shows the key
		subclasses of Throwable.*/
		
		//Categories of exception
							 /*java.lang.Object
									^
									|
							java.lang.Throable
							  ^				^
							  |				|
				java.lang.Exception   	java.lang.Error
						^
						|
				java.lang.RuntimeException*/
		
		/*Error means something went so horribly wrong that your program should not attempt
		to recover from it. For example, the disk drive “disappeared” or the program ran out of
		memory. These are abnormal conditions that you aren’t likely to encounter and cannot
		recover from.*/
		
		//#Checked Exceptions
		
		/*A checked exception is an exception that must be declared or handled by the application
		code where it is thrown. In Java, checked exceptions all inherit Exception but not
		RuntimeException . Checked exceptions tend to be more anticipated—for example, trying
		to read a file that doesn’t exist.*/
		
		//***For the exam, though, you just need to know about checked exceptions that extend Exception .
		/*Let’s take a look at an example. The following fall() method declares that it might
		throw an IOException , which is a checked exception:
		
		void fall(int distance) throws IOException {
			if(distance > 10) {
			throw new IOException();
			}
		}*/
		
		//#Unchecked Exceptions
		//A runtime exception is defined as the RuntimeException class and its subclasses
		//When you see runtime, it means unchecked.
		
		//#Throwing an Exception
		
		// Basically anything! :D
		/*On the exam, many questions have a choice about not compiling and
		about throwing an exception. Pay special attention to code that calls a
		method on a null reference or that references an invalid array or List
		index. If you spot this, you know the correct answer is that the code throws
		an exception at runtime.*/
		
		/*throw new Exception();
		throw new Exception("Ow! I fell.");
		throw new RuntimeException();
		throw new RuntimeException("Ow! I fell.");*/
						
						
					
				
						
		

	}

}
