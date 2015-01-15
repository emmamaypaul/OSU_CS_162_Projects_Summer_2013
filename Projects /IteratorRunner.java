/**
<Emma_Paul> <August 29, 2013> 
<I worked on this lab with Ian Paul > 
<Lab 8 CS 162, Iterator Runner>
**/

public class IteratorRunner {

	public static void main(String[] args) {
		Integer [] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
		ArrayIterator<Integer> iterator = new ArrayIterator<Integer>(numbers);

		while (iterator.hasNext() ) 
		{
			Integer item = iterator.next();
			System.out.println(item);
		}
		
		//below is code for exercise 2 
		System.out.println("\n\n");//for spacing between exercises 
		EvenIndexArrayIterator<Integer> iteratorEven = new EvenIndexArrayIterator<Integer>(numbers);

		while (iteratorEven.hasNext() ) {
			Integer item = iteratorEven.next();
			System.out.println(item);
		}
	}
}
