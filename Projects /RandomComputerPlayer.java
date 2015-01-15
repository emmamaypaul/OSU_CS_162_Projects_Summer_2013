/**
 * @author Emma Paul 
 * July 21, 2013
 * Assignment 2 - Hangman Game
 * 
 * class for Random Computer Player (subclass that implements parent class Player)
 */

import java.util.List;
import java.util.Random;


public class RandomComputerPlayer implements Player
{
	List<String> letters;
	private Random rand = new Random();
	public RandomComputerPlayer (List<String> letters)
	{
		this.letters = letters; 
	}

	@Override
	public char getGuess() 
	{
		char compGuess;
		double wordDouble = rand.nextInt();//this line uses the random function in order to find a random words from the file (words.txt)
		int wordInt = (int)wordDouble; //converts the double to an int because we need an int to randomly select a word
		compGuess = letters.get(wordInt%(letters.size()-1)).charAt(0);//got help from tutor with % (multiplies a random number times 1 less than size of words to find a random word that is set to the key phrase  variable
		return compGuess;
	}

}
