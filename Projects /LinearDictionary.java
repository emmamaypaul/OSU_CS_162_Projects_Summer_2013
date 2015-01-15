//Emma Paul 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Searches linearly for words
public class LinearDictionary extends Dictionary
{
	//LinearDictionary will use an array or ArrayList to store the words. It performs a linear search to find a word. 
	ArrayList<String> dictionaryWords = new ArrayList<String>();//makes new ArrayList called dictionaryWords
	
	//Each dictionary implementation needs to take a String filename into the constructor.
	public LinearDictionary(String filename) throws FileNotFoundException
	{
		File dictionaryWordsFile = new File(filename);
		Scanner scanFile = new Scanner(dictionaryWordsFile);
		while(scanFile.hasNextLine())
		{
			String line = scanFile.nextLine(); //reads whole lines 
			dictionaryWords.add(line);//adds every line from the words.txt one at a time to dictionaryWords ArrayList
		}
	}
	//Each will have different implementations of the contains method. This method will look through your list of words
	//If it finds a matching word, it will return true, otherwise it will return false. 
	@Override
	boolean contains(String word) 
	{
		long before = System.currentTimeMillis();//starts clock before for loop 
		for(String s : dictionaryWords)//this says for String s in dictionaryWords (takes all the words from dictionaryWords and puts them in String s
		{
			if (s.equals(word))
			{
				return true;
			}
		}
		long after = System.currentTimeMillis();//records time after for loop 
		this.averageLookupTime = (this.averageLookupTime + (after - before))/2;
		return false;
	}
	
	
}
