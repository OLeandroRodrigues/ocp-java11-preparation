package exercises.solutions.consumer;

import java.util.*;
import java.util.function.*;
public class ConsumerExample {

	public static void main(String[] args) {
	
		/*1. Basic Printing
		- Create a Consumer<String> that prints a greeting message for a given name.
		- Example:
		  "Alice" -> "Hello, Alice!"*/
		System.out.println("1. Basic Printing");
		List<String> names = List.of("Alice","Jenifer","Juliet");
		
	
		// native consumer 
		names.forEach(u -> System.out.println("Hello, " + u));
		
		// consumer implemented manually
		Consumer<String> consumer1 = u -> System.out.println(u);
		
		print("Hello, Alice", consumer1);
		
		/*2. Uppercase Printer
		- Create a Consumer<String> that prints the given string in uppercase.
		- Test it with a list of names using .forEach().*/
		System.out.println("2. Uppercase Printer");
		
		//native consumer
		names.forEach(u -> System.out.println(u.toUpperCase()));
		
		// consumer implemented manually
		Consumer<String> consumer2 = u -> System.out.println(u.toString());
		print("Hello, Alice", consumer2);
		
		/*3. Combine Consumers
		- Create two Consumer<String>:
		  - The first prints "Processing: <value>".
		  - The second prints "Done!".
		- Combine them using .andThen() and test with different values.*/
		System.out.println("3. Combine Consumers");
		
		Consumer<String> consumer3 = u -> System.out.println("Processing: " + u);
		Consumer<String> consumer4 = u -> System.out.println("Done");
		
		Consumer<String> combined = consumer3.andThen(consumer4);
		
		combined.accept("Date");

		/*4. User Notification
		- Create a User class with name and email.
		- Build a Consumer<User> that prints:
		  Sending email to <name> at <email>
		- Apply it to a list of users with .forEach().*/
		List<User> users  = List.of(new User("Maria","maria@maria.com"),new User("Juliet","juliet@juliet"));

		// native consumer
		Consumer<User> consumerUser = u -> System.out.println("Sending email to " + u.name + " at " + u.email);
		users.forEach(consumerUser);
		
		// consumer implemented manually
		print(users.get(0).name,users.get(0).email,consumerUser);
		
		/*5. Logging Actions
		- Create a list of integers.
		- Use a Consumer<Integer> that prints each number multiplied by 2 and logs "Value processed".
		- Hint: you can combine two consumers with .andThen().*/
		
		List<Integer> numbers1 = List.of(1, 2, 3, 4, 5);
        Consumer<Integer> multiply = n -> System.out.println("Result: " + (n * 2));
        Consumer<Integer> log = n -> System.out.println("Value processed");
        Consumer<Integer> combined1 = multiply.andThen(log);
        numbers1.forEach(combined1);
        
        /*6. Bonus: Error Handling
        - Create a Consumer<String> that tries to parse the string into an integer and prints the result.
        - If parsing fails (e.g. "abc"), catch the exception and print "Invalid number".*/

        Consumer<String> safeParser = s -> {
            try {
                int num = Integer.parseInt(s);
                System.out.println("Parsed number: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + s);
            }
        };

        // Testing
        safeParser.accept("42");   // Parsed number: 42
        safeParser.accept("100");  // Parsed number: 100
        safeParser.accept("abc");  // Invalid number: abc
        
		
	}

	static class User {
	    String name;
	    String email;
	    User(String name, String email) { this.name = name; this.email = email;}
	    String getName() { return name; }
	    String getEmail() { return email; }
	}
	
	public static void print(String name, String email, Consumer<User> consumer) {
		consumer.accept(new User(name, email));
	}
	public static void print(String value, Consumer<String> consumer) {
		consumer.accept(value);
	}
}
