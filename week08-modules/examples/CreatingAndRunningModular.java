package examples;

public class CreatingAndRunningModular {

	public static void main(String[] args) {
		
		// Contents of zoo.animal.feeding
		/*(module) zoo.animals.talks.feeding
		(package)zoo.animals.talks.feeding
			-> Task.java
		module.info.java
		
		we will create, compile, run, and package the zoo.animal.feeding
		module.*/
		
		/*#Creating the Files*/
		
		/*So, let’s create a simple class.
		
		package zoo.animal.feeding;
		public class Task {
			public static void main(String... args) {
				System.out.println("All fed!");
			}
		}
		
		Next comes the module-info.java file. This is the simplest possible one.
		module zoo.animal.feeding {
		}*/
		
		/*#Compiling Our First Module
		Before we can run modular code, we need to compile it.
		
		javac --module-path mods -d feeding feeding/zoo/animal/feeding/*.java feeding/module-info.java
		
		Just like classpath, you can use an abbreviation in the command. The syntax --module-path and -p are equivalent. That means we could have written many other
		commands in place of the previous command. The following four commands show the -p option:
		
		javac -p mods
		-d feeding
		feeding/zoo/animal/feeding/*.java
		feeding/*.java
		
		javac -p mods
		-d feeding
		feeding/zoo/animal/feeding/*.java
		feeding/module-info.java
		
		javac -p mods
		-d feeding
		feeding/zoo/animal/feeding/Task.java
		feeding/module-info.java
		
		Do be sure to memorize the module command syntax. You will be tested on it on the
		exam. We will be sure to give you lots of practice questions on the syntax to reinforce it.*/
		
		/*#Running Our First Module
		It is common for the module name to match either the full package
		name or the beginning of it.
		
		java --module-path feeding
		--module zoo.animal.feeding/zoo.animal.feeding.Task*/
		
		/*#Packaging Our First Module
		A module isn’t much use if we can run it only in the folder it was created in. Our next step
		is to package it. Be sure to create a mods directory before running this command:
		jar -cvf mods/zoo.animal.feeding.jar -C feeding/ .
		
		There’s nothing module-specifi c here. In fact, you might remember seeing this command
		in Chapter 1. We are packaging everything under the feeding directory and storing it in a
		JAR fi le named zoo.animal.feeding.jar under the mods folder. This represents how the
		module JAR will look to other code that wants to use it.*/
		
		/*It is possible to version your module using the --module-version option.
		This isn’t on the exam but is good to do when you are ready to share your
		module with others.*/
		
		/*Now let’s run the program again, but this time using the mods directory instead of the
		loose classes:
		java -p mods
		-m zoo.animal.feeding/zoo.animal.feeding.Task*/
		
	}

}
