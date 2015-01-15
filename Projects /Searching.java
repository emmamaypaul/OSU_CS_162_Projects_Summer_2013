
public class Searching
{
	public int search (int a[], int v) 
	{
		//for(int i=0; i<500; i++)//loop for 500 times 
		//{
			for(int k =0; k<a.length; k++)
			{
				if(a[k] == v)
				return k; 
			}
		return -1;	
	}
}
