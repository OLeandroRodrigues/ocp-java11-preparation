/*Notes
  Explore methods in depth, including overloading
*/
package examples;

public class DesigningMethods {

	public static void main(String[] args) {
	
		/*Table 7.1 Parts of a method declaration
		Element 					Value in nap() example 					Required?
		Access modifier 			public 									No
		Optional specifier 			final 									No
		Return type 				void 									Yes
		Method name 				nap 									Yes
		Parameter list 				(int minutes) 							Yes, but can be empty parentheses
		Optional exception list 	throws InterruptedException 			No
		Method body* 				{										Yes, but can be empty
										// take a nap
									}*/
		
		//Access Modifiers
		//Java offers four choices of access modifier:
		/**private** The private modifier means the method can be called only from within the same
		class.*/
		
		/**Default (Package-Private) Access** With default access, the method can be called only from
		classes in the same package. This one is tricky because there is no keyword for default
		access. You simply omit the access modifier.*/
		
		/***protected** The protected modifier means the method can be called only from classes in
		the same package or subclasses. You’ll learn about subclasses in Chapter 8, “Class Design.”*/
		
		/***public** The public modifier means the method can be called from any class./
			
		

	}

}
