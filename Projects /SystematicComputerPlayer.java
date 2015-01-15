/**
 * @author Emma Paul 
 * July 21, 2013
 * Assignment 2 - Hangman Game
 * 
 * class for Systematic Computer Player (subclass that implements parent class Player)
 */

import java.util.List;



public class SystematicComputerPlayer implements Player
{
	char[] systematic = new char[] {'e', 't', 'a', 'o', 'i', 'n', 's', 'h', 'r', 'd', 'l', 'c', 'u', 'm', 'w', 'f', 'g', 'y', 'p', 'b', 'v', 'k', 'j', 'x', 'q', 'z'};
	List<String> letters;
	int currentGuess = 0;
	
	public SystematicComputerPlayer (List<String> letters)
	{
		this.letters = letters; 
	}

	@Override
	public char getGuess() 
	{
		char compGuess = systematic[currentGuess];
		while(!(letters.contains(Character.toString(compGuess))))//tests to see if the compGuess is part of the letters 
		{
			currentGuess++;//adds 1 to current guess 
			compGuess = systematic[currentGuess];//so that the contents of compGuess will grab the next index as it guesses
		}
		
		currentGuess++;//adds 1 to current guess for same reason as above 
		return compGuess;
		
	}

}
