
public class DestroyingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Calling System.gc()
		Java includes a built-in method to help support garbage collection that can be called at
		any time.*/
		System.gc();
		
		// What is the System.gc() command guaranteed to do? Nothing, actually. :D
		// The JVM may perform garbage collection
		// at that moment, or it might be busy and choose not to. The JVM is free to ignore the request.
		
		//When is System.gc() guaranteed to be called by the JVM? Never, actually.
		/*In fact, shortly before a program runs out of memory and throws an
		OutOfMemoryError, the JVM will try to perform garbage collection, but it’s not guaranteed
		to succeed.*/
		
		/*For the exam, you need to know that System.gc() is not guaranteed to run or do
			anything, and you should be able to recognize when objects become eligible for garbage
			collection.
		 */
		
		/*An object is no longer reachable when one of two situations occurs:
		■■ The object no longer has any references pointing to it.
		■■ All references to the object have gone out of scope.*/
		
	}

}
