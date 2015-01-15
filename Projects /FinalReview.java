
public class FinalReview 
{
	
	public int descendingMethod(int n)
	{
		return descendingMethodHelper(n);
	}
	
	public int descendingMethodHelper(int n)
	{
		System.out.println(n);
		if (n == 0)
		{
			
			return n;
		}
		
		else 
		{
			n = n-1;
			return descendingMethodHelper(n);
		}
		
	}
	
	
	
	public static void main(String[] args)
	{
		FinalReview test = new FinalReview();
		int n = 5;
		test.descendingMethod(5);
	}
	
	
	
}
