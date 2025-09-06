
import java.util.*;

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
}


