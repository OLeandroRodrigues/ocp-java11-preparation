/*
 * Notes
 	We will look at what it means for two objects to be
	equivalent or the same. We will also look at the impact of the String pool on equality*/

public class UnderstandingEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*#Comparing equals() and ==*/
		//Consider the following code that uses == with objects:
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two); // false
		System.out.println(one == three); // true
		
		//The exam will test you on your understanding of equality with objects they define too.
		
		/*#The String Pool*/
		/*Since strings are everywhere in Java, they use up a lot of memory. In some production
		applications, they can use a large amount of memory in the entire program. Java realizes
		that many strings repeat in the program and solves this issue by reusing common ones. The
		string pool, also known as the intern pool, is a location in the Java virtual machine (JVM)
		that collects all these strings*/
		String x1 = "Hello World";
		String y1 = "Hello World";
		System.out.println(x1 == y1); // true
		
		String x2 = "Hello World";
		String z2 = " Hello World".trim();
		System.out.println(x2 == z2); // false
		/*In this example, we don’t have two of the same String literal. Although x and z happen
		to evaluate to the same string, one is computed at runtime. Since it isn’t the same at
		compile-time, a new String object is created*/
		String singleString = "hello world";
		String oneLine = "hello " + "world";
		String concat = " hello";
		concat += "world";
		System.out.println(singleString == oneLine); // false
		System.out.println(singleString == concat); // false
		
		// intern()
		/*If the literal is not yet in the string
		pool, Java will add it at this time.*/
		String name = "Hello World";
		String name2 = new String("Hello World").intern();
		System.out.println(name == name2); // true
		
		/*REMEMBER!*/
		/*Remember to never use intern() or == to compare String objects in your
		code. The only time you should have to deal with these is on the exam.*/
	}

}
