Consumer Challenge

This challenge is designed to help you practice the Consumer<T> functional interface in Java.
Remember: a Consumer<T> receives a value of type T and performs an action, without returning anything.

Tasks

1. Basic Printing
- Create a Consumer<String> that prints a greeting message for a given name.
- Example:
  "Alice" -> "Hello, Alice!"
  OK - DONE

2. Uppercase Printer
- Create a Consumer<String> that prints the given string in uppercase.
- Test it with a list of names using .forEach().
   OK - DONE

3. Combine Consumers
- Create two Consumer<String>:
  - The first prints "Processing: <value>".
  - The second prints "Done!".
- Combine them using .andThen() and test with different values.
   OK - DONE

4. User Notification
- Create a User class with name and email.
- Build a Consumer<User> that prints:
  Sending email to <name> at <email>
- Apply it to a list of users with .forEach().
  OK - DONE

5. Logging Actions
- Create a list of integers.
- Use a Consumer<Integer> that prints each number multiplied by 2 and logs "Value processed".
- Hint: you can combine two consumers with .andThen().
  OK - DONE

6. Bonus: Error Handling
- Create a Consumer<String> that tries to parse the string into an integer and prints the result.
- If parsing fails (e.g. "abc"), catch the exception and print "Invalid number".

Goal
After completing this challenge you should:
- Understand how Consumer<T> works.
- Know how to use it with .forEach() in collections.
- Be able to chain actions using .andThen().
- Apply it to real-world use cases (logging, notifications, error handling).