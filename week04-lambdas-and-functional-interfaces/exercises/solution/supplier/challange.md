Supplier Challenge

This challenge is designed to help you practice the Supplier<T> functional interface in Java.
Remember: a Supplier<T> takes no arguments and returns a value of type T.

------------------------------------------------------------
1. Hello Supplier
- Create a Supplier<String> that always returns "Hello World".
- Call get() and print the result.
  OK - DONE

------------------------------------------------------------
2. Current Time
- Create a Supplier<Long> that returns the current system time using System.currentTimeMillis().
- Print it multiple times to see different values.
  OK - DONE

------------------------------------------------------------
3. Random Numbers
- Create a Supplier<Integer> that generates random integers between 1 and 10.
- Use it in a loop to print 5 random numbers.
  OK - DONE

------------------------------------------------------------
4. UUID Generator
- Use Supplier<String> with UUID.randomUUID().toString() to generate unique IDs.
- Generate 3 different IDs.
  OK - DONE

------------------------------------------------------------
5. Lazy Value
- Create a Supplier<Double> that returns Math.random().
- Call get() three times and print the values to show it generates a new number each time.
  OK - DONE

------------------------------------------------------------
6. User Factory
- Create a User class with name and age.
- Create a Supplier<User> that returns a new User("Alice", 30).
- Print the result of calling get().
  OK - DONE

------------------------------------------------------------
7. Supplier with Stream
- Use Stream.generate() with a Supplier<Integer> that produces random numbers from 0–100.
- Limit it to 5 numbers and print them.
  OK - DONE

------------------------------------------------------------
8. Fibonacci Supplier (Bonus)
- Implement a Supplier<Integer> that generates the next number in the Fibonacci sequence on each call to get().
- Test it by calling get() 10 times in a loop.
  OK - DONE

------------------------------------------------------------
Goal:
After completing this challenge you should:
- Understand how to create and use Supplier<T>.
- Know how to produce constant, random, and dynamic values.
- Use Suppliers in combination with Streams for lazy data generation.