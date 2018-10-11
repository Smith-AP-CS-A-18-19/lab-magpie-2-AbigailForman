/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */

public class Magpie2 {


	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				   || statement.indexOf("father") >= 0
				   || statement.indexOf("sister") >= 0
				   || statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";

		} else if (statement.indexOf("bearded dragon") >= 0
				 || statement.indexOf("dog") >= 0
				 || statement.indexOf("cat") >= 0
				 || statement.indexOf("bird") >= 0)
	{
		response = "Tell me more about your pet.";
	}

	else if (statement.indexOf("I am hungry") >= 0
			 || statement.indexOf("I want lunch") >= 0)
{
	response = "What do you want for lunch?";
}


else if (statement.indexOf("Chicken") >= 0)
{
response = "Chicken is very yummy.";
}
else if (statement.indexOf("Chicken") >= 0)
{
response = "Yes it is. What else are you doing today?";
}
else if (statement.indexOf("I am going running") >=0)
{
 response = "I cannot physically run. I am a laptop.";

}



	else if (statement.indexOf("Abby") >=0)
  {
 	 response = "Abby is my mom.";

  }
	else if (statement.indexOf("AP Biology") >=0)
  {
 	 response = "Abby doesn't like AP Biology.";

  }
	else if (statement.indexOf("I like to watch YouTube videos") >=0)


	 if (statement.indexOf("I like to watch Netflix") >=0)
  {
 	 response = "My favorite show on Netflix is Disenchanted.";

  }
	
	else if (statement.indexOf("I hate AP Biology") >=0)
  {
 	 response = "I want all of my cells to be in metabolic equilibrium.";

  }

	else if (statement.indexOf("How are you") >=0)
  {
 	 response = "I am doing well, how are you?";
  }
	else if (statement.indexOf("Fine") >= 0
				 || statement.indexOf("Great") >= 0
				 || statement.indexOf("Amazing") >= 0
				 || statement.indexOf("Okay") >= 0
				 || statement.indexOf("Ok") >= 0
				 || statement.indexOf("Doing well") >= 0)
	{
