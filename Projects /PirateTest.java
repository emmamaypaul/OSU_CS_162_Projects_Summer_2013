import static org.junit.Assert.*;

import org.junit.Test;


public class PirateTest //exercise 1 for lab 4
{
	//1. test for the consturctor
	@Test 
	public void addGoldException() throws Exception //no parameter in method declarartion 
	{
		String OneEyeJack = "OneEyeJack";
		int initialGold = 10;
		Pirate p = new Pirate(OneEyeJack, initialGold);
		p.getName();
		p.getNumGold();
		assertEquals(OneEyeJack, p.getName());
		assertEquals(10, p.getNumGold());
	}
	
	//2. test for constructor passing negative amount for initial gold value 
	@Test (expected = Exception.class) 
	public void addGoldExceptionNegNumTest() throws Exception 
	{
		String OneEyeJack = "OneEyeJack";
		int initialGold = -10;
		Pirate p2 = new Pirate(OneEyeJack, initialGold);
		p2.getNumGold();
		assertEquals(OneEyeJack, p2.getName());
		assertEquals("Init Gold must be >= 0", p2.getNumGold());
	}
	
	//3. test for removeGold() that we write ourselves in Pirate class 
	@Test  
	public void removeGold() throws Exception//test if add gold method works 
	{
		String OneEyeJack = "OneEyeJack";
		int initialGold = 50;
		int removeGoldNum = 30;
		Pirate p3 = new Pirate(OneEyeJack, initialGold);
		p3.removeGold(removeGoldNum); 
		assertEquals (20, p3.getNumGold());//test will pass if both are equal 
	}

}



