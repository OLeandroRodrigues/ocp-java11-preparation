
import java.util.*;
import java.util.function.*;

public class WritingSimpleLambdas {

	public static void main(String[] args) {
		
		//Functional programming
		//Lambda Example
		
		/*Our goal is to print out all the animals in a list according to some criteria. We’ll show you
		how to do this without lambdas to illustrate how lambdas are useful. We start out with the
		Animal class:*/
		
		// list of animals
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		
	
		// pass class that does check
		print(animals, new CheckIfHopper());
		
		// lambda expression
		print(animals, a -> a.canHop());
		print(animals, a -> a.canSwim());
		print(animals, a -> ! a.canSwim());
		
		//Lambda Syntax
		//a -> a.canHop();
		
		/*Table 6.1 shows examples of valid lambdas that return a boolean .*/
		
		/*tabLe 6.1 										Valid lambdas
		Lambda 											# parameters
		() -> true 										0
		a -> a.startsWith("test") 						1
		(String a) -> a.startsWith("test") 				1
		(a, b) -> a.startsWith("test") 					2
		(String a, String b) -> a.startsWith("test") 	2*/
		
		/*tabLe 6. 2 											Invalid lambdas that return boolean
		Invalid lambda 										Reason
		a, b -> a.startsWith("test") 						Missing parentheses
		a -> { a.startsWith("test"); } 						Missing return
		a -> { return a.startsWith("test") } 				Missing semicolon*/
		
		//Remember that the parentheses are optional only when there is one parameter and it
		//doesn’t have a type declared.
	}
	private static void print(List<Animal> animals,CheckTrait checker) {
		
		for (Animal animal : animals) {
			// the general check
			if (checker.test(animal))	
				System.out.print(animal + " ");
			}
			System.out.println();
	}
	
	public static class Animal {
		private String species;
		private boolean canHop;
		private boolean canSwim;
		public Animal(String speciesName, boolean hopper, boolean swimmer){
			species = speciesName;
			canHop = hopper;
			canSwim = swimmer;
		}
		
		public boolean canHop() { return canHop; }
		public boolean canSwim() { return canSwim; }
		public String toString() { return species; }
		
	}
	
	public static class CheckIfHopper implements CheckTrait {
		public boolean test(Animal a) {
		return a.canHop();
		}
	}
	
	public interface CheckTrait {
		boolean test(Animal a);
	}
	
	public class PredicateSearch {
		
		public static void main(String[] args) {
			
			List<Animal> animals = new ArrayList<Animal>();
			animals.add(new Animal("fish", false, true));
			print(animals, a -> a.canHop());
		}
		
		private static void print(List<Animal> animals,Predicate<Animal> checker) {
			
			for (Animal animal : animals) {
				if (checker.test(animal))
					System.out.print(animal + " ");
			}
			
			System.out.println();
			}
		}
}


