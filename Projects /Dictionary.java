//Emma Paul 
//Dictionary abstract class with averageLookupTime method to return averageLookuptime (variable) of each search method
//as well as a boolean contains method for each search that passes in a string word 
public abstract class Dictionary 
{	
	//instance field to keep track of the average lookup time, which is the average time it takes the contains
	protected double averageLookupTime;//use protected so the the classes that inherit from dictionary can use the variable
	abstract boolean contains(String word);//an abstract method called contains that accepts a String parameter and returns a boolean.
	//(method to look up a particular word in the dictionary)
	
	//getter for the average lookup time instance field (called getAverageLookupTime) that is stored as a double 
	public double getAverageLookupTime()//abstract classes can contain methods (which is how they differ from interfaces) 
	{
		return averageLookupTime;
	}
	
}



	
