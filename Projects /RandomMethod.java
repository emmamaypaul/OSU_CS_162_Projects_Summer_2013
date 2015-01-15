
import java.util.Random;


public class RandomMethod {

//public class RmMthd {
public static int [] FillArray(int numbers []) 
{
	Random intGin = new Random();
	int randomRange = 100;
	for (int i = 0 ; i < MAX ; i++) 
	{
	numbers[i] = intGin.nextInt(randomRange);
	}//end for
	return numbers;
}//end FillArray

public static void main (String [] args) {
int[] numbers = new int[MAX] ;

numbers = FillArray(numbers);

for (int i=0; i<MAX; i++) {
System.out.println(numbers[i]);
}//end for
}//end main

private static final int MAX = 15;
}//end class

