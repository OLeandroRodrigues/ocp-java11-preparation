package examples;

public class ApplyingAccessModifiers {

	public static void main(String[] args) {
		
		/*
			We are going to discuss Access Modifiers from most restrictive to least
			restrictive:
			-> private: Only accessible within the same class
			-> Default (package-private) access: private plus other classes in the same package
			-> protected: Default access plus child classes
			-> public: protected plus classes in the other packages
		*/
		
		//######################## Private Access ########################################
		/*Private access is easy. Only code in the same class can call private methods or access private
		fields.*/
		
		// structure of the packages
		// package: pond.duck
		/* FatherDuck.java BadDucking.java MotherDuck.java GoodDucking.java */
		// package: pond.swan
		/* BadCygnet */
		
		 /*This is perfectly legal code because everything is one class:
			1: package pond.duck;
			2: public class FatherDuck {
			3: 		private String noise = "quack";
			4: 		private void quack() {
			5: 			System.out.println(noise); // private access is ok
			6: 		}
			7: 		private void makeNoise() {
			8: 			quack(); // private access is ok
			9: 		} }*/
		
			/*Now we add another class:
			1: package pond.duck;
			2: public class BadDuckling {
			3: 		public void makeNoise() {
			4: 			FatherDuck duck = new FatherDuck();
			5: 			duck.quack(); // DOES NOT COMPILE
			6: 			System.out.println(duck.noise); // DOES NOT COMPILE
			7: } }*/
		
		  /*######################## Default (Package-Private) Access #############################*/
		  //Only classes in the package may access it
		
			/*package pond.duck;
				public class MotherDuck {
				String noise = "quack";
				void quack() {
					System.out.println(noise); // default access is ok
				}
				private void makeNoise() {
					quack(); // default access is ok
				}
			}*/
			
			/*package pond.duck;
			public class GoodDuckling {
				public void makeNoise() {
						MotherDuck duck = new MotherDuck();
						duck.quack(); // default access
						System.out.println(duck.noise); // default access
				}
			}*/
		
			/*package pond.swan;
			import pond.duck.MotherDuck; // import another package
			public class BadCygnet {
				public void makeNoise() {
					MotherDuck duck = new MotherDuck();
					duck.quack(); // DOES NOT COMPILE
					System.out.println(duck.noise); // DOES NOT COMPILE
				}
			}*/
		
			/*######################## Protected Access #############################*/
			/*Protected access allows everything that default (package-private) access allows and more.
			The protected access modifier adds the ability to access members of a parent class. 
			INHERIRANCE! :D*/
		
			// Classes used to show protected access
			// package: pond.shore
			/* Bird.java BirdWatcher.java  */
			// package: pond.goose
			/* Gosling (extends Bird) Goose (extends Bird)*/
			// package: pond.inland
			/* BirdWatcherFromAfar */
			// package: pond.inland
			/* Swan (extends Bird) */
			// package: pond.duck
			/* GooseWatcher */
		
			//First, create a Bird class and give protected access to its members:
			/*package pond.shore;
			public class Bird {
					protected String text = "floating"; // protected access
					protected void floatInWater() { // protected access
						System.out.println(text);
					}
			}*/
		
			//Next, we create a subclass:
			/*package pond.goose;
			import pond.shore.Bird; // in a different package
			public class Gosling extends Bird { // extends means create subclass
				public void swim() {
					floatInWater(); // calling protected member
					System.out.println(text); // accessing protected member
				}
			}*/
		
			//This means that a class in the same package as Bird can access its protected members.
			/*package pond.shore; // same package as Bird
			public class BirdWatcher {
				public void watchBird() {
					Bird bird = new Bird();
					bird.floatInWater(); // calling protected member
					System.out.println(bird.text); // accessing protected member
				}
			}*/
		
			//Now let’s try the same thing from a different package:
			/*package pond.inland;
			import pond.shore.Bird; // different package than Bird
			public class BirdWatcherFromAfar {
					public void watchBird() {
						Bird bird = new Bird();
						bird.floatInWater(); // DOES NOT COMPILE
						System.out.println(bird.text); // DOES NOT COMPILE
					}
			}*/
		
			/*Got that? Subclasses and classes in the same package are the only ones allowed to access
			protected members.
			There is one gotcha for protected access. Consider this class:*/
		
			/*1: package pond.swan;
			2: import pond.shore.Bird; // in different package than Bird
			3: public class Swan extends Bird { // but subclass of Bird
			4: 		public void swim() {
			5: 			floatInWater(); // subclass access to superclass
			6: 			System.out.println(text); // subclass access to superclass
			7: 		}
			8: public void helpOtherSwanSwim() {
			9: 		Swan other = new Swan();
			10: 		other.floatInWater(); // subclass access to superclass
			11: 		System.out.println(other.text); // subclass access
			12: 		// to superclass
			13: }
			14: public void helpOtherBirdSwim() {
			15: 	Bird other = new Bird();
			16: 	other.floatInWater(); // DOES NOT COMPILE
			17: 	System.out.println(other.text); // DOES NOT COMPILE
			18: }
			19: }*/
		
			/*We’re going to try this again to make sure you understand what is going on. Can you
			figure out why these examples don’t compile?*/
		
			/*package pond.goose;
			import pond.shore.Bird;
			public class Goose extends Bird {
				public void helpGooseSwim() {
						Goose other = new Goose();
						other.floatInWater();
						System.out.println(other.text);
				}
			public void helpOtherGooseSwim() {
				Bird other = new Goose();
				other.floatInWater(); // DOES NOT COMPILE
				System.out.println(other.text); // DOES NOT COMPILE
			}
			}*/
		
			//What about this one?
			
			/*package pond.duck;
			import pond.goose.Goose;
			public class GooseWatcher {
				public void watch() {
					Goose goose = new Goose();
					goose.floatInWater(); // DOES NOT COMPILE
				}
			}*/
		
			/*######################## Public Access #############################*/
			//public means anyone can access the member from anywhere.
		
		
			
		
		
	}

}
