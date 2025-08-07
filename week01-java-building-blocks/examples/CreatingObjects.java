
/*Notes */
/*1)*/
/*
	Some classes provide built-in methods that allow you to create new
	instances without using a constructor or the new keyword. For example, in
	Chapter 5, “Core Java APIs,” you’ll create instances of Integer using the
	valueOf() method. Methods like this will often use new with a constructor
	in their method definition. For the exam, remember that anytime a constructor
	is used, the new keyword is required.
*/

class Beverage {
		// Properties
		private String name;

		// Construtor
		public Beverage() {}
		
		public Beverage(String name) {
			this.name = name;
		}
		
		// Getter
		public String getName() {
			return name; 
		}
		
		// Setter
		public void setName(String name) {
			this.name = name; 
		}
}

class Coffee extends Beverage{
	// Properties
	private String brandName;

	// Construtor
	public Coffee() {}
	
	public Coffee(String brandName) {
		this.brandName = brandName;
	}
	
	public Coffee(String name, String brandName) {
		super(name);
		this.brandName = brandName;
	}
	
	// Getter
	public String getBrandName() {
		return brandName; 
	}
	
	// Setter
	public void setBrandName(String brandName) {
		this.brandName = brandName; 
	}
}

public class CreatingObjects {

	public static void main(String[] args) {
		
		// WAY TO CALL A CONSTRUTOR AND CONSEQUENTLY CREATES AN OBJECT

		// 1: NOT CONSTRUCTOR
		Coffee coffee = new Coffee();
		System.out.println("Name: " + coffee.getBrandName());
		
		// 2: CONSTRUCTOR CHILD 
		coffee = new Coffee("starbucks");
		System.out.println("Name: " + coffee.getBrandName());
		
		// 3: CONSTRUCT WITH INHERITANCE
		coffee = new Coffee("hot coffee","starbucks");
		System.out.println("BrandName: " + coffee.getBrandName() + ", Name: " + coffee.getName());
		
	}
}
