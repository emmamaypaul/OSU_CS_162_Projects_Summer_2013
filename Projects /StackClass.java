//Emma Paul
import java.util.Stack;

//a class for the Stack data structure, implementing the interface created for it
public class StackClass implements StackInterface
{
	//I used the stack java class rather than creating my own stack implementation because the assignment didn't specify we needed one
	Stack<Integer> stack = new Stack<Integer>();

	@Override
	public int push(int number) //adds an int to the top of the stack 
	{
		stack.push(number);//adds number 
		return number;//returns the number that was added 
	}

	@Override
	public int pop() //removes an int from top of stack 
	{
		return stack.pop();//returns the number that was removed from top 
	}
	
	@Override
	public int peek() //looks at top of stack 
	{
		return stack.peek();//returns number at top of stack 
	}	
	
	
	

}
