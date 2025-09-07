/*
 * 	Notes 
 	Lambdas work with interfaces that have only one abstract method. These are called
 	functional interfaces
 */
public class FunctionalInterfaces {

	public static void main(String[] args) {
		
		/*There are four functional interfaces you are likely to see on the exam. The next sections
		take a look at: 
				Predicate, Consumer, Supplier, and Comparator.
		*/
		
		//#Predicate
		//You can imagine that we’d have to create lots of interfaces like this (Sam)to use lambdas.
		/*Luckily, Java recognizes that this is a common problem and provides such an interface
		for us. It’s in the package java.util.function and the gist of it is as follows:*/
		
		/*public interface Predicate<T> {
			boolean test(T t);
			}*/
	}

}
