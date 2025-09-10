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
	
	 public static void main(String[] args) {
		 List<User> users = List.of(new User("John", 18, true), 
				 new User("Lennon",25,false),
				 new User("Paul",30,false));
		 
		 // users admin
		 System.out.println("admins:");
		 print(users, u -> u.isAdmin());
		 
		// users age > 25
		 System.out.println("users age > 25");
		 print(users, u -> u.getAge() > 25);
		 
		 // users not admin and age > 25
		 System.out.println("users not admin and age > 25");
		 print(users, u -> !u.isAdmin() && u.getAge() > 25);
	 }
}
