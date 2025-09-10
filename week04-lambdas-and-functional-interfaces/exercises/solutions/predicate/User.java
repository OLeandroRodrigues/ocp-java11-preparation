package exercises.solutions.predicate;

public class User {
	private String name;
	private int age;
	private boolean isAdmin;
	
	public User(String name, int age, boolean isAdmin) {
		this.name = name;
		this.age = age;
		this.isAdmin = isAdmin;
	}
	
	public String getName() { return name; }
	
	public int getAge() { return age; }
	
	public boolean isAdmin() { return isAdmin; }
	
	@Override
	public String toString() {
		return name + " (" + age + "yrs, admin=" + isAdmin + ")";
	}
	
}
