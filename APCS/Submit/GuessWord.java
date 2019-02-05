import cs1.*;
public class GuessWord
{
	// instance data
	private String mysteryWord;
	private int numGuesses;
	private String theGuesses;
	private String puzzle;
	
	public GuessWord(String w) //purpose of the constructor is to initialize the instance data
	{
		mysteryWord = w; // use the parameter w to initialize mysteryWord
		numGuesses = 0;  //    REMEMBER: recipient (instance data) needs to be on the left
		theGuesses = "";	// initialize numGuesses to 0, and theGuesses and puzzle to an
		puzzle = "";    	// empty String ""
	 						// After you initialize puzzle to a starting value of ""
	 	for(int k = 0; k <= mysteryWord.length(); k++) // you will want to loop through the mysteryWord and add the
	 	puzzle += "*"; // correct number of * characters to puzzle
	 
		 
	}
	
	public boolean checkLetter(String lett)
	{
		int loc = mysteryWord.indexOf(lett); // USE the String method indexOf to do this
		if (lett.equals(loc)) // returns true if lett is in mysteryWord, false otherwise
		return true;
		else
		return false;	
		
		
	}
	
	public int playGame()
	{
		String theLett;
		
		while(!puzzle.equals(mysteryWord))
		{
			System.out.println("Puzzle: " + puzzle);
			if (numGuesses > 0) System.out.println("You have guessed " +
			                    theGuesses + " so far");
			System.out.print("Enter your guess: ");
			theLett = Keyboard.readString();
			
											 // write a line of code to add theLett to theGuesses
		 		theGuesses += theLett;		 // to help player know which letters 
											 // have already been guessed
		
				numGuesses++;				 // write a line of code to increment numGuesses
			
			
			if (theLett == puzzle)  // invoke method to check whether theLett in mysteryWord
			{
				System.out.println("Good Job!");		
				String theChar;
				for(int i = 0; i<puzzle.length(); i++)
				theChar = puzzle.substring(i,i++);  // invoke method to update the puzzle**********
			}
			else
				System.out.println("Try Again!");		

			
		}
		System.out.println("Puzzle: " + puzzle);

		return 1;
		
	}
		
		
		
		
	
	public void updatePuzzle(String lett)
	{
		for(int k = 0; k < mysteryWord.length; k++)// loop through mysteryWord and check each letter in
			if (mysteryWord[k] = lett)				   // mysteryWord against lett
				puzzle.substring(k,lett) += lett; // if matches, remove * from puzzle and replace with lett
												  //    you will use substring to do this
		puzzle = puzzle [lett]					  //    you can set the puzzle equal to the portion of the
												  //    puzzle that is before the letter, add the letter, and 
												  //    add the portion of the puzzle that follows the letter
		
	}
	
	
	
	public static void main(String[] args)
	{
		//client program
		
		String[] wordList = {"moon","yummy","computer","software","fun"};
		// make sure you understand how to make a random number
		// that can be used as an index into an array
		// think about the following line of code very carefully
		int rnd = (int)(Math.random()*wordList.length);
		GuessWord game = new GuessWord(wordList[rnd]);
		int num = game.playGame();
		System.out.println("You got it in " + num + " guesses!");
		
	}
}