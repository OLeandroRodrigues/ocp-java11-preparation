package exercises.solution.supplier;

import java.util.*;
import java.util.function.*;
import java.lang.Thread;
import java.util.Random;

public class SupplierExample {

	public static void main(String[] args) {

		
		/*1. Hello Supplier
		- Create a Supplier<String> that always returns "Hello World".
		- Call get() and print the result.*/
		System.out.println("1. Hello Supplier");
		Supplier<String> supplier1 = () -> "Hello World";
		
		// native applier
		System.out.println(supplier1.get());
		
		// applier implemented manually
		System.out.println(returnText(supplier1));
		
		/*2. Current Time
		- Create a Supplier<Long> that returns the current system time using System.currentTimeMillis().
		- Print it multiple times to see different values.*/
		System.out.println("2. Current Time");
		
		Supplier<Long> supplierTimesMillis = () -> System.currentTimeMillis();
		System.out.println("Time 1 - " + supplierTimesMillis.get());
		System.out.println("Time 2 - " + supplierTimesMillis.get());
		System.out.println("Time 3 - " + supplierTimesMillis.get());
		
		/*3. Random Numbers
		- Create a Supplier<Integer> that generates random integers between 1 and 10.
		- Use it in a loop to print 5 random numbers.*/
		System.out.println("3. Random Numbers");
		
		Random random = new Random();
		Supplier<Integer> supplier2 = () -> random.nextInt(10) + 1;
		
		 for (int i = 0; i < 5; i++) {
	            System.out.println("Random: " + supplier2.get());
	     }
		
		
		
		
	}
	
	private static String returnText(Supplier<String> supplier) {
		return supplier.get();
	}

}
