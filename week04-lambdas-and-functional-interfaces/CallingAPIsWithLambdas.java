
/*
 * Notes 
 * 	The most common methods that use them on the exam. The 1Z0-816 will cover streams and many
 	more APIs that use lambdas
*/

import java.util.*;

public class CallingAPIsWithLambdas {

	public static void main(String[] args) {

		/*#removeIf()*/
		//List and Set declare a removeIf() method that takes a Predicate.
		
		System.out.println("removeIf()"); 
		List<String> bunnies1 = new ArrayList<>();
		bunnies1.add("long ear");
		bunnies1.add("floppy");
		bunnies1.add("hoppy");
		System.out.println(bunnies1); // [long ear, floppy, hoppy]
		bunnies1.removeIf(s -> s.charAt(0) != 'h');
		System.out.println(bunnies1); // [hoppy]
		
		/*The removeIf() method works the same way on a Set. It removes any values in the set
		that match the Predicate. 
		There isn’t a removeIf() method on a Map. Remember that maps have both keys and values. 
		It wouldn’t be clear what one was removing!*/
		
		/*#sort()*/
		//While you can call Collections.sort(list), you can now sort directly on the list object.
		System.out.println("sort()");
		List<String> bunnies2 = new ArrayList<>();
		bunnies2.add("long ear");
		bunnies2.add("floppy");
		bunnies2.add("hoppy");
		System.out.println(bunnies2); // [long ear, floppy, hoppy]
		bunnies2.sort((b1, b2) -> b1.compareTo(b2));
		System.out.println(bunnies2); // [floppy, hoppy, long ear]
		/*There is not a sort method on Set or Map. Neither of those types has indexing, so it
		wouldn’t make sense to sort them.*/
		
		/*#forEach()*/
		//It takes a Consumer and calls that lambda for each element encountered.
		System.out.println("forEach()");
		List<String> bunnies3 = new ArrayList<>();
		bunnies3.add("long ear");
		bunnies3.add("floppy");
		bunnies3.add("hoppy");
		
		bunnies3.forEach(b -> System.out.println(b));
		System.out.println(bunnies3);
		/*This code prints the following:
		long ear
		floppy
		hoppy
		[long ear, floppy, hoppy]*/
		
		/*We can use forEach() with a Set or Map. For a Set, it works the same way as a List.*/
		Set<String> bunnies4 = Set.of("long ear", "floppy", "hoppy");
		bunnies4.forEach(b -> System.out.println(b));
		
		//For a Map, you have to choose whether you want to go through the keys or values:
		Map<String, Integer> bunnies5 = new HashMap<>();
		bunnies5.put("long ear", 3);
		bunnies5.put("floppy", 8);
		bunnies5.put("hoppy", 1);
		bunnies5.keySet().forEach(b -> System.out.println(b));
		bunnies5.values().forEach(b -> System.out.println(b));
		//It turns out the keySet() and values() methods each return a Set. Since we know how
		//to use forEach() with a Set, this is easy!
		
		/*Using forEach() with a Map Directly
		You don’t need to know this for the exam, but Java has a functional interface called
		BiConsumer. It works just like Consumer except it can take two parameters. This functional
		interface allows you to use forEach() with key/value pairs from Map.*/
		System.out.println("forEach() with a Map Directly");
		Map<String, Integer> bunnies6 = new HashMap<>();
		bunnies6.put("long ear", 3);
		bunnies6.put("floppy", 8);
		bunnies6.put("hoppy", 1);
		bunnies6.forEach((k, v) -> System.out.println(k + " " + v));
	}

}
