/*

Prepare to be tested on these rules. The following examples are legal:
long okidentifier;
float $OK2Identifier;
boolean _alsoOK1d3ntifi3r;
char __SStillOkbutKnotsonice$;


These examples are not legal:
int 3DPointClass; // identifiers cannot begin with a number
byte hollywood@vine; // @ is not a letter, digit, $ or _
String *$coffee; // * is not a letter, digit, $ or _
double public; // public is a reserved word
short _; // a single underscore is not allowed


When you see a nonstandard identifier, be sure to
check if it is legal. If it’s not, you get to mark the answer “does not compile” and skip analyzing
everything else in the question.

*/

public class DeclaringVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring Multiple Variables
		String name, shortname;
		String companyName = "Petrobras", shortName = "Petro";
		
		String s1 = "1", s2;
		int i1; int i2;

	}

}
