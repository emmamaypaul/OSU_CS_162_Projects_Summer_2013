/**
 * @author Emma Paul 
 * July 21, 2013
 * Assignment 2 - Hangman Game
 * 
 * Main class with main method 
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.swing.*;


public class HangmanViewer //this class contains my main method 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		String keyPhrase;//declare keyPhrase variable 
		if (args.length != 3)
		{
			return; //would exit program if there weren't 3 arguments 
		}
		
		String lettersFilePath = args[0]; //assigning argument 1 for the 3 command line arguments 
		String wordsFilePath = args[1];
		String charsTypePlayer = args[2];
		
		try //try reading the words.txt file 
		{
		//line below grabs words.text file and assigns it to variable wordsFile
		BufferedReader wordsFile = new BufferedReader(new FileReader(wordsFilePath));
		
		String lineFromFile = wordsFile.readLine();//reads lines from file as a string, assigned to lineFromFile type String
		
		List<String> words= new LinkedList<String>(); //creates a list of type string (got help from tutor with this line)
		
		while(lineFromFile != null)//while there are lines in the words.txt file 
		{

			words.add(lineFromFile);//add them to the variable words (type String) 
			lineFromFile = wordsFile.readLine();//repeats grabbing words from File until no more words 
		}
		BufferedReader lettersFile = new BufferedReader(new FileReader(lettersFilePath));//gets characters from letters.txt
		
		String letterFromFile = lettersFile.readLine();//reads lines from file as a string, assigned to lineFromFile type String
		
		List<String> letters = new LinkedList<String>(); //creates a list of type string (got help from tutor with this line)
		
		while(letterFromFile != null)//while there are lines in the words.txt file 
		{
			letters.add(letterFromFile);//add a letters to letterFromFIle list 
			letterFromFile = lettersFile.readLine();//repeats grabbing words from File until no more words 
		}
		
		Player computerPlayer;
		if (charsTypePlayer.equals("r"))
		{
			computerPlayer = new RandomComputerPlayer(letters);
		}
		else if (charsTypePlayer.equals("s"))
		{
			computerPlayer = new SystematicComputerPlayer(letters);
		} 
		else 
		{
			computerPlayer = null; //help with tutor on this line 
		}
		
		double wordDouble = r.nextInt();
		int wordInt = (int)wordDouble; //converts the double to an int because we need an int to randomly select a word
		keyPhrase = words.get(wordInt%(words.size()-1));//got help from tutor with % (multiplies a random number times 1 less than size of words to find a random word that is set to the key phrase  variable
		HangmanDrawing drawing = new HangmanDrawing(keyPhrase, computerPlayer, letters);//creates new HangmanDrawing object using keyPhrase that was just randomly selected 
		drawing.setVisible(true);//sets the Gui object to be visible 
		}
		catch (Exception e) //catch if there is not a words.txt file 
		{
			System.out.println("Error!");
		}
	}

}
