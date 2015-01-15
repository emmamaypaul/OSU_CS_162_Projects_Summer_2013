/*
<Emma_Paul> <September 1, 2013> 
<I worked on this assignment with Ian Paul> 
<Main class to run either a linear, binary, or hash search in a dictionary of a solved anagram word> 
<project description> 
*/
import java.io.*;
import java.util.Scanner;


public class Assignment5 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		if(args.length != 3)
		{
			System.exit(-1);
		}
		
		String anagram = args[0];
		String filename = args[1];
		Dictionary dictionary;
		if (args[2].equals("l"))
		{
			dictionary = new LinearDictionary(filename);//doesn't Have to be named filename, could be named whatever, we pass words.txt
		}
		else if (args[2].equals("b"))
		{
			dictionary = new BinaryDictionary(filename);//doesn't Have to be named filename, could be named whatever
		}
		else 
		{
			dictionary = new HashDictionary(filename);//doesn't Have to be named filename, could be named whatever
		}
		
		AnagramSolver anagramSolver = new AnagramSolver(dictionary);
		System.out.println(anagramSolver.solve(anagram));
		System.out.println("The average lookup time is: " + dictionary.getAverageLookupTime());//prints average lookup time 
	
	}
	
}
