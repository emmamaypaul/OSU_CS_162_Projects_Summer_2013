import java.util.*;


public class HangmanGameDriver //code below taken from provided java file
{
	public static void main(String[] args)
	{
		String keyPhrase = "Aardvark";
		int initialGuesses = 10;
		HangmanGameLogic hangmanGame = new HangmanGameLogic(keyPhrase, initialGuesses);
		
		System.out.println("Welcome to a hangman game.\nIf you would like to guess a word, please enter 1: \n" +
				"If you would like to enter a word for the computer to guess, please enter 2: ");
		Scanner input = new Scanner(System.in);
		int userGameTypeChoice = input.nextInt();
		if(userGameTypeChoice == 1)
		{
			playGameUserGuesses(hangmanGame);
		}
		if (userGameTypeChoice == 2)
		{
			playGameCompGuesses(hangmanGame);
		}
		else
		{
			System.out.println("Please enter either a 1 or 2 to begin playing");
		}
	}
	
	private static void playGameUserGuesses(HangmanGameLogic game)
	{
		String input2;
		char guess;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to hangman, your up next!\n");
		System.out.printf("The key phrase you are trying to guess is %d characters long.", game.getKeyPhrase().length(), game.getNumberOfGuesses());
		
		while(!game.isGameOver())
		{
			System.out.printf("You have %d guesses left to save your neck!\n", game.getNumGuessesLeft());
			System.out.printf("So far you know the following positions about the keyphrase (dashes represent unknown characters):\n\t%s\n\n", game.getKnownKeyPhrase());
			System.out.println("Please enter a single character that you believe is in the key phrase");
			
			
			//get input and confirm it is only one character
			input2 = in.nextLine();
			
			//while input is longer than one character, ask for new input with only a single character as input
			while(input2.length() > 1)
			{
				System.out.println("That is more than one character, please input only a single character.");
				input2 = in.nextLine();
			}
			
			//guess has now been confirmed at only one character
			guess = input2.charAt(0);
			
			
			//now for the meaningful part of checking the input character
			try
			{
				game.guessCharacter(guess);
			}
			catch (InvalidInputException e)
			{
				System.out.printf("\n\nThe guess %s is invalid, you are only allowed to guess letters in my version of this game, try again\n\n\n", e.getMessage());
			}
			catch (AlreadyGuessedException e)
			{
				System.out.printf("\n\nYou have already guessed %s, try again\n\n\n", e.getMessage());
			}
		}
		if(game.getNumGuessesLeft() <= 0)
			System.out.println("I am sorry, that was your last guess, and you have lost the game.");
		else
			System.out.println("Congratulations! You have won the game!");
	    }
	
	private static void playGameCompGuesses(HangmanGameLogic game) //method for computer to guess 
	{
		char computerGuess;
		String[] compFirstRoundGuesses = {"e", "t", "a", "o", "i", "n", "s", "h", "r", "d"};
		String[] compSecondRoundGuesses = {"b", "c", "f", "g", "j", "k", "l", "m", "p", "q", "u", "v", "w", "x", "y", "z"};
		
		//need to have comp go through random guesses of different indexes for first round
		//then need to have comp go through random guesses of different indexes for second round of letter choices 
		
	}

}

