/*
 * <Emma_Paul> <August 29, 2013> 
 * <A class that iterates through the even indices of an array 
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIndexArrayIterator<Type> implements Iterator<Type> 
{
	//referenced http://stackoverflow.com/questions/3912765/iterator-for-array
	private Type array[];
	private int pos = 0;

	EvenIndexArrayIterator(Type [] list) 
	{
		array = list;
	}
	
	/**
	 *hasNext() method 
	@return returns the position* 2 if it is less than the array.length so that it only returns even indices 
	**/ 
	public boolean hasNext() 
	{
		return pos*2 < array.length;
	}
	
	/**
	next() method
	 @return returns array index (pos) *2 to go to the next even index (pos)
	 @throws throws NoSuchElementException if the element does not exist  
	**/ 
	public Type next() throws NoSuchElementException
	{
		
		if (hasNext())
			return array[(pos++)*2];
		else 
			throw new NoSuchElementException();	
			
	}

	public void remove() 
	{
		throw new UnsupportedOperationException();
	}	
}