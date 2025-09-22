package examples;

public class CreatingClasses {

	public static void main(String[] args) {
		
		//#Extending a Class
		//abstract or final or anything
		// final -> final means a class cannot be extended.
		
		var lion = new Lion();
		lion.setProperties(3, "kion");
		lion.roar();
			
		//#Applying Class Access Modifiers
		/*One benefi t of using the package-private
		access is that you can defi ne many classes within the same Java fi le. For example, the following
		defi nition could appear in a single Java fi le named Groundhog.java , since it contains
		only one public class:
		
			class Rodent {}
			public class Groundhog extends Rodent {}
		*/
		
		//#Accessing the "this" Reference
		
		//#Calling the super Reference
		/*
		 	class Mammal {
				String type = "mammal";
				}
				
			public class Bat extends Mammal {
				String type = "bat";
				public String getType() {
					return super.type + ":" + this.type;
				}
				public static void main(String... zoo) {
					System.out.print(new Bat().getType());
				}
			}
		*/
		
		
	}
	
	public static class Animal{
		private int age;
		protected String name;
		
		public int getAge() {return age;}
		public void setAge(int newAge) {age = newAge;}

	}
	
	public static class Lion extends Animal{
		public void setProperties(int age, String n) {
			setAge(age);
			name = n;
		}
		public void roar() {
			System.out.print(name + ", age " + getAge() + ", says: Roar!");
			}
	}
}
