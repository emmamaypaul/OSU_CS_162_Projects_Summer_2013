//Emma Paul 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

//Stores words in a Hashtable for quick retrieval
public class HashDictionary extends Dictionary
{
	//HashDictionary will store the words in a Hashtable instead of an array or ArrayList.
	//Use the Hashtable class from Java. A Hashtable stores elements in key-value pairs. 
	//HashDictionary uses the java Hashtable Class (since we are not required to make our own hash method)
	Hashtable<String, Boolean>dictionaryWords = new Hashtable<String, Boolean>();//makes new ArrayList called dictionaryWords
	
	//Each dictionary implementation needs to take a String filename into the constructor.
	public HashDictionary(String filename) throws FileNotFoundException//constructors are always same name as Class name!!! 
	{	
	File dictionaryWordsFile = new File(filename);
	Scanner scanFile = new Scanner(dictionaryWordsFile);
		while(scanFile.hasNextLine())
		{
			String line = scanFile.nextLine(); //reads whole lines 
			dictionaryWords.put(line, true);//adds every line from the words.txt one at a time to dictionaryWords ArrayList
			//the put basically hashes the dictionary words, using Javas hash function 
		}
	}
	
	//Each will have different implementations of the contains method. This method will look through your list of words
	//If it finds a matching word, it will return true, otherwise it will return false. 
	boolean contains(String word) 
	{
		long before = System.currentTimeMillis();
		if(dictionaryWords.containsKey(word))
		{
			return true;//returns true if word is in dictionary
		}
		long after = System.currentTimeMillis();
		this.averageLookupTime = (this.averageLookupTime + (after - before))/2;
		return false;//returns false if word is not in dictionary 
	}

}
