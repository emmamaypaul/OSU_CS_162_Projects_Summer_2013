/**  @Author Emma Paul 
 *	 @version .1, 08/04/2013
 *   This contains tests for the provided Hangman game.
 *   
 */


import static org.junit.Assert.*;

import org.junit.Test;


public class Ass3HangmanLogicTest 
{
	//Test for the constructor to see if String keyPhrase is valid input
	//This is a test for valid input
	@Test 
	public void HanmanLogicKeyPhraseTest() throws Ass3InvalidInputException
		{
			String keyPhrase = "hangman";
			int numberOfGuesses = 10;
			Ass3HangmanLogic a = new Ass3HangmanLogic(keyPhrase, numberOfGuesses);
			assertEquals("hangman", a.getKeyPhrase());
		}
	//Test for the constructor to see if String keyPhrase is blank
	//This is a test for invalid input
	@Test (expected = Ass3InvalidInputException.class)
	public void HanmanLogicBlankTest() throws Ass3InvalidInputException
	{
		String keyPhrase = "";
		int numberOfGuesses = 1;
		Ass3HangmanLogic a = new Ass3HangmanLogic(keyPhrase, numberOfGuesses);
		assertEquals("Invalid keyphrase, must not be blank or null", a.getKeyPhrase());
	}
	
	//Test for the constructor to see if String keyPhrase is null
	//This is a test for invalid input 
	@Test (expected = Ass3InvalidInputException.class)
	public void HanmanLogicNullTest() throws Ass3InvalidInputException
	{
		String keyPhrase = null;
		int numberOfGuesses = 1;
		Ass3HangmanLogic a = new Ass3HangmanLogic(keyPhrase, numberOfGuesses);
		assertEquals("Invalid keyphrase, must not be blank or null", a.getKeyPhrase());
	}
	
	//Test for the constructor to see if int numberOfGuesses is < 1
	//This is a test for a negative input value 
	@Test (expected = Ass3InvalidInputException.class)
	public void HanmanLogicNumTest() throws Ass3InvalidInputException
	{
		String keyPhrase = "SomeKeyPhrase";
		int numberOfGuesses = -1;
		Ass3HangmanLogic a = new Ass3HangmanLogic(keyPhrase, numberOfGuesses);
		assertEquals("Invalid number of guesses, must be one or greater", a.getKeyPhrase());
	}
	//Test for constructor to see if int numberOfGuesses correctly runs for a positive input value 
	//This is a test for valid input 
	@Test 
	public void HanmanLogicPosNumTest() throws Ass3InvalidInputException
	{
		String keyPhrase = "SomeKeyPhrase";
		int numberOfGuesses = 20;
		Ass3HangmanLogic a = new Ass3HangmanLogic(keyPhrase, numberOfGuesses);
		assertEquals(20 , a.getNumberOfGuesses());
	}
	
	//This is a test for the getKnownKeyPhrase() method to see if it returns with "-" characters 
	//when the keyPhrase has not been guessed yet 
	@Test public void getKnownKeyPhraseTest() throws Ass3InvalidInputException
	{
		String charGuesses = "---";
		String keyPhrase = "eat";
		int numberOfGuesses = 20;
		Ass3HangmanLogic a = new Ass3HangmanLogic(keyPhrase, numberOfGuesses);
		assertEquals(charGuesses, a.getKnownKeyPhrase());
	    
	}
	
	//This is a test for the getKnownKeyPhrase() method to see if it correctly executes when a correct letter is guessed
	@Test public void charCorrectTest() throws Ass3InvalidInputException, InvalidInputException, AlreadyGuessedException
	{
		char charGuess = 'a';
		String keyPhrase = "eat";
		int numberOfGuesses = 20;
		Ass3HangmanLogic a = new Ass3HangmanLogic(keyPhrase, numberOfGuesses);
		a.guessCharacter(charGuess);
		assertEquals("-a-", a.getKnownKeyPhrase());    
	}
	
	//This is a test for the getKnownKeyPhrase() method to see if it correctly executes when an incorrect letter is guessed
	@Test public void charInCorrectTest() throws Ass3InvalidInputException, InvalidInputException, AlreadyGuessedException
	{
		char charGuess = 'z';
		String keyPhrase = "eat";
		int numberOfGuesses = 20;
		Ass3HangmanLogic a = new Ass3HangmanLogic(keyPhrase, numberOfGuesses);
		a.guessCharacter(charGuess);
		assertEquals("---", a.getKnownKeyPhrase());    
	}
	
	//This is a test for the getKnownKeyPhrase() method to see if it correctly executes when the keyPhrase has been guessed
	@Test public void guessedKeyPhraseTest() throws Ass3InvalidInputException, InvalidInputException, AlreadyGuessedException
	{
		char charGuess = 'a';
		char charGuess2 = 'e';
		char charGuess3 = 't';
		String keyPhrase = "eat";
		int numberOfGuesses = 20;
		Ass3HangmanLogic a = new Ass3HangmanLogic(keyPhrase, numberOfGuesses);
		a.guessCharacter(charGuess);
		a.guessCharacter(charGuess2);
		a.guessCharacter(charGuess3);
		assertEquals("eat", a.getKnownKeyPhrase());    
	}
	
	//This tests if a correct character guess is in the keyPhrase 
	@Test public void guessGoodCharacterTest() throws InvalidInputException, AlreadyGuessedException, Ass3InvalidInputException
	{
		String keyPhrase = "hangman";
		char a = 'a';
		int numberOfGuesses = 20;
		Ass3HangmanLogic b = new Ass3HangmanLogic(keyPhrase, numberOfGuesses);
		assertEquals(true, b.guessCharacter(a));
	}
	//This tests if an incorrect character is in the keyPhrase 
	@Test 
	public void guessBadCharacterTest() throws InvalidInputException, AlreadyGuessedException, Ass3InvalidInputException
	{
		String keyPhrase = "hangman";
		char a = 'z';
		int numberOfGuesses = 20;
		Ass3HangmanLogic b = new Ass3HangmanLogic(keyPhrase, numberOfGuesses);
		assertEquals(false , b.guessCharacter(a));
	}
	
	//This tests if an exception is thrown for an invalid character guess input 
	@Test (expected = InvalidInputException.class)
	public void guessNonCharacterTest() throws InvalidInputException, AlreadyGuessedException, Ass3InvalidInputException
	{
		String keyPhrase = "hangman";
		char a = '1';
		int numberOfGuesses = 20;
		Ass3HangmanLogic b = new Ass3HangmanLogic(keyPhrase, numberOfGuesses);
		b.guessCharacter(a);
	}
	
	//This tests if the AlreadyGuessedException is thrown when the user guesses the same character twice on accident
	@Test (expected = AlreadyGuessedException.class)
	public void alreadyGuessCharacterTest() throws InvalidInputException, AlreadyGuessedException, Ass3InvalidInputException
	{
		String keyPhrase = "hangman";
		char a = 'a';
		int numberOfGuesses = 20;
		Ass3HangmanLogic b = new Ass3HangmanLogic(keyPhrase, numberOfGuesses);
		b.guessCharacter(a);
		b.guessCharacter(a);
	}			
}

