import java.util.*;

/**(taken from book, Appendix L)
 * COPYRIGHT (C) 2013 Emma Paul. All Right Reserved 
 * CS 162 Ass 1.A helper class to represent the logic of the Hangman game 
 * @author Emma Paul 
 * @version 1 2013-07-03
 *
 */
public class HangmanLogic 
{
	private String phrase; //variable for the phrase the user is guessing
	private int guesses; //variable for the number of guesses the user has 
	private int numberOfGuesses = 0;//variable for the number of guesses the user has had, initialized at 0 for starting with 0 guesses
	
	//referenced for array list: http://www.daniweb.com/software-development/java/threads/333144/java-hangman-game
	//These arrays are for the two options the user can have after they guess a letter, either a correct guess, which goes into the correctGuesses array 
	// later on in the code, or the guessed letter will go into the usedLetter array if it is not a correct guess.
	//I got help from my tutor, Lewis Coates, a tutor from Portland State University, lewisc@pdx.edu. 
	//Though the website I referenced helped, my tutor also helped me understand it more throughly 
	private ArrayList<Character> usedLetter = new ArrayList<Character>(); // list of users already used letters 
	private ArrayList<Character> correctGuesses = new ArrayList<Character>(); // list of users correct guesses
	
	//1. constructor for HangmanLogic class that specifies phrase being guess and number of guesses allowed 
	public HangmanLogic(String keyPhrase, int numberOfGuesses)//1. Hangman class constructor 
	{
		phrase = keyPhrase; //sets the key phrase info to the variable phrase 
		guesses = numberOfGuesses; //sets the number of guesses amount to the variable guesses 
	}
	
	public String getKeyPhrase() //2. method to return the phrase being guessed
	{
		return phrase; 	
	}
	
	public int getNumberOfGuesses() //3. method to return the number of guesses allowed before failure. 
	{
		return guesses;
	}

	//4. This method returns whether a given character is part of the key phrase 
	//used for reference: http://www.daniweb.com/software-development/java/threads/333144/java-hangman-game
	public boolean guessCharacter(char guess) throws Exception 
	{
		if (!(Character.isDigit(guess)|| Character.isLetter(guess)))//I got help from tutor on this line, he taught me the .isDigit function
			//it says that if the user guess is not a digit or a letter
		{
			throw new Exception ("Please enter either a letter or a number: ");	//exception is thrown 	
		}
		if (usedLetter.contains(guess))//if the user guess is in the usedLetter array 
		{
			throw new Exception ("You have already guessed that letter or number. Please guess again: ");//exception is thrown 
		}
			usedLetter.add(guess); //adds guessed letter to guessed list 
			
		numberOfGuesses++;//after the user has a guess and the exceptions are thrown, the number of guesses goes up by 1
		if (this.phrase.contains(Character.toString(guess)))//wrapper method. I got help from my tutor and used the tutorial 
			//it means that if the user guess is in the phrase
		{
			this.correctGuesses.add(guess);//then this line adds their correct guess to the correctGuesses array list 
			return true; //and the method returns true
		}
		
		else //else if the user guess is not in the phrase 
		{
			return false; //the method returns false, and the user guess is not added to the correctGuesses array list
		}
	}
				
}

