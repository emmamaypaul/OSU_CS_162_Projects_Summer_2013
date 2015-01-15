import static org.junit.Assert.*;

import org.junit.Test;


public class TreasureChestTest 
{
	/*
	 * Exercise 2 
	 * 1. The TreasureChest constructor:Provide an initial amount of gold > 0 (positive input) and verify the amount of gold in tc
	 * 2. addGold() method: Provide an int amount of gold to add to tc from pirates personal stash > 0 (positive input) 
	 * and verify the amount num gold in tc is > 0 (non negative) 
	 * 3. removeGold() method: Provide an into amount of gold to remove from tc > 0 (positive input) 
	 * and verify the amount of gold left in tc is >= 0 as well as verify pirates personal collection >= 0
	 * 4. checkGold() method: no test necessary because the method returns the amount of gold in the treasure chest 
	 * (which shouldn't be negative because the other methods should have thrown exceptions when there was not enough gold in the chest)
	 */
	
	
	//an implement of the four test groups above 
	@Test //(expected = Exception.class) 
	public void addGoldExceptionNegNumTest() throws Exception 
	{
		Pirate Jack = null;
		int initalGold = 40;
		int goldToAdd = 10;
		TreasureChest tc = new TreasureChest(initalGold);
		tc.addGold(goldToAdd, Jack);
		assertEquals(50, tc.checkGold());
	}

}
