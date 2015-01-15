import java.util.Scanner;

/**(taken from book, Appendix L)
 * COPYRIGHT (C) 2013 Emma Paul. All Right Reserved 
 * CS 162 Ass 1. A class with main method to run HangmanLogic.java methods 
 * @author Emma Paul 
 * @version 1 2013-07-03
 *
 */


public class Hangman 
{ 
	//main method to test if code works 
	public static void main (String[]args)
	{
		
		HangmanLogic game = new HangmanLogic("Shark Attack", 20);//info for creating a new hangman game object 
		
		System.out.println("Please enter an alphabet letter you would like to guess: ");
		Scanner input = new Scanner(System.in);
		String userGuess = input.next();
		try 
		{
			if (game.guessCharacter('a')) //try block to test exception handling method: is the guess "a" in the key phrase?) 
					{
						System.out.println("a is in the key phrase");//if this prints, the error handling method to check if the guess is in the key phrase was done correctly 
					}
		}
		catch (Exception ex)
		{
			System.out.println("Unexpected exception????");//if this is printed, then it is an unexpected exception and there is an error
		}
		
		try //try block to test methods 
		{
			if (!(game.guessCharacter('z'))) //try block to test exception handling method: is the guess "z" in the key phrase
					{
						System.out.println("z is not in the key phrase");//if this prints, the error handing method to check if the guess is in the key phrase was done correctly
					}
		}
		catch (Exception ex)
		{
			System.out.println("Unexpected exception????");//if this is printed, then it is an unexpected exception and there is an error
		}
		try //try block to test exception handling methods 
		{
			if (game.guessCharacter('+')) //: is the guess "+", which is not a digit or a number, caught as an error?
					{
						System.out.print("Error handling should happen");
					}
		}
		catch (Exception ex)
		{
			System.out.println("Expected exception");//if this prints, then it is an expected solution and error handling was handled correctly
		}
		
		String s = game.getKeyPhrase();
		System.out.print("The key phrase is: " + s);
		
		int x = game.getNumberOfGuesses();
		System.out.print("\nAnd the number of guesses allowed is: " + x);
	}

}
