/**  @Author Joseph Jess (some fixed bugs done by Emma Paul)
 *	 @version 0.2, 01/29/2013
 *   This contains the logic for a Hangman game.
 *   I have chosen to disallow all input except alphabetic characters (disallowing number to make some things easier to manage)
 */
import java.util.ArrayList;

public class Ass3HangmanLogic 
{
	private String keyPhrase;
	private int numberOfGuesses;
	private int numberOfGuessesLeft;
	private ArrayList<Character> guessedCharacters;
	
	/**
	 * Constructor creates this HangmanLogic initial state
	 * @param newPhrase  the phrase to be used for the key phrase of the hangman game
	 * @param numGuesses  the number of guesses allowed in the hangman game
	 */
	public Ass3HangmanLogic(String keyPhrase, int numberOfGuesses) throws Ass3InvalidInputException//fixed bug, I changed the exception name 
	{
		//a better check for valid keyphrases could be made, but that is not the point of this assignment
		if(keyPhrase == null || keyPhrase.equals(""))//fixed null bug on this line, got help from tutor explaining how 
			//the null needed to be first for the computer to check it before the "" and also how you can't have .equals for null
			//so I made it to keyPhrase == null 
			throw new Ass3InvalidInputException("Invalid keyphrase, must not be blank or null");
		else if(numberOfGuesses < 1)
			throw new Ass3InvalidInputException("Invalid number of guesses, must be one or greater");
	
		this.keyPhrase = keyPhrase;		
		this.numberOfGuesses = numberOfGuesses;
		this.numberOfGuessesLeft = numberOfGuesses;
		guessedCharacters = new ArrayList<Character>();
	}	
	
	/**
	 * Accessor method for the keyPhrase field
	 * @return  returns the keyPhrase field of this object
	 */
	public String getKeyPhrase()
	{
		return keyPhrase;
	}
	
	/**
	 * method returns the keyPhrase field in an encoded manner with dashes representing the still unknown letters and letters for the known letters
	 * @return  returns the encoded keyPhrase of this object (letters known and dashes)
	 */
	public String getKnownKeyPhrase()
	{
		char[] encodedKeyPhrase = new char[keyPhrase.length()];
		String lowerCaseKeyPhrase = keyPhrase.toLowerCase();
		
		for(int i = 0; i < keyPhrase.length(); i++)
		{
			char cur = lowerCaseKeyPhrase.charAt(i);
			if(guessedCharacters.contains(cur))
				encodedKeyPhrase[i] = cur;
			else
				encodedKeyPhrase[i] = '-';
		}
		
		return (new String(encodedKeyPhrase) );
	}
	
	/**
	 * Accessor method for the numberOfGuesses field
	 * @return  returns the numberOfGuesses field of this object
	 */
	public int getNumberOfGuesses()
	{
		return numberOfGuesses;
	}
	
	/**
	 * Accessor method for the numberOfGuessesLeft field
	 * @return  returns the numberOfGuessesLeft field of this object
	 */
	public int getNumGuessesLeft()
	{
		return numberOfGuessesLeft;
	}
	
	/**
	 * This method returns whether a specified character exists in the keyPhrase field
	 * @param guess  a character being checked for in the keyPhrase field
	 * @return  returns whether a specified character exists in the keyPhrase field
	 * @throws InvalidInputException  if a non-valid character is passed as input to this method
	 * @throws AlreadyGuessedException  if a valid character which has already been guessed is passed as input to this method
	 */
	public boolean guessCharacter(char guess) throws InvalidInputException, AlreadyGuessedException
	{
		if(isValidCharacter(guess))
		{
			//force into one case
			guess = Character.toLowerCase(guess);
			
			if(guessedCharacters.contains(guess) )
			{
				throw new AlreadyGuessedException("" + guess);
			}
			else
			{
				guessedCharacters.add(guess);
				if(keyPhrase.contains("" + guess))
					return true;
				else
				{
					numberOfGuessesLeft--;
					return false;
				}
			}		
		}
		else
		{
			throw new InvalidInputException("" + guess);
		}
	}	
	
	/**
	 * Returns whether the guessing user is out of guesses in this game of hangman
	 * @return  Returns whether the guessing user is out of guesses in this game of hangman
	 */
	public boolean isGameOver()
	{
		boolean guessed = (getKnownKeyPhrase().equals(keyPhrase.toLowerCase()));
		
		return( numberOfGuessesLeft == 0 || guessed);		
	}
	
	/**
	 * Returns whether the character parameter is considered valid in this game
	 * @param guess  the character being checked for validity
	 * @return  returns whether the character parameter is considered valid in this game
	 */
	private boolean isValidCharacter(char guess)
	{
		return Character.isLetter(guess);
	}
}
