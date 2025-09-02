package week03_core_java_apis;

import java.util.Arrays; // import just Arrays

public class UnderstandingJavaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*#Creating an Array of Primitives*/
		// One way
		int[] numbers1 = new int[3];
		
		// Another way
		int[] numbers2 = new int[] {42, 55, 99};
		int[] numbers3 = {42, 55, 99}; // anonymous array
		
		
		int[] numAnimals;
		int [] numAnimals2;
		int []numAnimals3;
		int numAnimals4[];
		int numAnimals5 [];
		/*Most people use the first one. You could see any of these on the exam, though, so get
		used to seeing the brackets in odd places*/
		
		/*#Multiple “Arrays” in Declarations*/
		int ids[], types; //
		
		/*#Creating an Array with Reference Variables*/
		String [] bugs = { "cricket", "beetle", "ladybug" };
		String [] alias = bugs;
		System.out.println(bugs.equals(alias)); // true
		System.out.println(bugs.toString()); //[Ljava.lang.String;@160bc7c0
		
		/*Remember casting from the previous chapter when you wanted to force a bigger type
		into a smaller type? You can do that with arrays too:*/
		String[] strings = { "stringValue" };
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		//againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
		//objects[0] = new StringBuilder(); // careful!
		
		/*#Using an Array*/
		String[] mammals = {"monkey", "chimp", "donkey"};
		System.out.println(mammals.length); // 3
		System.out.println(mammals[0]); // monkey
		System.out.println(mammals[1]); // chimp
		System.out.println(mammals[2]); // donkey
		
		//It is very common to use a loop when reading from or writing to an array. This loop sets
		//each element of numbers to five higher than the current index:
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = i + 5;
		
		//Can you tell why each of these throws an ArrayIndexOutOfBoundsException
		//for our array of size 10?
		/*numbers[10] = 3; the bound is [9] because if begins with [0] and not with [1]
		numbers[numbers.length] = 5; the bound is [9] again the length give all the slots that is 10
		for (int i = 0; i <= numbers.length; i++) numbers[i] = i + 5; <= will do that the loop be executated 10 times
		what will throw execption 
		*/
		
		/*#Sorting */
		// Java makes it easy to sort an array by providing a sort method
		/*Just like StringBuilder allowed you to pass almost anything to append(), you
		can pass almost any array to Arrays.sort().*/
		int[] numbers10 = { 6, 9, 1 };
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++)
		System.out.print(numbers[i] + " ");
		
		/*#Searching*/
		/*Table 5.1 Binary search rules
		Scenario 									Result
		Target element found in sorted array 		Index of match
		Target element not found in sorted array 	Negative value showing one smaller than the negative
													of the index, where a match needs to
													be inserted to preserve sorted order
		Unsorted array 								A surprise—this result isn’t predictable*/
		int[] numbers11 = {2,4,6,8};
		System.out.println(Arrays.binarySearch(numbers11, 2)); // 0
		System.out.println(Arrays.binarySearch(numbers11, 4)); // 1
		System.out.println(Arrays.binarySearch(numbers11, 1)); // -1
		System.out.println(Arrays.binarySearch(numbers11, 3)); // -2
		System.out.println(Arrays.binarySearch(numbers11, 9)); // -5
		
		/*#Comparing*/
		//compare two arrays to determine which is “smaller.”
		
		//compare()
		/*
		-> A negative number means the first array is smaller than the second.
		-> A zero means the arrays are equal.
		-> A positive number means the first array is larger than the second.*/
		
		System.out.println(Arrays.compare(new int[] {1}, new int[] {2})); // negative
		
		/*Now that you know how to compare a single value, let’s look at how to compare arrays
		of different lengths:
			If both arrays are the same length and have the same values in each spot in the same
		order, return zero.
			If all the elements are the same but the second array has extra elements at the end,
		return a negative number.
			If all the elements are the same but the first array has extra elements at the end, return
		a positive number.
			If the first element that differs is smaller in the first array, return a negative number.
			If the first element that differs is larger in the first array, return a positive number.*/
		
		/*#mismatch()*/
		/*If the arrays are equal, mismatch() returns -1. Otherwise, it returns the first index where they
		differ.*/
		
		System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1}));
		System.out.println(Arrays.mismatch(new String[] {"a"},
		new String[] {"A"}));
		System.out.println(Arrays.mismatch(new int[] {1, 2}, new int[] {1}));
		
		/*Table 5.3 Equality vs. comparison vs. mismatch
		Method 							When arrays are the same 				When arrays are different
		equals() 						true 									false
		compare() 						0 										Positive or negative number
		mismatch() 						-1 										Zero or positive index*/
		
		/*#Varargs*/
		/*public static void main(String... args) // varargs*/
		/*can use a variable defined using varargs as if it were a normal array.*/
		
		/*#Multidimensional Arrays*/
		
		int[][] vars1; // 2D array
		int vars2 [][]; // 2D array
		int[] vars3[]; // 2D array
		int[] vars4 [], space [][]; // a 2D AND a 3D array
		
		String [][] rectangle = new String[3][2]; // three columns each one pointing to an array with two slots
		
		//Using a Multidimensional Array
		
		
	}
	

}
