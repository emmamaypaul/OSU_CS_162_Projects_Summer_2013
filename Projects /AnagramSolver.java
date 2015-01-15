//Emma Paul 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//The AnagramSolver class is responsible for recursively trying permutations of a word and checking to see if it's in a Dictionary
public class AnagramSolver 
{
	Dictionary dictionary;//instantiates a Dictionary object
	public AnagramSolver(Dictionary dictionary)//takes a Dictionary object (called dictionary) in the constructor.
	{
		this.dictionary = dictionary;
	}
	
	//solve method that accepts a String and returns the solved String (or null if there is no solution).
	//method to see if a generated string is a word or not
	public String solve(String anagram) //
	{
		HashSet <String> anagramWords = new HashSet<String>();//
		anagramGenerator(anagram, "", anagramWords);
		for(String s :  anagramWords)//puts anagramWords into string s one at a time 
		{
			if(dictionary.contains(s))
			{
				return s;
			}
		}
		return null;
	}
	//It will use this list when attempting to solve an anagram.
	
	
	//helper method to make your recursive solution.In your recursive solution, you must use the Dictionarie's contains 
	//code below referenced from http://www.dreamincode.net/forums/topic/188032-java-recursion-anagram/
	//I understand how it creates substrings of the word (s1) and adds them together when s1 is 0 (aka no more substrings left)
	//and the solved permutations are put into s2 
    public void anagramGenerator(String s1, String s2, HashSet <String> anagramWords)  
    {
	   if(s1.length() == 0)   
	   {
	            anagramWords.add(s2);
	    }
       for(int i = 0; i < s1.length(); i++) 
       {
	            anagramGenerator(s1.substring(0, i) + s1.substring(i+1, s1.length()), s1.charAt(i) + s2, anagramWords);
        }
     }
}


