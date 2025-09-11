package exercises.solutions.predicate;

import java.util.*;
import java.util.function.Predicate;

public class PredicateUserExample {
	
	private static void print(List<User> users, Predicate<User> filter) {
		for(User u: users) {
			if(filter.test(u)) {
				System.out.println(u);
			}
		}
		System.out.println("----");
	}
	
	private static void printWithCustomPredicate(List<User> users, CheckUser filter) {
		
		for(User u: users) {
			if(filter.test(u)) {
				System.out.println(u);
			}
		}
		System.out.println("----");
	}
	
	public interface CheckUser{
		 boolean test(User user);
	 }
	
	 public static void main(String[] args) {
		 // List.of (return immutable list)
		 // Add ArrayList outer it becomes a mutable list
		 List<User> users = new ArrayList<>(List.of(new User("John", 18, true), 
				 new User("Lennon",25,false),
				 new User("Paul",30,false),
				 new User("Ana",18,true),
				 new User("Anabella",41,false)));
		 
		 // users admin
		 System.out.println("admins:");
		 print(users, u -> u.isAdmin());
		 System.out.println("admins with custom predicate:");
		 print(users, u -> u.isAdmin());
		 
		// users age > 25
		 System.out.println("users age > 25");
		 print(users, u -> u.getAge() > 25);
		 System.out.println("users age > 25 with custom predicate:");
		 printWithCustomPredicate(users, u -> u.getAge() > 25);
		 
		 // users not admin and age > 25
		 System.out.println("users not admin and age > 25");
		 print(users, u -> !u.isAdmin() && u.getAge() > 25);
		 System.out.println("users not admin and age > 25 with custom predicate");
		 printWithCustomPredicate(users, u -> !u.isAdmin() && u.getAge() > 25);
		 
		//# Challange - 1 
		 // Write a Predicate<User> that filters users whose name starts with "A".
		 System.out.println("Write a Predicate<User> that filters users whose name starts with \"A\"");
		 print(users, u -> u.getName().startsWith("A"));
		 System.out.println("Write a Predicate<User> that filters users whose name starts with \"A\" with custom predicate");
		 printWithCustomPredicate(users, u -> u.getName().startsWith("A"));
		 
		 //# Challange - 2 
		 //Combine this predicate with another one that filters users with age >= 21, using .and().
		 System.out.println("Combine this predicate with another one that filters users with age >= 21, using .and().\n");
		 Predicate<User> startWithJ = u -> u.getName().startsWith("J");
		 CheckUser startWithJCustomPredicate = u -> u.getName().startsWith("J");
		 Predicate<User> isAdult = u -> u.getAge() >= 18;
		 CheckUser isAdultCustomPredicate = u -> u.getAge() >= 18;
		 
		 // combining with .and()
		 Predicate<User> startWithBAndC = startWithJ.and(isAdult);
		 // filter and print
		 users.stream()
		 .filter(startWithBAndC)
		 .forEach(System.out::print);
		 
		 //# Challange - 3
		 //#Create a method that uses users.removeIf(...) with a Predicate<User> to remove all admins older than 40.
		 System.out.println("Create a method that uses users.removeIf(...) with a Predicate<User> to remove all admins older than 40.");
		 
		 users.removeIf(u -> u.getAge() > 40);
		 users.forEach(System.out::println);
		 
		 //# Challange - 4
		 //Rewrite the same logic using a custom Predicate interface (CheckUser).
		 // All called above also had a predicate custom call, except that one where .removeif and .and should be implemented 
	 }
}
