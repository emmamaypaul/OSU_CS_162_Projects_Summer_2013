//Emma Paul 
import java.util.LinkedList;
import java.util.Queue;

//has a class for the Queue data structure, implementing the interface you created for it,
public class QueueClass implements QueueInterface
{
	//I am aware I just used the Java Queue class and used it's add and remove methods rather than implementing my own because 
	//the lab didn't specify we needed to do so 
	Queue<Integer> queue = new LinkedList<Integer>();//note it does not = new Queue<Integer> because a LinkedList is better 
	
	@Override
	public int add(int number) //adds an integer number to the queue 
	{
		queue.add(number);//adds number 
		return number;//then returns the number that was added 
	}

	@Override
	public int remove() //removes an integer number to the queue 
	{
		
		return queue.remove();//returns the value that was removed from the head of queue 
	}

	@Override
	public int peek() 
	{
		
		return queue.peek();//returns the value that is at the head of the queue 
	}
	
}
