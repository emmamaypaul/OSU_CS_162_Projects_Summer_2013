//This program was copied from Big Java pg 668
//It check which words in a file are not present in a dictionary 
import java.util.*;
import java.io.*;


public class SpellCheck
{
	public static void main (String[] args) throws FileNotFoundException
	{
		//Read the dictionary and the document 
		Set<String> dictionaryWords = readWords("words");
		Set<String> documentWords = readWords("alice40.txt");
		
		//Print all words that are in the document but not in the dictionary
		for (String word: documentWords)//what is this syntax? Does it compare the two twring documents and can I use it for my hw?
		{
			if(!dictionaryWords.contains(word))
		}
		
		
	}
}
