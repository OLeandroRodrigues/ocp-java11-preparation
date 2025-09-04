package week03_core_java_apis;

/*
 Notes
 	An array has one glaring shortcoming: You have to know how many elements will be
	in the array when you create it, and then you are stuck with that choice. Just like a
	StringBuilder, an ArrayList can change capacity at runtime as needed. Like an array, an
	ArrayList is an ordered sequence that allows duplicates.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.*;

public class UnderstandingJavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*#Creating an ArrayList*/
		//As with StringBuilder, there are three ways to create an ArrayList:
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);
		
		//with generics (  
		ArrayList<String> list4 = new ArrayList<String>(); // java 5
		ArrayList<String> list5 = new ArrayList<>(); // java 7
		
		/*#Using an ArrayList*/
		//ArrayList has many methods, but you only need to know a handful of them—
		
		//add()
		/*The add() methods insert a new value in the ArrayList. The method signatures are as
		follows:
			boolean add(E element)
			void add(int index, E element)*/
		
		ArrayList list6 = new ArrayList();
		list6.add("hawk"); // [hawk]
		list6.add(Boolean.TRUE); // [hawk, true]
		System.out.println(list6); // [hawk, true]
		
		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
		//safer.add(Boolean.TRUE); // DOES NOT COMPILE
		
		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add(1, "robin"); // [hawk, robin]
		birds.add(0, "blue jay"); // [blue jay, hawk, robin]
		birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
		System.out.println(birds); // [blue jay, cardinal, hawk, robin]
		
		//remove()
		/*The method signatures are as follows:
			boolean remove(Object object)
			E remove(int index)*/
		
		List<String> birds1 = new ArrayList<>();
		birds1.add("hawk"); // [hawk]
		birds1.add("hawk"); // [hawk, hawk]
		System.out.println(birds1.remove("cardinal")); // prints false
		System.out.println(birds1.remove("hawk")); // prints true
		System.out.println(birds1.remove(0)); // prints hawk
		System.out.println(birds1); // []
		
		//set()
		/*The set() method changes one of the elements of the ArrayList without changing the size.
			The method signature is as follows:
			E set(int index, E newElement)*/
		
		//The E return type is the element that got replaced. The following shows how to use this method:
		List<String> birds2 = new ArrayList<>();
		birds2.add("hawk"); // [hawk]
		System.out.println(birds2.size()); // 1
		birds2.set(0, "robin"); // [robin]
		System.out.println(birds2.size()); // 1
		//birds2.set(1, "robin"); // IndexOutOfBoundsException
		
		//isEmpty() and size()
		/*The isEmpty() and size() methods look at how many of the slots are in use. The method
		signatures are as follows:
					boolean isEmpty()
					int size()*/
		//The following shows how to use these methods:
		List<String> birds3 = new ArrayList<>();
		System.out.println(birds3.isEmpty()); // true
		System.out.println(birds3.size()); // 0
		birds3.add("hawk"); // [hawk]
		birds3.add("hawk"); // [hawk, hawk]
		System.out.println(birds3.isEmpty()); // false
		System.out.println(birds3.size()); // 2
		
		//clear()
		/*The clear() method provides an easy way to discard all elements of the ArrayList. The
		method signature is as follows:
			void clear()
			The following shows how to use this method:*/
		List<String> birds4 = new ArrayList<>();
		birds4.add("hawk"); // [hawk]
		birds4.add("hawk"); // [hawk, hawk]
		System.out.println(birds4.isEmpty()); // false
		System.out.println(birds4.size()); // 2
		birds4.clear(); // []
		System.out.println(birds4.isEmpty()); // true
		System.out.println(birds4.size()); // 0
		
		//contains()
		/*The contains() method checks whether a certain value is in the ArrayList. The method
		signature is as follows:
			boolean contains(Object object)
		The following shows how to use this method:*/
		List<String> birds5 = new ArrayList<>();
		birds5.add("hawk"); // [hawk]
		System.out.println(birds5.contains("hawk")); // true
		System.out.println(birds5.contains("robin")); // false
		
		//equals()
		/*Finally, ArrayList has a custom implementation of equals(),so you can compare two lists
		to see whether they contain the same elements in the same order.
			boolean equals(Object object)
		The following shows an example:*/
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two)); // true
		one.add("a"); // [a]
		System.out.println(one.equals(two)); // false
		two.add("a"); // [a]
		System.out.println(one.equals(two)); // true
		one.add("b"); // [a,b]
		two.add(0, "b"); // [b,a]
		System.out.println(one.equals(two)); // false
		
		/*#Wrapper Classes*/
		/*Table 5.4 Wrapper classes
		Primitive type 						Wrapper class 						Example of creating
		boolean 							Boolean 							Boolean.valueOf(true)
		byte 								Byte 								Byte.valueOf((byte) 1)
		short 								Short 								Short.valueOf((short) 1)
		int 								Integer 							Integer.valueOf(1)
		long 								Long 								Long.valueOf(1)
		float 								Float 								Float.valueOf((float) 1.0)
		double 								Double 								Double.valueOf(1.0)
		char 								Character 							Character.valueOf('c')*/
		
		//You do need to know these methods
		int primitive = Integer.parseInt("123");
		Integer wrapper = Integer.valueOf("123");
		
		/*Table 5.5 Converting from a String
		Wrapper class 			Converting String to a primitive 			Converting String to a wrapper class
		Boolean 				Boolean.parseBoolean("true") 				Boolean.valueOf("TRUE")
		Byte 					Byte.parseByte("1") 						Byte.valueOf("2")
		Short 					Short.parseShort("1") 						Short.valueOf("2")
		Integer 				Integer.parseInt("1") 						Integer.valueOf("2")
		Long 					Long.parseLong("1") 						Long.valueOf("2")
		Float 					Float.parseFloat("1") 						Float.valueOf("2.2")
		Double 					Double.parseDouble("1") 					Double.valueOf("2.2")
		Character 				None 										None*/
		
		/*#Autoboxing and Unboxing*/
		/*Since Java 5, you can just type the primitive value, and Java will convert it to the
		relevant wrapper class for you. This is called autoboxing*/
		//The reverse conversion of wrapper class to primitive value is called unboxing
		
		List<Integer> weights = new ArrayList<>();
		Integer w = 50;
		weights.add(w); // [50] autoboxes
		weights.add(Integer.valueOf(60)); // [50, 60]
		weights.remove(50); // [60]
		double first = weights.get(0); // 60.0 unboxes
		
		//Also be careful when autoboxing into Integer
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);
		System.out.println(numbers);
		
		/*
		 It actually outputs [1]. After adding the two values, the List contains [1, 2]. We then
		request the element with index 1 be removed. That’s right: index 1. Because there’s already
		a remove() method that takes an int parameter, Java calls that method rather than autoboxing.
		If you want to remove the 1, you can write numbers.remove(new Integer(1)) to
		force wrapper class use. */
		
		/*#Converting Between array and List*/
		// From array To ArrayList mutable
		String[] array = { "hawk", "robin" }; // [hawk, robin]
		List<String> list = Arrays.asList(array); // returns fixed size list
		System.out.println(list.size()); // 2
		list.set(1, "test"); // [hawk, test]
		array[0] = "new"; // [new, test]
		System.out.print(Arrays.toString(array));// [new, test]
		//list.remove(1); // throws UnsupportedOperationException
		
		// From array To ArrayList imutable
		String[] array1 = { "hawk", "robin" }; // [hawk, robin]
		List<String> list10 = List.of(array1); // returns immutable list
		System.out.println(list10.size()); // 2
		array1[0] = "new";
		System.out.println(Arrays.toString(array1)); // [new, robin]
		System.out.println(list10); // [hawk, robin]
		//list1.set(1, "test"); // throws UnsupportedOperationException

		/*Using Varargs to Create a List*/
		List<String> list11 = Arrays.asList("one", "two");
		List<String> list12 = List.of("one", "two");
		
		/*Table 5.6 Array and list conversions
														toArray() 			Arrays.asList() 			List.of()
		Type converting from 							List 				Array (or varargs) 			Array (or varargs)
		Type created 									Array 				List 						List
		Allowed to remove values from created object    No					No							No
		Allowed to change values in the created object  Yes 				Yes							No
		Changing values in the created object 			No 					Yes							N/A
		affects the original or vice versa.*/
		
		/*#Sorting*/
		List<Integer> numbers10 = new ArrayList<>();
		numbers10.add(99);
		numbers10.add(5);
		numbers10.add(81);
		Collections.sort(numbers10);
		System.out.println(numbers10); // [5, 81, 99]
		
		
	}

}
