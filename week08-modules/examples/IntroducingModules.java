package examples;

public class IntroducingModules {

	public static void main(String[] args) {

		//#Introducing Modules
		
		/*Let’s look at what modules are and what
		problems they are designed to solve.
		The Java Platform Module System includes the following:
		-> A format for module JAR files
		-> Partitioning of the JDK into modules
		-> Additional command-line options for Java tools*/
		
		//#Exploring a Module
		//A module is a group of one or more packages plus a special file called module-info.java.
		
		/*zoo.animal.feeding <- zoo.staff
		zoo.animal.talks   <- zoo.staff
		zoo.animal.care    <- zoo.staff
		
		zoo.animal.feeding <- zoo.animal.care
		zoo.animal.feeding <- zoo.animal.talks*/
		
		/*zoo.animal.talks  <- zoo.staff
		zoo.animal.talks  -> zoo.animal.feeding
		zoo.animal.talks  -> zoo.animal.care*/
		
		/*#zoo.animals.talks module.
		shows what is inside the zoo.animals.talks module. There are three packages with two classes each. 
		(It’s a small zoo.) There is also a strange file called module-info.java. 
		This file is required to be inside all modules*/
		
		/*zoo.animals.talks
		zoo.animals.talks.content
			-> ElephantScript.java, SeaLionScript.java
		zoo.animals.talks.media
			-> Signage.java, Announcement.java
		zoo.animals.talks.schedule
			-> Weekday.java, Weekend.java
		module-info.java*/
		
		//#Benefits of Modules
		/*-> Better Access Control: Modules solve this problem by acting as a fifth level of access control.
		-> Clearer Dependency Management: When launching the program, Java would complain
		that Hamcrest isn’t in the module path and you’d know right away.
		-> Custom Java Builds: The Java Platform Module System allows developers to specify what modules they actually
		need. This makes it possible to create a smaller runtime image that is customized to
		what the application needs and nothing more. Users can run that image without having
		Java installed at all.*/
		
		//#Improved Performance
	
		
		
		
		
	}

}
