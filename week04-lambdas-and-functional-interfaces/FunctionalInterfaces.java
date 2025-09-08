/*
 * 	Notes 
 	Lambdas work with interfaces that have only one abstract method. These are called
 	functional interfaces
 */

import java.util.function.*;
import java.util.*;

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
		
		/*#Consumer*/
		/*The Consumer functional interface has one method you need to know:
			void accept(T t)
		*/
		
		//Why might you want to receive a value and not return it? A common reason is when
		//printing a message:
		Consumer<String> consumer = x -> System.out.println(x);
		print(consumer, "Hello World");
		
		//This code prints Hello World. It’s a more complicated version than the one you learned
		//as your first program. (Indeed, it is :D) )
		
		/*#Supplier*/
		/*The Supplier functional interface has only one method:
			T get()*/
		
		//A good use case for a Supplier is when generating values. Here are two examples:
		Supplier<Integer> number1 = () -> 42;
		Supplier<Integer> random = () -> new Random().nextInt();
		
		Supplier<Integer> number2 = () -> 42;
		System.out.println(returnNumber(number2));
		
		/*#Comparator*/
		/*In Chapter 5, “Core Java APIs,” we compared numbers. We didn’t supply a Comparator
		because we were using the default sort order. We did learn the rules. A negative number
		means the first value is smaller, zero means they are equal, and a positive number means
		the first value is bigger. The method signature is as follows:
		int compare(T o1, T o2)*/
		
		/*Note
		 * The Comparator interface existed prior to lambdas being added to Java. As
		   a result, it is in a different package. You can find Comparator in java.util .
		 */
		Comparator<Integer> ints = (i1, i2) -> i1 - i2;
		Comparator<String> strings = (s1, s2) -> s2.compareTo(s1);
		Comparator<String> moreStrings = (s1, s2) -> - s1.compareTo(s2);
		
		/*Table 6. 3 							Basic functional interfaces
		Functional interface 					# parameters 				Return type
		Comparator 								Two 						int
		Consumer 								One 						void
		Predicate 								One 						boolean
		Supplier 								None 						One (type varies)*/
	}
	
	private static void print(Consumer<String> consumer, String value) {
		consumer.accept(value);
		}
	
	private static int returnNumber(Supplier<Integer> supplier) {
		return supplier.get();
		}
	

}
