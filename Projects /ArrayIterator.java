/*
 * <Emma_Paul> <August 29, 2013> 
 * <A class that iterates through the indices of an array 
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<Type> implements Iterator<Type> 
{
	//referenced http://stackoverflow.com/questions/3912765/iterator-for-array
	private Type array[];
	private int pos = 0;

	ArrayIterator(Type [] list) 
	{
		array = list;
	}
	
	/**
	*hasNext() method 
	@return returns the position if it is less than the array.length 
	**/ 
	public boolean hasNext() 
	{
		return pos < array.length;
	}
	
	/**
	next() method
	 @return returns array index position (pos) and updates pos to next index with the ++ 
	 @throws throws NoSuchElementException if the element does not exist  
	**/ 
	public Type next() throws NoSuchElementException
	{
		if (hasNext())//if the hasNext method returns true and pos is less than the array length 
		{
			return array[pos++];//return that position and update the variable position ++
		}
		else 
		{
			throw new NoSuchElementException();
		}
		
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}	
}
