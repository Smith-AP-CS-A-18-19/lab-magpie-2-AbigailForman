


	/**
	 * Gives a response to a user statement
	 *

	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	 public class Magpie2 {
		 public String getGreeting() {
			 return "Hello, let's talk.";
}
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

															else {
																							response = getRandomResponse();
															}
															return response;
							}

							/**
							* Pick a default response to use if nothing else fits.
							* @return a non-committal string
							*/
							private String getRandomResponse() {
															final int NUMBER_OF_RESPONSES = 4;
															double r = Math.random();
															int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
															String response = "";

															if (whichResponse == 0) {
																							response = "Interesting, tell me more.";
															} else if (whichResponse == 1) {
																							response = "Hmmm.";
															} else if (whichResponse == 2) {
																							response = "Do you really think so?";
															} else if (whichResponse == 3) {
																							response = "You don't say.";
															}

															return response;
							}
}
