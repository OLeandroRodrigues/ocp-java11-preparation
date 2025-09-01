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
	}
	

}
