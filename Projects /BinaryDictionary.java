//Emma Paul 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Binary class that extends Dictionary: uses binary search to find words
public class BinaryDictionary extends Dictionary
{
	//BinaryDictionary will use an array or ArrayList to store the words. 
	ArrayList<String> dictionaryWords = new ArrayList<String>();//makes new ArrayList called dictionaryWords
	
	//Each dictionary implementation needs to take a String filename into the constructor.
	public BinaryDictionary(String filename) throws FileNotFoundException//constructors are always same name as Class name!!! 
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
		int low = 0;
		int high = dictionaryWords.size() -1;
		long before = System.currentTimeMillis();
		while (low <= high)
		{
			int mid = (low + high)/2;
			int diff = dictionaryWords.get(mid).compareTo(word);//compares two strings lexicographically (mid - word) 
			//I believe if it were written word.compareTo(dictionaryWords.get(mid) it would do word - mid 
			if(0 == diff)//mid word is equal to word because mid-word = diff (so if diff is 0 they are the same word)
			{
				return true;
			}
			else if (diff < 0)//if actual word is above mid word (because if mid - word returns a negative number the word 
			//is greater than the mid word 
			{
				//since the word is greater than the mid word the new low is the mid word 
				low = mid + 1 ; //use +1 to omit any possible rounding errors (got help with tutor for this line) 
			}
			else //else diff is a positive number so the word is below the mid word (mid-word= positive number)
			{
				//so the high is now the mid point 
				high = mid - 1;//use -1 to omit any possible rounding errors 
			}
		}
		long after = System.currentTimeMillis();
		this.averageLookupTime = (this.averageLookupTime + (after - before))/2;
		return false;//returns false (null) when word has not been found in the dictionary 
		
	}
	

}
