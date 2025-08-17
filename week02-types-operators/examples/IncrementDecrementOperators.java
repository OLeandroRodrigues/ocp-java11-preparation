/*Notes
 	IMPORTANT: For the exam, it is critical that you know the difference between expressions
	like parkAttendance++ and ++parkAttendance . The increment and
	decrement operators will be in multiple questions, and confusion about
	which value is returned could cause you to lose a lot of points on the exam.
*/

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int parkAttendance = 0;
		System.out.println(parkAttendance); // 0
		System.out.println(++parkAttendance); // 1
		System.out.println(parkAttendance); // 1
		System.out.println(parkAttendance--); // 1
		System.out.println(parkAttendance); // 0
		
		System.out.println(++parkAttendance); // 1
		System.out.println(parkAttendance); // 1
		System.out.println(parkAttendance++); // 1
		System.out.println(parkAttendance++); // 2
		System.out.println(parkAttendance); // 3
		
		/*One common practice in a certifi cation exam, albeit less common in the real world, is to
		apply multiple increment or decrement operators to a single variable on the same line:*/
		
		int lion = 3;
		int tiger = ++lion * 5 / lion--;
		System.out.println("lion is " + lion);
		System.out.println("tiger is " + tiger);
		
		/*This one is more complicated than the previous example because lion is modifi ed two
		times on the same line. Each time it is modifi ed, as the expression moves from left to right,
		
		the value of lion changes, with different values being assigned to the variable. As you’ll
		recall from our discussion on operator precedence, order of operation plays an important
		part in evaluating this example.
		So how do you read this code? First, lion is incremented and returned to the expression,
		which is multiplied by 5. We can simplify this:
		int tiger = 4 * 5 / lion--; // lion assigned value of 4
		Next, lion is decremented, but the original value of 4 is used in the expression, leading
		to this:
		int tiger = 4 * 5 / 4; // lion assigned value of 3
		Finally, we evaluate multiplication and division from left to right. The product of the
		first two numbers is 20. The divisor 4 divides 20 evenly, resulting in an assignment of 5 to
		tiger. The result is then printed:
		lion is 3
		tiger is 5*/
		

		//Now it gets tricky.
		int x = 5;
		int y = x++ + ++x;
		System.out.println("x = " + x + ", y = " + y);
		
		// Another crazy case
		int a = 1;
		a = a++ + a++ + ++a;
		System.out.println(a);
	}

}
