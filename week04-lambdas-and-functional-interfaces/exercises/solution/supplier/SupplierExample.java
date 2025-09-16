package exercises.solution.supplier;

import java.util.*;
import java.util.function.*;
import java.util.Random;
import java.util.stream.Stream;

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
		
		 /*4. UUID Generator
		 - Use Supplier<String> with UUID.randomUUID().toString() to generate unique IDs.
		 - Generate 3 different IDs.*/
		// Supplier que gera UUIDs únicos como String
		 System.out.println("4. UUID Generator");
        Supplier<String> uuidSupplier = () -> UUID.randomUUID().toString();

        // Gerar 3 UUIDs diferentes
        System.out.println("UUID 1: " + uuidSupplier.get());
        System.out.println("UUID 2: " + uuidSupplier.get());
        System.out.println("UUID 3: " + uuidSupplier.get());
        
        /*5. Lazy Value
        - Create a Supplier<Double> that returns Math.random().
        - Call get() three times and print the values to show it generates a new number each time.*/
        System.out.println("5. Lazy Value");
        Supplier<Double> mathRandomSupplier = () -> Math.random();
        System.out.println("VALUE 1:" + mathRandomSupplier.get());
        System.out.println("VALUE 2:" + mathRandomSupplier.get());
        System.out.println("VALUE 3:" + mathRandomSupplier.get());
        
        /*6. User Factory
        - Create a User class with name and age.
        - Create a Supplier<User> that returns a new User("Alice", 30).
        - Print the result of calling get().*/
        System.out.println("6. User Factory");
        
        Supplier<User> userSupplier = () -> new User("John",30);
        System.out.println("Name: " + userSupplier.get().getName() + ", Age :" + userSupplier.get().getAge());
        
        /*7. Supplier with Stream
        - Use Stream.generate() with a Supplier<Integer> that produces random numbers from 0–100.
        - Limit it to 5 numbers and print them.*/
        System.out.println("7. Supplier with Stream");
        Random random1 = new Random();

        Supplier<Integer> randomSupplier = () -> random1.nextInt(101);

        Stream.generate(randomSupplier)
              .limit(5)
              .forEach(System.out::println);
        
        /*8. Fibonacci Supplier (Bonus)
        - Implement a Supplier<Integer> that generates the next number in the Fibonacci sequence on each call to get().
        - Test it by calling get() 10 times in a loop.*/
        System.out.println("8. Fibonacci Supplier (Bonus)");
        // 
        Supplier<Integer> fibSupplier = new Supplier<>() {
            private int prev = 0;
            private int curr = 1;

            @Override
            public Integer get() {
                int next = prev;
                int sum = prev + curr;
                prev = curr;
                curr = sum;
                return next;
            }
        };

        for (int i = 0; i < 10; i++) {
            System.out.print(fibSupplier.get() + " ");
        }
        
        
	}
	
	static class User {
	    String name;
	    Integer age;
	    User(String name, Integer age) { this.name = name; this.age = age;}
	    String getName() { return name; }
	    Integer getAge() { return age; }
	}
	

	private static String returnText(Supplier<String> supplier) {
		return supplier.get();
	}

}
