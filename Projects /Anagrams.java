import java.io.*;
import java.util.*;

//code below taken from http://www.dreamincode.net/forums/topic/188032-java-recursion-anagram/
public class Anagrams 
{
    public void anag(String s1, String s2)  
    {
	   if(s1.length() == 0)   
	   {
	            System.out.println(s2);
	    }
       for(int i = 0; i < s1.length(); i++) {
	            anag(s1.substring(0, i) + s1.substring(i+1, s1.length()), s1.charAt(i) + s2);
        }
	    }
    public static void main(String[] args)  
    {
        Anagrams ana = new Anagrams();
        ana.anag("hello", "");//scrambled letters for word: aibohphobia (fear of palindromes) 
        
       
        Set<String> dictionaryWords = readWords("words.txt"); //reads dictionary words from document 
        //how do I put the anagram words that the code above computes into a set? 
        
      //Print all words that are in the document but not in the dictionary
      	for (String word: //put anagram words set to compare to)//what is this syntax? Does it compare the two twring documents and can I use it for my hw?
      		{
      			if(dictionaryWords.contains(word))//if the dictionary contains the word that 
      			{
      				System.out.println(word);
      			}
      		}
        
       
     
    }
    //referenced pg 669 in Big Java
    //Reads all words from a file 
   // @param filename the name of the file 
    //@return a set with all lower case words in the file. 
    public static Set<String> readWords(String filename) throws FileNotFoundException 
    {
    	Set<String> words = new HashSet<String>();
    	Scanner in = new Scanner(new File(filename));
    	//Use any characters other than a-z or A-Z as delimiters 
    	while (in.hasNext())
    	{
    		words.add(in.next().toLowerCase());
    	}
    	return words;
    	}
    }
	

    
  
}